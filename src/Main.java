//Implementação de Lista Duplamente Encadeada Circular.

public class Main {
    public static void main(String[] args){
        //Instânciar Lista
        Lista lista = new Lista();

        //Inserção dados na pelo fim da lista
        lista.inserirFim(9);
        lista.inserirFim(5);
        lista.inserirFim(4);
        lista.inserirFim(2);

        //Retirando dados pelo fim da lista e exibindo.
        System.out.println("Valor:"+lista.retirarFim());
        System.out.println("Valor:"+lista.retirarFim());
        System.out.println("Valor:"+lista.retirarFim());
    }
}
