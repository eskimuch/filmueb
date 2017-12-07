package filmueb.data;

public class Movie
{
    private String name, director, genre, description;
    private int productionYear;
    private double rating;

    public Movie(String name, String director, String genre, String description, int productionYear, double rating) {
        this.name = name;
        this.director = director;
        this.genre = genre;
        this.description = description;
        this.productionYear = productionYear;
        this.rating = rating;
    }
    public Movie(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
