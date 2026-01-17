/* Desafio  
Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n. 
Um quadrado perfeito é um inteiro que é o quadrado de um inteiro; em outras palavras, é o 
produto de algum inteiro consigo mesmo. Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, 
enquanto 3 e 11 não são. 

Entrada
A entrada consiste em um número inteiro n, representando o valor total. 

Saída
A saída consiste em retornar o menor número de números quadrados perfeitos. 

Ex: Entrada =12, saída = 3
*/

import java.util.*;

public class Desafio {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        int[] d = new int[n + 1];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[0] = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                d[i] = Math.min(d[i], d[i - j * j] + 1);
            }
        }

        System.out.println(d[n]);
       
    }
}
