import java.util.*;

class Input {
    public static void main(String[] args) {
        boolean run = true;

        System.out.println("Welcome to the calculator!");
        System.out.println("This program can do the basic operations found in a calculator");

        while (run) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number - ");
            int First = sc.nextInt();
            System.out.print("Enter the second number - ");
            int Second = sc.nextInt();

            int Add = First + Second;
            int Minus = First - Second;
            int Multiply = First * Second;
            int Divide = First / Second;
            Scanner a = new Scanner(System.in);
            System.out.println("These are the 4 basic operations this program can do for you:");
            System.out.println("1)Addition \n2)Subtraction \n3)Multiplication \n4)Division");
            System.out.print("Enter the name of the operation you want to use - ");
            String Input = a.nextLine();
            if (Input.equals("Addition")) {
                System.out.println("The addition is " + Add);
            }
            if (Input.equals("Subtraction")) {
                System.out.println("The subctraction is " + Minus);
            }
            if (Input.equals("Multiplication")) {
                System.out.println("The multiplication is " + Multiply);
            }
            if (Input.equals("Division")) {
                System.out.println("The division is " + Divide);
            }

            Scanner g = new Scanner(System.in);
            System.out.print("Do you want to use this program again? (Yes/No) ");
            String Again = g.nextLine();
            if (Again.equals("Yes")) {
                continue;
            }
            if (Again.equals("No")) {
                break;

            }
            g.close();
            a.close();
            sc.close();
        }
    }
}
