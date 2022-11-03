public class Main {
    public static void main(String[] args) {
        // se llama a la funcion suma
        int resultado = suma(5, 3, 2);
        System.out.println(resultado);

        // se instancia la clase coche
        coche micoche = new coche();
        micoche.puertas();
        System.out.println(micoche.numPuertas);

    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    static class coche {
        int numPuertas = 4;

        public void puertas() {
            this.numPuertas++;
        }


    }
}