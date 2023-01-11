// Armazena dados inteiros em um vetor de tamanho determinado. Le um valor T e preenche vetor N[1000]
// com a sequência de valores de 0 até T-1 repetidas vezes. Imprime o vetor N

import java.util.Scanner; 

public class Desafio13 {
    
public static void main(String[] args){ 
    Scanner leitor = new Scanner(System.in); 
    int t = leitor.nextInt(); 
// meu TODO: trabalhar exceptions - valores não inteiros para t
// Lembre-se a sequência de valores é de 0 até T-1:
        int vetor[] =  new int[1000];
        int j = 0;
            while(j < vetor.length ) {
                
            for(int i = 0; i < t; i++){
                if (j < vetor.length) {
                vetor[j] = i;
                System.out.println("N[" +j+ "] = "+ vetor[j]);
                j++;
            } 
            }
        }
    leitor.close();
}
}