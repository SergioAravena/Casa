



package controlador;

import modelo.*;



/**
 *
 * @author Sergio Aravena
 */
public class Cola {
    
    private Nodo primero;

    private Nodo ultimo;

    private int tamaño;
    
    public Cola() {
        this.primero = null;
        this.ultimo = null;

     
    }

    public boolean estaVacia() {

        if (this.primero == null) {
            return true;
        }
        return false;

    }

    public void Push(Jugador dato) {

        Nodo nuevo = new Nodo(dato, null);

        if (estaVacia()) {

            this.primero = nuevo;
            this.ultimo = nuevo;

        } else {

            this.ultimo.setSiguiente(nuevo);

            this.ultimo = nuevo;
           

        }
        tamaño++;
        
 
    }

    public Jugador Pop() {

        if(!estaVacia()){
            
            Nodo aux = primero;
            
            this.primero = this.primero.getSiguiente();
            tamaño--;
            return aux.getDato();
        }
        return null;
    }

    
    public Jugador Peek(){
        
        return this.primero.getDato();
        
    }
    
    public int tamaño(){
        
       return tamaño;
        
    }
    
    
}
