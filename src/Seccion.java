
public class Seccion {
    private String nombre;
    private int nroNoticias;
    private  Noticia n[] = new Noticia[50];
    public Seccion(){
        nombre = "deporte";nroNoticias = 4;
        for (int i = 0;i<nroNoticias;i++){
            n[i] = new Noticia();
        }

    }
    public void mostrar() {
        System.out.println("===== Seccion =====");
        System.out.println("nombreSec: " + nombre);
        System.out.println("nroNoticias: " + nombre);
        for (int i = 0; i < nroNoticias; i++) {
            n[i].mostrar();
        }
    }
    public void leer() {
        System.out.print("===== ingrese los Datos Seccion =====");
        System.out.print("ingrese nombreSec: " );
        nombre = Leer.dato();
        System.out.println("ingrese nroNoticias: " );
        nroNoticias = Leer.datoInt();
        for (int i = 0; i < nroNoticias; i++) {
            n[i].mostrar();
        }
    }

}
