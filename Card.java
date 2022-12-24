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
    public boolean pistiCheck(Card a){
        if(getRank()==a.getRank()){
            return true;
        }
        return false;
    }
    public boolean cardCheck(Card a){
        if(a==null){
            return false;
        }
        else if(getRank()=="J"){
            return true;
        }        
        else if (getRank()==a.getRank()){
            return true;
        }

        return false;
    }
}