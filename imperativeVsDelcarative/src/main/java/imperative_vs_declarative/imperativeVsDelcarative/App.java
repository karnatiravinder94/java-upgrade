package imperative_vs_declarative.imperativeVsDelcarative;

import java.util.stream.IntStream;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*
         * Imperative style of programming
         */
    	int imperatieSum=0;
        for(int i=0;i<=100;i++) {
        	imperatieSum=+i;
        }
        System.out.println("imperative sum -----> "+imperatieSum);
        
        /*
         * Declarative style of programming
         */
        int declarativeSum=IntStream.range(0, 100).sum();
        System.out.println("Declarative style of sum ---> "+declarativeSum);
        
    }
}
