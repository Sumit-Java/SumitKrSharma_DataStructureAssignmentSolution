package Model;

import java.util.Arrays;

public class BTtoBST {

	static int index;
	
	//A helper function that stores in-order traversal of a tree rooted with node/
	
	static void storeInorder(Node node, int inorder[])
	{
		// Base Case
		if (node == null)
			return;

		//first store the left subtree 
		storeInorder(node.left, inorder);

		// Copy the root's data
		inorder[index] = node.val;
		index++; // increase index for next entry
		
		// finally store the right subtree 
		storeInorder(node.right, inorder);
	}
	
	
	//A helper function to count nodes in a Binary Tree 
			
	static int countNodes(Node root)
	{
		if (root == null)
			return 0;
	
		return countNodes(root.left) + countNodes(root.right) + 1;
	}


	/* A helper function that copies contents of arr[] to Binary Tree.
	This function basically does In-order traversal of Binary Tree and
	one by one copy arr[] elements to Binary Tree nodes */
	
	static void arrayToBST(int[] arr, Node root)
	{
		// Base Case
		if (root == null)
			return;

		/* first update the left subtree */
		arrayToBST(arr, root.left);

		/* Now update root's data and increment index */
		root.val = arr[index];
		index++;

		/* finally update the right subtree */
		arrayToBST(arr, root.right);
	}


	
	// This function converts a given Binary Tree to BST
	
	public void binaryTreeToBST(Node root) 
	{
		// base case: tree is empty
				if (root == null)
					return;

				/* Count the number of nodes in Binary Tree so that
				we know the size of temporary array to be created */

				int n = countNodes(root);

				// Create a temp array arr[] and store inorder traversal of tree in arr[]
				
				int arr[] = new int[n];

				storeInorder(root, arr);

				// Sort the array using library function for quick sort
				Arrays.sort(arr);
				
				
				// Copy array elements back to Binary Tree

				index = 0;
				arrayToBST(arr, root);
		
	}

}
