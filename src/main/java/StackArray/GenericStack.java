package StackArray;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {

    private E[] elements ;

    public boolean isEmpty() {
        return elements == null ? true : false;
    }

    public void push(E foobar) {
        if( !isEmpty() ) {
            elements = Arrays.copyOf(elements,elements.length + 1);
            elements[elements.length - 1] = foobar;
        } else {
            elements = (E[]) Array.newInstance(String.class, 1);
            elements[0] = foobar;
        }
    }

    public E pop() {
        if( !isEmpty() ){
            E topPop = elements[elements.length - 1];
            elements = Arrays.copyOf(elements, elements.length - 1);
            return topPop;
        }
        else {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
    }

}
