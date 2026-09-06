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

        double valorCarro = 5000;

        for (double parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
