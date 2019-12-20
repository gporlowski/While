import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    boolean contin = true;
		  while (contin) {
		    System.out.print("Czy chcesz zakończyć działanie programu: ");
		    String answer = scan.nextLine();
		    if (answer.equals("tak") || answer.equals("TAK") || answer.equals("Tak")) {
		        contin = false;
		    }
		  }
	}
}
