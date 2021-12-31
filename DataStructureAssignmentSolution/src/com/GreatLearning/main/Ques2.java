package com.GreatLearning.main;

	public class Ques2 
  {
			class Node
			{
				int data;
				Node left, right;

				public Node( int data ) {
					this.data = data;
					left = right = null; 
					}
			}

			// Root of Binary search tree
			Node root;

			// Constructor of method
			Ques2()
			{
				root = null;
			}
			void insert(int data)
			{
				root = insertRec(root, data);
			}
			
		//	A recursive function to insert a new key in BST 
			
			Node insertRec(Node root, int data)
			{

				//If the tree is empty,return a new node
				
				if (root == null)
				{
					root = new Node(data);
					return root;
				}

				// Or, recursive down the tree
				if (data < root.data)
					root.left = insertRec(root.left, data);
				else if (data > root.data)
					root.right = insertRec(root.right, data);

				return root;
			}
			//print sorted array
			void Inorder(Node root)
			{
				if (root != null)
				{
					Inorder(root.left);
					System.out.print(root.data + " ");
					Inorder(root.right);
				}
			}
			void send(int arr[])
			{
				for(int i = 0; i < arr.length; i++)
				{
					insert(arr[i]);
				}
				
			}
		
		
    public static void main(String[] args) 
    {
	  class Node
	  {
		int data;
		Node left, right;
		
			public Node( int data ) {
				this.data = data;
				left = right = null; 
		}
	  };
	  
	  Ques2  tree = new Ques2 ();
	  
	//given data in complete BST
	    Node node = new Node(50);
		node.left = new Node(30);
		node.right = new Node(60);
		node.left.left = new Node(10);
		node.right.left = new Node(40);
		
		
		
	 
	//after removing left node , data skewed to right nodes
		Node main=new Node(10);
		main.right=new Node(30);
		main.right.right=new Node(40);
		main.right.right.right= new Node(50);
		main.right.right.right.right=new Node(60);  
		
		int arr[] = {50, 30, 60, 10, 40};
		tree.send(arr);
		tree.Inorder(tree.root);
   }
  } 