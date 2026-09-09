public class EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Chegou no 5, parando tudo!");
                break;
                // O loop morre aqui. 6, 7, 8, 9 e 10 nunca vão rodar.
            }
            System.out.println("Contando: " + i);
        }

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Pulando o número 3...");
                continue;
                // Ignora o print de baixo e volta lá pro topo (onde o i vira 4)
            }
            System.out.println("Processando número: " + i); // O 3 nunca chega a ser impresso aqui
        }
    }
}
