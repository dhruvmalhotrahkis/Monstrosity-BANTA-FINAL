public class Type {

    private String type;
    private Trait trait;

    public Type(String type, Trait trait) {
        this.type = type;
        this.trait = trait;
    }

    //TYPES SECTION

    /**
     *
     * Sets the overall type of the monster to a new type
     *
     * @param x the new type you want to set the monster to
     */

    public void setTypeObject(Type x){
        setType(x.getTheType());
        trait.setTrait(x.getTrait().getTheTrait());
        trait.setLevel(x.getTrait().getLevel());
    }

    /**
     *
     * Returns the current type of the monster
     *
     * @return the current type of the monster
     */

    public String getTheType() {
        return type;
    }

    /**
     *
     * (Only sets) the type of the monster to the new type
     *
     * @param newType the new type you want to set it to
     */

    public void setType(String newType) { //Mutation
        type = newType;
    }

    //TRAITS SECTION

    public Trait getTrait(){
        return trait;
    }

}