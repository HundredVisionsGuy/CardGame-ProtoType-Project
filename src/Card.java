public class Card {
  private String suit = "";
  private String rank_name = "";
  private int rank_value = 0;
  
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
