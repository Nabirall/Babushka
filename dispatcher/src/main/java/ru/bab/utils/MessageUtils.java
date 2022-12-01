package ru.bab.utils;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class MessageUtils {
    public SendMessage generateSendMessageWithText(Update update, String text){
        var message = update.getMessage();
        var sendMassage=new SendMessage();
        sendMassage.setChatId(message.getChatId().toString());
        sendMassage.setText(text);
        return sendMassage;
    }
}
