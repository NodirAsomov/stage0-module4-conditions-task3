package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {


    public void calculateSalary(int salary) {
        int basicSalary=salary;
        if (basicSalary<0){
            System.out.println("wrong input");
        }
        else {
            if (basicSalary <= 10000) {
                System.out.println(salary * 0.15);
            } else if (basicSalary <= 20000||10000 < basicSalary) {
                System.out.println(salary * 0.18);
            } else if (basicSalary > 20000) {
                System.out.println(salary * 0.20);
            }
        }
        }

    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();
        calculator.calculateSalary(100);
    }
}
