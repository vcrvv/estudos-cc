public class App {
    public static void main(String[] args) throws Exception {
        int[][] matriz = new int[3][2]; // Matriz de 3 linhas por 2 colunas

        int[][] matrizDireta = {{1, 2}, {3, 4}, {5, 6}}; // 3 linhas, 2 colunas com valores específicos

        int elemento = matrizDireta[0][1]; // Acessa o elemento da primeira linha e segunda coluna

        matrizDireta[0][1] = 10; // Modifica o elemento na primeira linha e segunda coluna para 10

        for(int i = 0; i < matriz.length; i++) { // Percorre linhas
            for(int j = 0; j < matriz[i].length; j++) { // Percorre colunas
                System.out.println(matriz[i][j]);
            }
        }


        // Inicialização da matriz 3x3 com valores
        int[][] matrizDois = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Acessando um elemento específico (segunda linha, terceira coluna)
        System.out.println("Valor original na posição [1][2]: " + matrizDois[1][2]);
        
        // Modificando o valor na posição [1][2] para 10
        matrizDois[1][2] = 10;
        
        // Exibindo todos os dados da matriz após a modificação
        System.out.println("Exibindo todos os valores da matriz:");
        for(int i = 0; i < matrizDois.length; i++) {
            for(int j = 0; j < matrizDois[i].length; j++) {
                System.out.print(matrizDois[i][j] + " ");
            }
            System.out.println(); // Quebra de linha para formatar a saída como uma matriz
        }
    }
}  
