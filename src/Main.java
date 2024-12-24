import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*

        Locale.setDefault(Locale.US);

        int idade;
        double salario, altura;
        char genero;
        String nome;

        idade = 30;
        salario = 5000.5;
        altura = 1.72;
        genero = 'F';
        nome = "Maria silva";

        System.out.println("A funcionaria " + nome + ", do Sexo " + genero + ", com o salario de " + String.format("%.2f", salario) + " e com " + idade + " anos");
*/
/*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, soma;
        soma = 0;

        System.out.print("Digite o primeiro numero: ");
        x = sc.nextInt();
        while (x != 0) {
            soma = soma + x;
            System.out.print("Digite outro numero: ");
            x = sc.nextInt();
        }
        System.out.println("SOMA = " + soma);
        sc.close();*/
/*       Scanner sc = new Scanner(System.in);


    String nome1, nome2;
    double salario1, salario2;
    int idade;
    char sexo;

        System.out.println("Digite o nome da primeira pessoa: ");
        nome1 = sc.nextLine();
        System.out.println("Digite o salario da primeira pessoa: ");
        salario1 = sc.nextDouble();

        System.out.println("Digite o nome da segunda pessoa: ");
        sc.nextLine();
        nome2 = sc.nextLine();
        System.out.println("Digite o salario da segunda pessoa: ");
        salario2 = sc.nextDouble();

        System.out.println("Digite uma idade: ");
        idade = sc.nextInt();
        System.out.println("Digite um Sexo: ");
        sexo = sc.next().charAt(0);

        System.out.println("Nome 1: " + nome1);
        System.out.println("Salario 1: " + String.format("%.2f", salario1));
        System.out.println("Nome 2: " + nome2);
        System.out.println("Salario 2: " + String.format("%.2f", salario2));
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);

        sc.close();
*/
/*
        Scanner sc = new Scanner(System.in);
        int hora;
        System.out.print("Digite uma hora do dia: ");

        hora = sc.nextInt();
        if (hora < 12) {
            System.out.println("Bom dia!");
        }
        else {
            System.out.println("Boa tarde!");
        }
        sc.close();

*/
/*

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int N = sc.nextInt();

        double[] vet = new double[N];

        for(int i = 0; i < N; i++){
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.println("Numeros Digitados: ");
        for (int i = 0; i < N; i++){
            System.out.println(String.format("%.1f", vet[i]));
        }
*/
/*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int M, N;
        System.out.println("Quantas linhas vai ter a matriz? ");
        M = sc.nextInt();
        System.out.println("Quantas colunas vai ter a matriz? ");
        N = sc.nextInt();

        int[][] mat = new int[M][N];

        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                System.out.println("Elemnto[" + i + "," + j +"]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Matriz Digitada: ");
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

*/
/*

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base, altura, area, perimetro, diagonal;

        System.out.print("Base do Retangulo: ");
        base = sc.nextDouble();
        System.out.print("Altura do Retangulo: ");
        altura = sc.nextDouble();


        area = base * altura;
        perimetro = 2 * (base + altura);
        diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));

        System.out.println("AREA = " + String.format("%.4f", area));
        System.out.println("PERIMETRO = " + String.format("%.4f", perimetro));
        System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));

*/
/*

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2;
        double media;

        System.out.println("Digite o nome da primeira pessoa: ");
        nome1 = sc.nextLine();
        System.out.println("Digite a idade da primeira pessoa: ");
        idade1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome da segunda pessoa: ");
        nome2 = sc.nextLine();
        System.out.println("Digite o nome da segunda pessoa: ");
        idade2 = sc.nextInt();

        media = ((double) idade1 + idade2) / 2;
        System.out.println("A media das idades de " + nome1 + " e " + nome2 + " e de: " + String.format("%.1f", media));
*/
/*

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, menor;

        System.out.println("Digite um numero: ");
        n1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        n2 = sc.nextInt();
        System.out.println("Digite mais um numero: ");
        n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3){
            menor = n1;
        }else if (n2 < n3){
            menor = n2;
        }else {
            menor = n3;
        }

        System.out.println("MENOR: " + menor);
*/
/*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y;


        System.out.println("Digite dois numeros: ");
        x = sc.nextInt();
        y = sc.nextInt();

        while(x != y){
            if (x < y){
                System.out.println("Crescente");
            }else {
                System.out.println("Decrescente");
            }
            System.out.println("Digite outros dois numeros: ");
            x = sc.nextInt();
            y = sc.nextInt();*/
/*        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y, troca, soma;

        System.out.println("Digite 2 numeros: ");
        x = sc.nextInt();
        y = sc.nextInt();

        if ( x > y){
            troca = x;
            x = y;
            y = troca;
        }

        soma = 0;
        for (int i = x+1; i < y; i++){
            if (i % 2 != 0){
                soma = soma +i;

            }}
        System.out.println("SOMA DOS IMPARES: " + soma);*/
/*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;
        double soma, media;


        System.out.print("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        double [] vet = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }
            System.out.println();


            System.out.print("VALORES = ");
            for (int i = 0; i < N; i++){
                System.out.print(String.format("%.1f ", vet[i]));
            }
            System.out.println();

            soma = 0;
            for (int i = 0; i < N; i++){
                soma = soma + vet[i];

            }
            System.out.println("SOMA = " + String.format("%.2f", soma));

            media = soma / N;
            System.out.println("MEDIA = " + String.format("%.2f", media));
*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, cont;

        System.out.println("Qual a ordem da matriz? ");
        N = sc.nextInt();

        int[][] mat = new int[N][N];

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                System.out.print("ELEMENTO [" + i + "," + j + "]: ");
                mat [i][j] = sc.nextInt();
            }
        }

        System.out.println("DIAGONAL PRINCIPAL: ");
        for (int i =0; i < N; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
        cont = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
            if (mat [i][j] < 0){
                cont++;
            }}
        }
        System.out.println("Negativos: " + cont);


    }
}