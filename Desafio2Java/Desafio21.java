// Dado um inteiro x, retorne o número de etapas para reduzi-lo a zero.
// Em uma etapa, se o número atual for par,
// você deve dividi-lo por 2, caso contrário, você deve subtrair 1 dele.

import java.util.*;

public class Desafio21 {
    public static void main(String[] args)
    {
        //System.out.println("Digite um número inteiro: ");
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var step = 0;

// TODO: Implemente uma condição onde seja possível reduzir o número até 0:

        while (num > 0)
        {
            /*if (num == 1)
            {
                step++;
                num -= 1;
            }*/
            if(num % 2 == 0)
            {
                step++;
                num /= 2;            
            }
            else
            {
                step++;
                num -= 1;
            }
        }
        System.out.println(step);
    }
}