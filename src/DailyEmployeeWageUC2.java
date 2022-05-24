public class DailyEmployeeWageUC2 {
    public static void main(String[] args) {
        int is_full_time = 1;
        int emp_rate_per_hour = 25;
        int emp_Hrs = 0;
        int emp_Wage = 0;
        double empCheck = Math.floor(Math.random() *10 ) % 2;
        System.out.println(empCheck);
        if (empCheck == is_full_time)
            emp_Hrs = 8;
        else
            emp_Hrs = 0;
        emp_Wage = emp_Hrs * emp_rate_per_hour;
        System.out.println("Emp Wage: " + emp_Wage);
    }
}
