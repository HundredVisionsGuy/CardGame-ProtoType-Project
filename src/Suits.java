public enum Suits {
  /* 
    TODO: using the context, replace all blanks with appropriate code
    
    NOTE: you may wish to reference the following article:
    Java Enums: How to Make Enums More Useful
    https://dzone.com/articles/java-enums-how-to-make-much-more-useful 
  */
  
  SPADES("Spades"), 
  ____("Hearts"), 
  CLUBS(____), 
  ____;
  
  private String val;
  
  private Suits(String value) {
      this.____ = value;
  }
  public String getSuit() {
      return ____;
  }
}
