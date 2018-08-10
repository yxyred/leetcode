package com.example.Myleetcode.jianzhioffer;


import lombok.extern.slf4j.Slf4j;

/**
 *
 */
/*输入两个链表，找出它们的第一个公共结点
* */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

@Slf4j
public class FindFirstCommonNode {
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
        ListNode p1 = pHead1, p2 = pHead2 ;
        while(p1 != null ){

            while(p2 != null){
                if (p1.val == p2.val){
                    return p1;
                }
                p2 = p2.next;
            }
            p1 = p1.next;
            p2 = pHead2;
        }
        return null;
    }
}
