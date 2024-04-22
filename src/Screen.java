import java.util.Scanner;

public class Screen {

//THIS IS THE MAIN SCREEN AND OPTIONS
    public void set_screen(){
        int ex_code;
        ex_code = 0;

        Scanner scanner = new Scanner(System.in);
        int uinput = scanner.nextInt();
        do{
            System.out.println("Please Choose an Option");
            System.out.println("-----------");
            System.out.println("1. View Recipe");
            System.out.println("2. Modify Recipe");
            System.out.println("3. Add Recipe");
            System.out.println("4. Delete Recipe");
            System.out.println("5.Exit");

            uinput = scanner.nextInt();

            switch (uinput){
                case 1:
                    viewRecipies();
                    break;
                case 2:
                    modifyRecipies();
                    break;
                case 3:
                    addRecipes();
                    break;
                case 4:
                    deleteRecipes();
                    viewRecipies();
                    break;
                case 5:
                    ex_code = 1;
                    break;
                default:
                    if (uinput > 5){
                        System.out.println("That is not a valid input");
                    }
                    break;
            }

        }while(ex_code == 0);


    }

    //THESE ARE THE METHODS FOR THE MAIN SCREEN

public void viewRecipies(){
        int goBackVal;
        int inputval;
        Scanner insidescanner = new Scanner(System.in);

        goBackVal = 0;
        do {
            System.out.println("show recipies later \n press 1 to return to the main screen");
            inputval = insidescanner.nextInt();
            if (inputval == 1){
                goBackVal = 1;
            }
        }while(goBackVal == 0);
        goBackVal = 0;

}
public void modifyRecipies(){
    int goBackVal;
    int inputval;
    Scanner insidescanner = new Scanner(System.in);

    goBackVal = 0;
    do {
        System.out.println("modify recipies later");
        inputval = insidescanner.nextInt();
        if (inputval == 1){
            goBackVal = 1;
        }
    }while(goBackVal == 0);
    goBackVal = 0;
}
public void addRecipes(){
    int goBackVal;
    int inputval;
    Scanner insidescanner = new Scanner(System.in);

    goBackVal = 0;
    do {
        System.out.println("add recipies later");
        inputval = insidescanner.nextInt();
        if (inputval == 1){
            goBackVal = 1;
        }
    }while(goBackVal == 0);
    goBackVal = 0;
}
public void deleteRecipes(){
    int goBackVal;
    int inputval;
    Scanner insidescanner = new Scanner(System.in);

    goBackVal = 0;
    do {
        System.out.println("delete recipies later");
        inputval = insidescanner.nextInt();
        if (inputval == 1){
            goBackVal = 1;
        }
    }while(goBackVal == 0);
    goBackVal = 0;
}
}
