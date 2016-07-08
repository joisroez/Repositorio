/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author Administrador
 */
public class ValidaCedula {
     String cedula;
    int [] verificador = {2,1,2,1,2,1,2,1,2};
    /** Creates a new instance of ValidaCedula */
    public ValidaCedula(String Cedula) {
        this.cedula = Cedula;
    }

    public boolean bienIngresada(int UltimoDigito){
        boolean ok = false;
        int[] vector = new int [9];
        int resultado = 0;
        for (int i=0; i<9; i++){
            vector [i] = Integer.parseInt(cedula.charAt(i) + "");
        }

        for (int j=0; j<9; j++){
            int auxres = vector[j] * verificador[j];
            if (auxres >= 10){
                String auxStr = auxres + "";
                resultado = resultado + (Integer.parseInt(auxStr.charAt(0)+"") + Integer.parseInt(auxStr.charAt(1)+""));
            }
            else
                resultado = resultado + auxres;
        }

        String res = resultado + "";

        int aux2 = (Integer.parseInt(res.charAt(0) + "") + 1) * 10;

        int resFinal = aux2 - resultado;

        if (resFinal == UltimoDigito){
            ok = true;
        }

        return ok;
    }

}
