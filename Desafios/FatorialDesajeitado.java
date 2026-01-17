/*
Desafio
O fatorial de um número inteiro positivo N é o produto de todos os inteiros positivos menores ou iguais a n. Fazemos um fatorial desajeitado usando os inteiros em ordem decrescente, trocando as operações de multiplicação por uma rotação fixa de operações cuja ordem é: multiplicar '*', dividir '/', adicionar '+' e subtrair '-'. Por exemplo, desajeitado(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1. Lembre-se que no fatorial desajeitado as operações ainda são aplicadas usando a ordem usual de operações aritméticas. Além disso, a divisão neste caso sempre resulta em um número inteiro, por exemplo, 90 / 8 = 11. Dado um inteiro N, retorne o fatorial desajeitado de n.

Entrada
A entrada consiste em um valor inteiro positivo N.

Saída
A saída consiste em retornar o valor do seu fatorial desajeitado de N, conforme exemplo abaixo.

Exemplo: Entrada = 4, Saída = 7
Explicação: 7 = 4 * 3 / 2 + 1 
*/

import java.util.*;

public class FatorialDesajeitado {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int res = 0;
        int cnt = 1;
        int tmp = n;
        n--;
        
        while (n > 0) {
            if (cnt % 4 == 1) {        // multiplicação
                tmp = tmp * n;
            } else if (cnt % 4 == 2) { // divisão inteira
                tmp = tmp / n;
            } else if (cnt % 4 == 3) { // adição
                res += tmp;            // acumula antes de reiniciar tmp
                tmp = n;
            } else {                   // subtração
                res += tmp;            // acumula antes de reiniciar tmp
                tmp = -n;
            }
            cnt++;
            n--;
        }
        res += tmp; // soma o último valor restante
        System.out.println(res);
    }

}
