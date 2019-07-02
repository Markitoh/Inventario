import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

public class documento {
	static Scanner entradaEscaner = new Scanner (System.in); 
	static String RUTA = "C:\\Users\\Marco\\eclipse-workspace\\Inventario\\inventario\\";
	
	@SuppressWarnings("resource")
	public static void guardarInventario() throws IOException, ParseException  {
		
		
		File fichero = new File("C:\\Users\\Marco\\eclipse-workspace\\Inventario\\inventario\\IInventario.csv");
		fichero.delete();
		
		FilenameFilter filter=new FilenameFilter(){
			public boolean accept(File dir, String fileName) {
			return fileName.endsWith("csv");
			}
			};
			
			File f=new File(RUTA);
			String [] fileList=f.list(filter);
			 String producto = "IInventario";
			 FileWriter product = new FileWriter(RUTA + producto + ".csv");
			 
			 
			for (int i=0; i < fileList.length; i++){

			  String entireFileText = new Scanner(new File(RUTA +fileList[i]))
			  .useDelimiter("\\A").next();
			  
			product.write(entireFileText + "\r\n");

			}	
			product.close();
			
			System.out.println("--Archivo Generado--");
	}
}
