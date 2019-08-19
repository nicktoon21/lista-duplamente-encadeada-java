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
        if(inicio.getValor() <= valor){
            inicio = proximo;
            fim = proximo;
        }else{
            inicio.setProximo(inicio);
            inicio = proximo;
        }
    }
    public void setQuantidadeDeElementos(int quantidadeDeElementos) {this.quantidadeDeElementos = quantidadeDeElementos++;}

}
