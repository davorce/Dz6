//Napišite program u Javi koji će učitati niz znakova (string)
//sa standardnog ulaza i okrenuti redoslijed riječi u unesenom stringu.
//Prikazati transformirani string s obrnutim redoslijedom riječi.
//Primjer ulaza: Dobar dan svima
//Primjer izlaza: svima dan Doba

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Unesi niz rijeci koje zelis dobiti u obrnutom redosijedu: ");
        String nizRijeci = scan.nextLine();
        nizRijeci = nizRijeci.trim();
        String[] nizRijeciTemp = nizRijeci.split(" ");
        System.out.println("Obrnuti redoslijed rijeci: ");

        for (int i = nizRijeciTemp.length - 1; i >= 0; i--) {
            System.out.print(nizRijeciTemp[i] + " ");
        }
    }
}
