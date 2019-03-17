package StackArrayList;
import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {

    private ArrayList<E> elements = new ArrayList<>();

    public Stack(){
    }

    public void push(E nextElement){
        elements.add(nextElement);
    }

    public E pop(){
        if( isEmpty() ){
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return elements.remove((elements.size()-1));
        // TODO Revisar
//        return isEmpty() ? elements.remove(elements.size() - 1) : (E) new IndexOutOfBoundsException("Stack is empty");
    }

    public boolean isEmpty(){
        return elements.isEmpty();
    }

}


