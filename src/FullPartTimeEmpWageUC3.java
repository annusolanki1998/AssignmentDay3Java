public class FullPartTimeEmpWageUC3 {
    public static void main(String[] args) {
        int is_full_time = 2;
        int is_part_time = 1;
        int emp_rate_per_hour = 25;
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10 ) % 3;
        System.out.println(empCheck);
        if (empCheck == is_full_time)
            empHrs = 8;
        else if (empCheck == is_part_time)
            empHrs = 4;
        else
            empHrs = 0;
        empWage = empHrs * emp_rate_per_hour;
        System.out.println("The total EmpWage: " + empWage);
    }
}
