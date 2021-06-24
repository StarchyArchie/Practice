package CSCLessons.Lists;

/**
 * Author(s): Vishal Nigam
 *
 * Tests for UnorderedList methods.
 */

public class UnorderedListTests
{
    //Run all of the tests
    public static void main(String[] args)
    {
        System.out.println("Running tests:");
        System.out.println("getItem: " + testGetItem());
        System.out.println("addItem: " + testAddItem());
    }

    public static boolean testGetItem()
    {
        UnorderedList list = new UnorderedList(10);
        for (int i = 0; i < 10; i++)
        {
            list.addItem((char) ('a' + i));
        }
        for (int i = 9; i > 4; i--)
        {
            list.removeItem(i);
        }

        try
        {
            //Case 1, negative index
            //Test an arbitrary negative index and the boundary case (-1)
            if (list.getItem(-5) != '\u0000' || list.getItem(-1) != '\u0000')
            {
                //If we don't get the expected number, the UnorderedList has a bug and fails our test
                return false;
            }
            for(int i=0; i<list.size();i++){
                if(list.getItem(i)!=(char)('a'+i)){
                    return false;
                }
            }
            for(int i=list.size();i<list.capacity(); i++){
                if(list.getItem(i)!='\u0000'){return false;}
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            //This method isn't supposed to throw an exception for any inputs, so if it does the test fails
            return false;
        }
        return true;
    }

    public static boolean testAddItem()
    {
        UnorderedList list = new UnorderedList(10);
        for (int i = 0; i < 10; i++)
        {
            list.addItem((char) ('a' + i));
        }
        for (int i = 9; i > 4; i--)
        {
            list.removeItem(i);
        }
        char newChar = 'v';
        int cap = list.capacity(), index = list.size();
        list.addItem(newChar);
        if(list.getItem(index-1)!='v'){
            return false;
        }
        while(index<cap){
            list.addItem('o');
        }//fills the rest of the array
        if(cap!=index){//ensures that capacity hasn't doubled yet
            return false;
        }
        else list.addItem('y');
        if(cap!=(index-1)*2){
            return false;
        }
        return true;
    }
}

