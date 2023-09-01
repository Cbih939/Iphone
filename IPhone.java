import java.util.ArrayList;
import java.util.List;

public class IPhone {
    private String modelo;
    private int armazenamento;
    private boolean ligado;
    private List<String> mensagensArmazenadas = new ArrayList<>();
    private String dados;

    public IPhone(String modelo, int armazenamento) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    public void ligar() {
        // Ligar o iPhone
        if (!ligado) {
            System.out.println("O iPhone está ligado.");
            ligado = true;
        } else {
            System.out.println("O iPhone já está ligado.");
        }
    }

    public void desligar() {
        // Desligar o iPhone
        if (ligado) {
            System.out.println("O iPhone está desligado.");
            ligado = false;
        } else {
            System.out.println("O iPhone já está desligado.");
        }
    }

    public void fazerChamada(String numero) {
        // Fazer uma chamada
        if (ligado) {
            System.out.println("Chamando " + numero + "...");
        } else {
            System.out.println("Não é possível fazer chamada. O iPhone está desligado.");
        }
    }

    public void receberChamada() {
        // Receber uma chamada
        if (ligado) {
            System.out.println("Recebendo uma chamada...");
        } else {
            System.out.println("Não é possível receber chamadas. O iPhone está desligado.");
        }
    }

    public void enviarMensagem(String numero, String mensagem) {
        // Enviar uma mensagem
        if (ligado) {
            System.out.println("Enviando mensagem para " + numero + ": " + mensagem);          
        } else {
            System.out.println("Não é possível enviar mensagens. O iPhone está desligado.");
        }
    }

    public void reproduzirMusica() {
        // Reproduzir música
        if (ligado) {
            System.out.println("Reproduzindo música...");
        } else {
            System.out.println("Não é possível reproduzir música. O iPhone está desligado.");
        }
    }

    public void pausarMusica() {
        // Pausar a reprodução de música
        if (ligado) {
            System.out.println("A música foi pausada.");
        } else {
            System.out.println("Não é possível pausar a música. O iPhone está desligado.");
        }
    }

    public void abrirNavegador() {
        // Abrir o navegador
        if (ligado) {
            System.out.println("Abrindo o navegador da internet...");
        } else {
            System.out.println("Não é possível abrir o navegador. O iPhone está desligado.");
        }
    }

    private void armazenarDados() {
        // Armazenar dados no dispositivo
        if (ligado) {
            mensagensArmazenadas.add(dados);
            System.out.println("Dados armazenados com sucesso.");
        } else {
            System.out.println("Não é possível armazenar dados. O iPhone está desligado.");
        }
    }
}
