public class EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 10

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Analise o codigo abaixo
        // Responda o numero impresso antes da execuçao

        int contador = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j % 2 != 0) {
                    contador++;
                }
            }
        }
        System.out.println(contador);

       for (int dia = 1; dia <= 2; dia++) {
            for (int hora = 8; hora <= 10; hora++) {
                if (hora % 2 != 0) {
                    System.out.println("Alarme tocando: Dia " + dia + " as " + hora + "h");
                }
            }
        }

        int total = 0;
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j % 2 == 0) {
                    total++;
                }
            }
        }
        System.out.println(total);
    } 
}
