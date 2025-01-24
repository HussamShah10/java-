import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter character: ");
        String character = input.nextLine();
        
        System.out.println("Enter number of steps: ");
        int number = input.nextInt();
        int count = 1;
        String empString = " ";
        for (int i = number; i > 0; i--){
            System.out.println(empString.repeat(i-1) + character.repeat(count));
            count++;
        }
        
    }
}
