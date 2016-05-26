/**
 * Created by s180256 on 6/5/2016.
 */
public class Items {

    public static String name;
    public static int stock;
    public static double price;

    public Items(){
        this.name="Blank";
        this.stock=1;
        this.price = 100.0;
    }

    public Items(String name, int stock, double price){
        this.name = name;
        this.stock = stock;
        this.price = price;
//        Shop.itemList.add(new Items(name, stock, price));
    }

    /**
     *
     * Returns the name of the item
     *
     * @return the name of the item
     */

    public String getName(){
        return name;
    }

    /**
     *
     * Returns the current stock (quantity) of the item
     *
     * @return the stock (quantity) of the item
     */

    public int getStock(){
        return stock;
    }

    /**
     *
     * Returns basic item info of the item: Name, stock, and price
     *
     * @return the info of the item
     */

    public String itemInfo(){
        return name + "\nStock: " + stock + "\nPrice: " + price +"\n";
    }

    /**
     *
     * Returns the price of the item
     *
     * @return the price of the item
     */

    public double getPrice(){
        return price;
    }

    /**
     *
     * Setting the new price of the item
     *
     * @param newPrice the new price of the item you want to set it to
     */

    public void setPrice(double newPrice){
        price = newPrice;
    }

    /**
     *
     * Increases the amount of stocks of the item
     *
     * @param amount the amount of stocks you want to increase
     */

    public void increaseStock(int amount){
        stock += amount;
    }

    /**
     *
     * Decreases stock of the item
     *
     * @param amount the amount of stocks you want to decrease
     */

    public void decreaseStock(int amount){
        stock -= amount;
    }

}