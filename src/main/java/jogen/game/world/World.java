package jogen.game.world;

import jogen.game.world.planet.Planet;
import jogen.game.world.object.GameObject;
import jogen.game.world.character.Character;

public class World {
  public String name;
  public ArrayList<Planet> planets;
  public ArrayList<GameObject> objects;
  public ArrayList<Character> characters;

  public World(String name) {
    this.name = name;
    objects = new ArrayList<GameObject>();
    characters = new ArrayList<Character>();
  }

  public void tick() {
    try {
      for (int i = 0; i < planets.size(); i++) {
        planets.get(i).tick();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    try {
      for (int i = 0; i < objects.size(); i++) {
        objects.get(i).tick();
      }
    } catch (Exception e) {
      e.printStackTrace();
    } try {
      for (int i = 0; i < characters.size(); i++) {
        characters.get(i).tick();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
