import java.util.Scanner;

public class App {

    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            int vidasRestantes = 6;
            String letrasCertas = "";
            String letrasTentadas = "";
            char letraChutada;
            
            String palavra = "treme";

            //contagem de vidas
            do {
                System.out.println("\n\nVidas Restantes: " + vidasRestantes);
                System.out.println("Letras já Tentadas: " + letrasTentadas + "\n");

                exibeForca(vidasRestantes);
                exibePalavraTela(palavra, letrasCertas);

                //TODO 02: caso o usuario digite uma letra ja tentada, peça uma nova letra

                boolean ErroLeitura = true;
                do {
                System.out.println("\n\n");
                letraChutada = Leitura.lerValorString("\nDigite uma letra: ").toLowerCase().charAt(0);
                if (letraJaTentada(letrasTentadas, letraChutada)) {
                    System.out.println("ERRO: Letra já tentada, tente outra!");
                    ErroLeitura = true;
                } else ErroLeitura = false;
                } while (ErroLeitura);

                //atualiza a lista de letras tentadas
                letrasTentadas += letraChutada;

                //atualiza a lista de letras certas
                if (acertouLetra(palavra, letraChutada))
                    letrasCertas += letraChutada;
                else 
                    //tira uma vida
                    vidasRestantes--;
                
                exibePalavraTela(palavra, letrasCertas);

                //TODO 03: implemente um bloco de código que verifique se o usuario já descobriu todas as letras da palavra.

                if (palavraJaDescoberta(palavra, letrasCertas)) break;
                else System.out.println();

            } while (vidasRestantes > 0);

            //TODO 04: implemente um bloco de comandos que informe uma mensagem dizendo se o jogador ganhou ou perdeu
            if (vidasRestantes > 0) System.out.println("PARABÉNS, VOCÊ VENCEU!!!");
            else {
                System.out.println("Infelizmente, você perdeu.");
                exibeForca(vidasRestantes);
                System.out.println("Mais sorte na próxima vez!\nObrigado por jogar");
            }
            teclado.close();
    }

    static boolean acertouLetra(String palavra, char letraChutada){
        return palavra.contains(Character.toString(letraChutada));
    }

    static void exibeForca(int contagemErro){
        switch (contagemErro) {
        //TODO 01: implemente aqui o desenho da forca quando a qtde de vidas restantes for 5, 4, 3, 2, 1
            case 6:
                System.out.println("""        
                        +---+
                        |   |
                            |
                            |
                            |
                            |
                    ========= """);
                break;
                case 5:
                System.out.println("""        
                        +---+
                        |   |
                        O   |
                            |
                            |
                            |
                    =========""");
                break;
                case 4:
                System.out.println("""        
                        +---+
                        |   |
                        O   |
                        |   |
                            |
                            |
                    =========""");
                break;
                case 3:
                System.out.println("""        
                        +---+
                        |   |
                        O   |
                       /|   |
                            |
                            |
                    =========""");
                break;
                case 2:
                System.out.println("""        
                        +---+
                        |   |
                        O   |
                       /|\\  |
                            |
                            |
                    =========""");
                break;
                case 1:
                System.out.println("""        
                        +---+
                        |   |
                        O   |
                       /|\\  |
                       /    |
                            |
                    =========""");
                break;
                case 0:
                System.out.println("""        
                        +---+
                        |   |
                        O   |
                       /|\\  |
                       / \\  |
                            |
                    ========= """);
                break;

            default:
                break;
        }
    }

    static void exibePalavraTela(String palavraSecreta, String letrasCertas){
        char letra;
        System.out.println("\n\n");

        for (int posicaoLetra = 0; posicaoLetra < palavraSecreta.length(); posicaoLetra++) {
            letra = palavraSecreta.charAt(posicaoLetra);

            if (letrasCertas.contains(Character.toString(letra))) {
                System.out.print("  _" + letra + "_  ");
            } else {
                System.out.print("  ____  ");
            }
        }
    }

    static boolean letraJaTentada(String letrasTentadas, char letraChutada) {
        return letrasTentadas.contains(Character.toString(letraChutada));
    }

    static boolean palavraJaDescoberta(String palavraSecreta, String letrasCertas){
        char letra;
        System.out.println("\n\n");
        int letrasAcertadas = 0;
        for (int posicaoLetra = 0; posicaoLetra < palavraSecreta.length(); posicaoLetra++) {
            letra = palavraSecreta.charAt(posicaoLetra);

            if (letrasCertas.contains(Character.toString(letra))) {
                letrasAcertadas++;
            } 
            }
            if (letrasAcertadas == palavraSecreta.length()) return true;
            else return false;
        }

}