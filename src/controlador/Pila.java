
package controlador;

import modelo.*;

/**
 *
 * @author Sergio Aravena
 */
public class Pila {

    
   private Nodo inicio;

   private int tamaño;
   
   public Pila() {
       inicio=null;
       tamaño = 0;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
   
   
   public  boolean estaVacia(){
       
    return inicio==null;
   }
   
   
    public void Push(Jugador elemento){
        
        Nodo nuevo = new Nodo(elemento, null);
        
        if(estaVacia()){
            
            
            inicio=nuevo;
        }else{
            
            nuevo.setSiguiente(inicio);
            
            inicio=nuevo;
        }
        tamaño++;
    }
    
    
    
    public Jugador Pop(){
        
        Nodo aux = inicio;
        
        inicio=inicio.getSiguiente();
        aux.setSiguiente(null);
        tamaño--;
        
        Jugador resultado =  aux.getDato();
                
        aux=null;
        
        return resultado;
        
        
    }
   
    public Jugador Peek(){
        
        return inicio.getDato();
        
    }
    
    public int tamaño(){
        
        return tamaño;
        
    }
    
    public void limpiarPila(){
        
        
        while(!estaVacia()){
            Pop();
            
        }
    }
    
}
