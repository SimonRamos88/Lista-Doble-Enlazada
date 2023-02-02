
package com.mycompany.listadobleenlazada;


public class Node <T>{
    T data;
    Node next;
    Node prev;
    
    //CONSTRUCTORES
    
    public Node(T data){
        this.data = data;
        this.next = this.prev = null;
    }
    
    public Node(){
        this(null);
    }
    
    //GETTERS AND SETTERS

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
    
}
