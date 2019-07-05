import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


import org.json.simple.parser.ParseException;

public class login extends rolAdmin{
	


	@SuppressWarnings({ "unused", "static-access", "resource" })
	public void Login() throws IOException, ParseException {
		
		Menu a = new Menu();
		manejador login = new manejador();
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("\nBienvenido \n");
	System.out.println("Introduzca su usuario");
	String user = scanner.nextLine();
	
	String ad = "Admin";
	File profile = new File("C:\\Users\\Marco\\eclipse-workspace\\Inventario\\login\\" + user + ".csv"); 
	File Admin = new File("C:\\Users\\Marco\\eclipse-workspace\\Inventario\\login\\Admin.csv"); 
	
	 if (profile.exists()) {
			System.out.println("Introduzca su Password");
			String pass = scanner.nextLine();
			
			if(user.equals(ad)) {
				System.out.println("\n*** USUARIO ADMINISTRADOR *** \n");
				login.runAdmin();
				
			}
			
			int pas = Integer.valueOf(pass);
			BufferedReader br = new BufferedReader (new FileReader ("C:\\Users\\Marco\\eclipse-workspace\\Inventario\\login\\" + user + ".csv"));
			String linea = br.readLine();
			String palabra[] = linea.split(" ",3);
			Integer part2 = Integer.valueOf(palabra[1]);
			Integer part3 = Integer.valueOf(palabra[2]);
			
			if(pas == part2 && part3 == 1) {
				
				System.out.println("\n ***Logeado*** \n");
				a.correrInventario();
				
				
			}else if(pas == part2 && part3 == 0) {
				
				login.runMenuAlterno();
			}
					
			else {
				System.out.println("Password incorrecto \n");
			
			}
	 }

    else {
   	 
        System.out.println("Usuario no creado"); 
	
    }
  }

}
