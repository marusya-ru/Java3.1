public class Main {
    public static void main(String[] args) {
        int ticketPrice = 1150;
        int amountRublesBonusMile = 20;
        int amountBonusMiles = ticketPrice / amountRublesBonusMile;
        System.out.println("Количество бонусных миль при цене билета " + ticketPrice + "руб. составит: " + amountBonusMiles);
    }
}
