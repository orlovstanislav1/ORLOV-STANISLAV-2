package com.company.HW3;

/*Проверьте, является ли введенное пользователем с клавиатуры натуральное число — простым
(не имеющим натуральных делителей, кроме себя самого и 1) . Постарайтесь не выполнять лишних действий
например, после того, как вы нашли хотя бы один нетривиальный делитель уже ясно, что число составное и проверку
продолжать не нужно). Также учтите, что наименьший делитель натурального числа n, если он вообще имеется,
обязательно располагается в отрезке [emails; √n].
*/

import java.util.Scanner;

public class Main55 {
    public static void main(String[] args) throws Exception {
        int j = 2;
        int a = 0;
        int b = 0;
        Scanner reader = new Scanner ( System.in );
        System.out.println ( "Please enter a number: " );
        b = reader.nextInt ();
        while (j <= b / 2) {
            if (b % j == 0) {
                a = 1;
            }
            j++;
        }
        if (a == 1) {
            System.out.println ( "Число " + b + " составное" );
        } else {
            System.out.println ( "Число " + b + " простое " );
        }
    }
}
/*
В 5 задании проверка на простоту должна включать минимальные оптимизации.
"Постарайтесь не выполнять лишних действий (например, после того, как вы нашли хотя бы один нетривиальный делитель уже ясно, что число составное и проверку продолжать не нужно). Также учтите, что наименьший делитель натурального числа n, если он вообще имеется, обязательно располагается в отрезке [emails; √n]"
Т. е. если нашелся делитель, то можно уже выходить из цикла, и идти в цикле можно до  √n  (Math.sqrt(n), а сейчас там до n/emails)

Поправь, пожалуйста, 5 задачу с учетом этого и пришли ее еще раз.
 */
