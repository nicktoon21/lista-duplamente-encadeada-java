import java.util.Scanner;
import java.lang.OutOfMemoryError;

public class Lista {

    Scanner read = new Scanner(System.in);

    private int quantidadeDeElementos;
    private No inicio;
    private No fim;

    public int getQuantidadeDeElementos(){
        return quantidadeDeElementos;
    }

    //Inserir no inicio
    public void InserirInicio(int valor){
        No proximo = null;
        try{
            proximo = new No(valor);
        }catch(OutOfMemoryError error){
            System.out.printf("\nErro: Estouro de memoria! (%s)", error.getMessage());
        }
        if(getQuantidadeDeElementos() < 1){
            inicio = proximo;
            fim = proximo;
            proximo.setAnterior(proximo);
            proximo.setProximo(proximo);
        }else{
            proximo.setProximo(inicio);
            proximo.setAnterior(fim);
            fim.setProximo(proximo);
            inicio.setAnterior(proximo);
            inicio = proximo;
        }
        quantidadeDeElementos++;
    }

    //Retirar do inicio
    public int RetirarInicio(){
        No ponteiroAux = null;
        if(getQuantidadeDeElementos() <= 0){
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
            quantidadeDeElementos--;
        }
        return ponteiroAux.getValor();
    }

}
