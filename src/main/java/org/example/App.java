package org.example;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class App {
    public static void main(String[] args){
        Scanner retire = new Scanner(System.in);
        System.out.print("What is your current age? ");
        String age = retire.nextLine();
        int a = Integer.parseInt(age);
        System.out.print("At what age would you like to retire? ");
        String ret = retire.nextLine();
        int b = Integer.parseInt(ret);
        int c = b - a;
        System.out.println("You have " + c + " years left until you can retire");
        Date now = new Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyy");
        Calendar dates = Calendar.getInstance();
        dates.setTime(now);
        dates.add(Calendar.YEAR, c);
        String year = date.format(dates.getTime());
        System.out.println("It's " + date.format(now) + ", so you can retire in " + year + ".");

    }
}
