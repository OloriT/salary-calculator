import com.sun.source.tree.WhileLoopTree;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class SalaryChecker {
    static NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);

    public static void main(String[] args) {
        //App that calculates the Annual and monthly gross and net salary of staff and their level

        new Scanner(System.in);
        Scanner sc;
        int salary = 0;

        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Enter a Salary: ");

            sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                salary = sc.nextInt();

                isValidInput = true;
                // Format the number as currency
                String formattedAmount = currencyFormatter.format(salary);
                //enter the Annual Gross salary
                System.out.println("Annual Gross Salary:" + " " + formattedAmount);

                //to get the monthly gross salary
                int monthlyGross = salary / 12;
                // Format the number as currency
                formattedAmount = currencyFormatter.format(monthlyGross);
                System.out.println("Monthly Gross Salary:" + " " + formattedAmount);

                //Get the tax deducted from the annual salary
                int taxDeduction = (int) (salary * (10.0f / 100.0f));
                // Format the number as currency
                formattedAmount = currencyFormatter.format(taxDeduction);
                System.out.println("Tax Deducted Annually:" + " " + formattedAmount);

                //Get the pension deducted from the annual salary
                int pensionDeduction = (int) (salary * (13.0f / 100.0f));
                // Format the number as currency
                formattedAmount = currencyFormatter.format(pensionDeduction);
                System.out.println("Pension Deducted Annually:" + " " + formattedAmount);


                //To get the Annual Net Salary(After tax deduction and removal of pension)
                int annualNet = salary - (taxDeduction + pensionDeduction);
                // Format the number as currency
                formattedAmount = currencyFormatter.format(annualNet);
                System.out.println("Annual Net Salary:" + " " + formattedAmount);

                //To get the Monthly net salary of staff
                int monthlyNet = annualNet / 12;
                // Format the number as currency
                formattedAmount = currencyFormatter.format(monthlyNet);
                System.out.println("Monthly Net Salary:" + " " + formattedAmount);


                //To determine the staff level
                if (salary >= 12000000) {
                    System.out.println("LEVEL:" + " " + "\u001B[34mSENIOR LEVEL" + "\u001B[0m");
                } else if (salary <= 11999999 && salary >= 6000000) {
                    System.out.println("LEVEL:" + " " + "\u001B[33mMID LEVEL" + "\u001B[0m");
                } else if (salary <= 5999999 && salary >= 1800000) {
                    System.out.println("LEVEL:" + " " + "\u001B[32mJUNIOR LEVEL" + "\u001B[0m");
                } else if (salary < 1800000 && salary >= 600000) {
                    System.out.println("LEVEL:" + "\u001B[35mOFFICE ASSISTANT" + "\u001B[0m");
                } else if (salary == 0) {
                    System.out.println("LEVEL:" + "\u001B[31mERROR, PLEASE ENTER CORRECT SALARY" + "\u001B[0m");
                } else {
                    System.out.println("\u001B[35mSALARY RANGE DOES NOT EXIST");
                }
            } else {
                String input = sc.next();
                System.out.println("Invalid input. Please enter an integer.");

            }
        }

    }
}
