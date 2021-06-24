package CSCLessons.Lists;//
// Tests UnorderedList Class

public class TestUnorderedList{

    public static void main (String [] args){

        UnorderedList list = new UnorderedList(10);

        System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.size());

        list.display();


        System.out.println("--------");
        System.out.println("Add 'a' and 'c'");

        list.addItem('a');
        list.addItem('c');

        list.display();

        System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.size());

        System.out.println("--------");
        System.out.println("Add 'd' and 'f'");

        list.addItem('d');
        list.addItem('f');

        list.display();

        System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.size());
        System.out.println("The item at index 2 is " + list.getItem(2));

        System.out.println("--------");
        System.out.println("Remove 'c'");

        list.removeItem(1);

        list.display();

        System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.size());

        System.out.println("--------");
        System.out.println("Remove 'f'");

        list.removeItem(2);

        list.display();

        System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.size());

        System.out.println("--------");
        System.out.println("Remove All");

        list.removeAll();

        list.display();

        System.out.println("Is empty = " + list.isEmpty() + " Size = " + list.size());
    }
}
