import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

public class MenuAlterno extends Admin{

		public void runMenuAlterno() throws IOException, ParseException {
			
			manejador manage = new manejador();
			
			@SuppressWarnings("resource")
			Scanner entradaEscaner = new Scanner (System.in); 
			
			while(true) {
				
			System.out.println("\n *********Opciones De Inventario********** \n");
			System.out.println("1. Agregar Articulo");
			System.out.println("2. Eliminar Articulo");
			System.out.println("3. Buscar Articulo");
			System.out.println("4. Mostrar Inventario");
			System.out.println("5. Actualizar Inventario \n");
			System.out.println("6. Imprimir Inventario \n");
			System.out.println("7. LOG OUT");
			
			String entrada = entradaEscaner.nextLine ();
			int result = Integer.parseInt(entrada);
			
			switch(result) {
			
			
			case 1: System.out.println("Usuario no habilitado para esta funcionalidad");
			break;
			
			case 2: System.out.println("Usuario no habilitado para esta funcionalidad");
			break;
			
			case 3: manage.buscarInventario();
			break;
			
			case 4: manage.mostrarInventario();
			break;
					
			case 5: System.out.println("Usuario no habilitado para esta funcionalidad");
			break;
			
			case 6: manage.guardarInventario();
			break;
			
			case 7: manage.Login();
			break;
			
				}
			
		}
			
		}
		
	}
