import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de alunos:");
        int numeroAlunos = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[numeroAlunos];
        double[] notas1 = new double[numeroAlunos];
        double[] notas2 = new double[numeroAlunos];
        double[] notas3 = new double[numeroAlunos];

        for (int i = 0; i < numeroAlunos; i++) {

            System.out.println("Digite o nome do aluno"+ (i+1) + ":");
            nomes[i]= sc.nextLine();

            System.out.println("Digite a primeira nota do aluno"+ (i+1) + ":");
             notas1[i] = sc.nextDouble();

            System.out.println("Digite a segunda nota do aluno"+ (i+1) + ":");
             notas2[i] = sc.nextDouble();

            System.out.println("Digite a terceira nota do aluno"+ (i+1) + ":");
             notas3[i] = sc.nextDouble();
            sc.nextLine();
        }
        sc.close();

        for (int i = 0; i < numeroAlunos; i++) {
            double media = (notas1[i] + notas2[i] + notas3[i]) / 3;

            if (media >= 6.0) {
                System.out.println(nomes[i] + " Aprovado! Média: " + media);
            } else {
                System.out.println(nomes[i] + " Reprovado! Média: " + media);
            }
        }

    }
}