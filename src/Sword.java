/**
 * Created by s180256 on 4/5/2016.
 */
public class Sword {

    private Color color;
    private Handle handle;
    private int swordStrength;

    public Sword(){
        color = new Color();
        handle = new Handle();
        swordStrength = Monster.DEFAULT_SWORDSTRENGTH;
    }

    public Sword(Color color, Handle handle, int swordStrength){
        this.color = color;
        this.handle = handle;
        this.swordStrength = swordStrength;
    }

    /**
     *
     * Returns the strength of the sword (this amplifies the damage)
     *
     * @return the strength of the sword
     */

    public int getSwordStrength(){
        return swordStrength;
    }

    /**
     *
     * Returns the current color of the sword
     *
     * @return the current color of the sword
     */

    public String getColor(){
        return color.getColor();
    }

    /**
     *
     * Returns the current color of the handle
     *
     * @return the current color of the handle
     */

    public String getHandleColor(){
        return handle.getColor();
    }

    /**
     *
     * Returns the current handle type of the sword
     *
     * @return the current handle type of the sword
     */

    public String getHandleType(){
        return handle.getHandleType();
    }
}
