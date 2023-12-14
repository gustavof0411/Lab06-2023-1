package ordenadores;

public class OrdenarPorContagemSimples implements Ordenador {

    @Override
    public int[] ordene(int[] array) {
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        boolean[] arrayBool = new boolean[maior+1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                arrayBool[0] = true;
            } else {
            arrayBool[array[i]] = true;
        }
    }
        int quantidadeVerdadeiros = 0;
        for (int i = 0; i < arrayBool.length; i++) {
            if (arrayBool[i] == true) {
                quantidadeVerdadeiros++;
            }
        }
        int[] arrayOrdenado = new int[quantidadeVerdadeiros];
        int indiceArrayOrdenado = 0;
        for (int i = 0; i < arrayBool.length; i++) {
            if (arrayBool[i] == true) {
                arrayOrdenado[indiceArrayOrdenado] = i;
            }
            indiceArrayOrdenado++;
        }
        

        return arrayOrdenado;
    }

}
