package Table;

import sun.tools.jconsole.Tab;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class needs to manage an ArrayList of Entry objects.
 * It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.
 * It needs a put method that takes a key and value
 * and makes an entry with key, value.
 * NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and,
 * if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {

//    private ArrayList entries;
    private ArrayList<Entry<K, V>> entries;

    public Table() {
        this.entries = new ArrayList<>();
    }


    public V get(K key) {
        if ( entries.iterator().hasNext() ){
            return entries.iterator().next().getValue();
        }
        else {
            return null;
        }
    }

    public void put(K key, V value) {
        // TODO Revisar
//        System.out.println( entries.contains( get(key) ) );
        if ( get(key) != null ){
            for (int i = 0; i < entries.size(); i++) {
                if (entries.get(i).getKey() == key){
                    entries.set(i,new Entry<>(key,value));
                }
            }
        }else {
            entries.add(new Entry(key,value));
        }
    }


    public void remove(K key) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey() == key){
                entries.remove(i);
            }
        }
    }
}
