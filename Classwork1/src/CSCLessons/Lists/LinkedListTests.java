package CSCLessons.Lists;

/**
 * Author: Vishal Nigam
 *
 * Tests for detecting bugs in LinkedList
 */

public class LinkedListTests
{
    //Runs all tests
    public static void main(String[] args)
    {
        System.out.println("Running all tests...");
        System.out.println("Empty test: "+testIsEmpty());
        System.out.println("Insert test: " + testInsert());
        System.out.println("Clear Test: "+testClear());
        System.out.println("To Array Test: "+testToArray());
        System.out.println("Array to List Test: "+testFromArray());
    }
    public static boolean testIsEmpty()
    {
        System.out.println("Empty Tests:");
        LinkedList list = new LinkedList();
        if(!list.isEmpty()){
            System.out.print("Empty list error: ");
            return false;
        }
        list.add('a');
        if(list.isEmpty()){
            System.out.print("Non Empty list error: ");
            return false;
        }
        return true;
    }
    public static boolean testInsert(){
        LinkedList list = new LinkedList();

        return true;
    }
    public static boolean testClear(){
        System.out.println("Clear test: ");
        LinkedList list = new LinkedList();
        list.clear();
        if(list.size()!=0){
            return false;
        }
        return true;
    }
    public static boolean testToArray(){
        LinkedList list = new LinkedList();
        list.add('a');
        list.add('b');
        list.add('c');
        char[]arr = list.toArray();
        if(arr[0]!='a'){
            return false;
        }
        if(arr[1]!='b'){
            return false;
        }
        if(arr[2]!='c'){
            System.out.println("doesn't include final char properly.");
            return false;
        }
        return true;
    }
    public static boolean testFromArray(){
        char array[]= new char[]{'a','b','c','d','e','f'};
        LinkedList list = new LinkedList(array);

        return true;
    }
}

