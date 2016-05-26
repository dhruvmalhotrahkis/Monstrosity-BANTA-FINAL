/**
 * Created by s180256 on 4/5/2016.
 */
public class Color {

    private int r;
    private int g;
    private int b;
    private String color;

    public Color(){
        color = "White";
        r = 255;
        g = 255;
        b = 255;
    }

    public Color(String x){
        color = x;
        r = -1;
        g = -1;
        b = -1;
    }
    public Color(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;

        if(r > 255 || g > 255 || b > 255){
            color = "undefined";
        }
        else if(r > g && r > b && g > b){
            color = "Orange";
        }

        else if(r > g && r > b && g == b){
            color = "Red";
        }

        else if(r == g && r > b){
            color = "Yellow";
        }

        else if(g > r && g > b){
           color = "Green";
        }

        else if(b > r && b > g && g == r){
            color = "Blue";
        }

        else if(b > g && b > r && r > g){
            color = "Purple";
        }

        else if(r == b && r > g) {
            color = "Pink";
        }

        else if(r == 0 && g == 0 && b == 0){
            color = "Black";
        }

        else if(r == 255 && g == 255 && b == 255){
            color = "White";
        }

        else if(r == g && r == b){
            color = "Grey";
        }

        else {
            color = "Rainbow";
        }
    }

    /**
     *
     * Returns the color of the sword
     *
     * @return the color of the sword
     */

    public String getColor(){
        return color;
    }

    /**
     *
     * Sets the color to a specified color
     *
     * @param x the new color you want to set the original color to
     */

    public void setColor(String x){
        color = x;
    }

    public String toString(){
        return color;
    }
}
