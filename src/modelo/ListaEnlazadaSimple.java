
package modelo;

/**
 *
 * @author Sergio Aravena
 */
public class ListaEnlazadaSimple {
    
    private Nodo primero;

    public ListaEnlazadaSimple() {
        listaVacia();
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    /**
     * Vacia la lista pasando el nodo centinela a null
     */
    private void listaVacia() {

        primero = null;

    }

    /**
     * *
     * Indica si la lista esta vacia
     *
     * @return true si esta vacia false si contiene un elemento
     */
    public boolean estaVacia() {

        return primero == null;

    }

    /**
     * Inserta un objeto al principio de la lista
     *
     * @param p Objeto insertado
     */
    public void insertarPrimero(Jugador o) {

        Nodo nuevo = new Nodo(o, null);

        if (primero == null) {

            primero = nuevo;
        } else {

            nuevo.setSiguiente(primero);

            primero = nuevo;

        }

    }
    /**
     * Inserta al final de la lista un objeto
     * @param p Objeto insertado
     */
    public void insertarUltimo(Jugador o) {

        Nodo aux = new Nodo(o, null);

        Nodo rec_aux;

        if (primero == null) {

            aux.setSiguiente(primero);

            primero = aux;

        } else {

            rec_aux = primero;

            while (rec_aux.getSiguiente() != null) {

                rec_aux = rec_aux.getSiguiente();

                rec_aux.setSiguiente(aux);

            }

        }

    }
    /**
     * Quita el primer elemento de la lista
     */
    public void quitarPrimero() {

        Nodo aux;

        if (!this.estaVacia()) {

            aux = primero;

            primero = primero.getSiguiente();

            aux = null;
        }

    }

      /**
     * Quita el ultimo elemento de la lista
     */
    public void quitarUltimo() {

        Nodo aux = primero;

        if (aux.getSiguiente() == null) {

            listaVacia();

        }

        if (!estaVacia()) {

            aux = primero;

            while (aux.getSiguiente().getSiguiente() != null) {
                aux = aux.getSiguiente();

                aux.setSiguiente(null);

            }

        }

    }

    
     /**
     * Devuelve el primero elemento de la lista
     * @return Último elemento
     */
    public Jugador primero() {

       Jugador elemento = null;

        if (!estaVacia()) {

            elemento = (Jugador) primero.getDato();

        }
        return elemento;
    }

    /**
     * Devuelve el último elemento de la lista
     * @return Último elemento
     */
    public Jugador ultimo() {

        Jugador elemento = null;

        Nodo aux = null;

        if (!estaVacia()) {

            aux = primero;

            while (aux.getSiguiente() != null) {

                aux = aux.getSiguiente();

                elemento = (Jugador) aux.getDato();

            }

        }

        return elemento;

    }


       /**
     * Devuelve el número de elementos de la lista
     * @return Número de elementos
     */
      public int cuantosElementos(){
          
          Nodo aux = null;
          
          int i = 0;
          
          
          aux = primero;
          
          while (aux !=null) {              
              aux = aux.getSiguiente();
              
              i++;
          }
          
          return i;
      }
    
     /**
     * Borra un elemento de la lista
     * @param pos Posición de la lista que queremos borrar
     */
      public void borraPosicion(int pos){
          
          Nodo aux, ant ;
          
          int cont=1;
          
          
          aux =primero;
          
          ant=null;
          
          while (aux!=null) {              
              if(pos== cont){
               
                  if(ant==null){
                     
                      primero = primero.getSiguiente();
                      
                      aux=null;
                      
                      
                  }else{
                 
                     ant.setSiguiente(aux);
                     
                     
                      
                      aux = null;
 
                  }
                  
              }else{
               ant=aux;
               aux=ant.getSiguiente();
                  cont++;
              }
          }
             
              
          }
          
     /**
     * Devuelve el primer el elemento y lo borra de la lista
     * @return Primer elemento
     */
          
     public Object devYBorrarPrimero(){
 
       Jugador p=primero();
 
        quitarPrimero();
 
        return p;
    }
          
     /**
     * Indica la posición de un objeto
     * @param t Objeto buscado
     * @return Posición del objeto buscado
     */
    public int indexOf(Object t) {

        Nodo aux = primero;
        if (this.estaVacia()) {
            return 0;
        } else {
            int contador = 0;
            boolean encontrado = false;
            while (aux != null && !encontrado) {
                if (t.equals(aux.getDato())) {
                    encontrado = true;
                }
                contador++;
                aux = aux.getSiguiente();
            }
            if (encontrado) {
                return contador;
            } else {
                return -1;
            }
        }
    }

     /**
     * Indica si un objeto existe en la lista
     * @param t Objeto a comprobar
     * @return True = el objeto existe
     */
    
    public boolean objetoExistente(Jugador t) {

        boolean existe = false;

        Nodo aux = primero;

        while (aux != null && !existe) {

            Object oActual = aux.getDato();

            if (oActual.equals(t)) {
                existe = true;
            }

            aux = aux.getSiguiente();
        }

        return existe;
    }


        
        
    public void imprimir(){
        Nodo pivote = primero;
        
        
        
        while(pivote != null){
            
            System.out.println("Nodo "+pivote.getDato().toString());
            
            pivote = pivote.getSiguiente();
        }
        
        
    }
    
    
}
