import java.util.*;

public class Palindromo {
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
