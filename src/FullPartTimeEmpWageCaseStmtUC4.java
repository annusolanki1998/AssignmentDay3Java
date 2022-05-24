public class FullPartTimeEmpWageCaseStmtUC4 {
    public static final int is_part_time = 1;
    public static final int is_full_time = 2;
    public static final int emp_rate_per_hour = 25;
    public static void main(String[] args) {
        int empWage = 0;
        int empHrs = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        System.out.println(empCheck);
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
        System.out.println("The total EmpWage is : " + empWage);
    }
}
