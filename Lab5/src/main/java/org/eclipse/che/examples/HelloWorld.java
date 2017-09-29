package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
        
       SinglyLinkedList lista = new SinglyLinkedList() ;
       lista.addFirst("GUA");
       lista.addLast("ARG");
       lista.addLast("BRA");
       lista.addLast("PAN");
       
       String valor  = lista.removeFirst();
        while(valor != null){
            System.out.println(valor);
            valor = lista.removeFirst();
        }
    }
    
}
