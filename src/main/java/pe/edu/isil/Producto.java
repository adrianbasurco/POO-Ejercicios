package pe.edu.isil;

public class Producto {
    private String nombre;
    private Double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre(){
        return nombre;
    }
    public Double getPrecio(){
        return precio;
    }
    @Override
    public String toString(){
        return nombre + " - " + precio;
     }
     public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(obj instanceof Producto){
            Producto otro = (Producto)obj;
            return  this.nombre.equals(otro.getNombre());
            }
        return false;
        }
     }