import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

public class inventario {
	 private Scanner entradaEscaner = new Scanner (System.in); 
	 private String RUTA = "C:\\Users\\Marco\\eclipse-workspace\\Inventario\\inventario\\";
	
	
@SuppressWarnings("resource")
public void mostrarInventario() throws IOException {
	
	
	FilenameFilter filter=new FilenameFilter(){
		public boolean accept(File dir, String fileName) {
		return fileName.endsWith("csv");
		}
		};
		
		File f=new File(RUTA);
		String [] fileList=f.list(filter);
		
		for (int i=0; i < fileList.length; i++){

		  String entireFileText = new Scanner(new File(RUTA +fileList[i]))
		  .useDelimiter("\r\n").next();
		  
		 System.out.println(entireFileText);
			 
	}	
		
		return;	
}


@SuppressWarnings("resource")
public void buscarInventario() throws IOException  {

	System.out.println("Nombre del articulo a Buscar: ");
	String producto = entradaEscaner.nextLine ();
	
	File articulo = new File(RUTA + producto +".csv"); 
	
	 if (articulo.exists()) {
		 BufferedReader bf = new BufferedReader(new FileReader(RUTA + producto +".csv"));
			System.out.println("\n En Inventario: \n");
			
			String sCadena;
			while ((sCadena = bf.readLine())!=null) {
				
				   System.out.println(sCadena);
				}
	 }
        
     else {
    	 
         System.out.println("\n" +producto + " No Existe en Inventario"); 
	
     }
   	}


public void eliminarInventario(){
	
	System.out.println("Nombre del articulo a Eliminar: ");
	String producto = entradaEscaner.nextLine ();
	
	File fichero = new File(RUTA + producto + ".csv");
	
	if (fichero.exists()) {
		fichero.delete();
		 System.out.println("El producto ha sido borrado satisfactoriamente");
	}
		 else {
			 System.out.println("\n @@@@Producto No Se encuentra en Inventario@@@@"); 
		 }
    }

	
public void agregarArticulo() throws IOException	{	
	
	
	System.out.println("Nombre del articulo a agregar: ");
	String producto = entradaEscaner.nextLine ();

	File TextFile = new File(RUTA +producto + ".csv"); 
	
	if (TextFile.exists()) {
        System.out.println("Este Producto ya Existe en el Inventario"); 
	}
    else {
    System.out.println("Cantidad de articulo: ");
    String cantidad = entradaEscaner.nextLine ();
	FileWriter TextOut = new FileWriter(TextFile, true);
	TextOut.write(producto +" "+ cantidad + "\r\n");
	TextOut.close();
	
	System.out.print(producto + " Agregad@ al inventario \n \n");
    }
	
}


public void actualizarArticulo() throws IOException {
	
	System.out.println("Nombre del articulo a actualizar: ");
	String producto = entradaEscaner.nextLine ();
	File articulo = new File(RUTA + producto +".csv"); 
	
	if (articulo.exists()) {
		
    	System.out.println("Nueva cantidad inventario: ");
    	String cantidad = entradaEscaner.nextLine ();
    	
    		FileWriter product = new FileWriter(RUTA + producto + ".csv");
    		product.write(producto + " " + cantidad);
    		product.close();
    				

    	System.out.println("****"+ producto + " Ha sido actualizado ****");
	}
       
    else {
    	
    	System.out.println("\n "+ producto + " No Existe en el Inventario");
    }

}
}