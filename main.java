import java.util.Random;
public class main{
    public static Card[] deck = createDeck();
    public static Card[] playerHand = new Card[4];
    public static Card[] computerHand = new Card[4];
    public static Card[] board = new Card[52];
    public static Card[] playerCount = new Card[52];
    public static Card[] computerCount = new Card[52];
    public static Card[] boardFill(){
    Card card1  = new Card(0,"","");
    Card card2  = new Card(0,"","");
    Card card3  = new Card(0,"","");
    Card card4  = new Card(0,"","");
    Card card5  = new Card(0,"","");
    Card card6  = new Card(0,"","");
    Card card7  = new Card(0,"","");
    Card card8  = new Card(0,"","");
    Card card9  = new Card(0,"","");
    Card card10 = new Card(0,"","");
    Card card11 = new Card(0,"","");
    Card card12 = new Card(0,"","");
    Card card13 = new Card(0,"","");
    Card card14 = new Card(0,"","");
    Card card15 = new Card(0,"","");
    Card card16 = new Card(0,"","");
    Card card17 = new Card(0,"","");
    Card card18 = new Card(0,"","");
    Card card19 = new Card(0,"","");
    Card card20 = new Card(0,"","");
    Card card21 = new Card(0,"","");
    Card card22 = new Card(0,"","");
    Card card23 = new Card(0,"","");
    Card card24 = new Card(0,"","");
    Card card25 = new Card(0,"","");
    Card card26 = new Card(0,"","");
    Card card27 = new Card(0,"","");
    Card card28 = new Card(0,"","");
    Card card29 = new Card(0,"","");
    Card card30 = new Card(0,"","");
    Card card31 = new Card(0,"","");
    Card card32 = new Card(0,"","");
    Card card33 = new Card(0,"","");
    Card card34 = new Card(0,"","");
    Card card35 = new Card(0,"","");
    Card card36 = new Card(0,"","");
    Card card37 = new Card(0,"","");
    Card card38 = new Card(0,"","");
    Card card39 = new Card(0,"","");
    Card card40 = new Card(0,"","");
    Card card41 = new Card(0,"","");
    Card card42 = new Card(0,"","");
    Card card43 = new Card(0,"","");
    Card card44 = new Card(0,"","");
    Card card45 = new Card(0,"","");
    Card card46 = new Card(0,"","");
    Card card47 = new Card(0,"","");
    Card card48 = new Card(0,"","");
    Card card49 = new Card(0,"","");
    Card card50 = new Card(0,"","");
    Card card51 = new Card(0,"","");
    Card card52 = new Card(0,"","");
    board[0]     = card1;
    board[1]     = card2;
    board[2]     = card3;
    board[3]     = card4;
    board[4]     = card5;
    board[5]     = card6;
    board[6]     = card7;
    board[7]     = card8;
    board[8]     = card9;
    board[9]     = card10;
    board[10]    = card11;
    board[11]    = card12;
    board[12]    = card13;
    board[13]    = card14;
    board[14]    = card15;
    board[15]    = card16;
    board[16]    = card17;
    board[17]    = card18;
    board[18]    = card19;
    board[19]    = card20;
    board[20]    = card21;
    board[21]    = card22;
    board[22]    = card23;
    board[23]    = card24;
    board[24]    = card25;
    board[25]    = card26;
    board[26]    = card27;
    board[27]    = card28;
    board[28]    = card29;
    board[29]    = card30;
    board[30]    = card31;
    board[31]    = card32;
    board[32]    = card33;
    board[33]    = card34;
    board[34]    = card35;
    board[35]    = card36;
    board[36]    = card37;
    board[37]    = card38;
    board[38]    = card39;
    return board;
    }
    public static Card[] createDeck(){
        Card[] deck = new Card[52];
        Card card1  = new Card(1, "maca" ,"A");
        Card card2  = new Card(2, "maca" ,"2");
        Card card3  = new Card(3, "maca" ,"3");
        Card card4  = new Card(4, "maca" ,"4");
        Card card5  = new Card(5, "maca" ,"5");
        Card card6  = new Card(6, "maca" ,"6");
        Card card7  = new Card(7, "maca" ,"7");
        Card card8  = new Card(8, "maca" ,"8");
        Card card9  = new Card(9, "maca" ,"9");
        Card card10 = new Card(10,"maca","10");
        Card card11 = new Card(11,"maca","J");
        Card card12 = new Card(12,"maca","Q");
        Card card13 = new Card(13,"maca","K");
        Card card14 = new Card(1, "kupa" ,"A");
        Card card15 = new Card(2, "kupa" ,"2");
        Card card16 = new Card(3, "kupa" ,"3");
        Card card17 = new Card(4, "kupa" ,"4");
        Card card18 = new Card(5, "kupa" ,"5");
        Card card19 = new Card(6, "kupa" ,"6");
        Card card20 = new Card(7, "kupa" ,"7");
        Card card21 = new Card(8, "kupa" ,"8");
        Card card22 = new Card(9, "kupa" ,"9");
        Card card23 = new Card(10,"kupa","10");
        Card card24 = new Card(11,"kupa","J");
        Card card25 = new Card(12,"kupa","Q");
        Card card26 = new Card(13,"kupa","K");
        Card card27 = new Card(1, "karo" ,"A");
        Card card28 = new Card(2, "karo" ,"2");
        Card card29 = new Card(3, "karo" ,"3");
        Card card30 = new Card(4, "karo" ,"4");
        Card card31 = new Card(5, "karo" ,"5");
        Card card32 = new Card(6, "karo" ,"6");
        Card card33 = new Card(7, "karo" ,"7");
        Card card34 = new Card(8, "karo" ,"8");
        Card card35 = new Card(9, "karo" ,"9");
        Card card36 = new Card(10,"karo","10");
        Card card37 = new Card(11,"karo","J");
        Card card38 = new Card(12,"karo","Q");
        Card card39 = new Card(13,"karo","K");
        Card card40 = new Card(1, "sinek" ,"A");
        Card card41 = new Card(2, "sinek" ,"2");
        Card card42 = new Card(3, "sinek" ,"3");
        Card card43 = new Card(4, "sinek" ,"4");
        Card card44 = new Card(5, "sinek" ,"5");
        Card card45 = new Card(6, "sinek" ,"6");
        Card card46 = new Card(7, "sinek" ,"7");
        Card card47 = new Card(8, "sinek" ,"8");
        Card card48 = new Card(9, "sinek" ,"9");
        Card card49 = new Card(10,"sinek" ,"10");
        Card card50 = new Card(11,"sinek" ,"J");
        Card card51 = new Card(12,"sinek" ,"Q");
        Card card52 = new Card(13,"sinek" ,"K");
        deck[0]     = card1;
        deck[1]     = card2;
        deck[2]     = card3;
        deck[3]     = card4;
        deck[4]     = card5;
        deck[5]     = card6;
        deck[6]     = card7;
        deck[7]     = card8;
        deck[8]     = card9;
        deck[9]     = card10;
        deck[10]    = card11;
        deck[11]    = card12;
        deck[12]    = card13;
        deck[13]    = card14;
        deck[14]    = card15;
        deck[15]    = card16;
        deck[16]    = card17;
        deck[17]    = card18;
        deck[18]    = card19;
        deck[19]    = card20;
        deck[20]    = card21;
        deck[21]    = card22;
        deck[22]    = card23;
        deck[23]    = card24;
        deck[24]    = card25;
        deck[25]    = card26;
        deck[26]    = card27;
        deck[27]    = card28;
        deck[28]    = card29;
        deck[29]    = card30;
        deck[30]    = card31;
        deck[31]    = card32;
        deck[32]    = card33;
        deck[33]    = card34;
        deck[34]    = card35;
        deck[35]    = card36;
        deck[36]    = card37;
        deck[37]    = card38;
        deck[38]    = card39;
        deck[39]    = card40;
        deck[40]    = card41;
        deck[41]    = card42;
        deck[42]    = card43;
        deck[43]    = card44;
        deck[44]    = card45;
        deck[45]    = card46;
        deck[46]    = card47;
        deck[47]    = card48;
        deck[48]    = card49;
        deck[49]    = card50;
        deck[50]    = card51;
        deck[51]    = card52;
        return deck;
    }
    public static void cutDeck(){
        int half_length = deck.length/2;
        for(int i = 0;i<26;i++){
            Card a = deck[i];
            Card b = deck[half_length];
            deck[i] = b;
            deck[half_length] = a;
            half_length++;
        }
    }    
    public static int pointCount(Card[] cards){
        int point = 0;
        for(int i = 0;i<cards.length;i++){
            if(cards[i].getRank().equals("J")){point++;}
            if(cards[i].getRank().equals("A")){point++;}
            if(cards[i].getValue()==10&&cards[i].getSuit()=="karo"){point+=3;}
            if(cards[i].getValue()==2&&cards[i].getSuit()=="sinek"){point+=2;}
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
        //Card[] deck = createDeck();
        deckShuffle();
        boardFill();
        for(int i = 0;i<board.length;i++){
            System.out.print((i+1)+" -) ");
            deck[i].cardPrint();
        }
        for(int i = 0;i<5;i++){
            System.out.println();
        }
        cutDeck();
        for(int i = 0;i<board.length;i++){
            System.out.print((i+1)+" -) ");
            deck[i].cardPrint();
        }
        int x = pointCount(deck);
        System.out.println(x);
    }
}