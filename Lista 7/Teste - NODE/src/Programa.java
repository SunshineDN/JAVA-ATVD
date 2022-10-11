import entidades.Lista;

public class Programa {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.adicionar(10);
        lista.adicionar(15);
        lista.adicionar(20);
        lista.adicionar(25);
        System.out.println("Tamanho = " + lista.getSize());
        System.out.println("Primeiro = " + lista.getHead().getValor());
        System.out.println("Ultimo = " + lista.getTail().getValor());
        lista.listar();
        lista.getElemento(3);
    }
}
