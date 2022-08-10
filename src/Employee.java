public class Employee {

    //attributes
    String employeeName;
    int employeeCode;
    double salary;
    String dob;
    int age;

    //behavior
    public double salaryHike(double hikePercentage) {

        return salary + (salary * hikePercentage / 100);
    }

    public void display() {

        System.out.println("Employee name = " + employeeName);
        System.out.println("Employee code = " + employeeCode);
        System.out.println("Age = " + age);
        System.out.println("DOB = " + dob);
        System.out.println("Salary = " + salary);

    }

}
