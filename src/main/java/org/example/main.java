package org.example;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int Armut , Elma , Domates , Muz , Patlican;


        Scanner inp = new Scanner(System.in);

        System.out.print("Aldığınız Armut miktarını Kg cinsinden giriniz : ");
        Armut = inp.nextInt();

        System.out.print("Aldığınız Elma miktarını Kg cinsinden giriniz :");
        Elma = inp.nextInt();

        System.out.print("Aldığınız Domates miktarını Kg cinsinden giriniz :");
        Domates = inp.nextInt();

        System.out.print("Aldığınız Muz miktarını Kg cinsinden giriniz :");
        Muz = inp.nextInt();

        System.out.print("Aldığınız Patlıcan miktarını Kg cinsinden giriniz :");
        Patlican = inp.nextInt();

        double Tutar = Armut*2.14 + Elma*3.67 + Domates*1.11 + Muz*0.95 + Patlican*5.00 ;

        System.out.println("Toplam tutar :" + Tutar );


    }
}

