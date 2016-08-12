package jogen.game.world.planet.data.region;

public class Region {
  Pos[] outerBorders;
  RegionItem[] layers;

  public Region() {

  }

  public RegionItem generateHill(Region r, int minEdges) {
    float sa = r.getSurfaceArea();
    sa /= 10;
    sa *= 0.8;
    int pMax = FloatUtils.rountToInt(sa) - minEdges;

    Random random = new Random();
    Pos[] points = new Pos[random.nextInt(pMax) + minEdges];
    // *GROANS*
  }
}
