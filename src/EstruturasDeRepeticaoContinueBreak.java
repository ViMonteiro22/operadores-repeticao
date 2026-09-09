public class EstruturasDeRepeticaoContinueBreak {
    public static void main(String[] args) {

        int capacidadeMaxima = 3;
        int caminhoesNoPatio = 0;

        // Fila com 10 caminhões no portão
        for (int caminhao = 1; caminhao <= 10; caminhao++) {

            // 1. O BREAK: Verifica se o pátio já lotou antes de atender o caminhão
            if (caminhoesNoPatio == capacidadeMaxima) {
                System.out.println("🚨 ALERTA: Pátio lotado! Parando a triagem no caminhão " + caminhao + ".");
                break; // A FESTA ACABA AQUI. O loop morre e os caminhões de trás ficam esperando.
            }

            // 2. O CONTINUE: Simula que os caminhões 2 e 4 estão com erro na nota
            if (caminhao == 2 || caminhao == 4) {
                System.out.println("⚠️ Caminhão " + caminhao + " com nota inválida. Pulando e chamando o próximo...");
                System.out.println("----------------------------------");
                continue; // Ignora o código de baixo e volta pro topo para atender o próximo.
            }

            // Se não caiu no break nem no continue, o caminhão entra!
            System.out.println("✅ Caminhão " + caminhao + " liberado para descarregar.");
            caminhoesNoPatio++; // Ocupou uma vaga no pátio
            System.out.println("Vagas ocupadas: " + caminhoesNoPatio + "/" + capacidadeMaxima);
            System.out.println("----------------------------------");
        }

        System.out.println("🏁 Sistema de triagem pausado.");
    }
}
