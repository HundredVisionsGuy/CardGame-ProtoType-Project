public class Card {
  private String suit = "";
  private String rank_name = "";
  private int rank_value = 0;
  
  /* 
    TODO: using the context, replace all blanks with appropriate code
    
    NOTE: you may wish to reference the Oracle article on Classes
    https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html 
  */

  public Card(Ranks ____, ____ suit) {
      this.suit = suit.getSuit();
      rank_name = ____.getName();
      ____ = rank.getValue();
  }
  
  @Override
  public ____ toString() {
      return String.format(____ + " of " + suit);
  }
  public int getValue() {
    return ____;
  }
}
