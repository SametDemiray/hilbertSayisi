package org.example;
/*
Hilbert sayıları, Alman matematikçi David Hilbert'in adını taşıyan bir kavramdır. Bu sayılar, 4k+1 formülüyle ifade edilen pozitif
tam sayılardır. Yani, bir sayının Hilbert sayısı olması için o sayının 4'e bölümünden kalanın 1 olması gerekmektedir.Matematiksel
olarak, Hilbert sayıları genellikle 4k+1 şeklinde ifade edilir, burada k pozitif bir tam sayıdır. Örneğin, 1, 5, 9, 13, 17 gibi sayılar
Hilbert sayılarıdır.

Bu sayılar, matematiksel araştırmalarda ve teorik çalışmalarda sıkça karşımıza çıkar ve çeşitli bağlantıları ve özellikleri vardır.
 Örneğin, birçok modüler aritmetik probleminde önemli bir rol oynarlar.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir pozitif tamsayı girin: ");
        number = scanner.nextInt();

        if (isHilbertNumber(number)) {
            System.out.println(number + " bir Hilbert Sayısıdır.");
        } else {
            System.out.println(number + " bir Hilbert Sayısı değildir.");
        }

        scanner.close();
    }

    // Bir tamsayının Hilbert Sayısı olup olmadığını kontrol eden fonksiyon
    public static boolean isHilbertNumber(int number) {
        return (number % 4 == 1);
    }

}