import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class index {

      // CORES
      public static final String rst = "\u001B[0m"; // resetar cores
      public static final String gre = "\u001B[32m"; // verde para as respostas
      public static final String yll = "\u001B[33m"; // amarelo para perguntas
      public static final String red = "\u001B[31m"; // vermelho para valores invalidos
      public static final String cyn = "\u001B[36m"; // ciano para iniciando problema
      public static final String neg = "\u001B[1m"; // negrito

    static Scanner input = new Scanner(System.in);
    public static int[] array;

    public static String camimho_conjunto_cem = "./massa_dados/conjunto_cem.txt";
    public static String camimho_conjunto_mil = "./massa_dados/conjunto_mil.txt";
    public static String camimho_conjunto_dezMil = "./massa_dados/conjunto_dezMil.txt";
    public static String camimho_conjunto_cemMil = "./massa_dados/conjunto_cemMil.txt";
    public static String camimho_conjunto_umMilhao = "./massa_dados/conjunto_umMilhao.txt";
    public static String camimho_conjunto_dezMilhoes = "./massa_dados/conjunto_dezMilhoes.txt";

    public static void main(String[] args) {

        try {
            menuConjunto();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void menuConjunto() throws Exception {
        System.out.println("Bem vindo ao menu");
        System.out.println();
        System.out.println("qual conjunto voce quer executar ? opções de 1 a 6");
        System.out.println();

        System.out.println(yll + "conjusto com 100 elementos" );
        System.out.println("conjusto com MIL elementos" );
        System.out.println("conjusto com 10 MIL ");
        System.out.println("conjusto com 100 MIL ");
        System.out.println("conjusto com 1 MILHÃO");
        System.out.println("conjusto com 10 MILHOÕES" + rst);
        System.out.println();
        int option = input.nextInt();

        switch (option) {

            case 1:
                System.out.println(red+ " 100 SELECIONADO" + rst);
                importarArray(camimho_conjunto_cem);
                break;

            case 2:
                System.out.println(red+ " mil SELECIONADO" + rst);
                importarArray(camimho_conjunto_mil);
                break;

            case 3:
                System.out.println(red+ "10 mil SELECIONADO" + rst);
                importarArray(camimho_conjunto_dezMil);
                break;

            case 4:
                System.out.println(red+ "100 mil SELECIONADO" + rst);
                importarArray(camimho_conjunto_cemMil);
                break;

            case 5:
                System.out.println(red+ " 1 milhao SELECIONADO" + rst );
                importarArray(camimho_conjunto_umMilhao);
                break;

            case 6:
                System.out.println(red+ "10 milhoes SELECIONADO" + rst);
                importarArray(camimho_conjunto_dezMilhoes);
                break;
        }

        menuAlgoritimos();

    }

    public static void importarArray(String caminho) throws Exception {

        FileReader rd = new FileReader(caminho);
        BufferedReader bf = new BufferedReader(rd);

        String[] valores = { "" };

        String linha;
        while ((linha = bf.readLine()) != null) {
            valores = linha.split(",");
        }

        array = new int[valores.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(valores[i]);
        }

    }

    public static void menuAlgoritimos() {
        System.out.println();
        System.out.println("qual algoritimo você quer testar ? opcoes de 1 a 7");
        System.out.println();

        System.out.println( yll+"bubble sort" );
        System.out.println("insertion sort");
        System.out.println("Selection sort");
        System.out.println("Merge sort" );
        System.out.println("Radix sort" );
        System.out.println("couting sort" );
        System.out.println("quick sort" + rst);
        int option = input.nextInt();

        switch (option) {
            case 1:
                System.out.println(red+"BUBBLE SORT"  + rst);
                teste_bubble();
                break;

            case 2:
            System.out.println(red+"INSERTION SORT"  + rst);
                teste_insertion();
                break;

            case 3:
            System.out.println(red+" SELECTION SORT"  + rst);
                teste_selection();
                break;

            case 4:
            System.out.println(red+"MERGE SORT"  + rst);
                teste_merge();
                break;

            case 5:
            System.out.println(red+"RADIX SORT"  + rst);
                teste_radix();
                break;

            case 6:
            System.out.println(red+"COUTING SORT"  + rst);
                teste_couting();
                break;

            case 7:
            System.out.println(red+"QUICK SORT" + rst);
                teste_quick();
                break;

        }
    }

    public static void teste_bubble() {

        long tempoInicial = System.currentTimeMillis();

        algoritimos.algoritimoBubbleSort(array);

        long tempoFinal = System.currentTimeMillis();

        System.out.println(gre + "o tempo foi de " + (tempoFinal - tempoInicial));

    }

    public static void teste_insertion() {

        long tempoInicial = System.currentTimeMillis();

        algoritimos.algoritimoInsertionSort(array);

        long tempoFinal = System.currentTimeMillis();

        System.out.println(gre + "o tempo foi de " + (tempoFinal - tempoInicial));

    }

    public static void teste_selection() {

        long tempoInicial = System.currentTimeMillis();

        algoritimos.algoritimoSelectionSort(array);

        long tempoFinal = System.currentTimeMillis();

        System.out.println(gre + "o tempo foi de " + (tempoFinal - tempoInicial));

    }

    public static void teste_merge() {

        long tempoInicial = System.currentTimeMillis();

        algoritimos.algoritimoMergeSort(array);

        long tempoFinal = System.currentTimeMillis();

        System.out.println(gre + "o tempo foi de " + (tempoFinal - tempoInicial));

    }

    public static void teste_radix() {

        long tempoInicial = System.currentTimeMillis();

        algoritimos.algoritimoRadixSort(array);

        long tempoFinal = System.currentTimeMillis();

        System.out.println(gre + "o tempo foi de " + (tempoFinal - tempoInicial));

    }

    public static void teste_couting() {

        long tempoInicial = System.currentTimeMillis();

        algoritimos.algoritimoCoutingSort(array);

        long tempoFinal = System.currentTimeMillis();

        System.out.println(gre + "o tempo foi de " + (tempoFinal - tempoInicial));

    }

    public static void teste_quick() {

        long tempoInicial = System.currentTimeMillis();

        algoritimos.algoritimoQuickSort(array);

        long tempoFinal = System.currentTimeMillis();

        System.out.println(gre + "o tempo foi de " + (tempoFinal - tempoInicial));

        

    }



}
