import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class main{
    public static Card[] deck = new Card[52];
    public static Card[] playerHand = new Card[4];
    public static Card[] computerHand = new Card[4];
    public static Card[] board = new Card[52];
    public static Card[] playerCount = new Card[52];
    public static Card[] computerCount = new Card[52];
    public static String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    public static String[] suits = {"maca","kupa","karo","sinek"};
    public static void createDeck(){
    int index = 0;
    for(int i=0;i<suits.length;i++){
        for(int j = 0;j<ranks.length;j++){
            Card card = new Card(suits[i],ranks[j]);
            deck[index] = card;
            index++;
            }
        }
    }
    public static int getInput(int limit){
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        int input = 0;
        while(loop){
            try{
                input = sc.nextInt();
                if(input>=0&&input<limit){
                    loop = false;
                }
                System.out.println("Invalid input try again ");
            } 
            catch(InputMismatchException ex){
                System.out.println("Invalid input try again ");
                sc.nextLine();
            }
        }
        return input;

    }
    public static void cutDeck1(){
        int half_length = deck.length/2;
        for(int i = 0;i<26;i++){
            Card a = deck[i];
            Card b = deck[half_length];
            deck[i] = b;
            deck[half_length] = a;
            half_length++;
        }
    }
    public static void cutDeck2(){
        System.out.println("Please enter the number of the card that you want to cut from: ");
        int selection = getInput(52);
        selection -= 1;
        Card[] deckFirstPart = new Card[selection];
        Card[] deckSecondPart = new Card[52-selection];
        for(int i = 0;i<selection;i++){
            Card a = deck[i];
            deckFirstPart[i] = a;
        }
        for(int i = 0;i<52-selection;i++){
            Card a = deck[selection+i];
            deckSecondPart[i] = a;
        }
        for(int i = 0;i<deckFirstPart.length;i++){
            System.out.print((i+1)+" -) ");
            deckFirstPart[i].cardPrint();
        }
        System.out.println();
        for(int i = 0;i<deckSecondPart.length;i++){
            System.out.print((i+1)+" -) ");
            deckSecondPart[i].cardPrint();
        }
        System.out.println();
        for(int i = 0;i<deckSecondPart.length;i++){
            deck[i] = deckSecondPart[i];
        }
        for(int i = 0;i<deckFirstPart.length;i++){
            deck[deckSecondPart.length+i] = deckFirstPart[i];
        }
    }
    public static int pointCount(Card[] cards){
        int point = 0;
        for(int i = 0;i<cards.length;i++){
            if(cards[i].getRank().equals("J")){point++;}
            if(cards[i].getRank().equals("A")){point++;}
            if(cards[i].getRank()=="K"&&cards[i].getSuit()=="karo"){point+=3;}
            if(cards[i].getRank()=="2"&&cards[i].getSuit()=="sinek"){point+=2;}
        } 
        return point;
    }
    public static void deckShuffle(){
        Random rd = new Random();
        for(int i = 0;i<deck.length;i++){
            int index = rd.nextInt(deck.length);
            Card x = deck[i];
            Card y = deck[index];
            deck[i] = y;
            deck[index] = x;
        }
    }
    public static void main(String[] args){
        createDeck();
        deckShuffle();
        for(int i = 0;i<board.length;i++){
            System.out.print((i+1)+" -) ");
            deck[i].cardPrint();
        }
        for(int i = 0;i<5;i++){
            System.out.println();
        }
        cutDeck2();
        for(int i = 0;i<board.length;i++){
            System.out.print((i+1)+" -) ");
            deck[i].cardPrint();
        }
        int x = pointCount(deck);
        System.out.println(x);
    }
}