package com.zuolizhu.Abstraction.ItemList;

public class Main {
    public static void main(String[] args) {

        ZZLinkedList list = new ZZLinkedList(null);
        list.traverse(list.getRoot());

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "7 5 4 2 3 6 8 9 1";

        String[] data = stringData.split(" ");
        for(String s : data) {
            tree.addItem(new Node(s));
        }
        tree.traverse(tree.getRoot());
        tree.addItem(new Node(5));
        tree.traverse(tree.getRoot());
    }
}
