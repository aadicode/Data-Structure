public class Implementation {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;

        }
    }
    public void print(){
        ListNode curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args){
        Implementation list=new Implementation();
        list.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(8);
        ListNode fourth=new ListNode(11);

        list.head.next=second;
        second.next=third;
        third.next=fourth;

        list.print();
    }
}
