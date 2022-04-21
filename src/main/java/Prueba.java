public class Prueba {

    public static long factorial(long numero) {
        if (numero <= 1)
            return 1;
        return numero * factorial(numero - 1);
    }
        public static void main(String[] args) {


            for(long i = 0; i < 20; i++){
                System.out.println(String.format("Numerico de %d.  Factorial: %d", i, factorial(i)));
            }
        }

}
