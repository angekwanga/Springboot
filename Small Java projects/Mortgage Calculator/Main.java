import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Mortgage Calculator!");
        System.out.println("Principal: ");
        int principal = scanner.nextInt();
        System.out.println("Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble();
        System.out.println("Period (Years): ");
        int years = scanner.nextInt();
        double Mortgage = calculateMortgage(principal, annualInterestRate, years);
        String MortgageFormatted = String.format("Mortgage: $%.2f", Mortgage);
        System.out.println(MortgageFormatted);
    }
    public static double calculateMortgage(int principal, double annualInterestRate, int years) {
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = years * 12;
        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) /
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        return mortgage;
    }

}