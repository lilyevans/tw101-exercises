package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }

    public void add(String nameOfNewNode) {
        if (this.name.compareTo(nameOfNewNode) > 0){
            if (this.left == null){
                this.left = new Node(nameOfNewNode);
            }
            else {
                this.left.add(nameOfNewNode);
            }
        }
        else {
            if (this.right == null){
                this.right = new Node(nameOfNewNode);
            }
            else {
                this.right.add(nameOfNewNode);
            }
        }
    }

    public List<String> names() {

            List<String> namesList = new ArrayList<String>();
            if (this.left != null){
                namesList.addAll(this.left.names());
            }

            namesList.add(this.name);

            if (this.right != null){
                namesList.addAll(this.right.names());
            }

            return namesList;

    }
}
