public class EmpWageUC6 {
    public static final int is_part_time = 1;
    public static final int is_full_time = 2;
    public static final int emp_rate_per_hour = 25;
    public static final int num_of_working_days = 20;
    public static final int max_hrs_in_month = 100;

    public static void main(String[] args) {
        int totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= max_hrs_in_month && totalWorkingDays <= num_of_working_days) {
            int empHrs = 0;
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10 ) % 3;
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
            totalEmpHrs += empHrs;
            int empWage = empHrs * emp_rate_per_hour;
            totalEmpWage += empWage;
            System.out.println("Emp wage: " + empWage);
        }
        System.out.println("Total Emp wage: " + totalEmpWage);
    }

}
