import java.util.Scanner;

public class NotasEscolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input das notas
        double nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8;

        System.out.print("Digite a nota do 1o Bimestre: ");
        nota1 = scanner.nextDouble();
        System.out.print("Digite a nota do 2o Bimestre: ");
        nota2 = scanner.nextDouble();
        System.out.print("Digite a nota do 3o Bimestre: ");
        nota3 = scanner.nextDouble();
        System.out.print("Digite a nota do 4o Bimestre: ");
        nota4 = scanner.nextDouble();
        System.out.print("Digite a nota do 5o Bimestre: ");
        nota5 = scanner.nextDouble();
        System.out.print("Digite a nota do 6o Bimestre: ");
        nota6 = scanner.nextDouble();
        System.out.print("Digite a nota do 7o Bimestre: ");
        nota7 = scanner.nextDouble();
        System.out.print("Digite a nota do 8o Bimestre: ");
        nota8 = scanner.nextDouble();

        // Cálculo das médias bimestrais
        double media1oBimestre = (nota1 + nota2) / 2;
        double media2oBimestre = (nota3 + nota4) / 2;
        double media3oBimestre = (nota5 + nota6) / 2;
        double media4oBimestre = (nota7 + nota8) / 2;

        // Cálculo das médias semestrais
        double media1oSemestre = (media1oBimestre + media2oBimestre) / 2;
        double media2oSemestre = (media3oBimestre + media4oBimestre) / 2;

        // Cálculo da média final
        double mediaFinal = (media1oSemestre + media2oSemestre) / 2;

        // Apresentação dos resultados
        System.out.println("\nResultados:");
        System.out.printf("1o Bimestre: %.1f%n", nota1);
        System.out.printf("2o Bimestre: %.1f%n", nota2);
        System.out.printf("1o Semestre: %.1f%n", media1oSemestre);
        System.out.println("----------------------");
        System.out.printf("3o Bimestre: %.1f%n", nota3);
        System.out.printf("4o Bimestre: %.1f%n", nota4);
        System.out.printf("2o Semestre: %.1f%n", media2oSemestre);
        System.out.println("-----------------------");
        System.out.printf("Média Final: %.1f%n", mediaFinal);

        scanner.close();
    }
}