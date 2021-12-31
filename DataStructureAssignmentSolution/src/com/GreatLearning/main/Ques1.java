package com.GreatLearning.main;



	import java.util.Scanner;

	public class Ques1
	{
		class Node
		{
			int data;
			Node left, right;

			public Node( int data )
			{
				this.data = data;
				left = right = null; 
				}
		}

		// Root of Binary search tree
		Node root;

		// Constructor of method
		Ques1()
		{
			root = null;
		}
		void insert(int data)
		{
			root = insertRec(root, data);
		}
		
	//	A recursive function to insert a new key in BST 
		int c=1;
		Node insertRec(Node root, int data)
		{

			//If the tree is empty,return a new node
			
			if (root == null)
			{
				root = new Node(data);
				return root;
			}

			// Or, recursive down the tree
			if (data > root.data)
				root.left = insertRec(root.left, data);
			else if (data < root.data)
				root.right = insertRec(root.right, data);
			
			return root;
			
		}
		
	
		void Inorder(Node root)
		{
			if (root != null)
			{
			
				Inorder(root.left);
				System.out.print(root.data + " ");
				Inorder(root.right);
			}
		
		}
		void floorsinfo(int arr[])
		{
			for(int i = 0; i < arr.length; i++)
			{
				insert(arr[i]);
				if(arr[i]==root.data);
				System.out.println( "day "+ ++c+":");
			}
			
		}
		
		

	public static void main(String[] args) 
	{

	   Ques1 Building = new Ques1();
	    int[] floorsizes;

	    int size, i;

		  Scanner sc = new Scanner(System.in);

	   System.out.println("enter the total no of floors in the building");

		  size = sc.nextInt();

		  floorsizes = new int[size + 1];

		  for (i = 1; i <= size; i++) {

		  System.out.println("\nenter the floor size given on day : "+ i );

		  floorsizes[i] = sc.nextInt();
		  }
		  
		  System.out.println("The order of construction is as follows");
		  Building.floorsinfo( floorsizes);
		  Building.Inorder(Building.root);
		  
		
		  
		 
	}

	}

