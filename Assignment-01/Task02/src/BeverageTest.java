import java.util.Scanner;

public class BeverageTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create instances of Tea and Coffee
        Beverages tea = new Tea();
        Beverages coffee = new Coffee();

        // Prompt user for tea extras
        System.out.print("Do you want extras with your tea (yes/no)? ");
        String teaExtrasInput = scanner.nextLine().trim().toLowerCase();
        boolean wantsTeaExtras = teaExtrasInput.equals("yes");
        tea.setWantsExtras(wantsTeaExtras);

        // Prompt user for coffee extras
        System.out.print("\nDo you want extras with your coffee (yes/no)? ");
        String coffeeExtrasInput = scanner.nextLine().trim().toLowerCase();
        boolean wantsCoffeeExtras = coffeeExtrasInput.equals("yes");
        coffee.setWantsExtras(wantsCoffeeExtras);

        // Prepare tea
        System.out.println("\nMaking Tea...");
        tea.finalTemplateMethod();


        // Prepare coffee
        System.out.println("\nMaking Coffee...");
        coffee.finalTemplateMethod();

        // Close scanner
        scanner.close();
    }
}
