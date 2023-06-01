
 /**
  *
  * @author Lyonel García
  */
public class Socio {
    private String NombreCompleto;

    private String apellidos;
    private String mail;
    private String Direccion;
    private String DNI;

     /**
      * @param nombreCompleto
      * @param mail
      * @param Direccion
      * @param DNI
      * @param apellidos
      */

    public Socio(String nombreCompleto, String apellidos, String mail, String Direccion, String DNI){
        this.NombreCompleto = nombreCompleto;
        this.apellidos = apellidos;
        this.mail = mail;
        this.Direccion = Direccion;
        this.DNI = DNI;
    }

     /**
      *
      * @param id
      *
      */

    public void CrearPedido(String id){

    }

     /**
      *
      * @param id
      *
      */

    public void EliminarPedido(String id){

    }

     /**
      *
      *
      */
    public void EliminarCuenta(){
        this.NombreCompleto = null;
        this.mail = null;
        this.DNI = null;
        this.Direccion = null;
    }

     /**
      *
      * @return String genera todos los datos
      */
    public String toString() {
        return "Socio" + '\n' +
                "NombreCompleto= " + NombreCompleto + '\n' +
                "mail='" + mail + '\n' +
                "Direccion='" + Direccion + '\n' +
                "DNI='" + DNI;
    }

     /**
      *
      * @param novedad
      * @return
      */
    public String RecibirNovedad(String novedad){
        String mail = this.mail;
        return mail;
    }

     /**
      * 
      * @param descuento
      * @return
      */
     public String RecibirDescuento(String descuento){
         String mail = this.mail;
         return mail;
     }
}
