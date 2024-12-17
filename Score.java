import java.util.Scanner;

public class Score {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        System.out.print("Enter your score : ");
        double score = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter your department : ");
        String department = scan.nextLine();

        System.out.println("My name is " + name);
        System.out.println("My score is " + score / 10 + "/10");
        System.out.println("My department is " + department);

        scan.close();

    }

}