public class App { 
    public static void main(String[] args) {
        int[] meuVetor = {10, 20, 30, 40, 50}; //Inicializando o vetor com valores
    
        int elemento = meuVetor[2]; // Isso atribuirá o valor 30 à variável elemento
        System.out.println("Valor da posição [2] do vetor: " + elemento);
    
        meuVetor[2] = 35; // O terceiro elemento agora é 35
    
        System.out.println("Valores do vetor:");
        for(int i = 0; i < meuVetor.length; i++) {
            System.out.println("[" + i + "] = " + meuVetor[i]);
        }
    
        int[] vetor = new int[5]; // Declarando e inicializando um vetor com 5 posições
        System.out.println("Valores do outro vetor:");
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("[" + i + "] = " + vetor[i]);
        }   
        
    }
}

