package com.HackerRank.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SimilarPair {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		Node root = null;
		Map<Integer, Node> lookup = new HashMap<Integer, Node>();
		
		for(int v=1;v<n;v++){
			root = insert(root, scanner.nextInt(), scanner.nextInt(), lookup);
		}
		scanner.close();
	}
	private static Node insert(Node i, int parent, int child, Map<Integer, Node> lookup) {
		if(lookup.containsKey(parent)){
			if(lookup.get(parent).getLeft() == null){
				Node childNode = new Node(child);
				lookup.get(parent).setLeft(childNode);
				lookup.put(child, childNode);
			}else{
				Node childNode = new Node(child);
				lookup.get(parent).setRight(childNode);
				lookup.put(child, childNode);
			}
		}else{
			if(i==null){
				i = new Node(parent);
				Node childNode = new Node(child);
				i.setLeft(childNode);
				lookup.put(parent, i);
				lookup.put(child, childNode);	
			}
		}
		System.out.println("Inserting :"+parent+"   Child:"+child);
		return i;
	}
}
class Node {
    private int data;
//    private List<Node> children = new ArrayList<>();
    private Node left;
    private Node right;

    public Node(int data){
        this.data = data;
    }

//    public void addChild(Node node){
//        children.add(node);
//    }
//
//    public List<Node> getChildren(){
//        return children;
//    }

    public int getData(){
        return data;
    }

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}
}
