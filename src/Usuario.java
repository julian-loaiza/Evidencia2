public class Usuario {
    //Atributos de tipo privado como id
    private int idUsuario;
    private String nombre;
    private  String apellido;
    private int numeroIdentificacion;
    //Instanciar la clase Libro para relacionar el usuario con un libro
    private Libro libroPrestado;
    //Constructor para inicializar los atributos
    public Usuario(int idUsuario, String nombre, String apellido, int numeroIdentificacion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
    }
//Metodos a implementar para prestar un libro al usuario
    public void prestarLibro(Libro libro) {
        if (libro.isDisponible()) {
            this.libroPrestado = libro;
            libro.actualizarDisponibilidad(false);
            libro.asignarUsuarioPrestamo(nombre + " " + apellido);
            System.out.println("Libro prestado por el usuario: " + nombre + " " + apellido);
            libro.mostrarInformacion();
        } else {
            System.out.println("El libro no está disponible para préstamo.");
        }
    }


}
