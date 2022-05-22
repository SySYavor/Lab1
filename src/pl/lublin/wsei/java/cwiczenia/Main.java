package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        //4 zadanie
        System.out.println("Hello world\n");
        */

        /*
        //7 zadanie

        int a = 3;
        double b = 4.21;
        String s = "jakis tekst";
        System.out.printf("a = %d, b =%.2f, s = %20s %n",a,b,s);
         */

        /*
        //zadanie 7
        System.out.printf("alfa\tsin(alfa)\n");
        for (int i = 0; i < 370; i+=10)
            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));

        System.out.printf("arg\tlog2(arg)\tsum(arg)\n");
        double sumP = 0;
        double a = 2;
        for (int i = 1; i <10; i+= 1) {
            sumP += Math.pow(a, i);

            System.out.printf("%d\t%f\t\n", i, Math.log(i), sumP);
        }



        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
*/
        /*
        System.out.println("Podaj pierwsza liczbe");
        num1=input.nextInt();
        System.out.println("Podaj druga liczbe");
        num2=input.nextInt();
        System.out.printf("Wynik dodawania %d + %d = %d\n", num1,num2, num1+num2);
         */


        //problem z num2
/*
        do {
            System.out.println("Podaj pierwsza liczbe");
            num1=input.nextInt();
            if (num1!=0) {
                System.out.println("Podaj druga liczbe");
                num2 = input.nextInt();
            }
            System.out.printf("Wynik dodawania %d + %d = %d\n", num1,num2, num1+num2);
        }while
        ((num1 !=0) && (num2 !=0));


  do{
            int num1=0;
            int num2=0;
            System.out.println("Podaj pierwsza liczbe");
            num1=input.nextInt();
            if (num1 == 0) break;
            System.out.println("Podaj druga liczbe");
            num2 = input.nextInt();
            if (num2 == 0) break;
            System.out.printf("Wynik dodawania %d + %d = %d\n", num1,num2, num1+num2);
        }while (true);


        do{
            int num1=0;
            int num2=0;
            System.out.println("Podaj pierwsza liczbe");
            num1=input.nextInt();
            System.out.println("Podaj druga liczbe");
            num2 = input.nextInt();
            if ((num1 == 0) && (num2 == 0)) break;
            System.out.printf("Wynik dodawania %d + %d = %d\n", num1,num2, num1+num2);
        }while (true);*/
        /*
        //10 zad
        System.out.println("podaj liczbe");
        int a = input.nextInt();
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toHexString(a));

         */
        /*
        int[] liczby = new int[30];
        Random rnd = new Random();
        for (int i =0; i <30; i++)
            liczby[i] = rnd.nextInt();
        int mx = Integer.MAX_VALUE;
        int mn = Integer.MIN_VALUE;
        long avg = 0;
        for (int l :liczby)
        {
            System.out.println(l);
            if (l<mn) mn =l;
            if (l>mx) mx =l;
            avg+=l;
        }
         */
        Account acc = new Account();
        acc.setName("Piotr Gołąbek");
        //acc.name = "Piotr Gołąbek";
        System.out.println(acc.getName());
    }
}
