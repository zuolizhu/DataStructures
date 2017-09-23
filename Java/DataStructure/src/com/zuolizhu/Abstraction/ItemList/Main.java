package com.zuolizhu.Abstraction.ItemList;

public class Main {
    public static void main(String[] args) {

        ZZLinkedList list = new ZZLinkedList(null);
        list.traverse(list.getRoot());

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for(String s : data) {
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
    }
}
