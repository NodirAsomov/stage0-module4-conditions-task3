package school.mjc.stage0.conditions.task3;

public class Divider {
    //int b=5;
    //int a=11;
    public void isDividableBy5And11(int number) {

        if ((number / 5) < 0 && (number / 11) < 0){
            System.out.println("Dividible");
        }
        else {
            System.out.println("Non-Dividible");
        }

        if (number >= 0 || number <= 0) {
            System.out.println("Cannot divide by zero");
        }

    }

    public static void main(String[] args) {
        Divider obj = new Divider();
        obj.isDividableBy5And11(40);
    }

}
