/**
 * Created by s180256 on 4/5/2016.
 */
public class Skeleton extends Monster{

    private Type type;
    private final int DEFAULT_RAGE = 2;

    public Skeleton(){
        super();
        int randomLevel = (int) (Math.random() + 10);
        type = new Type("Skeleton", new Trait("Summon Undead Army", randomLevel));
        getType().setTypeObject(type);
    }

    public Skeleton(String name, Account account, Sword sword, int level, double damage, double health){
        super(name, account, null, sword, damage, 0.0, health);
        type = new Type("Skeleton", new Trait("Summon Undead Army", level));
        getType().setTypeObject(type);
    }

    /**
     *
     * Amplifies the damage of the skeleton due to it's passive trait
     *
     */



    /**
     *
     * Reduces the amount of damage the skeleton takes due to it's passive trait
     *
     */


    /**
     *
     * Returns the current type of the sword
     *
     * @return the current type of the sword
     */

    public String swordType(){
        return null;
    }
}
