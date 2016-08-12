package jogen.game.world.planet;

public class Planet {
  public PlanetPos position;
  
  public String name;
  public TerrainMap terrain;
  
  public Planet() {
    this.name = name;
    this.terrain = TerrainMap.generateNew(new Random().nextInt());
  }
  
  public Planet generate(int seed) {
    this.name = Planets.getRandomName();
    this.terrain = TerrainMap.generateNew(seed);
  }
}
