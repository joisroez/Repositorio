/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class GenerarCodigo {
     private String archivo;

    public GenerarCodigo(String Archivo) {
        this.archivo = Archivo;
    }

    public int contarElementos(){
       int elementos = 0;

       try{
            FileReader archivoEntrada = new FileReader(archivo);
            BufferedReader fr = new BufferedReader(archivoEntrada);
            String c;

            while((c=fr.readLine()) != null)
            {
                elementos++;
            }
       }
       catch(IOException fnfe){
            JOptionPane.showMessageDialog(null,fnfe.toString(),"* * *   ERROR   * * *",2);
       }

       return elementos;
    }

}
