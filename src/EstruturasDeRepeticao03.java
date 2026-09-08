public class EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 numeros de um dado valor
        // Por exemplo, 15

       /* int valorMax = 25;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 15){
                break;
            }
            System.out.println(i);
        } */

        // Exercicio BREAK
        // Dado um valor de um carro, descubra quantas x ele pode ser parcelado
        // Condiçao valorParcela >= 1.000,00

        double valorCarro = 7500;

        for (double parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }

        // Exercicios do BREAK

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }

            System.out.println(i);
        }

        /* Nesse caso tem uma pegadinha
         java executa o código de cima para baixo
         linha por linha, respeitando condições e laços */

        /* println acontece antes do if, ou seja, ele imprime o 5
        No código anterior, o if vinha antes do println
        por isso o 5 não chegava a ser impresso */

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

            if (i == 5) {
                break;
            }
        }
    }
}
