package ordenadores;

public class OrdenarQuick implements Ordenador {

    @Override
    public int[] ordene(int[] array) {
        return array;
    }

    public int quickParticio(int[] array, int inicio, int fim) {
        int indicePivo = inicio;
        if (inicio <= fim) {
            int pivo = array[inicio];
            int indiceSalvo = inicio;
            for (int i = inicio; i <= fim; i++) {
                if (array[i] < pivo) {
                    indiceSalvo++;
                    int elementoTroca = array[indiceSalvo];
                    array[indiceSalvo] = array[i];
                    array[i] = elementoTroca;
                }
            }
            for (int i = inicio; i <= fim; i++) {
                if (pivo > array[i]) {
                    int elementoTroca = array[i];
                    array[i] = pivo;
                    array[indicePivo] = elementoTroca;
                    indicePivo++;
                } else if (pivo < array[i] && pivo != array[i]) {
                    break;
                }
            }
        }
        return indicePivo;
    }
}
