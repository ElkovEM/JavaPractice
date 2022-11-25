package pr2.Poker;
import java.util.ArrayList;
import java.util.Scanner;

public class Poker {
    static int AMOUNT_OF_CARDS_IN_HAND = 5;
    static String[] suits = {"Spade", "Heart", "Clover", "Diamond"};
    static String[] ranks  = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"};
    static ArrayList<String> deck = new ArrayList<>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Poker PokerTable = new Poker();
        PokerTable.deckInit();

        System.out.println("Вы играете в техасский холдем, кол-во карт: 52. Введите кол-во игроков (не более десяти): ");
        int amountOfPlayers = scanner.nextInt();
        System.out.println("Карты розданы!\n");
        for (int i = 1; i <= amountOfPlayers; i++){
            System.out.println("Рука игрока №" + i);
            printPlayersHand();

        }
    }

    public void deckInit(){
        for (String suit: suits){
            for (String rank: ranks){
                deck.add(rank + " " + suit);
            }
        }
    }
    public static void printPlayersHand(){
        for (int i = 0; i < AMOUNT_OF_CARDS_IN_HAND; i++){
            int randomCard = (int)(Math.random() * deck.size());
            System.out.println(deck.get(randomCard));
            deck.remove(randomCard);
        }
        System.out.println();
    }
}
