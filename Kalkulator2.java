import java.util.Scanner;

public class Kalkulator2{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Witaj w Kalkulatorze! Jakie dzialanie chcesz wykonac?");
		System.out.println("1. Dodawanie");
		System.out.println("2. Odejmowanie");
		System.out.println("3. Mnozenie");
		System.out.println("4. Dzielenie");
		System.out.println("5. Reszta z dzielenia");
		System.out.println("\n");
		int wybor = scanner.nextInt();
		
		while (wybor<1||wybor>5){
			System.out.println("Zly numer wyboru. Podaj jeszcze raz, jakie dzialanie chcesz wykonac: ");
			wybor = scanner.nextInt();
		}
		System.out.println("Podaj pierwsza liczbe: ");
		double firts = scanner.nextDouble();
		System.out.println("Podaj druga liczbe: ");
		double second = scanner.nextDouble();
		switch (wybor){
			case 1:
			double d = (firts+second);
			System.out.println("Wynik Twojego dodawania to "+d);
			break;
			case 2:
			double o = (firts-second);
			System.out.println("Wynik Twojego odejmowania to "+o);
			break;
			case 3:
			double m = (firts*second);
			System.out.println("Wynik Twojego mnozenia to "+m);
			break;
			case 4:
			double z = (firts/second);
			System.out.println("Wynik Twojego dzielenia to "+z);
			break;
			case 5:
			double r = (firts%second);
			System.out.println("Reszta z dzielenia "+firts+" przez "+second+" to "+r);
			break;
		}
		System.out.println("\n");
		System.out.println("Dzieki za skorzysztanie z Kalkulatora! Do zobaczenia!");
		
	}	
}