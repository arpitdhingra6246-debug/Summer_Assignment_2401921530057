package music.wind;
import music.playable;
public class Saxophone implements Playable {
  @Override
  public void play() {
    System.out.println("Playing Saxophone");
  }
}
