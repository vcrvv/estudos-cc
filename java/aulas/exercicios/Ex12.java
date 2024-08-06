public class Ex12 {
    public static void main(String[] args) {
        System.out.println("Tabela de Multiplicação: ");

        for (int num = 1; num <= 10; num++) {
            System.out.println("\nTabuada do " + num + ": ");

            for (int valor = 1; valor <= 10; valor++) {
                int resultado = num * valor;
                System.out.println(num + " x " + valor + " = " + resultado);
            }
        }
    }
}
