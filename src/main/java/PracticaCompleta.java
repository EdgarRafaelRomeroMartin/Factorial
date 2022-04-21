import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class PracticaCompleta {


    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        List<Integer> listita = new ArrayList<Integer>();
        System.out.println("Introduce cantidad de numeritos UwU");
        int N = teclado.nextInt();


        for(long i = 0; i < N; i++){
            System.out.println("Introduce un numero");
            int num = teclado.nextInt();
            listita.add(num);


        }
        for(Integer e: listita) {
            int n = Integer.parseInt(String.valueOf(e));
            Thread t = new Thread( new HilosYTal(n) );
            System.out.println(String.format("El numero %d tiene como factorial: %d", e, factorial(e)));
            t.start();
            System.out.println("esta en el hilo:");

        }
    }
    public static long factorial(long numero) {
        if (numero <= 1)
            return 1;
        return numero * factorial(numero - 1);
    }

}
