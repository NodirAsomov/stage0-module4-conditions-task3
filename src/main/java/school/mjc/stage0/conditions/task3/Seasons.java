package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {

        if (month>12){
            System.out.println("wrong number!");
        }

        if (month == 12) {
            System.out.println("December");
        }
        if
        (month == 11) {
            System.out.println("November");
        }
        if (month == 10) {
            System.out.println("October");
        }
        if (month == 9) {
            System.out.println("September");
        }
        if (month == 8) {
            System.out.println("August");
        }
        if (month == 7) {
            System.out.println("July");
        }
        if (month == 6) {
            System.out.println("June");
        }
        if (month == 5) {
            System.out.println("May");
        }
        if (month == 4) {
            System.out.println("April");
        }
        if (month == 3) {
            System.out.println("March");
        }
        if (month == 2) {
            System.out.println("February");
        }
        if (month == 1) {
            System.out.println("January");
        }
    }


        public static void main (String[]args){
            Seasons seasons = new Seasons();
            seasons.tellTheSeasonByMonthNumber(6);

        }
    }
