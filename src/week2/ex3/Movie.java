package week2.ex3;

public class Movie {

    private String name;
    private final int PRICE = 10000;
    private String[] runningTime;
    private String[] place;

    public Movie(String name, String[] runningTime, String[] place) {
        this.name = name;
        this.runningTime = runningTime;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPRICE() {
        return PRICE;
    }

    public String[] getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String[] runningTime) {
        this.runningTime = runningTime;
    }

    public String[] getPlace() {
        return place;
    }

    public void setPlace(String[] place) {
        this.place = place;
    }
}
