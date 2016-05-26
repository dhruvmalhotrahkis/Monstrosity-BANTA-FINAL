/**
 * Created by s180256 on 4/5/2016.
 */
public class Handle{

    private String handleType;
    private Color color;

    public Handle(){
        color = new Color();
        handleType = "Leather";
    }

    public Handle(String type, Color color){
        handleType = type;
        this.color = color;
    }

    /**
     *
     * Returns the handle type of the handle
     *
     * @return the handle type of the handle
     */

    public String getHandleType(){
        return handleType;
    }

    /**
     *
     * Returns the current color of the handle
     *
     * @return the current color of the handle
     */

    public String getColor(){
        return color.getColor();
    }


}
