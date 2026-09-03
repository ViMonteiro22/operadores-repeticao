public class EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 0;

       /* while (count < 10){
            System.out.println(count);
            count += 1;
        } */

        /* int pratosSujos = 3;

        while (pratosSujos > 0) {
            System.out.println("Lavando um prato...");

            pratosSujos = pratosSujos - 1;
        }

        do {
            System.out.println("Lavando um prato (do-while)");
        } while (pratosSujos > 0); */

        for (int a = 1; a <= 10; a++){
            for (int b = 0; b <= 10; b++){
                if (b == 0){
                    System.out.println("Tabuada do " + a);
                }
                System.out.println(a + "x" + b + " = " + a*b);
                if (b == 10){
                    System.out.println("------------------------");
                }
            }
        }

       /* for (int i = 1; i <= 5; i++) {
            System.out.println("Escrevendo a tabuada pela " + i + "ª vez.");
        } */
    }
}