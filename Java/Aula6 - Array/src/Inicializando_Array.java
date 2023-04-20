public class Inicializando_Array {
    public static void main(String[] args) {
        //LISTA  DE VALORES
    int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        System.out.printf("%s %12s \n", "Index", "Valores");
    //PERCORRE CADA ELEMENTO E IMPRIME O ÍNDICE COM O VALOR
        for( int counter = 0; counter < array.length; counter ++){
        System.out.printf("%5d %4s %4d \n", counter, "=>" , array[ counter ]);
    }
}
}
