package Driver;

import Model.BSTtoRightSkewed;
import Model.BTtoBST;
import Model.Node;

public class Driver 
{
	public static void main(String[] args)
	{ 
		//Defining Objects for class "BSTtoRightSkewed" and "BTtoBST".
		BSTtoRightSkewed tree = new BSTtoRightSkewed();
		BTtoBST BStree= new BTtoBST();
		
		//Hard-coding for Binary Tree Creation.
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(40);
		
		// Order of the Skewed tree can
		// be defined as follows -
		// For Increasing order - 0
		// For Decreasing order - 1
		int order = 0;
		
		//Method calling to convert Binary tree to Binary Search Tree.
		BStree.binaryTreeToBST(tree.node);
		
		//Method Calling to Convert Binary Search Tree to Skewed tree.
		tree.flattenBTToSkewed(tree.node, order);
		
		//Method calling to Traverse Right as per Problem Statement. 
		tree.traverseRightSkewed(tree.headNode);

	
	}

}
