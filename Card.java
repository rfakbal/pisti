public class Card{
    private String suit;
    private String rank;
    public Card(String s/*suit*/,String r /*rank*/){
        suit = s;
        rank = r;
    }
    public String getSuit(){
        return suit;
    }
    public String getRank(){
        return rank;
    }
    public void cardPrint(){
        if(getSuit()==""&&getRank()==""){
            System.out.print("null");
        }
        else{System.out.print(getSuit()+" "+getRank()+" ");}
        System.out.println();
    }
    public boolean cardCheck(Card a){
        if(getRank()=="J"){
            return true;
        }        
        else if (getRank()==a.getRank()){
            return true;
        }

        return false;
    }
}