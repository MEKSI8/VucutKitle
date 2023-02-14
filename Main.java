import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu girin:");
        float boy = input.nextFloat();
        System.out.println("Kilonuzu girin:");
        float kilo = input.nextFloat();

        float vucutKitleIndex=kilo/(boy*boy);

        System.out.println("Vücüt kitle indeksiniz:"+vucutKitleIndex);

    }
}