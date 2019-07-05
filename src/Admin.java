import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

public class Admin {

	public void runAdmin() throws IOException, ParseException {
		
		
		
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
		System.out.println("7. Crear usuario");
		System.out.println("8. Eliminar usuario");
		System.out.println("9. Actualizar usuario \n");
		System.out.println("10. LOG OUT");
		
		manejador manage = new manejador();
		
		String entrada = entradaEscaner.nextLine ();
		int result = Integer.parseInt(entrada);
		
		switch(result) {
		
		
		case 1: manage.agregarArticulo();
		break;
		
		case 2: manage.eliminarInventario();
		break;
		
		case 3: manage.buscarInventario();
		break;
		
		case 4: manage.mostrarInventario();
		break;
				
		case 5: manage.actualizarArticulo();
		break;
		
		case 6: manage.guardarInventario();
		break;
		
		case 7: manage.Registrar();
		break;
		
		case 8: manage.Eliminar();
		break;
		
		case 9: manage.Actualizar();
		break;
		
		case 10: manage.Login();
		break;
			}
		
	}
		
	}
	
	
}

