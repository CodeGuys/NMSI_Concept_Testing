package japi.data.number.range;

public class FloatRange {
  public float min;
  public float max;

  public FloatRange(float min, float max) {
    this.min = min;
    this.max = max;
  }

  public float rand() {
    java.util.Random generator = new java.util.Random();
    int f = max-min;
    return generator.nextFloat(f) + min;
  }
}
