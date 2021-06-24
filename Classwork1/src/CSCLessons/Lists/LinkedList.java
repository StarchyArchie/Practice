package CSCLessons.Lists;

/**
 * Zach Kohlberg
 *
 * Fixed by: someone who read the header comment (Vishal Nigam)
 *
 * An absolutely imperfect implementation of a linked list with bugs.
 */

public class LinkedList
{
	/*
	 * This internal class won't be visible from outside the list, so we won't
     * bother hiding its instance data. Makes the syntax slightly simpler.
	 */
	private class Node
	{
		public char item;
		public Node next;

		public Node(char c)
		{
			item = c;
		}

		public Node (char c, Node n)
		{
			item = c;
			next = n;
		}
	}

	//Instance data
	private Node head;
	private int count;

	//Constructors

	//Initialize an empty list
	public LinkedList()
	{
		head = null;
		count = 0;
	}

	//Initialize a list from an array of characters
	public LinkedList(char[] array)
	{
		count = array.length;
        //Start with the first character in the head node, unless we have an
        //array of size 0
        head = count > 0 ? new Node(array[0]) : null;
        Node n = head;
        //Append each char in the array to the end of the list
        for (int i = 0; i < count; i++)
        {
            n.next = new Node(array[i]);
            n = n.next;
        }
	}

	//Instance methods

	//Return the number of characters in this list
	public int size()
	{
		return count;
	}

	//Return whether the list is empty
	public boolean isEmpty()//Only counted as empty is size was negative, needs to be zero instead.
	{
		return count == 0;
	}

	//Convert the list to an array
	public char[] toArray()
	{
		//Create an array of the appropriate size
		char[] array = new char[count];
		Node n = head;
		//Add each node's item to the array
		for (int i = 0; i <= count; i++)//will exclude final char if count not included
		{
			n = n.next;
            array[i] = n.item;
		}
		return array;
	}

	//Return the character at index
	public char get(int index) throws IndexOutOfBoundsException
	{
		//Throw an exception if index is out of bounds
		if (index >= count || index < 0)
		{
			throw new IndexOutOfBoundsException("" + index);
		}

        //Start n at head
		Node n = head;
		//Move n to the next node until it reaches index
		for (int i = 0; i < index; i++)
            n = n.next;
        //Return the item in that node
		return n.item;
	}

	//Remove the character at index AND return the removed character
	public char remove(int index) throws IndexOutOfBoundsException
	{
		//Throw an exception if index is out of bounds
		if (index >= count || index < 0)
		{
			throw new IndexOutOfBoundsException("" + index);
		}

        //The char we're going to delete
        char c;
        //If the index is 0, we have to delete head. Not the same as deleting
        //another node.
        if (index == 0)
        {
            //Save head's character before deleting the node
            c = head.item;
            //Remove just the head node
            head = null;
        }
        else
        {
            //Start n at head
            Node n = head;
            //Move n forward until we find the node BEFORE index
            for (int i = 0; i < index - 1; i++)
                n = n.next;
            //Save next node's character (next node is at index)
            c = n.next.item;
            //Remove the next node
            n.next = n.next.next;
        }
        //Update count
		count--;
        //Return the character we deleted
		return c;
	}

	//Adds a new character to the end of the list
	public void add(char c)
	{
        if (head == null)
        {
            //Add a new head node if the list is empty, not the same as adding
            //a new node when the list isn't empty
            head = new Node(c);
        }
        else
        {
            //Start n at head
            Node n = head;
            //Move head forward until we reach the tail node (end of list)
            for (int i = 1; i < count; i++)
                n = n.next;
            //Add a new node after the tail node
            n.next = new Node(c);
        }
        //Update count
		count++;
	}

	//Insert a character at index
	public void insert(int index, char c) throws IndexOutOfBoundsException
	{
		//Throw an exception if index is negative or greater than count
		if (index > count || index < 0)
		{
			throw new IndexOutOfBoundsException("" + index);
		}

        if (index == 0)
        {
            //Add a new if inserting at the start of the list
            head = new Node(c, head);
        }
        else
        {
            //Start n at head
            Node n = head;
            //Move n forward until we find the node BEFORE index
            for (int i = 0; i < index - 1; i++)
                n = n.next;
            //Add a new node between n and n.next
            n.next = new Node(c, n.next);
        }
	}

	//Remove everything from the list
	public void clear()//also has to set the size to zero
	{
		head = null;
        count = 0;
	}

	//Convert the list to a string
	public String toString()
	{
		String s = "";
		//Add each node's item to s
		Node n = head;
		for (int i = 1; i < count; i++)
		{
			s += n.item;
            n = n.next;
		}
		return s;
	}
}

