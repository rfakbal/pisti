import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class main{
    public static Card[]    deck                = new Card[52];
    public static Card[]    playerHand          = new Card[4];
    public static Card[]    computerHand        = new Card[4];
    public static Card[]    board               = new Card[52];
    public static Card[]    playerCount         = new Card[52];
    public static Card[]    computerCount       = new Card[52];
    public static boolean   developermod;
    public static int       playerget;
    public static int       playerScore         = 0;
    public static int       computerScore       = 0;
    public static int       dealReminder        = 0;
    public static int       boardReminder       = 3;
    public static boolean   start               = true;
    public static String[]  ranks               = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    public static String[]  suits               = {"maca","kupa","karo","sinek"};
    public static void cardPrint(Card a){
    if(a==null){
        System.out.println("There is No Card ");
    }
    else{System.out.print(a.getSuit()+" "+a.getRank()+" ");}
     System.out.println();
    }
    public static void createDeck(){
        int index = 0; // this integer helps me to track deck's new card's index.
        for(int i=0;i<suits.length;i++){ 
            for(int j = 0;j<ranks.length;j++){ //
                Card card = new Card(suits[i],ranks[j]);
                deck[index] = card;
                index++;
                }
            }
            if(developermod){
                for(int i = 0;i<52;i++){
                    System.out.print(i+"-) ");
                    cardPrint(deck[i]);
                }   
            }
        
    }
    public static int getInput(int limit){
        Scanner sc = new Scanner(System.in);
        boolean loop = true; // this condition ends the loop
        int input = 0;
        while(loop){
            try{
                input = sc.nextInt();
                if(input>0&&input<limit){
                    loop = false;
                }
                else{
                    System.out.println("Invalid input try again ");
                }
            } 
            catch(InputMismatchException ex){
                System.out.println("Invalid input try again ");
                sc.nextLine();
            }
        }
        return input;

    }
    public static void cutDeck(){
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
        if(developermod){
        for(int i = 0;i<deckFirstPart.length;i++){
            System.out.print((i+1)+" -) ");
            cardPrint(deckFirstPart[i]);
        }
        System.out.println();
        for(int i = 0;i<deckSecondPart.length;i++){
            System.out.print((i+1)+" -) ");
            cardPrint(deckSecondPart[i]);
        }    
        }
        for(int i = 0;i<deckSecondPart.length;i++){
            deck[i] = deckSecondPart[i];
        }
        for(int i = 0;i<deckFirstPart.length;i++){
            deck[deckSecondPart.length+i] = deckFirstPart[i];
        }
    }
    public static void dealCards(){
        if(start==true){
            for(int i = 0;i<4;i++,dealReminder++){
                board[i] = deck[i];
            }
        }
        for(int i = 0;i<4;i++,dealReminder++){
            playerHand[i] = deck[dealReminder];
        }
        for(int i = 0;i<4;i++,dealReminder++){
            computerHand[i] = deck[dealReminder];
        }
    }
    public static void printHand(Card[] arr,int a){
        if(a==0){
         System.out.println("Your Cards: ");
            for(int i = 0;i<4;i++){
            System.out.print((i+1)+" -) ");
            cardPrint(arr[i]);
            }   
        }
        else if(a==1){
         System.out.println("Computer's Card: ");
            for(int i = 0;i<4;i++){
            System.out.print((i+1)+" -) ");
            cardPrint(arr[i]);
            }   
        }
        
    }
    public static void drawBoard(){
        if(start==true){
            System.out.println("Board Cards: ");
            for(int i = 0;i<3;i++){
                cardPrint(board[i]);
            }
            //top = board[3];
            System.out.print("Card on Top: ");
            cardPrint(board[boardReminder]);
            System.out.println();
            start = false;
        }
        else{
            if(boardReminder==1){
                System.out.println("The only Card on Top: ");
                cardPrint(board[boardReminder]);
                System.out.println();
            }
            else{
                System.out.print("Card on Top: ");
            cardPrint(board[boardReminder]);
            System.out.println();
            }
            
        }
    }
    public static void emptyBoard(Card[] arr){
        for(int i = 0;i<boardReminder+1;i++){
            for(int j = 0;j<52;j++){
                if(arr[j]!=null){
                    continue;
                }
                else{
                    arr[j]=board[i];
                    board[i]=null;
                }
            }
        }
        boardReminder=0;
    }
    public static void playerPlay(){
        Scanner sc = new Scanner(System.in);
        printHand(playerHand,0);
        boolean end = true;
        int input = 0;
        while(end){
            input = getInput(5);
            input--;
            if(playerHand[input]!=null){
                end = false;
            }
        }
        if(board[boardReminder]==null){
            boardReminder++;
            board[boardReminder]=playerHand[input];
            playerHand[input]=null;
        }
        else if(boardReminder==1 && playerHand[input].pistiCheck(board[boardReminder])){
            System.out.println("PISTI!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            boardReminder++;
            board[boardReminder] = playerHand[input];
            emptyBoard(playerCount);
            playerHand[input]=null;
            playerScore += 10;
            playerget = 1;
        }
        else if(playerHand[input].cardCheck(board[boardReminder])){
            System.out.println("You Played"+" "+playerHand[input].getSuit()+" "+playerHand[input].getRank()+" And "+"Got All The Cards ++++++++++++++++++++++++++++++++++++++++++++++");
            boardReminder++;
            board[boardReminder] = playerHand[input];
            emptyBoard(playerCount);
            playerHand[input]=null;
            playerget = 1;
        }
        else{
            boardReminder++;
            board[boardReminder] = playerHand[input];
            System.out.println("You Played"+" "+playerHand[input].getSuit()+" "+playerHand[input].getRank()+"    --------------------------------------------");
            playerHand[input]=null;
        }
    }
    public static void computerPlay(){
        Random rd = new Random(System.currentTimeMillis());
        boolean playRandom = true;
        boolean end = true;
        int selection = 0;
        if(developermod){printHand(computerHand,1);}
        for(int i = 0;i<4;i++){
            if(computerHand[i]!=null){
               if(boardReminder==1 && computerHand[i].pistiCheck(board[boardReminder])){
                System.out.println("Computer played = "+ computerHand[i].getSuit()+" "+computerHand[i].getRank() +" and got the pisti!!!!");
                boardReminder++;
                board[boardReminder] = computerHand[i];
                emptyBoard(computerCount);
                computerHand[i] = null;
                computerScore += 10;
                playerget = 0;
                playRandom = false;
                }
            else if(computerHand[i].cardCheck(board[boardReminder])){
                System.out.println("Computer played = "+ computerHand[i].getSuit()+" "+computerHand[i].getRank() +" and got all the cards on the board.");
                boardReminder++;
                board[boardReminder] = computerHand[i];
                emptyBoard(computerCount);
                computerHand[i] = null;
                playerget = 0;
                playRandom = false;
                } 
            }   
        }
        if(playRandom){
            boolean cardNull = true;
            while(cardNull){
                selection = rd.nextInt(4);
                if(computerHand[selection]!=null){
                boardReminder++;
                board[boardReminder] = computerHand[selection];
                System.out.print("Computer played = "+ computerHand[selection].getSuit()+" "+computerHand[selection].getRank() +" .");
                System.out.println();
                cardNull = false;
                computerHand[selection]=null;
                }
            }
        }
    }
    public static int pointCount(Card[] cards){
        int point = 0;
        for(int i = 0;i<cards.length;i++){
            if(cards[i]==null){continue;}
            else if(cards[i].getRank().equals("J")){point++;}
            else if(cards[i].getRank().equals("A")){point++;}
            else if(cards[i].getRank()=="K"&&cards[i].getSuit()=="karo"){point+=3;}
            else if(cards[i].getRank()=="2"&&cards[i].getSuit()=="sinek"){point+=2;}
            else{point++;}
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
    public static void scoreDraw(){
        int cardScorePlayer = pointCount(playerCount);
        playerScore += cardScorePlayer;
        int cardScoreComputer = pointCount(computerCount);
        computerScore += cardScoreComputer;
        if(developermod){
           for(int i = 0;i<computerCount.length;i++){
                if(computerCount[i]!=null){
                    cardPrint(playerCount[i]);
                }
            }    
        }
        System.out.println("Your score: "+playerScore);
        System.out.println();
        if(developermod){
           for(int i = 0;i<computerCount.length;i++){
                if(computerCount[i]!=null){
                    cardPrint(computerCount[i]);
                }
            }    
        }
        System.out.println("Computer's score: "+computerScore);
        System.out.println();
        System.out.println("END");
    }
    public static void giveLastCards(){
        if(board[boardReminder]!=null){
            if(playerget==1){
                emptyBoard(playerCount);
            }
            else{
                emptyBoard(computerCount);
            }
        }
    }
    public static void pisti(){
        for(int i = 0;i<6;i++){
            dealCards();
            for(int j = 0;j<4;j++){
                drawBoard();
                playerPlay();
                computerPlay();
            }
        }
    }
    public static void isDeveloper(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.equals("dev")){
            developermod = true;
        }
        else{
            developermod = false;
        }
    }
    public static void main(String[] args){
        isDeveloper();
        createDeck();
        deckShuffle();
        cutDeck();
        pisti();
        giveLastCards();
        scoreDraw();
    }
}