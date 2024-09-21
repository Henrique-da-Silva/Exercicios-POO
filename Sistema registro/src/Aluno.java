


class Aluno {
    String nome;
    int idade;
    String curso;
    int numeroMatricula;

    // Construtor padrão
    public Aluno() {
        this.nome = "Sem nome";
        this.idade = 0;
        this.curso = "Sem curso";
        this.numeroMatricula = 0;
    }

    // Construtor personalizado
    public Aluno(String nome, int idade, String curso, int numeroMatricula) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.numeroMatricula = numeroMatricula;
    }

    // Método para exibir as informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Número de Matrícula: " + numeroMatricula);
    }


}