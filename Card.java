public class Card{
    private int value;
    private String suit;
    private String rank;
    public Card(int x/*value for test*/,String s/*suit*/,String r /*rank*/){
        value = x;
        suit = s;
        rank = r;
    }
    public boolean cardCheck(Card b){
        if(getValue()==b.getValue()){
            return true;
        }
        return false;
    }
    //public String[] suits = {"♣", "♦", "♥", "♠"};
    //public String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10","J", "Q", "K"};
    public int getValue(){
        return value;
    }
    public String getSuit(){
        return suit;
    }
    public String getRank(){
        return rank;
    }
    public void cardPrint(){
        if(getValue()==0&&getSuit()==""&&getRank()==""){
            System.out.print("null");
        }
        else{System.out.print(getValue()+" "+getSuit()+" "+getRank()+" ");}
        System.out.println();
    }

}