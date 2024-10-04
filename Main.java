import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        int highwayNumber;
        int primaryNumber;
        String highwayName;
        System.out.println("Please enter a highway number (1-999");
        highwayNumber = scnr.nextInt();

        if (highwayNumber < 100) {
            if (highwayNumber == 0) {
                System.out.println(highwayNumber + " is not a valid interstate highway number.");
            }
            else if (highwayNumber % 2 > 0){
                System.out.println("I-" + highwayNumber + " is primary, going north/south.");
                }
            else if (highwayNumber % 2 == 0){
                System.out.println("I-" + highwayNumber + " is primary, going east/west.");
            }
            }
        else if (highwayNumber <= 999 ) {
            if (highwayNumber % 100 == 0) {
                System.out.println(highwayNumber + " is not a valid interstate highway number.");
            } else if (highwayNumber % 100 > 0) {
                highwayName = Integer.toString(highwayNumber);
                primaryNumber = Integer.parseInt(highwayName.substring(1, 3));
                if (primaryNumber % 2 > 0){
                    System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going north/south.");
                }
                else if (primaryNumber % 2 == 0){
                    System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going east/west.");
                }
            }
        }
        else if (highwayNumber > 999 ) {
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
        }
    }
}
