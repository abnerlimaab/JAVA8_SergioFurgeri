package cap07;

import java.util.Scanner;

public class PessoaPolimorfa {
    public static void main(String[] args) {
        Pessoa pessoa = null;
        System.out.println("Forneça o número da Classe"
                + "\n\n1 - Pessoa"
                + "\n2 - Pessoa Física"
                + "\n3 - Pessoa Jurídica"
                + "\n4 - Funcionário");
        int tipo = Integer.parseInt(new Scanner(System.in).nextLine());
        switch (tipo) {
            case 1:
                pessoa = new Pessoa();
                break;
            case 2:
                pessoa = new PessoaFisica();
                break;
            case 3:
                pessoa = new PessoaJuridica();
                break;
            case 4:
                pessoa = new Funcionario();
                break;
            default: {
                System.out.println("Tipo desconhecido");
                System.exit(0);
            }
        }
        pessoa.mostraClasse();
    }
}
