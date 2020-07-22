public class Trial{
    public static void main(String[] args){
        double hamburger = 3.50;
        double drink = 1;

        double hamburger2 = hamburger*2;
        double combo = hamburger + drink;

        System.out.println("Menu \nHamburger: $" + hamburger + 
            "\nDrink: $" + drink + 
            "\nTwo Hamburgers: $" + hamburger2 + 
            "\nCombo: $" + combo);

        System.out.println("\nHow many drinks can you buy for one hamburger?");
        System.out.println((int)(hamburger/drink));
    }
}