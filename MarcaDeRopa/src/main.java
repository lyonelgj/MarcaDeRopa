public class main {
    public static void main(String[] args) {
        Socio s1 = new Socio("Lyonel", "García Jiménez","lyonelgarcia3@gmail.com"
        ,"calle pacuco peniche","54896127P");

        System.out.println(s1.toString());
        s1.EliminarCuenta();
        System.out.println(s1.toString());

    }

}