package CSCLessons.Trees;// Author: Vishal Nigam

public class TestBinaryTree
{
	public static void main(String[] args)
	{
		/**
		 * Part 1 (Before writing the binary tree class, this is just practice)
		 * 
		 * 1. Create a BinaryTreeNode to act as the root ('b')
		 * 2. Add two new nodes as its children ('a' and 'c')
		 * 3. Using the root to access each node, print each node's item.
		 *    Your output should be:
		 * Root element: b
		 * Left element: a
		 * Right element: c
		 *

        BinaryTreeNode root = new BinaryTreeNode('b');
        root.setLeftChild(new BinaryTreeNode('a'));
        root.setRightChild(new BinaryTreeNode('c'));
        System.out.println("Root element: "+root.getItem());
        System.out.println("Left element: "+root.getLeftChild().getItem());
        System.out.println("Right element: "+root.getRightChild().getItem());
         */
        BinaryTree tree = new BinaryTree();

		/**
		 * Part 2 (After you have written the binary tree class, this is a quick test)
		 * 
		 * 1. Create a new BinaryTree object
		 * 2. Insert the following characters (in the given order):
		 * m, e, k, z, a
		 * 3. Call the tree's traversal methods, which should print:
		 * Inorder Traversal
		 * a e k m z
         *
         * Preorder Traversal
         * m e a k z
         *
         * Postorder Traversal
         * a k e z m
		 */
	}
}

