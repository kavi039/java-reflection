import annotation.CanWatch;

public class Movie {

    private String name;
    private String location;

    public Movie() {

    }

    public Movie(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @CanWatch(flag = true)
    public String getName() {
        System.out.println("name is --->>  " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @CanWatch(flag = false)
    public String getLocation() {
        System.out.println("location is --->>  " + location);
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}