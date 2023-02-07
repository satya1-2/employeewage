package employeewages;

public class wagesuc1 {
    public static void main(String[] args) {
        System.out.println("Employee present or absent :-");
        int IsFullTime = 1;//constant
        double empCheck = Math.floor(Math.random() * 20) % 2;
        if (empCheck == IsFullTime) { //condition check
            System.out.println("Employee it is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}
