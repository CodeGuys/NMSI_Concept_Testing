package jogen.game.world.planet;

public class Planets {
  public String[] classes = {
    "Geoid"
  }
  public String[] names = {
    "prekker"
  }
  
  public String getRandomName() {
    return JMath.rand(classes) + " - " + JMath.rand(names);
  }
}
