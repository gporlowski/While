import java.util.Scanner;

public class While3 {
    public static final int[] DENOMINATIONS = new int[] {200, 100, 50, 20, 10, 5, 2, 1};
    public static final int AMOUNT_OF_BANKNOTES = 5;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj kwotę pieniędzy (liczba całkowitą): ");
        int value = scan.nextInt();
        System.out.println("\nOto kombinacja nominałów, które zajmie najmniej miejsca w portfelu:");
        simplestDenominations(value);
    }
    public static void simplestDenominations (int value) {
        int i = 0;
        int howMuchMoney;
        while (value > 0) {
            howMuchMoney = value / DENOMINATIONS[i];
            if (howMuchMoney > 0) {
                printAmountMoney(howMuchMoney, i);
            }
            value %= DENOMINATIONS[i];
            i++;
        }
    }
    public static void printAmountMoney (int howMuchMoney, int i) {
        if (i < AMOUNT_OF_BANKNOTES) {
            System.out.println(howMuchMoney + " x banknot " + DENOMINATIONS[i] + " złotowy.");
        } else {
            System.out.println(howMuchMoney + " x moneta " + DENOMINATIONS[i] + " złotowa.");
        }
    }
}
