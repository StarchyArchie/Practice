package CSCLessons.Trees;

/**
 * Author: Vishal Nigam
 *
 * A binary search tree
 */

public class BinaryTree
{
	// Instance variables
	private BinaryTreeNode root;

	// Constructor
	public BinaryTree()
	{
        root = new BinaryTreeNode('\u0000',null,null);
	}

	// Instance Methods

	// Returns whether tree is empty
	public boolean isEmpty()
	{
        if(root.getItem()=='\u0000'){
            return true;
        }
        else return false;
	}

	// Insert node into a binary tree including the empty tree case.
	public void insertInBinaryTree(char newItem)
	{
        if(isEmpty()){
            root.setItem(newItem);
        }
        else{
            insert(root,newItem);
        }
        //If empty, create new root node
        //Otherwise, insert as a child of root using recursive method below
	}

	// Recursively insert in non-empty tree. Used by insertInBinaryTree
	private void insert(BinaryTreeNode parent, char newItem)
	{
        if(parent.getItem()>newItem){
            if(parent.getLeftChild()!=null) {
                insert(parent.getLeftChild(),newItem);
            }
            else {
                parent.setLeftChild(new BinaryTreeNode(newItem));
            }
        }
        if(parent.getItem()<newItem){
            if(parent.getRightChild()!=null) {
                insert(parent.getRightChild(),newItem);
            }
            else parent.setRightChild(new BinaryTreeNode(newItem));
        }
	}

	// Inorder traversal printing a sorted list of nodes.
	// Includes empty tree case.
	public void inorderTraversal()
	{
        //If empty, print that the tree is empty
        //Otherwise, perform traversal recursively starting at the root node
        //using the method below
	}

	// Recursive inorder traversal. Used by inorderTraversal.
	private void inorder(BinaryTreeNode treeNode)
	{
        if(treeNode.getLeftChild()==null){
            System.out.print(treeNode.getItem());
        }
        else{
            inorder(treeNode.getLeftChild());
        }
        if(treeNode.getRightChild()!=null){
            inorder(treeNode.getRightChild());
        }
	}

	// Preorder traversal printing a list of nodes.
	// Includes empty tree case.
	public void preorderTraversal()
	{
        //If empty, print that the tree is empty
        //Otherwise, perform traversal recursively starting at the root node
        //using the method below
	}

	// Recursive preorder traversal. Used by preorderTraversal.
	private void preorder(BinaryTreeNode treeNode)
	{
	}

	// Postorder traversal printing a list of nodes.
	// Includes empty tree case.
	public void postorderTraversal()
	{
        //If empty, print that the tree is empty
        //Otherwise, perform traversal recursively starting at the root node
        //using the method below
	}

	// Recursive postorder traversal. Used by postorderTraversal.
	private void postorder(BinaryTreeNode treeNode)
	{
	}
}

