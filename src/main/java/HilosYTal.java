import java.util.logging.Logger;

public class HilosYTal implements Runnable {


        public static final String TAG = HilosYTal.class.getSimpleName();
        public static final int MAX = 500;

        public static final Logger LOGGER = Logger.getLogger(TAG);


        public  HilosYTal (int max) {
            maxValue = max;
        }

        public  HilosYTal () {
            maxValue = MAX;
        }


        private int i;
        private int maxValue;

        public void run() {
            i = 0;


            String name = Thread.currentThread().getName();
            System.out.printf("%s \n",name, i++);




        }




}
