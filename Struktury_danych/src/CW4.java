import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CW4 {
    public static void main(String[] args){
        List<Double> a=new LinkedList<>();
        String userData="";

        Scanner scn=new Scanner(System.in);
        System.out.println("Type numbers:");
        userData=scn.nextLine(); //pobranie danych od uzytkownika

        double i=1.0; //indeks typu double oraz zaczyna sie od 1, bo bedziemy dzielic z doublami
        for(String s:userData.split("[; ]")){ //podzielenie danych stosując "; "

            if(!s.isEmpty()) { //sprawdzenie czy string nie jest pusty
                a.add(Double.parseDouble(s) / i); //zamiana stringa na double, podzielenie przez indeks i wstawienie do listy
                i++;
            }
        }

        System.out.println(a);


        DecimalFormat df = new DecimalFormat(); //stworzenie nowego obiektu formatujacego
        df.setMaximumFractionDigits(2);     //ustawienie maksymalnej liczby cyfr po przecinku
        for(Double d:a)
        System.out.println(df.format(d));   //zastosowanie formatowania

    }

}
