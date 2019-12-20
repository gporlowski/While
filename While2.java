import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.print("Podaj liczbę całkowitą: ");
	  int number = scan.nextInt();
	  int power = 3;
	  int i = 1;
		while (number > power) {
		  power *= 3;
		  i++;
		}
		System.out.println("Potęga liczby 3, która jest większa od " + number + " to: " + i);
	}
}
