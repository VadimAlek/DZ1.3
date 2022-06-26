
public class Main {
    public static void main(String[] args) {

        //task1
        //Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        int[] num1 = new int[]{1, 2, 3,};


        //Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        double[] num2 = {1.57, 7.654, 9.986};


        //Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ
        // создания массива: с помощью ключевого слова или сразу заполненный элементами.
        int[] num3 = new int[]{14, 12, 1985};


        //task2
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        // начиная с первого элемента, через запятую. Запятая между последним элементом одного массива и
        // первым элементом следующего не нужна.
        for (int i = 0; i < num1.length; i++) {
            if (i != num1.length - 1)
                System.out.print(num1[i] + ",");
            else
                System.out.print(num1[1]);}


            for (int c = 0; c < num2.length; c++) {
                if (c != num2.length - 1)
                    System.out.print(num2[c] + ",");
                else
                    System.out.print(num2[c]);}

                for (int b = 0; b < num3.length; b++) {
                    if (b != num3.length - 1)
                        System.out.print(num3[b] + ",");
                    else
                        System.out.print(num3[b]);
                    System.out.println();}

                    //task3
        //Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего.
        // Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке, а элементы другого
        // массива – на другой.
        //Запятая между последним элементом одного массива и первым элементом следующего не нужна.
                    for (int d = num1.length - 1; d != 0; d--) {
                        if(d>0)
                        System.out.print(num1[d] + ",");
                        else if (d ==0)
                            System.out.print(num1[d]);}
                    System.out.println();

                    for (int e = num2.length - 1; e != 0; e--) {
                        if (e>0)
                        System.out.print(num2[e] + ",");
                        else if (e ==0)
                            System.out.print(num3[e]);}
                    System.out.println();

                    for (int f = num3.length-1; f != 0; f--) {
                        if (f>0)
                        System.out.print(num3[f] + ",");
                        else if (f ==0)
                            System.out.print(num3[f]);
                    System.out.println();


                    //task4
                    //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
                    for (int g = 0; g < num1.length; g++){
                        if (num1[g] % 2 == 1)
                        num1[g]++;
                        if (g< num1.length-1)
                            System.out.print(num1[g]+",");
                        else
                            System.out.println(num1[g]);
                    }
                }
            }
        }






















