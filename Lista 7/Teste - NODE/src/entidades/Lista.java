package entidades;

public class Lista {

    private Node head;
    private Node tail;
    private int size;

    public Lista() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void adicionar (int novoValor) {
        Node novoNode = new Node(novoValor);

        if (this.head == null && this.tail == null) {
            this.head = novoNode;
            this.tail = novoNode;
            this.size++;
        } else {
            this.tail.setProximo(novoNode);
            this.tail = novoNode;
            this.size++;
        }

    }

    public void listar () {
        Node p = this.head;

        while (p != null) {
            System.out.println(p.getValor());
            p = p.getProximo();
        }
    }

    public void remover (int novoValor) {

    }

    public void getElemento (int pos) {
        Node act = this.head;

        for (int i = 0; i < pos; i++) {
            if (act.getProximo() != null) {
                act = act.getProximo();
            }
        }
        System.out.println(act.getValor());
    }
}
