package CSCLessons.StackPostFix;

/**
 * Zach Kohlberg
 *
 * Simple implementation of a reference-based int stack
 */

public class IntStack
{
    private class Node
    {
        public int item;
        public Node next;

        public Node(int i, Node n)
        {
            item = i;
            next = n;
        }
    }

    //Top of the stack
    private Node top;
    private int count;

    //New empty stack
    public IntStack()
    {
        top = null;
        count = 0;
    }

    //Add a new node to the top of the stack
    public void push(int item)
    {
        top = new Node(item, top);
        count++;
    }

    //Remove and return top item of stack
    //If stack is empty, returns 0
    public int pop()
    {
        if (!isEmpty())
        {
            //Need to store item before changing top
            int item = top.item;
            //Remove top item from stack
            top = top.next;
            count--;

            return item;
        }
        return 0;
    }

    //Returns the top item of the stack without removing it
    public int peek()
    {
        return top.item;
    }

    //Returns whether the stack is empty
    public boolean isEmpty()
    {
        return top == null;
    }

    //Returns number of items in stack
    public int size()
    {
        return count;
    }

    //Empties stack
    public void clear()
    {
        top = null;
    }
}

