package CSCLessons.Trees;// Binary Tree Node
// Mark Hoffman  4/17/02
// 
// Implements a node of a binary tree

public class BinaryTreeNode
{
	// instance variables
	private char item;
	private BinaryTreeNode leftChild;
	private BinaryTreeNode rightChild;

	// constructors
	public BinaryTreeNode(char newitem)
	{
		item = newitem;
		leftChild = null;
		rightChild = null;
	} // end constructor

	public BinaryTreeNode(char newItem, BinaryTreeNode newLeftChild, BinaryTreeNode newRightChild)
	{
		item = newItem;
		leftChild = newLeftChild;
		rightChild = newRightChild;
	} // end constructor

	// Instance methods

	// return item value
	public char getItem()
	{
		return item;
	} // end getItem

	// set item value
	public void setItem(char newItem)
	{
		item = newItem;
	} // end setItem

	// get left child pointer
	public BinaryTreeNode getLeftChild()
	{
		return leftChild;
	} // end getLeftChild

	// set left child pointer
	public void setLeftChild(BinaryTreeNode newLeftChild)
	{
		leftChild = newLeftChild;
	} // end setLeftChild

	// get right child pointer
	public BinaryTreeNode getRightChild()
	{
		return rightChild;
	} // end getRightChild

	// set right child pointer
	public void setRightChild(BinaryTreeNode newRightChild)
	{
		rightChild = newRightChild;
	} // end setRightChild

} // end BinaryTreeNode
