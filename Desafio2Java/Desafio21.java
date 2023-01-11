// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.*;

public class Desafio21 {
    public static void main(String[] args)
    {
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
/* 
	if(step > 0){
	    System.out.println("numero de passos" + step);
	}else{
	    System.out.println("numero de passos" + step);
	}*/
    }
}