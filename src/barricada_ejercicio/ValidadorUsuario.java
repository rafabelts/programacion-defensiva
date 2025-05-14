package barricada_ejercicio;

// clase barricada
import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorUsuario {

    // method to validate the regex
    private static boolean isEmailValid(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();

    }

    // implementar método: validarCorreo(String correote)
    // aceptar emial que contengan @ y .
    public static String validarCorreo(String entradaCorreo) throws InputMismatchException {
        if (!isEmailValid(entradaCorreo)) {
            throw new InputMismatchException("Correo invalido");
        }

        return "";

    }

    // implementar método: validarContrasena(String contrasena)
    // constraseña debe tener longitud mayor o igual a 8
    public static String validarContrasena(String entradaContrasena) throws InputMismatchException {
        if (!(entradaContrasena.length() >= 8)) {
            throw new InputMismatchException("La contraseña tiene que tener una longitud de 8 o más caracteres");

        }

        return entradaContrasena;
    }

    // implementar método: validarEdad(String edadTexto)
    // edad debe ser mayor o gual a 15 y menor o igual a 50
    public static int validarEdad(int entradaEdad) throws InputMismatchException {
        if (entradaEdad < 15 && entradaEdad > 50) {
            throw new InputMismatchException("Edad inválida");

        }

        return entradaEdad;
    }
}
