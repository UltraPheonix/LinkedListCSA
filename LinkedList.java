import javax.swing.*;

//NOTE US USING THE GENERIC SYNTAX AGAIN
public class LinkedList<E extends Comparable<E>>{


    /**
     * This is a node that will serve as the root of our LinkedList
     * It will always point to the first value in the List, and we can use it to use as a base for other pointers to
     * come from
     */
    public ListNode<E> front;

    // No constructor needed, java automatically generates a default constructor


    public void add(E newValue){
        if(front == null){
            front = new ListNode<>(newValue);
        }else{
            //Note the usage of pass by reference, pt will only POINT to the memory address that is used in root
            add(newValue, front);
        }
    }

    /**
     * @param newValue the new value to insert into the list
     * @param pt a pointer to the node currently being inspected
     */
    private void add(E newValue, ListNode<E> pt){
        if(pt.next() == null){
            pt.setNext(new ListNode<>(newValue));
        }else{
            //Recursive call to move the pointer to the next node in the list
            add(newValue, pt.next());
        }
    }

    public E delete(E value){
        if(front.value().equals(value)){
            E val = front.value();
            front = front.next();
            return val;
        }else{
            return delete(value, front);
        }
    }

    private E delete(E value, ListNode<E> pt){
        if(pt.next().value().equals(value)){
            E val = pt.next().value();
            pt.setNext(pt.next().next());
            return val;
        }else{
            return delete(value, pt.next());
        }
    }

    public E get(E value){
        return get(value, front);
    }

    private E get(E value, ListNode<E> pt){
        if(pt.value().equals(value)){
            return pt.value();
        }else{
            return get(value, pt.next());
        }
    }


    @Override
    public String toString() {
        ListNode<E> pt = front;
        String s = "";

        while(pt != null){
            s = s +  ( pt.value().toString()+ "->");
            pt = pt.next();
        }
        s+= "/";
        return s;
    }


    public void insertInFront(E newValue, E valueAfter){
        // TODO: 11/05/2023 Finish method
    }

    private void insertIntFront(E newValue, E valueAfter){
        // TODO: 11/05/2023 Finish method
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        System.out.println(list.toString());
        list.add(6);
        System.out.println(list.toString());
        list.delete(5);
        System.out.println(list.toString());
    }
}
