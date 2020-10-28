import java.util.Scanner;
import java.lang.Math;

public class NumerosPrimos {

    public static void main(String[] args) {

        int number = 0;

        do{

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite un numero que se encuentre en el rango de 5 a 300: ");

            number = scanner.nextInt();

        } while (!(number >= 5 && number <= 300));

        int firstVariable = 2;
        double squareRootFormNumber = Math.sqrt(number);
        int counter = 0;

        while (firstVariable <= squareRootFormNumber){
            if (number % firstVariable == 0){
                counter ++;
            }
                firstVariable ++;
        }
        if (counter == 0){
            System.out.println("El numero " + number + " es primo");
        }
        else {
            System.out.println("El numero " + number + " no es primo");
        }

    }
}
