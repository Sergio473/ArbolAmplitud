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
public class ArbolAmplitud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Arbol Agre = new Arbol();
        
       Agre.insertar(10);
       Agre.insertar(20);
       Agre.insertar(300);
       Agre.insertar(56);
       Agre.insertar(23);
       
        System.out.println("La raiz es: "+ Agre.Raiz());
        System.out.println("");
        System.out.println("La altura es: "+ Agre.returnAltura());
        Agre.imprimirNivel();
        System.out.println("");
        System.out.println("");
        Agre.inOrden(Agre.raiz);
        System.out.println("");
        Agre.postOrden(Agre.raiz);
        System.out.println("");
        Agre.preOrden(Agre.raiz);
    }
}
