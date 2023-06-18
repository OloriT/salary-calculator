import java.util.Scanner;

public class StudentCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int value1 = sc.nextInt();
        int value2 = sc.nextInt();

        int addition = value1+value2;

        System.out.println("Answer:"+" "+ "\u001B[34m"+addition);

        sc = new Scanner(System.in);
        value1 = sc.nextInt();
        System.out.println(value1);
        value2 = sc.nextInt();

        int minus = value1+value2;

        System.out.println("Answer:"+" "+ "\u001B[32m"+minus);

        sc = new Scanner(System.in);
        value1 = sc.nextInt();
        value2 = sc.nextInt();

        int multiplication = value1*value2;

        System.out.println("Answer:"+" "+ "\u001B[33m"+multiplication);

    }
}
