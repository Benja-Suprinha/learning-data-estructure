public class linkedList {
    public class linkList {
        public node head;
        public node next;

        linkList(node head, node next) {
            this.head = head;
            if (next == null) {
                this.next = null;
            } else {
                this.next = next;
            }
        }

        public void addNode(node newNode) {
            if (this.next == null) {
                this.next = newNode;
            }
        }
    }

    public class node {
        public int data;

        node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        // Your code here
        linkedList list = new linkedList();

        node node1 = list.new node(1);

        linkList list1 = list.new linkList(node1, null);
        System.out.println(list1.head.data);
    }
}
