import java.util.Scanner;

public class ShadyRestRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // Prompt the user to choose a room type
        System.out.println("Welcome to Shady Rest Hotel!");
        System.out.println("Room types: ");
        System.out.println("1. Queen bed");
        System.out.println("2. King bed");
        System.out.println("3. King bed and pullout couch");
        System.out.println("Enter the room type (1-3): ");
        int roomType = scanner.nextInt();

        // Determine the price based on the room type
        int price;
        switch (roomType) {
            case 1:
            price = 125;
            System.out.println("You have chosen a queen bed.");
            break;
            case 2:
            price = 139;
            System.out.println("You have chosen a king bed.");
            break;
            case 3:
            price = 165;
            System.out.println("You have chosen a suiitee with a king bed and a pullout coach");
            break;
            default:
            price = 0;
            System.out.println("Invalid room type entered!");
            break;
        }

        // Display the price of the room
        if (price != 0) {
            System.out.println("The price of the room is: $" + price);
        } else {
            System.out.println("Please enter a valid room number!");
        }
        scanner.close();
        }
            
        }

