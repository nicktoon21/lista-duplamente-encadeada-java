public class No {

    private int valor;
    private No proximo;
    private No anterior;

    No(){}
    public No(int valor){setValor(valor);}

    public int getValor(){return valor;}
    public No getProximo(){return proximo;}
    public No getAnterior(){return anterior;}

    private void setValor(int valor){this.valor = valor;}
    public void setProximo(No proximo){this.proximo = proximo;}
    public void setAnterior(No anterior){this.anterior = anterior;}
}
