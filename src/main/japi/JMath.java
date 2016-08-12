package japi;

public class JMath {
  public static Object rand(Object[] objects) {
    Random g = new Random();
    return objects[g.nextInt(objects.length)];
  }
  public static String rand(String[] objects) {
    Random g = new Random();
    return objects[g.nextInt(objects.length)];
  }
  public static int rand(int min, int max) {
    Random g = new Random();
    int f = max-min;
    return g.nextInt(f) + min;
  }
}
