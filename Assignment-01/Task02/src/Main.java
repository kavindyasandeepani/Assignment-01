public class Main {
    public static void main(String[] args) {
        Beverages tea = new Tea();
        Beverages coffee = new Coffee();

        // Prepare tea with extras
        tea.setWantsExtras(true);
        System.out.println("Preparing Tea with Extras:");
        tea.finalTemplateMethod();

        System.out.println();

        // Prepare coffee without extras
        coffee.setWantsExtras(false);
        System.out.println("Preparing Coffee without Extras:");
        coffee.finalTemplateMethod();
    }
}
