public class WagesMonthUC5 {
    public  static  final int is_part_time = 1;
    public  static  final int is_full_time = 2;
    public  static  final int emp_rate_per_hour = 25;
    public  static  final int num_of_working_day= 20;

    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
        int totalWage = 0;
        for(int day = 0; day < num_of_working_day; day ++ ) {
            int empCheck = (int) Math.floor(Math.random() * 10 ) % 3;
            //System.out.println(empCheck);
            switch (empCheck) {
                case is_part_time:
                    empHrs = 4;
                    break;
                case is_full_time:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * emp_rate_per_hour;
            totalWage += empWage;
            System.out.println("Employee wages are: " + empWage);
        }
        System.out.println("Total Employee wages are: " + totalWage);
    }
}
