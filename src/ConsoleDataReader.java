import filmueb.data.Actor;
import filmueb.data.Movie;
import filmueb.data.Series;
import java.util.Scanner;

public class ConsoleDataReader
{
    private Scanner sc = new Scanner(System.in);
    private String error = "Podano błędną wartość, nie udało się utworzyć nowego obiektu w bazie!";
    private String add = "Wprowadzanie do bazy nowego ";
    private String addEnd = " został wprowadzony do bazy.";
    private String name = "Wprowadź nazwę: ";
    private String producer = "Wprowadź producenta: ";
    private String genre = "Wprowadź gatunek: ";
    private String description = "Wprowadź opis: ";
    private String rating = "Wprowadź ocenę: ";
    private String value = "Wprowadź ilość: ";

    Series createSeries()
    {
        System.out.println("\n"+add+"serialu.");
        Series series = new Series();

        System.out.println(name);
        String seriesName = sc.nextLine();
        series.setName(seriesName);

        System.out.println(producer);
        String seriesProducer = sc.nextLine();
        series.setProducer(seriesProducer);

        System.out.println(genre);
        String seriesGenre = sc.nextLine();
        series.setGenre(seriesGenre);

        System.out.println(description);
        String seriesDescription = sc.nextLine();
        series.setDescription(seriesDescription);

        System.out.println(value+"sezonów: ");
        int seriesSeriesVolume = sc.nextInt();
        if (seriesSeriesVolume<=0)
        {
            System.out.println(error);
            series = null;
            return series;
        }
        else
        {
            series.setSeriesVolume(seriesSeriesVolume);
        }

        System.out.println(value+"odcinków: ");
        int seriesEpisodesVolume = sc.nextInt();
        if (seriesEpisodesVolume<=0)
        {
            System.out.println(error);
            series = null;
            return series;
        }
        else
        {
            series.setEpisodesVolume(seriesEpisodesVolume);
        }

        System.out.println(rating);
        double seriesRating = sc.nextDouble();
        if (seriesRating < 0 || seriesRating >10)
        {
            System.out.println(error);
            series = null;
            return series;
        }
        else
        {
            series.setRating(seriesRating);
        }

        System.out.println("\nNowy serial"+addEnd);
        return series;
    }

    Movie createMovie()
    {
        System.out.println("\n"+add+"filmu.");
        Movie movie = new Movie();

        System.out.println(name);
        String movieName = sc.nextLine();
        movie.setName(movieName);

        System.out.println("Wprowadź reżysera: ");
        String movieDirector = sc.nextLine();
        movie.setDirector(movieDirector);

        System.out.println(genre);
        String movieGenre = sc.nextLine();
        movie.setGenre(movieGenre);

        System.out.println(description);
        String movieDescription = sc.nextLine();
        movie.setDescription(movieDescription);

        System.out.println("Wprowadź rok produkcji: ");
        int productionYear = sc.nextInt();
        if (productionYear < 1887)
        {
            System.out.println(error);
            movie = null;
            return movie;
        }
        else
        {
            movie.setProductionYear(productionYear);
        }

        System.out.println(rating);
        double movieRating = sc.nextDouble();
        if (movieRating<0 || movieRating>10)
        {
            System.out.println(error);
            movie = null;
            return movie;
        }
        else
        {
            movie.setRating(movieRating);
        }

        System.out.println("\nNowy film"+addEnd);
        return movie;
    }

    Actor createActor()
    {
        System.out.println("\n"+add+"aktora.");
        Actor actor = new Actor();
        System.out.println("Wprowadź imię: ");
        String actorName = sc.nextLine();
        actor.setName(actorName);
        System.out.println("Wprowadź nazwisko: ");
        String actorSurname = sc.nextLine();
        actor.setSurname(actorSurname);
        System.out.println("Wprowadź kraj pochodzenia: ");
        String actorCountry = sc.nextLine();
        actor.setCountry(actorCountry);
        System.out.println("\nNowy aktor"+addEnd);

        return actor;
    }
}
