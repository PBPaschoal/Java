import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ForwardMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.*;

public class MeuBot extends TelegramLongPollingBot {
    private final List<Message> historicoMensagens = new ArrayList<>();

    @Override
    public void onUpdateReceived(Update update) { // Lida com as mensagens recebidas
        if (update.hasMessage() && update.getMessage().hasText()) {
            Message mensagem = update.getMessage();
            String texto = mensagem.getText().toLowerCase();

            System.out.println("Mensagem recebida: " + texto);  // Log para depuração

            if (texto.startsWith("tem ") || texto.endsWith("?")) {
                buscarEReenviarMensagens(mensagem);
            } else {
                armazenarMensagem(mensagem);
            }
        }
    }

    private void armazenarMensagem(Message mensagem) {
        historicoMensagens.add(mensagem);
        System.out.println("Mensagem armazenada: " + mensagem.getText());  // Log para depuração
    }

    private void buscarEReenviarMensagens(Message mensagem) {
        String textoPesquisa = mensagem.getText().toLowerCase().replace("tem", "").replace("?", "").trim();
        String chatId = mensagem.getChatId().toString();
        List<Message> mensagensEncontradas = new ArrayList<>();

        System.out.println("Pesquisando por: " + textoPesquisa);  // Log para depuração

        for (Message msg : historicoMensagens) {
            String textoMsg = msg.getText().toLowerCase();
            if (textoMsg.contains(textoPesquisa)) {
                mensagensEncontradas.add(msg);
            }
        }

        if (!mensagensEncontradas.isEmpty()) {
            for (Message msg : mensagensEncontradas) {
                encaminharMensagem(chatId, msg);
            }
        } else {
            enviarMensagem(chatId, "Não encontrei nada sobre isso 😕");
        }
    }

    private void encaminharMensagem(String chatId, Message msg) {
        ForwardMessage forwardMessage = new ForwardMessage();
        forwardMessage.setChatId(chatId);
        forwardMessage.setFromChatId(msg.getChatId().toString());
        forwardMessage.setMessageId(msg.getMessageId());

        try {
            execute(forwardMessage);
            System.out.println("Mensagem encaminhada: " + msg.getText());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void enviarMensagem(String chatId, String texto) {
        try {
            execute(new SendMessage(chatId, texto));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "SeuBot";
    }

    @Override
    public String getBotToken() {
        return "SEUTOKEN_AQUI";
    }
}