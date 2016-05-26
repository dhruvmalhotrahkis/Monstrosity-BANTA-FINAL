import java.util.ArrayList;
import java.util.List;

/**
 * MonstrosityBANTA
 */
public class Inventory {

    public static List<Items> inventory = new ArrayList<Items>();

    public Inventory() {
    }

    /**
     *
     * This method will add an item to your inventory. If it is already there, then it just adds stock - with help from
     * addStock (the helper method).
     *
     * @param item the item you want to add to the inventory
     */

    public void addItem(Items item) {
        if(addStock(item)){
        }
        else {
            inventory.add(item);
        }
    }

    /**
     *
     * This method will remove an item from your inventory.
     *
     * @param item the item you want to remove from the list of the items you own
     * @return true if it successfuly removed an item
     */

    public boolean removeItem(Items item) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i) == item) {
                inventory.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     *
     * This will return the number if items in your inventory
     *
     * @return the number of items in your inventory
     */

    public int getNumProducts() {
        return inventory.size();
    }

    //Helper Method

    /**
     *
     * This method will check whether the item you want to add is already there. If so, instead of creating a new item,
     * you just add stock to the current item.
     *
     * @param item The item you want to add stock of
     * @return true if there already is the same item there
     */

    public boolean addStock(Items item) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getName().equals(item.getName()) && inventory.get(i).getPrice() == item.getPrice()) {
                inventory.get(i).increaseStock(item.getStock());
                return true;
            }
        }
        return false;
    }

    /**
     *
     * This method will return the amount of items you have in your inventory
     *
     * @return a list of items you have in your inventory
     */

    public String itemList() {
        String x = "";
        for (int i = 0; i < inventory.size(); i++) {
            x += inventory.get(i).itemInfo();
        }
        return x;
    }

    /**
     *
     * This method purchases an item with your specified quantity. It will the withdraw money from the specified account.
     * It will then test whether you have insufficient funds or the item cannot be found from the shop (if failed).
     *
     * @param name the name of the item
     * @param quantity the amount of the item you want to purchase
     */

    public void purchaseItem(String name, int quantity) {
        boolean purchase = false;
        boolean funds = false;

        for (int i = 0; i < Shop.itemList.size(); i++) {
            if (Shop.itemList.get(i).getName() == name) {
                if(Monster.account.withdraw(Shop.itemList.get(i).getPrice() * quantity)) {
                    Shop.itemList.get(i).decreaseStock(quantity);
                    inventory.add(Shop.itemList.get(i));
                    purchase = true;
                    funds = true;
                }
            }
        }
        if(funds == false){
            System.out.println("Insufficient Funds");
        }
        if (purchase == false) {
            System.out.println("Purchase Failed. Item Name or Item Quanitity is incorrect or the item is not found");
        }
    }

    /**
     *
     * This method will sell the item you specify. It will run the addItem method to see whether it should add stock or
     * not. It acts as a helper method in this case.
     *
     * @param item the item you want to sell
     */

    public void sellItem(Items item){
        boolean sell = false;
        addItem(item);
        Monster.account.deposit(item.getPrice() * item.getStock());
    }
}
