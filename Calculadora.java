public class Calculadora {
    private int numero1;
    private int numero2;

    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int realizarOperacion(String operacion) {
        int resultado = 0;
        switch (operacion) {
            case "suma":
                resultado = suma();
                break;
            case "resta":
                resultado = resta();
                break;
            // Add more cases for other operations if needed
        }
        return resultado;
    }

    public int suma() {
        return numero1 + numero2;
    }

    public int resta() {
        return numero1 - numero2;
    }
}