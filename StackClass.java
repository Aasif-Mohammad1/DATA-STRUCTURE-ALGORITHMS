package AasifMohammad;

public class StackClass {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next =null;
        }
    }
    static class Stack{
        public static Node head;
        public static Boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }
        public static int peep(){
            if(isEmpty()){
                return  -1;
            }
            return head.data;

        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(5);
        s.push(3);
        s.push(7);

        while(!s.isEmpty()){
            System.out.println(s.peep());
            s.pop();
        }
    }
}
