package barricada_ejercicio;

// Clase usuario zona segura
public class Usuario {

    String correo;
    String contrasena;
    int edad;

    // implementar constructor: Usuario(String correo, String contrasena, int edad)
    public Usuario(String correo, String contraseña, int edad) {
        this.correo = correo;
        this.contrasena = contraseña;
        this.edad = edad;
    }

    // implementar método: mostrarInfo()
    public void showInfo() {
        System.out.println("Correo\t Contraseña \t Edad");
        System.out.printf("%s \t %s \t %d \n", this.correo, this.contrasena, this.edad);
    }

}
