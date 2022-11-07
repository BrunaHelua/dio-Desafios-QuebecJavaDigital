// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.util.Scanner; 

public class Desafio13 {
    
public static void main(String[] args){ 
    Scanner leitor = new Scanner(System.in); 
    int t = leitor.nextInt(); 

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