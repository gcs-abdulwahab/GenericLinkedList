


interface  ILinkedList {
    
            boolean isEmpty();
            void addAtBeginning(int x);
            void print();
    
}
 class SinglyLinkedList  implements ILinkedList {
    
        class Node {
            int data;
            Node next;
           
            Node(int data){
                this.data = data;
            }
            
        }
        
        Node head;
        
        
        
   public     boolean isEmpty(){
            return head == null;
        }
    public     void addAtBeginning(int x){
                Node temp = new Node(x);
                temp.next = head;
                head = temp;
        }
        
    public    void print(){
                
                Node temp = head;
                while( temp != null ){
                    System.out.print("  "+ temp.data+"  ");
                    temp = temp.next;
                }
            
        }
     

}
class DoublyLinkedList implements ILinkedList{
    class Node {
        int data;
        Node next;
        Node previous;
        Node(int data){
            this.data = data;
        }
}
    Node head;
    
     public   boolean isEmpty(){
            
            return head == null;
        }
    
    public     void  addAtBeginning(int val){
            
           
        }
    public     void print(){
           
        }
    
    
}
class HelloWorld {
    public static void main(String[] args) {


        ILinkedList sl;
        ILinkedList dl;

        sl = new SinglyLinkedList();
        dl = new DoublyLinkedList();  
        dl.isEmpty();
        sl.addAtBeginning(2);
        sl.addAtBeginning(1);
        sl.addAtBeginning(0);
        
        sl.print();
        
        // System.out.println("");
        // System.out.println("==========================");
        
        // dl.addAtBeginning(5);
        // dl.addAtBeginning(4);
        // dl.addAtBeginning(3);
        // dl.print();
        
        
        
    }
}
