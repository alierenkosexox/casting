
//Ali Eren KÖSE 27/02/2024 05:34

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // verileri belirle,tanımla
        int numberOne;
        double numberTwo;
        Scanner input = new Scanner(System.in);

        //  sayıları iste ve kaydet
        System.out.print("Tam sayı giriniz : ");
        numberOne = input.nextInt();
        System.out.print("Ondalık sayı giriniz : ");
        numberTwo = input.nextDouble();

        // verileri dönüştür
        double numberOneCasting = numberOne;
        int numberTwoCasting = (int) numberTwo;

        // sonucu yazdır
        System.out.println("Explicit Casting (int -> double ) : " + numberOneCasting);
        System.out.println("Implicit Casting (double -> int) : " + numberTwoCasting);
    }
}