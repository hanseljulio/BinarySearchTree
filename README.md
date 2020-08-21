# BinarySearchTree
Binary Search Tree with generics and recursion
Created June 8th 2019

-------------------------------------------------------------------------------
## Overview
This is a binary search tree with generics and recursion.
Serves as an exercise for the implementation of Nodes and Binary Trees.

-------------------------------------------------------------------------------
### Classes
1. Main.java
 * Main class to serve as the program driver
 
2. Node.java
 * Class for the Node functionality
 * Constructor: Node(E data)
   * The constructor will create a new node with the given data
 * Functions: toString()
     * This function will return data as a string


3. Tree.java
 * Class for binary tree
 * Functions:
   * search(E data)
     * This function returns the recursive function for search(Node< E > node, E data)
   * search(Node< E > node, E data)
     * This function will return the where the searched node is
   * insert(E data)
     * This function is the recursive function for insert(Node< E > node, E data)
   * insert(Node< E > node, E data)
     * This function will add a new node to the tree
   * deleteValue(E value)
     * This function is the recursive function for deleteValue(Node< E > node, E value)
   * deleteValue(Node< E > node, E value)
     * This function will delete a node in the tree
   * findMax(Node< E > subtree)
     * This function will return the maximum value in the tree;
 
