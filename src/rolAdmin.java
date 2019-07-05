import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

public class rolAdmin extends MenuAlterno{
	String RUTA = "C:\\Users\\Marco\\eclipse-workspace\\Inventario\\login\\";
	
	public void Registrar() throws IOException, ParseException {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
	
			System.out.println("\n***CREAR USUARIO*** \n");
			
			System.out.println("Inserte un nombre de usuario:");
			String nombre = entrada.nextLine();

			System.out.println("Inserte una contraseña:");
			String pass = entrada.nextLine();
			System.out.println("Rol: 1- Acceso a todo Menu \n0-Acceso Limitado");
			String rol = entrada.nextLine();
			
			FileWriter product = new FileWriter(RUTA + nombre + ".csv");
    		product.write(nombre + " " +pass+ " " +rol );
    		product.close();
			
    		System.out.println("\n***Usuario Creado:***");
	
			}
	
	@SuppressWarnings("resource")
	public void Eliminar() throws FileNotFoundException {
		Scanner user = new Scanner(System.in);
		String sDirectorio = "C:\\Users\\Marco\\eclipse-workspace\\Inventario\\login";
		File f = new File(sDirectorio);
		
		System.out.println("Que usuario desea Eliminar? \n");
		


		File[] ficheros = f.listFiles();
		for (int x=0;x<ficheros.length;x++){

		  System.out.println(ficheros[x].getName()); 
		}
		 System.out.println(); 
		 
		String profile = user.nextLine ();
		
		String G = "Admin";
		
		if(profile.contains(G)) {
			System.out.println("\nEL USUARIO ES ADMINISTRADOR - NO SE PUEDE ELIMINAR\n");
		}
		else {
		
		
		File users = new File(RUTA + profile + ".csv");
		
		if (users.exists()) {
			//users.delete();
			 System.out.println("Usuario Eliminado");
		}
			 else {
				 System.out.println("\n El Usuario no esta en la lista"); 
			 }
		}
	}
	
	@SuppressWarnings("resource")
	public void Actualizar() throws IOException {
		Scanner user = new Scanner(System.in);
		System.out.println("Que Usuario desea actualizar: ");
		
		String antiguoUser = user.nextLine ();
		File articulo = new File(RUTA + antiguoUser +".csv"); 
		
		if (articulo.exists()) {
			
	    	System.out.println("Nuevo Nombre de usuario ");
	    	String Nnombre = user.nextLine ();
			
	    	System.out.println("Nueva contraseña: ");
	    	String pass = user.nextLine ();
	    	
	    	System.out.println("Rol: \n0:Usuario Limitado\n1:Usuario Admin ");
	    	String funcion = user.nextLine ();
	    	
	    		FileWriter product = new FileWriter(RUTA + Nnombre + ".csv");
	    		product.write(Nnombre + " " + pass + " " + funcion);
	    		product.close();
	    			articulo.delete();	

	    	System.out.println("\n***"+ antiguoUser + " Ha sido actualizado a " + Nnombre + "***");
		}
	       
	    else {
	    	System.out.println("\n "+ antiguoUser + " No Existe como usuario");
	    }
		
	
	}

}
