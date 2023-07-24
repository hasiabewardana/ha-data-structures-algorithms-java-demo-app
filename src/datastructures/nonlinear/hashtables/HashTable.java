package datastructures.nonlinear.hashtables;

import java.util.LinkedList;

public class HashTable {

    private final int size;
    private final LinkedList<KeyValuePair>[] table;

    public HashTable(int size) {
        this.size = size;
        this.table = new LinkedList[size];
    }

    private int hash(String key) {
        int hash = 0;

        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i)) % size;
        }

        return hash;
    }

    public void put(String key, int value) {
        int index = hash(key);

        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        for (KeyValuePair pair : table[index]) {
            if (pair.key.equals(key)) {
                pair.value = value;
                return;
            }
        }

        table[index].add(new KeyValuePair(key, value));
    }

    public int get(String key) {
        int index = hash(key);

        if (table[index] != null) {
            for (KeyValuePair pair : table[index]) {
                if (pair.key.equals(key)) {
                    return pair.value;
                }
            }
        }

        return -1; // Not found
    }
}
