package pl.olejarz.springsecuritybasics;

public class Movies {
    private String title;
    private String director;

    public String getTitle() {
        return title;
    }

    public Movies() {
    }

    public Movies(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
