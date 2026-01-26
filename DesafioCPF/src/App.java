import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        String cpf;
        
        int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11;

        int parte1, parte2;
        int restoDivisao1, restoDivisao2;
        int div1, div2;

        System.out.println("Digite seu CPF:");
        cpf = teclado.nextLine();

        // Remover os digitos para o cpf ficar limpo
        cpf = cpf.replaceAll("\\D", "");

        //verificar se digitou mais de 11 numeros
        if (cpf.length() != 11) {
            System.out.println("CPF inválido: deve conter 11 dígitos numéricos.");
            teclado.close();
            return;
        }

        int pDigito = cpf.charAt(0);
        int qntdeCaractersIguais = 0;

        for ( int pos = 0; pos < cpf.length(); pos++) {
            if (pDigito == cpf.charAt(pos))
                qntdeCaractersIguais++;
        }

        //int controleLaco = 1;
        //do {
        //    if (pDigito == cpf.charAt(controleLaco))
        //    qntdeCaractersIguais++;
        //    controleLaco++;
        //} while (controleLaco < 11);

        if (qntdeCaractersIguais == 11){
            System.out.println("CPF Invalido");
            System.exit(0);
        }
        d1 = cpf.charAt(0) - 48;
        d2 = cpf.charAt(1) - 48;
        d3 = cpf.charAt(2) - 48;
        d4 = cpf.charAt(3) - 48;
        d5 = cpf.charAt(4) - 48;
        d6 = cpf.charAt(5) - 48;
        d7 = cpf.charAt(6) - 48;
        d8 = cpf.charAt(7) - 48;
        d9 = cpf.charAt(8) - 48;
        d10 = cpf.charAt(9) - 48;
        d11 = cpf.charAt(10) - 48;
        
        parte1 = (d1 * 10) + (d2 * 9) + (d3 * 8) + (d4 * 7) + (d5 * 6)  + (d6 * 5) + (d7 * 4) + (d8 * 3) + (d9 * 2);
        restoDivisao1 = parte1 % 11;

        if (restoDivisao1 < 2) {
            div1 = 0;
            System.out.println("O primeiro dígito verificador deve ser 0");
        } else {
            div1 = (11 - restoDivisao1);
            System.out.printf("O primeiro dígito verificador deve ser %d\n", div1);
        }

        parte2 = (d1 * 11) + (d2 * 10) + (d3 * 9) + (d4 * 8) + (d5 * 7)  + (d6 * 6) + (d7 * 5) + (d8 * 4) + (d9 * 3) + (div1 * 2);
        restoDivisao2 = parte2 % 11;

        if (restoDivisao2 < 2) {
            div2 = 0;
            System.out.println("O segundo dígito verificador deve ser 0");
        } else {
            div2 = (11 - restoDivisao2);
            System.out.printf("O segundo dígito verificador deve ser %d\n", div2);
        }
        //validar o CPF
        if (div1 == d10 && div2 == d11) {
            System.out.println("CPF Válido");
        } else {
            System.out.println("CPF Inválido");
        }

        teclado.close();
    }
}