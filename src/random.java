import java.util.Random;
import java.util.Scanner;

public class random {

	public static Random rand = new Random();
	
	public static String name1;
	public static String last;
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String yes ="";
	
		 name1 = name();
		 last = last();
		System.out.println(name1+" "+last);
		System.out.println("\n\n\n\n");
		System.out.println("Do you wanna change your First and last name\nYes Or No");
		while(!yes.equalsIgnoreCase("no")) {
			yes = scan.next() ;
			if(yes.equalsIgnoreCase("no")) {
				break;
			}
			name1 = name();
			last = last();
		System.out.println(name1+" "+last);
	
		}
		System.out.println("Insert your Email");
		String mail= scan.next();
		while(!(mail.equalsIgnoreCase("yahoo") || mail.equalsIgnoreCase("gmail") || mail.equalsIgnoreCase("hotmail"))) {
			System.out.println("make sure you type correct email");
			mail = scan.next();
		}
		System.out.println(name1+""+last+"@"+mail+".com");
		
		
		
	}
	
	
	
	public static String name() {
		int name;
		name = rand.nextInt(6)+1;
		
		
		String seyar = "Seyar";
		String morid = "Morid";
		String barry = "Baryalai";
		String toor = "Toryalai";
		String wali = "Wali";
		String arif = "Arif";
		
		if(name == 1) {
			return seyar;
		}else if(name == 2) {
			return morid;
		}else if(name == 3) {
			return barry;
		}else if(name == 4) {
			return toor;
		}else if(name == 5) {
			return wali;
		}else if(name == 6) {
			return arif;
		}
		return "";
	
	}
	public static String last() {
		int name;
		name = rand.nextInt(6)+1;
		
		
		String joyandah = "Joyandah";
		String joya = "Joya";
		String hashim = "Hashim";
		String ahmadi = "Ahmadi";
		String ghanizada = "Ghanizada";
		String ghousy = "Ghousy";
		
		if(name == 1) {
			return joyandah;
		}else if(name == 2) {
			return joya;
		}else if(name == 3) {
			return hashim;
		}else if(name == 4) {
			return ahmadi;
		}else if(name == 5) {
			return ghanizada;
		}else if(name == 6) {
			return ghousy;
		}
		return "";
	
	}
	
}
