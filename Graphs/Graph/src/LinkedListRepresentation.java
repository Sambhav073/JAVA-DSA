public class LinkedListRepresentation {
    // Node class representing each element in the linked list
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Custom LinkedList class for adjacency list
    static class MyLinkedList {
        Node head;

        // Add a node at the end
        void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // Print the list
        void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(" -> " + temp.data);
                temp = temp.next;
            }
        }
    }

    // Graph class using the custom LinkedList
    static class Graph {
        int V;
        MyLinkedList[] adj;

        // Constructor
        Graph(int v) {
            V = v;
            adj = new MyLinkedList[v];
            for (int i = 0; i < v; i++) {
                adj[i] = new MyLinkedList();
            }
        }

        // Add edge
        void addEdge(int src, int dest) {
            adj[src].add(dest);
            // Uncomment below line if the graph is undirected
            // adj[dest].add(src);
        }

        // Print graph
        void printGraph() {
            for (int i = 0; i < V; i++) {
                System.out.print("Vertex " + i + ":");
                adj[i].printList();
                System.out.println();
            }
        }


    }
    // Main method
    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.printGraph();
    }

}
