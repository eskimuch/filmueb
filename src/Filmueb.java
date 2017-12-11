import filmueb.data.Actor;
import filmueb.data.Movie;
import filmueb.data.Series;
import java.util.Scanner;

public class Filmueb
{
    public static void main(String[] args)
    {
/*      String[] tabAct = new String[3];
        String[] tabMovie = new String[6];
        String[] tabSer = new String[7];*/

        Scanner sc = new Scanner(System.in);
        ConsoleDataReader cdr = new ConsoleDataReader();

        String version = "0.3";

        //Actor act1 = new Actor("Tom","Cruise","USA");
        //Movie mov1 = new Movie("Top Gun","Tony Scott","Sensacyjny, Romans","Uczniowie elitarnej jednostki lotniczej, Maverick i Tom Kasansky, rywalizują o tytuł najlepszego pilota.",1986,7.5);
        //Series ser1 = new Series("Desperate Housewives","Marc Cherry","Dramat, Koedia obyczajowa","Na przedmieściach Fairview każda z gospodyń domowych coś ukrywa. Gdy jedna z nich popełni samobójstwo, na jaw zaczną wychodzić mroczne sekrety mieszkańców ulicy Wisteria Lane.",8,23,8.0);

        System.out.println("Wersja " + version);
        String object = "Nowy obiekt = ";
        boolean choice = true;

        while (choice) {
        System.out.println("\nWybierz jedną z poniższych opcji:\n1. Dodaj aktora\n2. Dodaj film\n3. Dodaj serial\n4. Wyświetl wszystkie informacje\n5. Zakończ");
        int ans = sc.nextInt();
        sc.nextLine();
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
            case 4:
                cdr.viewData();
                break;
            case 5:
                choice = false;
                break;
            default:
                System.out.println("Odpowiedź błędna.");
        }

        }

    }
}
