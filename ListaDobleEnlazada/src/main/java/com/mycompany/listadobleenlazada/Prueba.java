
package com.mycompany.listadobleenlazada;


public class Prueba {
    public static void main(String[] args) {
        DoubleList<Integer> list = new DoubleList();
        list.pushFront(new Node(1));
        list.pushBack(new Node(2));
        list.pushBack(new Node(3));
        list.pushFront(new Node(4));
        System.out.println("tamanio: " + list.size());
        list.stringTo();
        list.popBack();
        list.stringTo();
        list.popFront();
        list.stringTo();
        list.popBack();
        list.stringTo();
        list.popFront();
        list.stringTo(); //queda vacia
        System.out.println("tamanio list : " + list.size());
        DoubleList<Integer> list2 = new DoubleList();
        list2.pushFront( new Node(7));
        list2.pushFront( new Node(8));
        list2.pushFront( new Node(9));
        System.out.print("List 2: ");
        list2.stringTo();
        list.unir(list2);
        System.out.println("Tamanio union: " + list.size());
        System.out.print("Union: ");
        list.stringTo();
        
        list2.clean();
        list.unir(list2);
        System.out.println("Tamanio union: " + list.size());
        System.out.print("Union: ");
        list.stringTo();
        list2.pushBack(new Node(6));
        list2.pushBack(new Node(5));
        System.out.print("List 2: ");
        list2.stringTo();
        list.unir(list2);
        System.out.println("Tamanio union: " + list.size());
        System.out.print("Union: ");
        list.stringTo();
    }
}
