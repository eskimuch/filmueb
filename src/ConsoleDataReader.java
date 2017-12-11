import java.util.Scanner;

public class ConsoleDataReader
{
    private Scanner sc = new Scanner(System.in);

    public int ans()
    {
        System.out.println("\nWybierz jedną z poniższych opcji:" +
                "\n1. Dodaj aktora" +
                "\n2. Dodaj film" +
                "\n3. Dodaj serial" +
                "\n4. Wyświetl wszystkie informacje" +
                "\n5. Zakończ");
        int ans = sc.nextInt();
        sc.nextLine();
        return ans;
    }

}
