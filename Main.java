
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Cena towaru");
            int cena;
            int rata;
            try (Scanner kwota = new Scanner(System.in)) {
                cena = kwota.nextInt();
                System.out.println("Ilosc rat");
                rata = kwota.nextInt();
        }
        double cena1 = cena*2.5/rata;
        double kwota1 = cena*2.5;
        double cena2 = cena*5/rata;
        double kwota2 = cena*5;
        double cena3 = cena*10/rata;
        double kwota3 = cena*10;
                if(6 >= rata && rata <= 12){
                    System.out.println("Kwota do splaty " + cena1 + " pln");
                    System.out.println("Przy " + rata + " ratach kwota  " + kwota1 + " pln");
        }
                else if(13 >= rata &&rata<=24){
                    System.out.println("kwota do splaty " + cena2 + " pln");
                    System.out.println("Przy " + rata + " ratach kwota  " + kwota2 + " pln");
        }
                else if(25 >= rata &&rata<=48){
                    System.out.println("kwota do splaty " + cena3 + " pln");
                    System.out.println("Przy " + rata + " ratach kwota " + kwota3 + " pln");
        }
                else System.out.println("Nie ma");
    }
}