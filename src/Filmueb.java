import filmueb.data.Actor;
import filmueb.data.Movie;
import filmueb.data.Series;
import java.util.Scanner;


public class Filmueb
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ConsoleDataReader cdr = new ConsoleDataReader();

        String version = "0.2";

        //Actor act1 = new Actor("Tom","Cruise","USA");
        //Movie mov1 = new Movie("Top Gun","Tony Scott","Sensacyjny, Romans","Uczniowie elitarnej jednostki lotniczej, Maverick i Tom Kasansky, rywalizują o tytuł najlepszego pilota.",1986,7.5);
        //Series ser1 = new Series("Desperate Housewives","Marc Cherry","Dramat, Koedia obyczajowa","Na przedmieściach Fairview każda z gospodyń domowych coś ukrywa. Gdy jedna z nich popełni samobójstwo, na jaw zaczną wychodzić mroczne sekrety mieszkańców ulicy Wisteria Lane.",8,23,8.0);

        System.out.println("Wersja " + version);
        String object = "Nowy obiekt = ";

        System.out.println("\nWpisz 1,2 lub 3 aby dodać do bazy:\n1. Aktora\n2. Film\n3. Serial");
        int ans = sc.nextInt();
        switch (ans)
        {
            case 1:
                Actor act2 = cdr.createActor();
                String act = act2.getName() +" "+ act2.getSurname() +"\nKraj pochodzenia: "+ act2.getCountry();
                System.out.println("\n"+act);
                break;
            case 2:
                Movie mov2 = cdr.createMovie();
                if(mov2 == null)
                {
                    System.out.println(object+mov2);
                }
                else
                {
                    String mov = mov2.getName() +"\nReżyser: "+mov2.getDirector()+"\nGatunek: "+mov2.getGenre()+"\nOpis: "+mov2.getDescription()+"\nRok produckji: "+mov2.getProductionYear()+"\nOcena: "+mov2.getRating();
                    System.out.println("\n"+mov);
                }
                break;
            case 3:
                Series ser2 = cdr.createSeries();
                if (ser2 == null)
                {
                    System.out.println(object+ser2);
                }
                else
                {
                    String ser = ser2.getName() +"\nProducent: "+ ser2.getProducer()+"\nGatunek: "+ser2.getGenre()+"\nOpis: "+ser2.getDescription()+"\nIlość sezonów: "+ser2.getSeriesVolume()+"\nIlość odcinków: "+ser2.getEpisodesVolume()+"\nOcena: "+ser2.getRating();
                    System.out.println("\n"+ser);
                }
                break;
            default:
                System.out.println("Odpowiedź błędna.");
        }
    }
}
