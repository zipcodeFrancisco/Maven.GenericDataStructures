package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {

    private Object[] elements;

    public boolean isEmpty() {
        return elements == null ? true : false;
    }

    public void push(E foobar) {
        if ( !isEmpty() ){
            elements = Arrays.copyOf(elements,elements.length + 1);
            elements[elements.length - 1] = foobar;
        }
        else {
            elements = new Object[1];
            elements[0] = foobar;
        }

    }

    public Object pop() {
        if ( !isEmpty() ){
            Object topPop = elements[elements.length - 1];
            elements = Arrays.copyOf(elements,elements.length - 1);
            return topPop;
        }
        else {
            throw new IndexOutOfBoundsException("Ouch!");
        }
    }
}
