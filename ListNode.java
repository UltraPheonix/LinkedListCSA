/*
SYNTAX NOTE
Java gives us things called generics
These generics allow you to specify what type you want to use with a method
In side the open and close brackets, think of this sentence
The type E extends a comparable of E

Comparable is also a generic, so you have to tell it what type it will be working with, in this case the type will be
type E

It might look weird, but it actually is a very good way of allowing your classes to be reused with many different types
 */


public class ListNode<E extends Comparable<E>> {

    private E value;

    private ListNode<E> next;

    //Our different constructors, they are overloading each other to allow the user as many options as they want
    public ListNode(){
        this.value = null;
        this.next = null;
    }

    public ListNode(E value){
        this.value = value;
        this.next = null;
    }

    public ListNode(E value, ListNode<E> next){
        this.value = value;
        this.next = next;
    }

    //These are our getters and setters, they allow the user to modify the values with some restrictions

    public E value() {
        return value;
    }
    public void setValue(E value) {
        this.value = value;
    }

    public ListNode<E> next() {
        return next;
    }
    public void setNext(ListNode<E> next) {
        this.next = next;
    }
}
