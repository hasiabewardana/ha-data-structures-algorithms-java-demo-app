package datastructures.linear.array;

public class ArrayDemo {

    public static void demoArray(){
        ArrayImpl array = new ArrayImpl();
        array.printNumbers();
    }

    public static void demoArrayOperations(){
        ArrayOperations arrayOperations = new ArrayOperations();
        arrayOperations.insertToArray();
        arrayOperations.deleteFromArray();
        arrayOperations.searchElements();
    }
}
