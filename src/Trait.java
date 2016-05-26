public class Trait {

    private String trait;
    private int level;


    public Trait(String trait, int level){
        this.trait = trait;
        this.level = level;
    }

    /**
     *
     * Returns the current trait of the monster
     *
     * @return the current trait of the monster
     */

    public String getTheTrait(){
        return trait;
    }

    /**
     *
     * Sets the trait of the monster
     *
     * @param x a trait you want the monster's trait set to
     */

    public void setTrait(String x){
        trait = x;
    }

    /**
     *
     * Returns the current level of the monster
     *
     * @return the current level of the monster
     */

    public int getLevel(){
        return level;
    }

    /**
     *
     * This will set the level of the monster trait
     *
     * @param x the level you want the monster trait set to
     */

    public void setLevel(int x){
        level = x;
    }



}
