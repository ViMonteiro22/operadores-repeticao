public class EstruturasDeRepeticaoContinueExemploReal {

    // Imagina a seguinte situação na rotina de uma central de transportes:
    // você tem um sistema que processa a liberação de viagens.
    // Se a documentação de uma viagem der problema,
    // o sistema não pode simplesmente parar de funcionar e travar toda a operação.
    // Ele só precisa pular aquela viagem com erro e continuar despachando os próximos caminhões.

    public static void main(String[] args) {

        int totalViagensLiberadas = 0;

        // O sistema vai analisar 6 viagens na fila de hoje
        for (int idViagem = 1; idViagem <= 6; idViagem++) {

            // Simulando que as viagens 3 e 5 estão com problemas na nota fiscal
            if (idViagem == 3 || idViagem == 5) {
                System.out.println("⚠️ ALERTA: Viagem " + idViagem + " retida. Faltam documentos. Pulando para a próxima...");
                System.out.println("----------------------------------");

                continue; // O Java lê isso, ignora todo o resto abaixo, e volta pro topo para o próximo idViagem!
            }

            // Tudo que está daqui para baixo SÓ acontece se o continue NÃO for ativado
            System.out.println("✅ Viagem " + idViagem + " validada com sucesso.");
            System.out.println("Gerando rota da viagem " + idViagem + "...");
            System.out.println("Enviando notificação para o motorista...");
            System.out.println("----------------------------------");

            totalViagensLiberadas++; // Soma 1 no contador de sucessos
        }

        // Fora do laço, imprimimos o resultado final do dia
        System.out.println("FECHAMENTO: " + totalViagensLiberadas + " viagens foram liberadas hoje.");
    }
}
