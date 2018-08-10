package com.example.Myleetcode.jianzhioffer;


import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

/**
 *
 */
/*输入两个链表，找出它们的第一个公共结点
* */


@Slf4j
public class FindFirstCommonNode_2 {
    public static void main(String[] args){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode m1 = new ListNode(5);
        ListNode m2 = new ListNode(4);
        ListNode m3 = new ListNode(3);
        ListNode m4 = new ListNode(2);
        ListNode m5 = new ListNode(1);
        m1.next = m2;
        m2.next = m3;
        m3.next = m4;
        m4.next = m5;
        ListNode res = new FindFirstCommonNode().getFindFirstCommonNode(n1,m1);
        log.info("{}",res.val);
    }
    public ListNode getFindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode p1 = pHead1, p2 = pHead2 ,res = null;
        Stack<ListNode> L1 = new Stack<ListNode>();
        Stack<ListNode> L2 = new Stack<ListNode>();
        while(p1 != null ){
            L1.push(p1);
            p1 = p1.next;
        }
        while(p2 != null ){
            L2.push(p1);
            p2 = p2.next;
        }
        while (!L1.isEmpty() && !L2.isEmpty() && L2.peek() == L1.peek()){
            res = L1.pop();
            L2.pop();
        }
        return res;
    }
}
