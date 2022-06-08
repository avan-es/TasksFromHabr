public class ArrayRandom {

    void arrayRandom () {
        int max = 0;
        int min = 0;
        double average = 0;
        int[] array1 = new int[20];
        for (int i = 0; i<array1.length; i++) {
            array1[i] = (int) (Math.random()*(200+1)) - 100;
        }
        for (int i = 0; i<array1.length; i++){
            if (array1[i]<min){
                min = array1[i];
            }
            if (array1[i]>max){
                max = array1[i];
            }
            average = average + array1[i];
            System.out.print(array1[i] + "; ");
        }
        System.out.println();
        System.out.println("Минимальный элемент массива: " + min + ".");
        System.out.println("Максимальный элемент масива: " + max + ".");
        System.out.println("Среднее арифметическое элементов массива: " + average + ".");
    }

}
