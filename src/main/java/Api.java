public class Api {
  private static Api instance = new Api();

  private Api() {
  }

  public static Api getInstance() {
    return instance;
  }

  public String handleCreateMusic(String values) {
    return "Acessando serviços de criação de musicas. Resultado => " + ServiceMusic.getInstance().create(values);
  }

  public String handleFindAllMusics() {
    return "Acessando serviços de listagem de musicas. Resultado => " + ServiceMusic.getInstance().findAll();
  }

  public String handleDeleteMusic(String values) {
    return "Acessando serviços de exclusão de musicas. Resultado => " + ServiceMusic.getInstance().delete(values);
  }
}
