import java.util.ArrayList;
import java.util.List;

/**
 * Created by s180256 on 6/5/2016.
 */
public class Shop {

    //List of items in the shop
    public static List<Items> itemList = new ArrayList<Items>();

    public Shop(){

    }

    /**
     *
     * Returns what the current items in the shop
     *
     * @return all the items in the shop
     */

    public String seeShop(){
        String x = "";
        for(Items i : itemList){
            x += i.getName() + "\nStock: " + i.getStock() + "\nPrice: " + i.getPrice() +"\n";
        }
        return x;
    }

    public void addItem(Items item){
        itemList.add(item);
    }

    public boolean removeItem(Items item){
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i) == item) {
                itemList.remove(i);
                return true;
            }
        }
        return false;
    }

    }

