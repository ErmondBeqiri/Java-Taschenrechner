package uebung;
import java.util.Scanner;
public class Taschenrechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);
		   
		   while(true) {
	            System.out.println("Wählen Sie eine Option:");
	            System.out.println("1. Taschenrechner");
	            System.out.println("2. Linieare Funktionen");
	            System.out.println("3. Dezimal zu Binär");
	            System.out.println("4. Binär zu Dezimal");
	            System.out.println("5. Beenden");
	            int option = scanner.nextInt();

	            if(option == 1) {
	                System.out.println("Geben Sie zwei Zahlen ein:");
	                int a = scanner.nextInt();
	                int b = scanner.nextInt();

	                System.out.println("Plus: " + (a + b));
	                System.out.println("Minus: " + (a - b));
	                System.out.println("Mal: " + (a * b));
	                System.out.println("Geteilt: " + (a / b)); 
	               
	            }
	                
	                
	                if(option == 2) {
	                // Lineare Funktion: y = mx + c
	                System.out.println("Geben Sie die Steigung (m) und den y-Achsenabschnitt (c) ein:");
	                int m = scanner.nextInt(); // Steigung
	                int c = scanner.nextInt(); // y-Achsenabschnitt

	                for(int x = 0; x < 10; x++) {
	                    int y = m * x + c;
	                    System.out.println("Der Wert von y für x = " + x + " ist: " + y);
	                }
	            } else if(option == 3) {
	                System.out.println("Geben Sie eine Dezimalzahl ein:");
	                int num = scanner.nextInt();
	                String bin = "";
	                for(int n = num; n > 0; n /= 2) {
	                    bin = (n % 2) + bin;
	                }
	                System.out.println("Binär: " + bin);
	            } else if(option == 4) {
	                System.out.println("Geben Sie eine Binärzahl ein:");
	                String bin = scanner.next();
	                int num = 0;
	                for(int i = 0; i < bin.length(); i++) {
	                    num = num * 2 + (bin.charAt(i) - '0');
	                }
	                System.out.println("Dezimal: " + num);
	            } else if(option == 5) {
	                break;
	            } else {
	                System.out.println("Ungültige Option. Bitte versuchen Sie es erneut.");
	            }
	        }

	        scanner.close();
	    }
	
	
	
	}


