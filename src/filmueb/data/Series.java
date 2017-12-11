package filmueb.data;

public class Series
{
    private String name, producer, genre, description;
    private int seriesVolume, episodesVolume;
    private double rating;

    public Series(String name, String producer, String genre, String description, int seriesVolume, int episodesVolume, double rating) {
        this.name = name;
        this.producer = producer;
        this.genre = genre;
        this.description = description;
        this.seriesVolume = seriesVolume;
        this.episodesVolume = episodesVolume;
        this.rating = rating;
    }
    public Series(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
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

    public int getSeriesVolume() {
        return seriesVolume;
    }

    public void setSeriesVolume(int seriesVolume) {
        this.seriesVolume = seriesVolume;
    }

    public int getEpisodesVolume() {
        return episodesVolume;
    }

    public void setEpisodesVolume(int episodesVolume) {
        this.episodesVolume = episodesVolume;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
