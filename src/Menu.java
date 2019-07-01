import java.io.IOException;
import java.util.Scanner;
import org.json.simple.parser.ParseException;


public class Menu {

	
	public static void main(String [] arg) throws IOException, ParseException {
		Scanner entradaEscaner = new Scanner (System.in); 
		
		
		while(true) {
			
		System.out.println("\n *********Opciones De Inventario********** \n");
		System.out.println("1. Agregar Articulo");
		System.out.println("2. Eliminar Articulo");
		System.out.println("3. Buscar Articulo");
		System.out.println("4. Mostrar Inventario \n");
		
		
		String entrada = entradaEscaner.nextLine ();
		int result = Integer.parseInt(entrada);
		
		switch(result) {
		
		case 1: inventario.agregarArticulo();
		break;
		
		case 2:
			
		break;
		
		case 3: inventario.eliminarInventario();
		break;
		
		
		case 4:  inventario.mostrarInventario();
		break;
		
		}
		}
		
		
	
		
		
	}

	private static void inventario() {
		// TODO Auto-generated method stub
		
	}
		
}
