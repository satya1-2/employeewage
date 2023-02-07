package employeewages;

public class calculateDailyEmployeewage {
    public static void main(String[] args) {
        int IsFullTime = 1;
        int EmpRatePerHrs = 20;

        int empHrs = 0;
        int empWages = 0;
        double empCheck = Math.floor(Math.random() * 20) % 2;
        if (empCheck == IsFullTime) {
            empHrs = 8;
        } else {
            empHrs = 0;
        }
        empWages = empHrs * EmpRatePerHrs;
        System.out.println(empWages);
    }
}


