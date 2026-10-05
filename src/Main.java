//Дополнительная задача "Мажоритарное число"Описание
//Мажоритарный элемент - это элемент, который занимает более половины размера массива.
//
//Как найти мажоритарный элемент в массиве вO(n)?
//
//Пример ввода:
//
//        {2,1,2,3,4,2,1,2,2}
//
//Ожидаемый результат:
//
//2

import java.util.Scanner;

class Chislo {
    public int Majority(int[] num) {
        int count = num.length / 2;
        for (int i = 0; i < num.length; i++) {
            int count2 = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[j] == num[i]) {
                    count2++;
                }
            }
            if (count2 > count) {
                return num[i];
            }
        }
        return -1;
    }

}

public class Main  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите размер");
       int n  = scan.nextInt();
       int [] num =  new int[n];
        System.out.println("введите элементы массива");
        for (int i =0; i<n;i++)
        {
            num[i]= scan.nextInt();
        }
        Chislo chislo = new Chislo();
        int result = chislo.Majority(num);
        System.out.println(result);

    }
}