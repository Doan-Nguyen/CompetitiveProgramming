package linkedlist;

/*
*   Idea:
*       - Coi viec di qua cac nodes nhu 1 tuyen duong. Check co di lai mot diem nao do trong tuyen duong.
*           => su dung 2 con tro: 1 con tro ~ tim duong/kham pha, 1 con tro theo sau.
* */

public class _141_Linked_List_Cycle {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int value){
            this.val=value;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head==null){
            return false;
        }
        ListNode fastNode = head.next;
        ListNode slowNode = head;
        while (fastNode.next != null && slowNode.next != null){
            if(fastNode==slowNode){
                return true;
            }
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        return false;
    }

    public static void main(String[] args){

    }
}
