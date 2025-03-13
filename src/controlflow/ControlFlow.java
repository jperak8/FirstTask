package controlflow;

public class ControlFlow {

    public static boolean checkNumbers() {
        int FIRST_NUMBER = 7;
        int SECOND_NUMBER = 7;

        if(FIRST_NUMBER == SECOND_NUMBER ) {
            System.out.println("Brojevi su isti!");
            return true;
        } else {
            System.out.println("Brojevi nisu isti");
            return false;
        }
    }

    public static char letterVerification(){
        char letter = 'p';

        switch (letter) {
            case 'c':
                System.out.println("Slučaj1!");
                letter = 'c';
                break;
            case 'o':
                System.out.println("Slučaj2!");
                letter = 'o';
                break;
            default:
                System.out.println("Slučaj3");
                letter = 'p';
        }
        return letter;
    }

}
