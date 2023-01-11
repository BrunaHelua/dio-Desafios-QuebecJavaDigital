// Calcular o valor a ser pago a partir do preço da peça e quantidade

import java.io.IOException;
import java.util.Scanner;

public class Desafio12 {

    // definicao do objeto desagio
    static double desafio12(int codigoPeca, int numeroPecas, Double valorPeca){
        double valPeca = valorPeca;
        int numPecas = numeroPecas;
        double valorTotal = numPecas * valPeca;
        return valorTotal;
    }

    //meu TODO: trabalhar exceptions
    // usar exceptions para quando usuario digita algo com tipo diferente do pedido
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite as informações da primeira peça");
        int codigoPeca1 = leitor.nextInt();
        int numeroPecas1 = leitor.nextInt();
        double valorPeca1 = leitor.nextDouble();
        double tot1 = desafio12(codigoPeca1, numeroPecas1, valorPeca1);

        System.out.println("Digite as informações da segunda peça");
        int codigoPeca2 = leitor.nextInt();
        int numeroPecas2 = leitor.nextInt();
        double valorPeca2 = leitor.nextDouble();
        double tot2 = desafio12(codigoPeca2, numeroPecas2, valorPeca2);
    
// TODO: Implemente um Cálculo Simples. 510+510+530 = 1550
// Levando em consideração a sua precedência de operadores e a definição de suas casas decimais:
        double totalPagar = tot1 + tot2;
System.out.println(String.format("VALOR A PAGAR: R$ %.2f", totalPagar));
leitor.close();
}

}