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
public class Arbol {
    NodoArbol raiz;
    int cant;
    int altura;
        
    public Arbol(){
        raiz = null;
    }
   
    
    
    public void insertar(int n){
        NodoArbol nuevo = new NodoArbol(n);
        if(raiz==null){
            raiz=nuevo;
        }else{
            NodoArbol aux=raiz;
            NodoArbol hijo;
            while(true){
                hijo=aux;
                if(n<aux.numero){
                    aux=aux.izq;
                    if(aux==null){
                        hijo.izq=nuevo;
                        return;
                    }
                }else{
                    aux=aux.der;
                    if(aux==null){
                        hijo.der = nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    public int returnAltura(){
        altura=0;
        returnAltura(raiz,1);
        return altura;
    }
    private void returnAltura(NodoArbol cor, int nivel){
        if (cor !=null) {
            returnAltura(cor.izq, nivel + 1);
            if(nivel>altura){
                altura=nivel;
        }
            returnAltura(cor.der, nivel + 1);
}
}
    String[] niveles;
    
    public void imprimirNivel(){
        niveles = new String[altura + 1];
        
        imprimirNivel(raiz, 0);
        for (int i = 0; i < niveles.length; i++) {
            System.out.println(niveles[i] + "El nivel: "+ i);
        }
    }
    
    private void imprimirNivel(NodoArbol rama, int nivel2){
        if (rama!=null) {
            niveles[nivel2]=rama.numero + ", "+ ((niveles[nivel2] != null) ? niveles[nivel2] : "");
            imprimirNivel(rama.der, nivel2 +1);
            imprimirNivel(rama.izq, nivel2 + 1);
        }
    }
    
    public NodoArbol Raiz(){
        return raiz;
    }
    public void inOrden(NodoArbol ra){
        if(ra !=null){
            inOrden(ra.izq);
            System.out.println(ra.numero + ", ");
            inOrden(ra.der);
        }
    }
    public void preOrden(NodoArbol ra){
        if(ra!=null){
            System.out.println(ra.numero + ",");
            preOrden(ra.izq);
            preOrden(ra.der);
        }
    }
    public void postOrden(NodoArbol ra){
        if(ra!=null){
            postOrden(ra.izq);
            postOrden(ra.der);
            System.out.println(ra.numero+ ",");
        }
    }
}
