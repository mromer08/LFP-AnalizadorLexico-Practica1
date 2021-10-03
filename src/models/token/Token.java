package models.token;

/**
 * Clase modelo para la creacion de Tokens
 *
 * @author Manu
 */
public class Token {

    private String cadena;
    private TipoToken tipo;
    private int fila;
    private int cantidad;
    private int columna;

    public Token(String cadena, TipoToken tipo) {
        this.cadena = cadena;
        this.tipo = tipo;
        this.cantidad = 1;
    }

    public Token(String cadena, TipoToken tipo, int fila, int columna) {
        this(cadena, tipo);
        this.columna = columna;
        this.fila = fila;
    }

    /**
     * Método para obtener el tipo de token
     *
     * @return Retornar el tipo del token, si no lo tiene asignado retorna null.
     */
    public TipoToken getTipo() {
        return tipo;
    }

    /**
     * Método para obtener el valor de la cadena del token
     *
     * @return Retorna un string con el contenido del token
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * Método para obtener la fila en la que se encuentra el token
     *
     * @return Retorna el número de fila en la que está el token.
     */
    public int getFila() {
        return fila;
    }

    /**
     * Método para cambmiar el número de fila donde se encuentra el token
     *
     * @param fila Número de fila en la que se encuentra el token
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * Método para obtener la cantidad de veces que se repite el token
     *
     * @return Valor entero que define cuantas veces se repite un token.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Método para aumentar la cantidad de veces que se repite un toquen de unidad
     * en unidad.
     */
    public void setCantidad() {
        this.cantidad++;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cadena == null) ? 0 : cadena.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Token other = (Token) obj;
        if (cadena == null) {
            if (other.cadena != null) {
                return false;
            }
        } else if (!cadena.equals(other.cadena)) {
            return false;
        }
        if (tipo != other.tipo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Token [cadena=" + cadena + " cantidad=" + cantidad + " tipo=" + tipo + "]";
    }
}
