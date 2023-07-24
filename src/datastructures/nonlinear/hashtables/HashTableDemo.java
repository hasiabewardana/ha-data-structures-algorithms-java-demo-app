package datastructures.nonlinear.hashtables;

public class HashTableDemo {

    public static void demoHashTable() {
        HashTable hashTable = new HashTable(10);
        hashTable.put("apple", 10);
        hashTable.put("banana", 20);
        hashTable.put("orange", 15);

        System.out.println(hashTable.get("apple"));   // Output: 10
        System.out.println(hashTable.get("banana"));  // Output: 20
        System.out.println(hashTable.get("orange"));  // Output: 15
        System.out.println(hashTable.get("grape"));   // Output: -1 (Not found)
    }
}
