public class Client {
  public String requestCreateMusic(String value) {
    return Api.getInstance().handleCreateMusic(value);
  }

  public String requestFindAllMusics() {
    return Api.getInstance().handleFindAllMusics();
  }

  public String requestDeleteMusic(String values) {
    return Api.getInstance().handleDeleteMusic(values);
  }
}
