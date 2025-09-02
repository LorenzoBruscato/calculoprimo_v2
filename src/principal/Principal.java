package principal;

import calculaprimo.CalculaPrimo;

public class Principal {

    public static void main(String[] args) {
        Runnable teste1 = new CalculaPrimo(5, 25);

        Thread t1 = new Thread(teste1);

        t1.start();
    }
}
