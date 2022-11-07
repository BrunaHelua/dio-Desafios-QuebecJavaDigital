// Exercicio para calcular números inteiros pares de um Array
// Exibe apenas os pares

public class Desafio11 {
    public static void main(String[] args){

// TODO: Crie um Array de números inteiros:
    int arrayInteiros[] = {2, 3, 5, 7, 11, 13, 18, 34};

// TODO: Implemente um laço de repetição que verifique APENAS seus números Pares:
    for (int i = 0; i < arrayInteiros.length; i++){
        if (arrayInteiros[i] % 2 == 0 ){
                System.out.println(arrayInteiros[i]);
                } 
            }
    }
}