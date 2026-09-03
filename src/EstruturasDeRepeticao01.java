public class EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 0;

       /* while (count < 10){
            System.out.println(count);
            count += 1;
        } */

        int pratosSujos = 3;

        while (pratosSujos > 0) {
            System.out.println("Lavando um prato...");

            pratosSujos = pratosSujos - 1;
        }

        do {
            System.out.println("Lavando um prato (do-while)");
        } while (pratosSujos > 0);
    }
}