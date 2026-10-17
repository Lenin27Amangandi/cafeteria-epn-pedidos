package main;


/** Error controlado del módulo (validación, lectura o escritura del CSV). */
public class PedidoException extends Exception {
    public PedidoException(String mensaje) {
        super(mensaje);
    }
}