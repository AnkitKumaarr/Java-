public class AverageSalaryExcludeMIN_MAXLC1491 {
    static double average(int[] salary) {
        double average = 0;
        double min = salary[0];
        double max =0;
        double totalSum = 0;
        for (int i = 0; i < salary.length; i++) {
            totalSum += salary[i];
            if(min>salary[i]){
                min = salary[i];
            }
            if(max<salary[i]){
                max = salary[i];
            }
        }
        average = (totalSum -min - max)/(salary.length -2);
        return average;
    }
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        double average = average(salary);
        System.out.println(average);
    }
}
