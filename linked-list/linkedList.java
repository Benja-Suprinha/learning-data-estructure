public class linkedList {
    public class linkList {
        public node head;

        linkList() {
            this.head = null;
        }

        public void addNode(linkList l, int data) {
            node node = new node(data);
            if (l.head == null) {
                l.head = node;
            } else {
                node temp = l.head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
            }
        }
    }

    public class node {
        public int data;
        public node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Your code here
    }
}
