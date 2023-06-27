import java.util.*;

class SimpleLinkedList<T> {

    Node<T> record = null;
    
    class Node<T>{
        T data;
        Node<T> next;
        Node(T data,Node next){
            this.data = data;
            this.next = next; 
        }

        Node(T data){
            this.data=data;
            this.next=null;
        }
    }
    
    SimpleLinkedList() {
        
    }

    SimpleLinkedList(T[] values) {
        Node<T> temp = null;
        for(int i=0;i<values.length;i++){
            if(i==0){
                this.record = new Node<T>(values[i]);
                temp = this.record;
            }
            else{
                temp.next = new Node<T>(values[i]);
                temp = temp.next;
            }
        }
    }

    void push(T value) {
        Node<T> temp = this.record;
        record = new Node<T>(value);
        record.next = temp;
    }

    T pop() {
        if(this.record != null){
            T temp = this.record.data;
            this.record = this.record.next;
            return temp;
        }
        throw new NoSuchElementException();
    }

    void reverse() {
        Node rev = null;
        Node head = this.record;
        Node next = head.next;
        while(head != null){
            head.next = rev;
            rev = head;
            head = next;
            if(next !=null) next = next.next;
        }
        this.record = rev;
    }

    T[] asArray(Class<T> clazz) {
       ArrayList<T> arr = new ArrayList<>();
        if(this.record != null){
            Node<T> temp = this.record;
            while(temp != null){
                arr.add(temp.data);
                temp = temp.next;
            }
        }
        return (T[])arr.toArray();
    }

    int size() {
        int size=0;
        Node head = this.record;
        while(head!=null){
            size++;
            head = head.next;
        }
        return size;
    }
}
