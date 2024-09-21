import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcao;
        Aluno aluno = null;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Criar instância de aluno");
            System.out.println("2 - Exibir informações de aluno");
            System.out.println("0 - Sair");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case '1':
                    System.out.println("Digite o nome do aluno:");
                    String nome = scanner.next();
                    System.out.println("Digite a idade do aluno:");
                    int idade = scanner.nextInt();
                    System.out.println("Digite o curso do aluno:");
                    String curso = scanner.next();
                    System.out.println("Digite o número de matrícula do aluno:");
                    int numeroMatricula = scanner.nextInt();
                    aluno = new Aluno(nome, idade, curso, numeroMatricula);
                    System.out.println("Aluno criado com sucesso!");
                    break;

                case '2':
                    if (aluno != null) {
                        aluno.exibirInformacoes();
                    } else {
                        System.out.println("Nenhum aluno foi criado ainda.");
                    }
                    break;
                case '0':
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != '0');
        scanner.close();
    }
}