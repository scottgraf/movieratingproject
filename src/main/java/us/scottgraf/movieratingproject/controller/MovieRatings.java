package us.scottgraf.movieratingproject.controller;

public class MovieRatings {

    private String name;
    private double ratings;


    public MovieRatings(String name, double ratings) {

        this.name = name;
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }
}
