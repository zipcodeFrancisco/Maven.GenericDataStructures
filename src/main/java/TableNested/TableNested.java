package TableNested;

import Table.Table;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry
 * from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    class Entry {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    private ArrayList<Entry> entries;

    public TableNested() {
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
                    entries.set(i,new Entry(key,value));
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
