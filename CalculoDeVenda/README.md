Cálculo de Venda
Escreva um algoritmo em Java que leia o valor de uma compra e o código de pagamento informado pelo cliente.
Com base nesse código, o programa deverá calcular e mostrar o valor final a ser pago e, quando for o caso, o valor de cada parcela.

Os códigos de pagamento são os seguintes:



Código	Condição de Pagamento	Regra de Cálculo
1	À vista, com 8% de desconto	valor final = valor - 8%
2	À vista no cartão, com 4% de desconto	valor final = valor - 4%
3	Em 2x, preço normal (sem juros)	valor final = valor
4	Em 4x, com 8% de acréscimo	valor final = valor + 8%
Outro	Código inválido	Exibir mensagem de erro
O programa deve:

Solicitar ao usuário o valor da compra.

Solicitar o código da forma de pagamento.

Calcular o valor final de acordo com a opção escolhida.

Exibir:

O tipo de pagamento escolhido.

O valor final da compra.

E, se houver parcelamento, o valor de cada parcela.



import java.util.Scanner;

public class PagamentoCompraSemFuncao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float valor, valorFinal;
        int codigo;

        System.out.print("Digite o valor da compra: ");
        valor = entrada.nextFloat();

        System.out.println("====================================");
        System.out.println("        FORMAS DE PAGAMENTO");
        System.out.println("====================================");
        System.out.println("1 - À vista, com 8% de desconto");
        System.out.println("2 - À vista no cartão, com 4% de desconto");
        System.out.println("3 - Em 2x, preço normal sem juros");
        System.out.println("4 - Em 4x, preço acrescido de 8%");

        System.out.print("Digite a opção de pagamento: ");
        codigo = entrada.nextInt();

        System.out.println();

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
            System.out.printf("Cada parcela: R$ %.2f%n", valorFinal / 2);
        } else if (codigo == 4) {
            // Em 4x, com acréscimo de 8%
            valorFinal = valor * ((100 + 8) / 100f);
            System.out.println("Em 4x, preço acrescido de 8%.");
            System.out.printf("Cada parcela: R$ %.2f%n", valorFinal / 4);
        } else {
            System.out.println("Código inválido.");
        }

        entrada.close();
    }
}
