import java.util.Scanner;
import java.security.SecureRandom;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        SecureRandom sorteio = new SecureRandom();
        int numero, tentativa = 0;
        int pontuacao = 5;
        System.out.println("O computador sorteará um número de 0 e 10 (ambos inclusos)");
        System.out.println("Você deve adivinhar o número!\nRegras:");
        System.out.println("Você terá três chances e começará com 5 pontos.");
        System.out.println("O computador informará se o número está abaixo ou acima da sua escolha.");
        System.out.println("Cada tentativa incorreta resultará em uma redução da pontuação.");
        System.out.println("Uma vitória na primeira tentativa vale 5 pontos, uma vitória na segunda tentativa vale 4 pontos.");
        System.out.println("E uma vitória na terceira tentativa vale 2 pontos.");
        numero = sorteio.nextInt(11);
        System.out.println("O número já foi sorteado! Aperte ENTER quando estiver pronto.");
        teclado.nextLine();
        System.out.print("Faça sua escolha: ");
        try {
        tentativa = teclado.nextInt();

        if (tentativa == numero) //USUARIO GANHOU 
            System.out.printf("\nParabéns, você venceu de primeira! Sua pontuação é %d.", pontuacao);
            //USUARIO VAI PRECISAR DA PRIMEIRA DICA E CHUTOU ACIMA 
        else if (tentativa > numero) {
            pontuacao = 4;
            System.out.printf("\nNúmero incorreto, o número sorteado é menor.");
            System.out.println("\nTente novamente: ");
            tentativa = teclado.nextInt();

            if (tentativa == numero) System.out.printf("\nParabéns, você venceu! Sua pontuação é %d.", pontuacao);
            //USUARIO VAI PRECISAR DA SEGUNDA DICA E CHUTOU ACIMA 
            else if (tentativa > numero) {
                pontuacao = 2;
                System.out.printf("\nNúmero incorreto, o número sorteado é menor.");
                System.out.println("\nÚltima tentativa.");
                System.out.println("Tente novamente: ");
                tentativa = teclado.nextInt();
            //USUARIO GANHOU
                if (tentativa == numero) System.out.printf("\nParabéns, você venceu! Sua pontuação é %d.", pontuacao);
            //USUARIO PERDEU
                else if (tentativa != numero) System.out.println("Você perdeu, mais sorte na próxima vez!\n O número era: " + numero);
            //USUARIO VAI PRECISAR DA SEGUNDA DICA E CHUTOU ABAIXO 
            } else if (tentativa < numero) {
                pontuacao = 2;
                System.out.printf("\nNúmero incorreto, o número sorteado é maior.");
                System.out.println("\nÚltima tentativa.");
                System.out.println("Tente novamente: ");
                tentativa = teclado.nextInt();
            //USUARIO GANHOU
                if (tentativa == numero) System.out.printf("\nParabéns, você venceu! Sua pontuação é %d.", pontuacao);
            //USUARIO PERDEU
                else if (tentativa != numero) System.out.println("Você perdeu, mais sorte na próxima vez!\n O número era: " + numero);
            }
            //USUARIO VAI PRECISAR DA SEGUNDA DICA E CHUTOU ABAIXO
        } else if (tentativa < numero) {
                pontuacao = 4;
                System.out.printf("\nNúmero incorreto, o número sorteado é maior.");
                System.out.println("Tente novamente: ");
                tentativa = teclado.nextInt();
            //USUARIO GANHOU
                if (tentativa == numero) System.out.printf("\nParabéns, você venceu! Sua pontuação é %d.", pontuacao);
            //USUARIO VAI PRECISAR DA SEGUNDA DICA E CHUTOU ACIMA 
            else if (tentativa > numero) {
                pontuacao = 2;
                System.out.printf("\nNúmero incorreto, o número sorteado é menor.");
                System.out.println("\nÚltima tentativa.");
                System.out.println("Tente novamente: ");
                tentativa = teclado.nextInt();
            //USUARIO GANHOU
                if (tentativa == numero) System.out.printf("\nParabéns, você venceu! Sua pontuação é %d.", pontuacao);
            //USUARIO PERDEU
                else if (tentativa != numero) System.out.println("Você perdeu, mais sorte na próxima vez!\n O número era: " + numero);
            //USUARIO VAI PRECISAR DA SEGUNDA DICA E CHUTOU ABAIXO 
            } else if (tentativa < numero) {
                pontuacao = 2;
                System.out.printf("\nNúmero incorreto, o número sorteado é maior.");
                System.out.println("\nÚltima tentativa.");
                System.out.println("Tente novamente: ");
                tentativa = teclado.nextInt();
            //USUARIO GANHOU
                if (tentativa == numero) System.out.printf("\nParabéns, você venceu! Sua pontuação é %d.", pontuacao);
            //USUARIO PERDEU
                else if (tentativa != numero) System.out.println("Você perdeu, mais sorte na próxima vez!\n O número era: " + numero);
            }
        }
        } catch (Exception e) {
            System.out.println("ERRO: Digite uma entrada válida!");
        }
        teclado.close();
    }
}