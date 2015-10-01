
package modelo;

/**
 *
 * @author Sergio Aravena
 */
public class Nodo {
    
    private Jugador dato;
    
    private Nodo siguiente;

    
    
    public Nodo() {
    }

    
    
    public Nodo(Jugador dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Jugador getDato() {
        return dato;
    }

    public void setDato(Jugador dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + ", siguiente=" + siguiente + '}';
    }

    

   
    
    
    
    
    
    
}
