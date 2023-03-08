package org.lesson.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pattern = "###.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        //INPUT
        System.out.print("Quanti chilometri devi percorrere?");
        int numKm = Integer.parseInt(scan.nextLine());
        System.out.print("Quanti anni hai?");
        int age = Integer.parseInt(scan.nextLine());


        //Calcolo prezzo del biglietto senza sconti
        double ticketPrice = numKm * 0.21;


        //OUTPUT
        if (age < 18){
            System.out.println("Il prezzo del tuo biglietto è: " + decimalFormat.format((ticketPrice * 0.8)));
        } else if (age > 65) {
            System.out.println("Il prezzo del tuo biglietto è: " + decimalFormat.format((ticketPrice * 0.6)));
        } else {
            System.out.println(decimalFormat.format(ticketPrice));
        }
    }
}
