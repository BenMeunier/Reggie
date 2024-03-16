import java.util.Scanner;

class Reggie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get SSN from user
        String ssn = SafeInput.getRegExString(scanner, "Enter your SS Number (###-##-####): ", "^\\d{3}-\\d{2}-\\d{4}$"); // ask for SS number

        // Get UC Student M number from user
        String mNumber = SafeInput.getRegExString(scanner, "Enter your UC M Number (M#####): ", "^(M|m)\\d{5}$"); // ask for UC m number

        // Get menu choice from user
        String menuChoice = SafeInput.getRegExString(scanner, "Enter menu choice (O for Open, S for Save, V for View, Q for Quit): ", "^[OoSsVvQq]$"); // ask for menu choice

        System.out.println("SS Number: " + ssn); // give SS number
        System.out.println("UC  M Number: " + mNumber); // give UC M number
        System.out.println("Menu Choice: " + menuChoice); // give menu choice

        scanner.close();
    }

}