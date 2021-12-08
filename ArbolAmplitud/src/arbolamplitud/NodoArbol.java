/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolamplitud;

/**
 *
 * @author vicsa
 */
public class NodoArbol {
    int numero;
    NodoArbol izq,der;
    
    public NodoArbol(int n){
        numero=n;
        izq=der=null;
    }
    public String toString(){
        return "El numero es: "+numero;
    }
}
