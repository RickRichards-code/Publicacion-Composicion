public class Publicacion {
    private int nroSecciones;
    private Seccion s[]=new Seccion[50];
    public Publicacion(){
        nroSecciones = 3;
        for (int i = 0;i<nroSecciones;i++){
            s[i] = new Seccion();
        }
    }
    public void mostrar(){
        System.out.println("=============== Publicacion ===============");
        System.out.println("nroSecciones: "+nroSecciones);
        for (int i = 0 ; i< nroSecciones ;i++){
            s[i].mostrar();
        }
    }
    public void leer(){
        System.out.println("=============== Igrese Datos Publicacion ===============");
        System.out.println("ingrese nroSecciones: ");
        nroSecciones = Leer.datoInt();
    }
}
