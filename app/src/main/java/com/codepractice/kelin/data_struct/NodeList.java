package com.codepractice.kelin.data_struct;

public class NodeList {

    private Node headNode;  //头节点


    //链表插入节点
    public void insertNode(Node node) {
        if (headNode == null) {
            headNode = node;
        } else {
            Node temp = headNode;
            //在最后一个节点插
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = node;
        }
    }
// Big Dog  战争践踏 c
    //删除指定节点
    public boolean deleteNode11(Node n) {
        if (n == null || n.nextNode == null) {
            return false;
        }
        Node temp = n.nextNode;
        n.data = temp.data;
        n.nextNode = temp.nextNode.nextNode;
        temp.nextNode = null;
        return true;
    }

    //删除尾节点
    public void deleteLastNode() {
        if (getSize() == 0) return;
        if (getSize() == 1) {
            headNode = null;
            return;
        }
        if (getSize() == 2) {
            headNode.nextNode = null;
            return;
        }
        Node tempPre = headNode;
        Node tempLast = headNode.nextNode;
        while (tempLast.nextNode != null) {
            tempPre = tempLast;
            tempLast = tempLast.nextNode;
        }
        tempPre.nextNode = null;
    }

    //返回链表长度
    public int getSize() {
        int i = 0;
        if (headNode == null) return i;
        Node temp = headNode;
        while (temp.nextNode != null) {
            i++;
            temp = temp.nextNode;
        }
        return i;
    }

}
