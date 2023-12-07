import java.util.Arrays;

public class algoritimos {
  // couting sort INICIO
  public static void algoritimoCoutingSort(int[] x) {
    int mim = getMim(x);
    int max = getMax(x);
    int range = max - mim;

    int[] arrayDeContagem = new int[range + 1];

    for (int valor : x) {
      arrayDeContagem[valor - mim]++;
    }

    int index = 0;
    for (int i = 0; i < range + 1; i++) {
      while (arrayDeContagem[i] > 0) {
        x[index] = i + mim;
        arrayDeContagem[i]--;
        index++;
      }
    }
  }

  public static int getMax(int[] vetor) {
    int maior = vetor[0];
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] > maior) {
        maior = vetor[i];
      }
    }
    return maior;
  }

  public static int getMim(int[] vetor) {
    int menor = vetor[0];
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] < menor) {
        menor = vetor[i];
      }
    }
    return menor;
  }

  // cauting sort FIM

  public static void algoritimoBubbleSort(int[] x) {
    int n = x.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - 1 - i; j++) {
        if (x[j] > x[j + 1]) {
          int aux = x[j];
          x[j] = x[j + 1];
          x[j + 1] = aux;
        }
      }
    }
  }

  public static void algoritimoInsertionSort(int[] x) {
    for (int i = 1; i < x.length; i++) {
      int j = i - 1;
      int numeroAtual = x[i];
      while (j >= 0 && x[j] > numeroAtual) {
        x[j + 1] = x[j];
        j--;
      }
      x[j + 1] = numeroAtual;
    }
  }

  public static void algoritimoSelectionSort(int[] x) {
    for (int i = 0; i < x.length - 1; i++) {
      int indexDoMinimo = i;
      for (int j = i; j < x.length; j++) {
        if (x[j] < x[indexDoMinimo]) {
          indexDoMinimo = j;
        }
      }

      int aux = x[i];
      x[i] = x[indexDoMinimo];
      x[indexDoMinimo] = aux;
    }
  }
  //merge sort INICIO
  //
  public static void algoritimoMergeSort(int[] x) {
    int n = x.length;
    if (n <= 1) {
      return;
    }

    int meio = x.length / 2;
    int[] esquerda = new int[meio];
    int[] direita = new int[x.length - meio];

    for (int i = 0; i < meio; i++) {
      esquerda[i] = x[i];
    }
    for (int i = meio; i < x.length; i++) {
      direita[i - meio] = x[i];
    }

    algoritimoMergeSort(esquerda);
    algoritimoMergeSort(direita);

    merge(x, esquerda, direita);
  }

  public static void merge(int[] x, int[] es, int[] di) {
    int tamanhoES = es.length;
    int tamanhoDI = di.length;
    int i = 0, j = 0, k = 0;

    while (i < tamanhoES && j < tamanhoDI) {
      if (es[i] <= di[j]) {
        x[k++] = es[i++];
      } else {
        x[k++] = di[j++];
      }
    }

    while (i < tamanhoES) {
      x[k++] = es[i++];
    }

    while (j < tamanhoDI) {
      x[k++] = di[j++];
    }
  }

  //merge sort FIM]

  //radix sort

   public static void algoritimoRadixSort(int x[]) {
        int max = getMax(x);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSortdoRadix(x, exp);
        }
    }

    public static void countSortdoRadix(int x[], int exp) {
        int n = x.length;
        int output[] = new int[n];
        int count[] = new int[10];
        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++) {
            count[(x[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(x[i] / exp) % 10] - 1] = x[i];
            count[(x[i] / exp) % 10]--;
        }

        System.arraycopy(output, 0, x, 0, n);
    }

    //quick sort

    public static void algoritimoQuickSort(int[] x) {
      if (x == null || x.length == 0) {
          return;
      }
      sort(x, 0, x.length - 1);
  }

  private static void sort(int[] x, int contadorES, int contadorDI) {
      int i = contadorES, j = contadorDI;
      int pivo = x[contadorES + (contadorDI - contadorES) / 2];

      while (i <= j) {
          while (x[i] < pivo) {
              i++;
          }
          while (x[j] > pivo) {
              j--;
          }
          if (i <= j) {
              int aux = x[i];
              x[i] = x[j];
              x[j] = aux;
              i++;
              j--;
          }
      }

      if (contadorES < j) {
          sort(x, contadorES, j);
      }
      if (i < contadorDI) {
          sort(x, i, contadorDI);
      }
  }

}
