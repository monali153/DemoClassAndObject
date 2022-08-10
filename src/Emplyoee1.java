public class Emplyoee1 {

    String employeeName;
    int employeeCode;
    int employeeAge;
    String dob;
    String address;
    double salary;

    Emplyoee1(String employeeName, int employeeCode, int employeeAge, String dob, String address, double salary) {
        this.employeeName = employeeName;
        this.employeeCode = employeeCode;
        this.employeeAge = employeeAge;
        this.dob = dob;
        this.address = address;
        this.salary = salary;
    }

    public double annualSalary() {

        return salary * 12;
    }

    public double payHike(double hikdePercentage) {

        return (salary + (salary * hikdePercentage / 100));
    }
}
