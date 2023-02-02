

package com.mycompany.listadobleenlazada;


public class DoubleList<T> {
    
    Node head;
    Node tail;
    int size;
    
    //CONSTRUCTORES
    
    public DoubleList(){
        this.head = this.tail = null;
        this.size = 0;
    }
    
    //METODOS
    
    public boolean empty(){
        return this.head == null;
    }
    
    public int size() {
        return size;
    }
    
    public void pushFront(Node n){
        if(empty()){
            this.head = this.tail = n;
        }else{
            this.head.setPrev(n);
            n.setNext(this.head);
            this.head = n;
        }
        this.size ++;
    
    }
    
    public void pushBack(Node n){
        if(empty()){
            this.head = this.tail = n;
        }else{
            this.tail.setNext(n);
            n.setPrev(this.tail);
            this.tail = n;
        }
        this.size ++;
    
    }
    
    
    public T popFront(){
        if(empty()){
            throw new IllegalArgumentException("Esta vacío pa");
        }else{
            T data = (T) this.head.getData();
            if(this.size == 1){
                this.head = this.tail = null;
            }else{
                this.head = this.head.getNext();
                this.head.setPrev(null);
            }
            this.size --;
            return data;
        }
        
    
    }
    
    public T popBack(){
        if(empty()){
            throw new IllegalArgumentException("Esta vacío pa");
        }
        T data = (T) this.head.getData();
        if(this.size == 1){
            this.head = this.tail = null;
        }else{
            this.tail = this.tail.getPrev();
            this.tail.setNext(null);
        }
        this.size --;
        return data;
        
    }
    
    public DoubleList unir(DoubleList list2){       
        this.size = this.size + list2.size();
        //Si esta lista esta vacia, la union es la lista 2
        if(empty()){
            this.head = list2.getHead();
            this.tail = list2.getTail();
        }else{
            // obtenemos la cola de lista 1 y que esta apunte a la cabeza de lista 2
            this.tail.setNext(list2.getHead());
            // Verificamos que la lista que vamos a unir no esté vacía
            if(list2.getHead()!=null){
                // la cola de lista 1 ahora va a hacer la de lista 2
                this.tail = list2.getTail();
                list2.getHead().setPrev(this.tail);
            }            
            
        }
        
        return this;
        
    }
    
    public void clean(){
        this.head = this.tail = null;
        this.size = 0;
    }
    
    public void stringTo(){
        
        Node n = this.head;
        String cad = "[ ";
        while(n!=null){
            cad += n.getData() + " ";
            n = n.getNext();
        }
        System.out.println(cad + " ]");
        
    }
    
    //GETTERS AND SETTERS

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
   
    
    
}
