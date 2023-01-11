
    // Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.*;

public class Desafio23 {
    public static void main(String[] args)
    {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var count = 0;

        for (var i = 1; i <=     ; i++)
        {
            var strNum = String.valueOf(i);
            if (strNum.length() ==      )
            {
                if (i %       ==    )
                {
                    count++;
                }
                continue;
            }
            char[] vs = strNum.toCharArray();
            var sum = 0;
            for (var j = 0; j <       ; j++)
            {
                sum += (int)Character.getNumericValue(vs[    ]);
            }
            if (sum %      ==       )
            {
                count++;
            }
        }
        System.out.println(     );
    }
}

