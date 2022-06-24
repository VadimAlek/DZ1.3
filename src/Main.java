
public class Main {
    public static void main(String[] args) {

        //task1
        //Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        int[] num1 = new int[]{1, 2, 3,};
        // int [] num1 = new int[3];
        //num1[0] = 1;
        //num1[1] = 2;
        //num1[2] = 3;


        //Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        double[] num2 = new double[]{1.57, 7.654, 9.986};
        //double[] num2 = new double [3];
        //double[0] = 1.57;
        //double[1] = 7.654;
        //double[2] = 9.986;

        //Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ
        // создания массива: с помощью ключевого слова или сразу заполненный элементами.
        int[] num3 = new int[]{14, 12, 1985};
        //int[] num3 = new int [3];
        //int[0] = 14;
        //int[1] = 12;
        //int[2] = 1985;

        //task2
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        // начиная с первого элемента, через запятую. Запятая между последним элементом одного массива и
        // первым элементом следующего не нужна.
        for (int i = 0; i < num1.length - 1; i++){
                System.out.print(num1[i] + ",");}
        System.out.print(num1[2] + " ");



            for (int c = 0; c < num2.length - 1; c++) {
                System.out.print(num2[c] + ",");}
        System.out.print(num2[2] + " ");

            for (int b = 0; b < num3.length - 1; b++) {
                System.out.print(num3[b] + ",");}
        System.out.print(num3[2] + " ");
            System.out.println();

            //task3
            for (int d = 2; d >= 0 + 1; d--) {
                System.out.print(num1[d] + ",");}
        System.out.print(num1[0]);
            System.out.println();
            for (int e = 2; e >= 0 + 1; e--) {
                System.out.print(num2[e] + ",");}
        System.out.println(num2[0]);
            System.out.println();
            for (int f = 2; f >= 0 + 1; f--) {
                System.out.print(num3[f] + ",");}
        System.out.println(num3[0]);
                System.out.println();


            //task4
            //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
            for (int g = 0; g < num1.length; g++)
                if (num1[g] % 2 != 0) {
                    System.out.print(num1[g] + 1 + ",");

                }
        }
    }



















