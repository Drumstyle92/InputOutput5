import java.util.Scanner;
public class PrintYourAgeFromInput {
    public static void main(String[] args){
        //Scanner
Scanner input = new Scanner(System.in);
// enter your name
System.out.printf("Enter your name: ");
// output
int age = input.nextInt();
System.out.printf("Your age is: %d %n ",age);
input.close();
    }
}
