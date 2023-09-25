import java.util.Scanner;

public class FibonacciSequence{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int upToWhatNumber=0;
        int firstTerm=0,secondTerm=1,nextTerm=0;

        System.out.println("Up to what number would you like to see the Fibonacci Sequence?");
        upToWhatNumber=input.nextInt();
        System.out.println("Fibonacci Series from 0 until "+upToWhatNumber+":");
        for(int i=0; firstTerm<=upToWhatNumber;i++){
            System.out.print(firstTerm+", ");
            nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;

        }

    }
}