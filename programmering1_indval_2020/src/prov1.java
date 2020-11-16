
import java.util.Scanner;

public class prov1{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ange sten, sax eller påse:");
        String inmatning = sc.nextLine();
        int random = (int) (Math.random() * 3);
        String sten = "sten";
        String påse = "påse";
        String sax = "sax";
        String a[] = new String[3];
        a[0] = sten;
        a[1] = sax;
        a[2] = påse;
        String b = a[random];


        if (inmatning.equals(a[random])) {
            System.out.println("Ingen vann");
        } else if (inmatning.equals(sax) && a[random].equals(sten)) {
            System.out.println("Datorn vinner");
        } else if (inmatning.equals(sten) && a[random].equals(sax)) {
            System.out.println("Du vinner");
        } else if (inmatning.equals(påse) && a[random].equals(sax)) {
            System.out.println("Datorn vinner");
        } else if (inmatning.equals(sax) && a[random].equals(påse)) {

            System.out.println("Du vinner");
        }
    }
}