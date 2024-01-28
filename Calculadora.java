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
            case "multiplicacion":
                resultado = multiplicacion();
                break;
            case "division":
                resultado = division();
                break;
        }
        return resultado;
    }

    public int suma() {
        return numero1 + numero2;
    }

    public int multiplicacion() {
        return numero1 * numero2;
    }

    public int division() {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            throw new ArithmeticException("No se puede dividir por cero");
        }
    }
}