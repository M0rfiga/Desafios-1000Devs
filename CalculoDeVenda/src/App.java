import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float valor, valorFinal = 0;
        int codigo;

        valor = obterValorfloat(teclado, "Digite o valor da compra: ");

        exibirMenu();

        codigo = obterValorInt(teclado, "Digite a opção de pagamento: ");

        System.out.println();

        decisao(codigo, valorFinal, valor);

        teclado.close();
    }
    static void decisao(int codigo, float valorFinal, float valor){
        if (codigo == 1) {
            // À vista, 8% de desconto
            valorFinal = valor * ((100 - 8) / 100f);
            System.out.println("À vista, com 8% de desconto.");
            System.out.printf("Valor final: R$ %.2f%n", valorFinal);
        } else if (codigo == 2) {
            // À vista no cartão, 4% de desconto
            valorFinal = valor * ((100 - 4) / 100f);
            System.out.println("À vista no cartão, com 4% de desconto.");
            System.out.printf("Valor final: R$ %.2f%n", valorFinal);
        } else if (codigo == 3) {
            // Em 2x, sem juros
            valorFinal = valor;
            System.out.println("Em 2x, preço normal sem juros.");
            System.out.printf("Valor final: R$ %.2f%n", valorFinal);
            System.out.printf("Cada parcela: R$ %.2f%n", valorFinal / 2);
        } else if (codigo == 4) {
            // Em 4x, com acréscimo de 8%
            valorFinal = valor * ((100 + 8) / 100f);
            System.out.println("Em 4x, preço acrescido de 8%.");
            System.out.printf("Valor final: R$ %.2f%n", valorFinal);
            System.out.printf("Cada parcela: R$ %.2f%n", valorFinal / 4);
        } else {
            System.out.println("Código inválido.");
        }
    }
    static void exibirMenu(){
        System.out.println("====================================");
        System.out.println("        FORMAS DE PAGAMENTO");
        System.out.println("====================================");
        System.out.println("1 - À vista, com 8% de desconto");
        System.out.println("2 - À vista no cartão, com 4% de desconto");
        System.out.println("3 - Em 2x, preço normal sem juros");
        System.out.println("4 - Em 4x, preço acrescido de 8%");

    }
    static String obterString(Scanner teclado, String mensagem) {
        String nextline;
        System.out.println(mensagem);
        nextline = teclado.nextLine();
        return nextline;
    }
    static double obterValorDouble(Scanner teclado, String mensagem) {
        
        double valorDouble;
        System.out.println(mensagem);
        valorDouble = teclado.nextDouble();
        return valorDouble;
    }
    static float obterValorfloat(Scanner teclado, String mensagem) {
        float ValorFloat;
        System.out.println(mensagem);
        ValorFloat = teclado.nextFloat();
        return ValorFloat;
    }
    static int obterValorInt(Scanner teclado, String mensagem) {
        int ValorInt;
        System.out.println(mensagem);
        ValorInt = teclado.nextInt();
        return ValorInt;
    }
}
