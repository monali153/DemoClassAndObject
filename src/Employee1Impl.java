public class Employee1Impl {

    public static void main(String[] args) {

        Emplyoee1 daniel = new Emplyoee1("Daniel", 130, 32, "12/12/1990", "124, bridge water, eville", 3000);

        double annualSalary = daniel.annualSalary();
        System.out.println("annualSalary = " + annualSalary);

        System.out.println("Monthly Salary before pay raise = " + daniel.salary);

        System.out.println("Monthly Salary after pay raise = " + daniel.payHike(20));


    }
}
