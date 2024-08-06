import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        System.out.println("Sorveteria Gourmet! Faça o seu pedido a seguir");
        Scanner leia = new Scanner(System.in);
        double sorvete = 0;
        double somaTotal = 0;
        boolean pedido = true;

        while (pedido) {
            System.out.println("""
            [1] - 1 Bola casquinha por R$6.00
            [2] - 2 Bolas casquinha por R$9.00
            [3] - 2 Bolas cascão por R$ recheado por R$12.00
                """);

            int opcao = leia.nextInt();
            switch (opcao) {
                case 1:
                    sorvete += 6.00;
                    break;
                case 2:
                    sorvete += 9.00;
                    break;
                case 3:
                    sorvete += 12.00;
                    break;
            }

            System.out.println("Quantos sorvetes voce deseja? ");
            int qnt_sorvt = leia.nextInt();
            somaTotal += sorvete * qnt_sorvt;

            for (int qnt_cob = 1; qnt_cob <= qnt_sorvt; qnt_cob++){
                System.out.println("Voce deseja adicionar cobertura? [S/N]");
                String opt = leia.next().toUpperCase();
                if (opt.equals("S")) {
                    System.out.println("""
                        Escolha uma das opçoes:
                        [1] - Chocolate por R$2.00
                        [2] - Morango por R$2.00
                        [3] - Avelã por R$3.00
                            """);

                    int sabor_cob = leia.nextInt();
                    if (sabor_cob == 1 || sabor_cob == 2) {
                        somaTotal += 2.00;
                    } else {
                        somaTotal += 3.00;
                    }
                } 
            }
            System.out.println("Continuar pedido? [S/N]");
            String res = leia.next().toUpperCase();
            if (res.equals("N")){
                pedido = false;
            }
        }
        System.out.println(String.format("Pedido efetuado! Total a pagar é R$:%.2f", somaTotal));
        leia.close();
    }  
}
