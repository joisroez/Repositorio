package clases;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class buscar {
     private String archivo;
     private String palabra;

    public buscar(String Archivo) {
        this.archivo = Archivo;
    }
    //Extrae toda la línea de texto(CEDULA)
    public String BuscarDatos(String Palabra) {
        this.palabra = Palabra;
        String salida="";

        try{
            FileReader archivoEntrada = new FileReader(archivo);
            BufferedReader fr = new BufferedReader(archivoEntrada);
            String lineac;
            while((lineac=fr.readLine()) != null)
            {
                StringTokenizer tokenizador = new StringTokenizer(lineac);//codigo para recorrer cada linea de fichero
                    if (tokenizador.nextToken().equals(palabra))//compara el primer dato del fichero(C.I.)
                    {
                        salida+= lineac + "!";
                        break;
                    }
                
            }
            fr.close();
        }
        catch(IOException fnfe){
            salida = fnfe.toString();
        }
        return salida;
    }
}

