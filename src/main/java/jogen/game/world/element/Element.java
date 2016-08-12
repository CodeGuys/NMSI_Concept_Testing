package jogen.game.world.element;

public class Element {
  public String name;
  public String symbol;
  public int number;
  
  public boolean radioactive;
  public int strength;
  
  public Element() {
    
  }
  
  public Element generate() {
    Element e = new Element();
    e.name = rand(Elements_e.names);
    e.symbol = Elements.getSymbol(e.name);
    e.number = Elements.getNumber(e.number);
  }
}
