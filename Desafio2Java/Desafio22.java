//Em um jogo 2D existe um robô de limpeza que começa na posição (0,0).
// Ele recebe alguns comandos através de uma sequência de movimentos.
// Os movimentos válidos são: 'W' (movimento para cima), "S"(movimento para baixo),
// "D"(movimento para direita) e "A"(movimento para esquerda).
// Você deverá verificar se após completar seus movimentos o robô se encontra na posição (0,0).
// Retorne true se o robô retornar à origem ou false caso contrário.
// Assuma que a magnitude do movimento do robô é a mesma para cada movimento.

import java.util.*;
 
public class Desafio22 {

public static void main(String[] args)
 
{
        String movimentos = new Scanner(System.in).nextLine();

        // posicoes da origem
        var x = 0;
        var y = 0;

 // TODO: Implemente os movimentos do Robô e verifique sua posição: 

        for (int i = 0; i < movimentos.length(); i++)
        {
            char ch = movimentos.charAt(i);
            if (ch == 'W')
            {
                y++;
            }
            if (ch == 'S')
            {
                y--;
            }
            if (ch == 'D')
            {
                x++;
            }
            if (ch == 'A')
            {
                x--;
            }
        }

    if (x == 0 && y == 0)
    {
        System.out.print("true");
    }
    else
    {
        //System.out.println(x + ", " + y);
        System.out.print("false");
    }
 
}
}

