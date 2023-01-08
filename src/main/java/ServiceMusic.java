import java.util.ArrayList;

public class ServiceMusic implements Service {
  private ArrayList<String> musics = new ArrayList<String>();
  private static ServiceMusic instance = new ServiceMusic();

  private ServiceMusic() {
  }

  public static ServiceMusic getInstance() {
    return instance;
  }

  public String create(String values) {
    this.musics.add(values);
    return "Musica criada: " + values;
  }

  public String findAll() {
    return "Lista de musicas: " + this.musics.toString();
  }

  public String delete(String values) {
    this.musics.remove(values);
    return "Musica excluída: " + values;
  }

  // tests cleanup
  public void clearAll() {
    this.musics.clear();
  }
}
