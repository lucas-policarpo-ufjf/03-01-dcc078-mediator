import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class ClientWebAppTest {

  @BeforeEach
  void setup() {
    ServiceMusic.getInstance().clearAll();
  }

  @Test
  void shouldCreateMusic() {
    ClientWebApp webApp = new ClientWebApp();

    assertEquals("Acessando serviços de criação de musicas. Resultado => Musica criada: lorem",
        webApp.requestCreateMusic("lorem"));
  }

  @Test
  void shouldFindAllMusics() {
    ClientWebApp webApp = new ClientWebApp();
    webApp.requestCreateMusic("lorem ip");

    assertEquals("Acessando serviços de listagem de musicas. Resultado => Lista de musicas: [lorem ip]",
        webApp.requestFindAllMusics());
  }

  @Test
  void shouldDeleteMusic() {
    ClientWebApp webApp = new ClientWebApp();
    webApp.requestDeleteMusic("lorem Wss");

    assertEquals("Acessando serviços de exclusão de musicas. Resultado => Musica excluída: lorem Wss",
        webApp.requestDeleteMusic("lorem Wss"));
  }
}
