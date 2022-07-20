package com.codepractice.kelin.data_struct;

public class NodeListUtils {

    /*
    * 传入反转前链表头
    * 返回反转后链表头
    * */
    public static Node convertNodeList(Node head){
        Node pReversedHead = head;
        Node pNode = head;
        Node pPrev = null;
        while (pNode != null) {
            Node pNext = pNode.nextNode;
            if (pNext == null) {
                pReversedHead = pNode;
            }
            pNode.nextNode = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        head = pReversedHead;
        return head;
    }

    //查找倒数第K个元素


    //判断链表是否有环



}
