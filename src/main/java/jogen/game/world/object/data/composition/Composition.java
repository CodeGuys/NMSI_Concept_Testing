public class Composition {
  public ArrayList<Element> elements = new ArrayList<Element>();
  public ArrayList<int> percents = new ArrayList<int>();
  
  public Composition() {
    
  }
  
  public void add(Element e, int p) {
    elements.add(e);
    percents.add(p);
  }
}
