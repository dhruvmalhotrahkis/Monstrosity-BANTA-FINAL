import java.util.ArrayList;
import java.util.List;

public class Monster extends Handle implements Rage{

    //Default Variables for the Default Constructor
    public static final Color DEFAULT_COLOR = new Color(255,255,255);
    public static final Type DEFAULT_TYPE = new Type("None", new Trait("None", 0));
    public static final String DEFAULT_NAME = "Default Monster";
    public static final Handle DEFAULT_HANDLE = new Handle("Leather", DEFAULT_COLOR);
    public static final Sword DEFAULT_SWORD = new Sword(DEFAULT_COLOR, DEFAULT_HANDLE, 0);
    public static final int DEFAULT_SWORDSTRENGTH = 1;
    private final int DEFAULT_RAGE = 2;

    private List<Monster> monsterList = new ArrayList<Monster>();
    public double damage;
    private double armour;
    private String name;
    private Type type;
    private Sword sword;
    public static Account account;
    public double health;
    private Inventory inventory;
    private Handle handle;
    public Shop shop;

    public Monster(){
        damage = 0.0;
        armour = 0.0;
        name = DEFAULT_NAME;
        type = DEFAULT_TYPE;
        sword = DEFAULT_SWORD;
        account = new Account();
        health = 100.0;
        inventory = new Inventory();
        shop = new Shop();
    }

    public Monster(String name, Account account, Type type, Sword sword, double damage, double armour, double health){
        //monsterList.add(new Monster(name, type, damage, armour));

        this.damage = damage;
        this.type = type;
        this.armour = armour;
        this.name = name;
        this.sword = sword;
        this.account = account;
        this.health = health;
        inventory = new Inventory();
        handle = new Handle();
        shop = new Shop();
    }

    //MONSTER SECTION --------------------------------------------------------------------------------------------------

    public double getArmour(){return armour;}

    /**
     *
     * Damages the monster. The damage on the health varies of whether the monster has armour or not.
     *
     * @param damage the amount of damage you want to damage the monster by
     */

    public void damage(double damage){
        if(armour == 0) {
            health -= damage;
        } else if (armour >= damage){
            armour -= damage;
        } else {
            double x = damage - armour;
            armour = 0.0;
            health -= x;
        }
    }

    /**
     *
     * Returns the amount of damage of the monster
     *
     * @return the amount of damage the monster has
     */

    public double getDamage(){
        return damage;
    }

    /**
     *
     * Sets the damage of monster to your specified numnber
     *
     * @param x the new damage of the monster
     */

    public void setDamage(double x){
        damage = x;
    }

    /**
     *
     * Returns the health of the monster
     *
     * @return the current health of the monster
     */

    public double getHealth(){
        return health;
    }

    /**
     *
     * Adds health to the monster.
     *
     * @param healthToAdd the amount of health you want to add to the monster
     */

    public void addHealth(double healthToAdd){
        health += healthToAdd;
    }

    /**
     *
     * Returns the current sword of the monster
     *
     * @return the current sword of the monster
     */

    /**
     *
     * Amplifies the damage of the monster due to it's passive trait
     *
     */

    public void damageAmplifier() {
        setDamage(getDamage() + DEFAULT_RAGE);
    }

    public void reducedHealthDamage() {

    }

    public Sword getSword(){
        return sword;
    }

    public Inventory getInventory(){
        return inventory;
    }

    public Account getAccount(){
        return account;
    }

    public Type getType(){
        return type;
    }

    public Handle getHandle(){ return handle;}




}
