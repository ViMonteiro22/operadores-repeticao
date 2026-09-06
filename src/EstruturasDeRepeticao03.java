public class EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 numeros de um dado valor
        // Por exemplo, 15

        int valorMax = 25;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 15){
                break;
            }
            System.out.println(i);
        }
    }
}
