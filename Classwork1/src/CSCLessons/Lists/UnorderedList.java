package CSCLessons.Lists;

/**
 * Vishal Nigam
 * 2/8/18
 */
public class UnorderedList {

    private int length;
    private int numItems = 0;
    private char list[];

    public  UnorderedList(int size){
        char arr[] = new char[size];
        list = arr;
        length = size;
        numItems = 0;
    }
    public int size(){
        return numItems;
    }
    public void addItem(char input){
        ensureCapacity();
        list[numItems] = input;
        numItems++;
    }
    public void removeItem(int index){
        int count = index+1;
        while (count<numItems){
            list[count]=list[count+1];
            count++;
        }
        numItems--;
    }
    public char getItem(int index){
        if(index>length){
            return '\u0000';
        }
        else if(index<0){
            return '\u0000';
        }
        else if(index>numItems){
            return '\u0000';
        }
        else return list[index];
    }
    public void removeAll(){
        numItems = 0;
    }
    public boolean isEmpty(){
        return numItems == 0;
    }
    public void display(){
        int count = 0;
        while(count<=numItems) {
            System.out.print(list[count]);
            count++;
        }
    }
    public int capacity(){
        return length;
    }
    public void ensureCapacity(){
        if (length==numItems){
            char[]array = new char[length*2];
            for (int i = 0;i<length;i++){
                array[i]=list[i];
            }
            list = array;
            length = length*2;
        }
    }
    public char[] toArray(){
        char array[] = new char[numItems];
        for (int i = 0;i<numItems;i++){
            array[i]=list[i];
        }
        return array;
    }
}
