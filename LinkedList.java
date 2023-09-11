public class LinkedList {
    Node head;

    public LinkedList(){
        this.head=null;
    }
    
    public void append(String name,int score){
        Node newNode = new Node(name, score);

        if (head==null){
            head=newNode;
            return;
        }

        Node current =head;

        while (current.next != null){
            current = current.next;
        }


        current.next=newNode;


    }

    public void display(){
        Node current=head;

        while (current !=null){
            System.out.println(current.score + "   "+ current.name);
            current=current.next;
        }
        System.out.println("null");

    }

    public void sort() {
        if (head == null || head.next == null) {
            return;
        }
    
        Node current = head;
        Node index = null;
        int tempScore;
        String tempName;
    
        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.score < index.score) { // Compare in descending order
                    tempScore = current.score;
                    current.score = index.score;
                    index.score = tempScore;
    
                    tempName = current.name;
                    current.name = index.name;
                    index.name = tempName;
                }
                index = index.next;
            }
            current = current.next;
        }
    

    }
}