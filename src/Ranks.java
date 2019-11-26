public enum Ranks {

  /* 
    TODO: using the context, replace all blanks with appropriate code
    
    NOTE: you may wish to reference the following article:
    Java Enums: How to Make Enums More Useful
    https://dzone.com/articles/java-enums-how-to-make-much-more-useful 
  */
  
  ACE(1, "Ace"), TWO(2, "Two"), THREE(____), FOUR(____), 
  FIVE(____), SIX(____), SEVEN(____), EIGHT(____), 
  NINE(____),TEN(____), JACK(10, "Jack"), ____,
  ____(10, ____);
  
  private int value;
  private String name;
  
  Ranks(final int value, final String name) {
    this.value = ____;
    ____.name = ____;
  }
  public int getValue() {
    return ____;
  }
  public ____ getName() {
    ____ this.name;
  }
}
