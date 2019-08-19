public class Main {
    public static void main(String[] args){
        Lista lista = new Lista();

        lista.inserirFim(9);
        lista.inserirFim(5);
        lista.inserirFim(4);
        lista.inserirFim(2);

        System.out.println("Valor:"+lista.retirarFim());
        System.out.println("Valor:"+lista.retirarFim());
        System.out.println("Valor:"+lista.retirarFim());
    }
}
