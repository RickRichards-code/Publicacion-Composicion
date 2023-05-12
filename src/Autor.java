import java.util.Scanner;

public class Autor {
    private String nombre,apellido;

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Autor(){
        nombre = "Juan";apellido="Perez Perez";
    }
    public void mostrar(){
//        System.out.println("---- autor ----");
        System.out.println("nombre: "+nombre);
        System.out.println("apellidos: "+apellido);
    }
    public void leer(){
        Scanner sc = new Scanner(System.in);

        System.out.print("ingrese el nombre: ");
        nombre = Leer.dato();
        System.out.print("ingrese los apellidos: ");
        apellido = Leer.dato();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
