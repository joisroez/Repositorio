/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author manabi
 */
public class lectura_de_archivos {
      public static void lectura(String [] REPASO)
    {
          File archivo = null;
          FileReader fr = null;
          BufferedReader br = null;

          try {
             // Apertura del fichero y creacion de BufferedReader para poder
             // hacer una lectura comoda (disponer del metodo readLine()).
             archivo = new File ("C:\\archivo.txt");
             fr = new FileReader (archivo);
             br = new BufferedReader(fr);

             // Lectura del fichero
             String linea;
             while((linea=br.readLine())!=null)
                System.out.println(linea);
          }
          catch(Exception e){
             e.printStackTrace();
          }finally{
             // En el finally cerramos el fichero, para asegurarnos
             // que se cierra tanto si todo va bien como si salta
             // una excepcion.
             try{
                if( null != fr ){
                   fr.close();
                }
             }catch (Exception e2){
                e2.printStackTrace();
             }
            }
    }

}
