import filmueb.data.Actor;
import filmueb.data.Movie;
import filmueb.data.Series;

class ApplicationController {

    private ApplicationDatabase ad = new ApplicationDatabase();
    private String object = "Nowy obiekt = ";
    private ConsoleDataReader cdr = new ConsoleDataReader();

    void mainLoop() {

        switch (cdr.ans()) {
            case 1:
                choiceActor();
                break;
            case 2:
                choiceFilm();
                break;
            case 3:
                choiceSerial();
                break;
            case 4:
                choiceViewAll();
                break;
            case 5:
                System.out.println("Do zobaczenia!");
                break;
            default:
                choiceError();
        }
    }

    private void choiceActor()
    {
        Actor act2 = ad.createActor();
        String act = act2.getName() +" "+ act2.getSurname() +"\nKraj pochodzenia: "+ act2.getCountry();
        System.out.println("\n"+act);
        mainLoop();
    }

    private void choiceFilm()
    {
        Movie mov2 = ad.createMovie();
        if(mov2 == null)
        {
            System.out.println(object+mov2);
        }
        else
        {
            String mov = mov2.getName() +"\nReżyser: "+mov2.getDirector()+"\nGatunek: "+mov2.getGenre()+"\nOpis: "+mov2.getDescription()+"\nRok produckji: "+mov2.getProductionYear()+"\nOcena: "+mov2.getRating();
            System.out.println("\n"+mov);
        }
        mainLoop();
    }

    private void choiceSerial()
    {
        Series ser2 = ad.createSeries();
        if (ser2 == null)
        {
            System.out.println(object+ser2);
        }
        else
        {
            String ser = ser2.getName() +"\nProducent: "+ ser2.getProducer()+"\nGatunek: "+ser2.getGenre()+"\nOpis: "+ser2.getDescription()+"\nIlość sezonów: "+ser2.getSeriesVolume()+"\nIlość odcinków: "+ser2.getEpisodesVolume()+"\nOcena: "+ser2.getRating();
            System.out.println("\n"+ser);
        }
        mainLoop();
    }

    private void choiceViewAll()
    {
        ad.viewData();
        mainLoop();
    }

    private void choiceError()
    {
        System.out.println("Odpowiedź błędna.");
        mainLoop();
    }

}
