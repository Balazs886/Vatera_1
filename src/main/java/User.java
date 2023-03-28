public class User {
    private String name;
    private Integer stars;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }
}
