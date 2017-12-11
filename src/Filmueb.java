public class Filmueb
{
    public static void main(String[] args)
    {
        String version = "0.4";
        System.out.println("Wersja " + version);

        ApplicationController ac = new ApplicationController();
        ac.mainLoop();
    }

}

