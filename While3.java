import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj kwotę (liczba całkowitą): ");
        int value = scan.nextInt();
        System.out.println("Oto kombinacja nominałów, które zajmie najmniej miejsca w portfelu:");
        twoHundred(value);
        hundred(value);
        fifty(value);
        twenty(value);
        ten(value);
        five(value);
        two(value);
        one(value);
    }
    public static void twoHundred (int value) {
        value = value / 200;
        if (value > 0) {
            System.out.println(value + " x banknot 200 złotowy.");
        }
    }
    public static void hundred (int value) {
        value = (value % 200) / 100;
        if (value > 0) {
            System.out.println(value + " x banknot 100 złotowy.");
        }
    }
    public static void fifty (int value) {
        value = (value % 100) / 50;
        if (value > 0) {
            System.out.println(value + " x banknot 50 złotowy.");
        }
    }
    public static void twenty (int value) {
        value = (value % 50) / 20;
        if (value > 0) {
            System.out.println(value + " x banknot 20 złotowy.");
        }
    }
    public static void ten (int value) {
        value = ((value % 50) % 20) / 10;
        if (value > 0) {
            System.out.println(value + " x banknot 10 złotowy.");
        }
    }
    public static void five (int value) {
        value = (value % 10) / 5;
        if (value > 0) {
            System.out.println(value + " x moneta 5 złotowa");
        }
    }
    public static void two (int value) {
        value = ((value % 10) % 5) / 2;
        if (value > 0) {
            System.out.println(value + " x moneta 2 złotowa");
        }
    }
    public static void one (int value) {
        value = ((value % 10) % 5) % 2;
        if (value > 0) {
            System.out.println(value + " x moneta 1 złotowa");
        }
    }
}
