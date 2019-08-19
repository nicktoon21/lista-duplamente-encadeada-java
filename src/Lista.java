import java.util.Scanner;
import java.lang.OutOfMemoryError;

public class Lista {

    Scanner read = new Scanner(System.in);

    private int quantidadeDeElementos = 0;
    private No inicio;
    private No fim;

    public int getQuantidadeDeElementos(){
        return quantidadeDeElementos;
    }

    //Inserir no inicio
    public void inserirInicio(int valor){
        No ponteiro = null;
        try{
            ponteiro = new No(valor);
        }catch(OutOfMemoryError error){
            System.out.printf("\nErro: Estouro de memoria! (%s)", error.getMessage());
        }
        if(quantidadeDeElementos < 1){
            inicio = ponteiro;
            fim = ponteiro;
            ponteiro.setAnterior(ponteiro);
            ponteiro.setProximo(ponteiro);
        }else{
            ponteiro.setProximo(inicio);
            ponteiro.setAnterior(fim);
            fim.setProximo(ponteiro);
            inicio.setAnterior(ponteiro);
            inicio = ponteiro;
        }
        quantidadeDeElementos++;
    }

    //Retirar do inicio
    public int retirarInicio(){
        No ponteiroAux = null;
        if(quantidadeDeElementos <= 0){
            System.out.printf("\nQuantidade de elementos igual a 0! (%s)");
            return 0;
        }else if (quantidadeDeElementos == 1){
            ponteiroAux = inicio;
            inicio.setProximo(null);
            inicio.setAnterior(null);
        }
        else{
            ponteiroAux = inicio;
            inicio = inicio.getProximo();
            inicio.setAnterior(fim);
            ponteiroAux.setAnterior(null);
            ponteiroAux.setProximo(null);
        }
        quantidadeDeElementos--;
        return ponteiroAux.getValor();
    }

    //Inserir no fim
    public void inserirFim(int valor){
        No ponteiro = null;
        try{
            ponteiro = new No(valor);
        }catch(OutOfMemoryError error){
            System.out.printf("\nErro: Estouro de memoria! (%s)", error.getMessage());
        }
        if(quantidadeDeElementos < 1){
            inicio = ponteiro;
            fim = ponteiro;
            ponteiro.setAnterior(ponteiro);
            ponteiro.setProximo(ponteiro);
        }else{
            fim.setProximo(ponteiro);
            ponteiro.setAnterior(fim);
            fim = ponteiro;
            fim.setProximo(inicio);
            inicio.setAnterior(fim);
        }
        quantidadeDeElementos++;
    }

    //Retirada Fim
    public int retirarFim() {
        No ponteiroAux = null;
        if (quantidadeDeElementos <= 0) {
            System.out.printf("\nQuantidade de elementos igual a 0! (%s)");
            return 0;
        } else if (quantidadeDeElementos == 1) {
            ponteiroAux = inicio;
            inicio.setProximo(null);
            inicio.setAnterior(null);
        } else {
            ponteiroAux = fim;
            fim = fim.getAnterior();
            ponteiroAux.setAnterior(null);
            ponteiroAux.setProximo(null);
            fim.setProximo(inicio);
            inicio.setAnterior(fim);
        }
        quantidadeDeElementos--;
        return ponteiroAux.getValor();
    }
}