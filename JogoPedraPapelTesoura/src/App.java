import java.util.Scanner;
import java.security.SecureRandom;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        SecureRandom sorteio = new SecureRandom();
        String escolhaComputador = "", escolhaUsuario = "";
        int decisao = 0;
        // implementar a leitura da escolha jogador
        System.out.println("Digite o número para escolher sua jogada:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        try {
            decisao = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("ERRO: Digite 1, 2 ou 3");
        }
        switch (decisao) {
            case 1:
                escolhaUsuario = "Pedra";
                break;
            case 2:
                escolhaUsuario = "Papel";
                break;
            case 3:
                escolhaUsuario = "Tesoura";
                break;
        }
        System.out.println("Você escolheu: " + escolhaUsuario);
        // sorteia um numero de 0 à 2 (3 - 1)
        switch (sorteio.nextInt(3)) {
            case 0:
                escolhaComputador = "Tesoura";
                break;
            case 1:
                escolhaComputador = "Pedra";
                break;
            case 2:
                escolhaComputador = "Papel";
                break;
        }
        System.out.println("O computador escolheu: " + escolhaComputador);
        // implementar a lógica do jogo e decidir o vencedor
        if ((escolhaUsuario).equals(escolhaComputador)) {
            System.out.println("O resultado foi: EMPATE");
        } else if (((escolhaUsuario)).equals("Pedra") && (escolhaComputador).equals("Tesoura")) {
            System.out.println("O Resultado foi: Vitória");
        } else if (((escolhaUsuario)).equals("Pedra") && (escolhaComputador).equals("Papel")) {
            System.out.println("O Resultado foi: Derrota");
        } else if (((escolhaUsuario)).equals("Papel") && (escolhaComputador).equals("Tesoura")) {
            System.out.println("O Resultado foi: Derrota");
        } else if (((escolhaUsuario)).equals("Papel") && (escolhaComputador).equals("Pedra")) {
            System.out.println("O Resultado foi: Vitória");
        } else if (((escolhaUsuario)).equals("Tesoura") && (escolhaComputador).equals("Pedra")) {
            System.out.println("O Resultado foi: Derrota");
        } else if (((escolhaUsuario)).equals("Tesoura") && (escolhaComputador).equals("Papel")) {
            System.out.println("O Resultado foi: Vitória");
        }
        teclado.close();
    }
}