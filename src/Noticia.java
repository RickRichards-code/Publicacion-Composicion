public class Noticia {
    private String titulo, texto, fecha, hora;
    private Autor a = new Autor(); // compocision

    public Noticia(String titulo, String texto, String fecha, String hora, Autor a) {
        this.titulo = titulo;
        this.texto = texto;
        this.fecha = fecha;
        this.hora = hora;
        this.a = a;
    }
    public Noticia(){
        titulo = "lubias";
        texto = "aaa bbb ccc";
        fecha = "01/20/2000";
        hora = "10:30";
    }
    public void mostrar(){
//        System.out.println("======= noticia =======");
        System.out.println("titulo: "+titulo);
        System.out.println("texto: "+texto);
        System.out.println("fecha: "+fecha);
        System.out.println("hora: "+hora);
        a.mostrar();
    }
    public void leer(){
        System.out.println("===== ingrese los Datos =====");
        System.out.print("ingrese titulo: ");
        titulo = Leer.dato();
        System.out.print("ingrese texto: ");
        texto = Leer.dato();
        System.out.print("ingrese fecha: ");
        fecha = Leer.dato();
        System.out.print("ingrese hora: ");
        hora = Leer.dato();
        a.leer();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Autor getA() {
        return a;
    }

    public void setA(Autor a) {
        this.a = a;
    }

}
