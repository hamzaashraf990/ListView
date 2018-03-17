package Model;

/**
 * Created by hamza on 3/17/2018.
 */

public class User {
    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    String weather;
    String condition;

    public int getDrawableimage() {
        return Drawableimage;
    }

    public void setDrawableimage(int drawableimage) {
        Drawableimage = drawableimage;
    }

    int Drawableimage;
}
