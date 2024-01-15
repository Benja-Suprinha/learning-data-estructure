public class linkedList {
    node head; //se define la cabeza de la lista
    int size = 0; //se define el tamaño de la lista

    public static linkedList addNode(linkedList list, int data) {
        node newNode = new node(data);
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
        } else {
            node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        list.size++;
        return list;
    }

    public static void printList(linkedList list) {
        node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    static class node { //se define la clase nodo que contiene el dato y el apuntador de la lista
        public int data;
        public node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();

        list = addNode(list, 1);
        list = addNode(list, 2);
        list = addNode(list, 3);

        printList(list);
        System.out.println("\nSize: " + list.size);
    }
}
