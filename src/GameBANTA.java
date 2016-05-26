/**
 * Created by s180256 on 18/5/2016.
 */
public class GameBANTA {
    public static void main(String[] args){
        /**
         * Damage: 20.0
         * Armour: 10.0
         * Health: 50.0
         */
        Monster kosher = new Monster("KosherBANTA", new Account(), new Type("Strictly Kosher", new Trait("Banterous", 20)), new Sword(new Color(233,199,199), new Handle("Leather", new Color("Red")), 20), 20.0, 10.0, 50.0);

        Shop shop = new Shop();
        Items item1 = new Items("Si",20,30.0);
        Items item2 = new Items("Kosher",40,60.0);
        Items item3 = new Items("Forceful", 50, 20.0);
        kosher.getInventory().addItem(item1);
        kosher.getInventory().addItem(item2);
        kosher.getInventory().addStock(item1);
        shop.addItem(item3);
//        System.out.println(shop.seeShop());
        System.out.println(shop.seeShop());
        System.out.println(kosher.getInventory().removeItem(item1));
//
        System.out.println(kosher.getType().getTrait().getTheTrait());
        System.out.println( kosher.getAccount().withdraw(100));
        kosher.getInventory().purchaseItem("item2",1);
        System.out.println(kosher.getAccount().getBalance());
        System.out.println(kosher.getHealth());
        kosher.addHealth(50);
        System.out.println(kosher.getHealth()); // health increase
        System.out.println(kosher.getHandleType()); // no need for extra get method, as used class extension instead (monster extends handle)
        System.out.println(kosher.getDamage());
        kosher.damageAmplifier(); // uses interface
        System.out.println(kosher.getDamage()); // damage increase
        System.out.println(kosher.getSword().getSwordStrength());
        System.out.println(kosher.getSword().getColor());
        System.out.println(kosher.getHandle().getColor());


//        kosher.getInventory().addItem(new Items("Banter",40,20.0));
//        kosher.getInventory().addItem(new Items("Banter",20,20.0));
//
//        System.out.println(kosher.getInventory().itemList());

        System.out.println(kosher.getType());
        System.out.println(kosher.getSword());
        System.out.println(kosher.getInventory().addStock(item3)); // tests to see if in inventory


    }
}
