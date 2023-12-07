package massa_dados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.io.FileWriter;

public class geradorDeMassa {
    public static int teto = Integer.MAX_VALUE; // ALTERE AQUI O TETO QUE DESEJA, os numeros gerads vao de ao
                                                // 0(inclusivo) até o teto(exclusivo)

    public static int seed = 42; // semente do conjuto de dados

    public static void main(String[] args) {
        int[] conjunto_cem = gerador_cem();
        int[] conjunto_mil = gerador_mil();
        int[] conjunto_dezMil = gerador_dezMil();
        int[] conjunto_cemMil = gerador_cemMil();
        int[] conjunto_umMilhao = gerador_umMilhao();
        int[] conjunto_dezMilhoes = gerador_dezMilhoes();

        try {
            gravarConjunto(conjunto_cem, "conjunto_cem.txt");
            gravarConjunto(conjunto_mil, "conjunto_mil.txt");
            gravarConjunto(conjunto_dezMil, "conjunto_dezMil.txt");
            gravarConjunto(conjunto_cemMil, "conjunto_cemMil.txt");
            gravarConjunto(conjunto_umMilhao, "conjunto_umMilhao.txt");
            gravarConjunto(conjunto_dezMilhoes, "conjunto_dezMilhoes.txt");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void gravarConjunto(int[] x, String y) throws Exception {
        FileWriter w = new FileWriter("./massa_dados/" + y);
        for (int i = 0; i < x.length; i++) {
            if (i != x.length - 1) {
                w.write(x[i] + ",");
            } else {
                w.write(x[i] + "");
            }
        }

        w.close();

    }

    // funcoes do tipo GERADOR

    public static int[] gerador_cem() {
        Random objetoRandom = new Random(seed);
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = objetoRandom.nextInt(teto);
        }
        return array;
    }

    public static int[] gerador_mil() {

        Random objetoRandom = new Random(seed);
        int[] array = new int[1_000];

        for (int i = 0; i < array.length; i++) {
            array[i] = objetoRandom.nextInt(teto);
        }
        return array;
    }

    public static int[] gerador_dezMil() {

        Random objetoRandom = new Random(seed);
        int[] array = new int[10_000];

        for (int i = 0; i < array.length; i++) {
            array[i] = objetoRandom.nextInt(teto);
        }
        return array;
    }

    public static int[] gerador_cemMil() {

        Random objetoRandom = new Random(seed);
        int[] array = new int[100_000];

        for (int i = 0; i < array.length; i++) {
            array[i] = objetoRandom.nextInt(teto);
        }
        return array;
    }

    public static int[] gerador_umMilhao() {

        Random objetoRandom = new Random(seed);
        int[] array = new int[1_000_000];

        for (int i = 0; i < array.length; i++) {
            array[i] = objetoRandom.nextInt(teto);
        }
        return array;
    }

    public static int[] gerador_dezMilhoes() {

        Random objetoRandom = new Random(seed);
        int[] array = new int[10_000_000];

        for (int i = 0; i < array.length; i++) {
            array[i] = objetoRandom.nextInt(teto);
        }
        return array;
    }

}
