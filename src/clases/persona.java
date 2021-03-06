package clases;
import java.io.*;
public class persona
{
    protected String nombres;
    protected String apellidos;
    protected String cedula;
    private String codigo;
    protected String direccion;
    protected String lugarnacimiento;
    protected String nacionalidad;
    protected String sexo;
    protected String estadocivil;
    protected String dia_nacimiento;
    protected String mes_nacimiento;
    protected String anio_nacimiento;

     /**
     * Constructor predeterminado.
     */
     public persona() {
    }

     public persona(String Nombres, String Apellidos, String Cedula, String Codigo,String Direccion,String Lugarnacimiento, String Nacionalidad, String Sexo, String Estadocivil, String Dia_nacimiento, String Mes_nacimiento, String Anio_nacimiento)
     {
        setNombres(Nombres);
        setApellidos(Apellidos);
        setCedula(Cedula);
        setCodigo(Codigo);
        setDireccion(Direccion);
        setLugarnacimiento(Lugarnacimiento);
        setNacionalidad(Nacionalidad);
        setSexo(Sexo);
        setEstadocivil(Estadocivil);
        setDia_nacimiento(Dia_nacimiento);
        setMes_nacimiento(Mes_nacimiento);
        setAnio_nacimiento(Anio_nacimiento);
 }
     /// comentarios repetidos

      /**
        * Establece el Nombre de la Persona.
        * @param Estado_civil de la Persona.
        */
      public void setNombres(String Nombres){
            this.nombres = Nombres;
        }

        /**
        * Establece el Apellido de la Persona.
        * @param Estado_civil de la Persona.
        */
        public void setApellidos(String Apellidos){
            this.apellidos = Apellidos;
        }
         /**
        * Establece el Cedula.
        * @param Cedula de la Persona.
        */
        public void setCedula(String Cedula){
            this.cedula = Cedula;
        }

     /**
      * Establece el codigo del paciente.
      * @param codigo Codigo del paciente.
      */
    public void setCodigo(String Codigo){
        this.codigo = Codigo;
    }

        /**
        * Establece el a Persona.
        * @param Telefono de la Persona.
        */
        public void setDireccion(String Direccion){
            this.direccion = Direccion;
        }
        /**
        * Establece el Telefono de la Persona.
        * @param Telefono de la Persona.
        */
        public void setLugarnacimiento(String Lugarnacimiento){
            this.lugarnacimiento = Lugarnacimiento;
        }

         /**
        * Establece el Telefono de la Persona.
        * @param Telefono de la Persona.
        */
        public void setNacionalidad(String Nacionalidad){
            this.nacionalidad = Nacionalidad;
        }
         /**
        * Establece el Telefono de la Persona.
        * @param Telefono de la Persona.
        */
        public void setSexo(String Sexo){
            this.sexo = Sexo;
        }
         /**
        * Establece el Telefono de la Persona.
        * @param Telefono de la Persona.
        */
        public void setEstadocivil(String Estadocivil){
            this.estadocivil = Estadocivil;
        }

        /**
        * Establece la Dia_nacimiento de la Persona.
        * @param Dia_nacimiento de la Persona.
        */
        public void setDia_nacimiento(String Dia_nacimiento){
            this.dia_nacimiento = Dia_nacimiento;
        }
        /**
        * Establece la Mes_nacimiento de la Persona.
        * @param Mes_nacimiento de la Persona.
        */
        public void setMes_nacimiento(String Mes_nacimiento){
            this.mes_nacimiento = Mes_nacimiento;
        }
        /**
        * Establece la Anio_nacimiento de la Persona.
        * @param Anio_nacimiento de la Persona.
        */
        public void setAnio_nacimiento(String Anio_nacimiento){
            this.anio_nacimiento = Anio_nacimiento;
        }


///// comentar para getttttttttt

      /**
        * Establece el Nombre de la Persona.
        * @param Estado_civil de la Persona.
        */
      public String getNombres(){
            return this.nombres;
        }

        /**
        * Establece el Apellido de la Persona.
        * @param Estado_civil de la Persona.
        */
        public String getApellidos(){
            return this.apellidos;
        }
         /**
        * Establece el Cedula.
        * @param Cedula de la Persona.
        */
        public String getCedula(){
            return this.cedula;
        }
             /**
         * Regresa el codigo del paciente.
         * @return Un string con el codigo del paciente.
         */
      public String getCodigo(){
        return this.codigo;
        }

        /**
        * Establece el a Persona.
        * @param Telefono de la Persona.
        */
        public String getDireccion(){
            return this.direccion;
        }
        /**
        * Establece el Telefono de la Persona.
        * @param Telefono de la Persona.
        */
        public String getLugarnacimiento(){
            return this.lugarnacimiento;
        }

         /**
        * Establece el Telefono de la Persona.
        * @param Telefono de la Persona.
        */
        public String getNacionalidad(){
            return this.nacionalidad;
        }
         /**
        * Establece el Telefono de la Persona.
        * @param Telefono de la Persona.
        */
        public String getSexo(){
            return this.sexo ;
        }
         /**
        * Establece el Telefono de la Persona.
        * @param Telefono de la Persona.
        */
        public String getEstadocivil(){
            return this.estadocivil;
        }
               
          /**
        * Establece el Telefono de la Persona.
        * @param Telefono de la Persona.
        */

         /**
         * Regresa la Dia_nacimiento de la Persona.
         * @return Un string con la Dia_nacimiento de la Persona.
         */
        public String getDia_nacimiento(){
            return this.dia_nacimiento;
        }
        /**
         * Regresa la Mes_nacimiento de la Persona.
         * @return Un string con la Mes_nacimiento de la Persona.
         */
        public String getMes_nacimiento(){
            return this.mes_nacimiento;
        }
        /**
         * Regresa la Anio_nacimiento de la Persona.
         * @return Un string con la Anio_nacimiento de la Persona.
         */
        public String getAnio_nacimiento(){
            return this.anio_nacimiento;
        }


        public String datospersona(){
        String salida = "";
        salida +=  this.getCedula() + "\t" +getCodigo() + "\t" +this.getNombres() + "\t" + this.getApellidos()+ "\t" +this.getDireccion() + "\t"+this.getDia_nacimiento()+"\t" + this.getMes_nacimiento()+"\t" +  this.getAnio_nacimiento() + "\t" +this.getEstadocivil() + "\t" +this.getSexo() + "\t" + this.getNacionalidad() + "\t" +this.getLugarnacimiento() + "\t"   ;
        return salida;
     }


}
