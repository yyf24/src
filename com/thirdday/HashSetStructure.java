package com.thirdday;

public class HashSetStructure {
    public static void main(String[] args) {
        Node[] table =new Node[16];
        System.out.println(table);
        table[2]=new Node("john",null);
        table[2].next=new Node("jack",null);
    }
}
class Node{
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}