
// Question 2) Find a pair with a given sum in Binary Search Tree

package com.pairoftree.com;
import java.util.HashSet;
import java.util.Set;

public class DriverApp {
	public static void main(String[] args) {
		Node root=null;
		Node node=new Node();
		
		root=node.insert(root, 40);
		root=node.insert(root, 20);
		root=node.insert(root, 60);
		root=node.insert(root, 10);
		root=node.insert(root, 30);
		root=node.insert(root, 50);
		root=node.insert(root, 70);
		
		DriverApp sumpair=new DriverApp();
		
		sumpair.findPairwithSum(root, 130);
		
		
		 
	}
	public void findPairwithSum(Node root, int sum) {
		Set<Integer> set=new HashSet<>();
		if(!findPairUtil(root,sum,set)) {
			System.out.println("Pair not found");
		}
		
		
	}
	public boolean findPairUtil(Node root, int sum,Set<Integer> set) {
		if(root==null) {
			return false;
		}
	if(	findPairUtil(root.left, sum,set)) {
		return true;
	}
		if(set.contains(sum-root.Value)) {
		
		System.out.println("Pair is:" +root.Value+":"+(sum-root.Value));
		return true;
		} else {
		
		
		set.add(root.Value);
		}
		 return findPairUtil(root.right, sum,set);
		
	}
	

}
