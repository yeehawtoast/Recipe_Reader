import java.util.Scanner;

public class Main {
    int ex_code = 0;
    public static void main(String[] args) {
        System.out.println("Hello, Faggot!");
        Main main = new Main();
        main.screen();
    }

    public void screen(){
        Scanner scanner = new Scanner(System.in);
        int uinput;
        do{
            System.out.println("Please Choose an Option");
            System.out.println("-----------");
            System.out.println("1. View Recipe");
            System.out.println("2. Modify Recipe");
            System.out.println("2. Add Recipe");
            System.out.println("3. Delete Recipe");
            System.out.println("4.Exit");

            uinput = scanner.nextInt();
            if (uinput > 4){
                System.out.println("That is not a valid input");
            }else if (uinput == 4){
                ex_code = 1;
            }


        }while(ex_code == 0);

        System.out.println("Goodbye!");
    }
}