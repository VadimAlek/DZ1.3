public class Main {
    public static void main(String[] args) {

        //task1
        //Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        int[] num1 = new int [] {1, 2, 3,};

        //Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        double[] num2 = new double[] {1.57, 7.654, 9.986};

        //Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ
        // создания массива: с помощью ключевого слова или сразу заполненный элементами.
        int[] num3 = new int[] {14, 12, 1985};

        //task2
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        // начиная с первого элемента, через запятую. Запятая между последним элементом одного массива и
        // первым элементом следующего не нужна.
        for (int i=0; i< num1.length ; i++ ){
            System.out.print(num1[i] + ",");}
        for (int c = 0; c < num2.length; c++){
            System.out.print(num2[c] + ",");}
        for (int b = 0; b < num3.length; b++){
            System.out.print(num3[b] + ",");}
        System.out.println();

        //task3
        for (int d = 2; d>=0; d--){
            System.out.print(num1[d] +",");}
        System.out.println();
        for(int e = 2; e>=0; e--){
            System.out.print(num2[e] +",");}
            System.out.println();
        for (int f = 2; f>=0; f--){
            System.out.print(num3[f] + ",");
            System.out.println();
        }

        //task4
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        if (num1[0] == 1){
            System.out.print((num1[0]+1) +",");};
        if (num1[1] ==2){
            System.out.print("2" + ",");}
        if (num1[2] == 3) {
            System.out.print((num1[2]+1) + ",");
        }
        }
        }








