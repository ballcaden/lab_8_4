import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birthYear = InputHelper.getRangedInt(scan, "Enter the year you were born: ", 1950, 2010);
        int birthMonth = InputHelper.getRangedInt(scan, "Enter the month you were born: ", 1, 12);
        int birthDay = InputHelper.getRangedInt(scan, "Enter the day you were born: ", 1, 32);
        int birthHour = InputHelper.getRangedInt(scan, "Enter the hour you were born: ", 1, 60);
        int birthMin = InputHelper.getRangedInt(scan, "Enter the minute you were born: ", 1, 60);
        System.out.print("Year: " + birthYear);
        System.out.print("\nMonth: " + birthMonth);
        System.out.print("\nDay: " + birthDay);
        System.out.print("\nHour: " + birthHour);
        System.out.print("\nMinute: " + birthMin);
    }
}