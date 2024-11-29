/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.message;

/**
 *
 * @author victus
 */
public class Message {
    private String text;
    public Message(String content) {
        text = content;
    }
    public String getMessage() {
        return text;
    }
     public static void main(String[] args) {
        Message message = new Message("hi rola");
        Sender sender = new Sender(message);
        Receiver receiver = new Receiver(message);
        receiver.start();
        sender.start();
    }
}
