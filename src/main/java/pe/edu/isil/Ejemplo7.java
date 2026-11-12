package pe.edu.isil;


public class Ejemplo7 {

    public static void main(String[] args) {
        Producto a = new Producto("Impresora", 1500);
        Producto b = new Producto("Impresora", 4500);
        Producto c = new Producto("Iphone 18 pro max", 8500);

        System.out.println("a.equals(b) " + a.equals(b));
        System.out.println("a.equals(c) " + a.equals(c));


    }
}