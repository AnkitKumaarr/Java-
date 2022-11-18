import java.text.NumberFormat;
// import java.util.Locale;
import java.util.Scanner;
public class Salary_slip {
    public static void main(String[] args) {
        final int MONTHS =12;
        double tax = 0;
        System.out.println("Enter your Basic Salary");
        Scanner sc = new Scanner(System.in);
        int basicSalary = sc.nextInt();
        System.out.println("Your Basic Salary is "+basicSalary);
        double hra = basicSalary*0.50;
        double da = basicSalary *0.10;
        double ma =basicSalary *0.25;
        double ta = basicSalary*0.10;
        double pf = basicSalary*0.10;

        double grossSalary = basicSalary + hra + da + ta +ma;
        double annualSalary = grossSalary *MONTHS;
        if(annualSalary >=500000 && annualSalary <=800000){
            tax =0.10;
        }
        else if(annualSalary >=800000 && annualSalary <=100000){
            tax = 0.20;
        }
        else if(annualSalary >=100000){
            tax =0.30;
        }
        if (tax>0){
            tax = grossSalary *tax;
        }
        double netSalary = grossSalary -tax -pf;

        //NumberFormat format = NumberFormat.getInstance();
        NumberFormat nf = NumberFormat.getCurrencyInstance();


        // class loaded in heap and function loaded in stack

        // locale
        
        // Locale lc = new Locale("hi", "IND");

        System.out.println("******* Salary Slip *******");
        System.out.println("Basic Salry  --" + nf.format(basicSalary));
        System.out.println("HRA -- " + nf.format(hra));
        System.out.println("DA --" +nf.format(da));
        System.out.println("MA-- "+ nf.format(ma));
        System.out.println("TA-- "+ nf.format(ta));
        System.out.println("GROSS SALARY -- " +nf.format(grossSalary));
        System.out.println("Tax -- " +nf.format(tax));
        System.out.println("NET SALARY --"+nf.format(netSalary));


        sc.close();
    }
}
