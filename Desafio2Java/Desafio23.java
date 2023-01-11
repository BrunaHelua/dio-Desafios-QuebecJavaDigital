// Dado um inteiro positivo num, retorne o número de inteiros positivos menor ou igual a num
// cuja soma de dígitos é par.

import java.util.*;

public class Desafio23 {
    public static void main(String[] args)
    {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var count = 0;
        var soma = 0;
        //num = num +1;
        //System.out.println(num);
        for (var i = 1; i <= num; i++)
        {
            soma = 0;
            // transforma num em String para usar posicoes dos char na String
            var strNum = String.valueOf(i);
            for (var j = 0; j < strNum.length(); j++)
            {
                char ch = strNum.charAt(j);

                // transforma em int para fazer soma dos digitos
                int numChar = Integer.parseInt(String.valueOf(ch));
                soma += numChar;
            }
            if(soma % 2 == 0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

