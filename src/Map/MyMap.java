package Map;

import java.util.ArrayList;

public class MyMap<K, V> {
    private final ArrayList<K> key;
    private final ArrayList<V> val;

    public MyMap() {
        key = new ArrayList<>();
        val = new ArrayList<>();
    }

    public void put(K k, V v) {
        int index = key.indexOf(k);
        if (index == -1) {
            key.add(k);
            val.add(v);
        } else {
            val.set(index, v);
        }
    }

    public V get(K k) {
        int index = key.indexOf(k);
        return index == -1 ? null : val.get(index);
    }

    public V remove(K k) {
        int index = key.indexOf(k);
        if (index == -1) {
            return null;
        }else{
            key.remove(index);
            return val.remove(index);
        }
    }
}