/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.message;

/**
 *
 * @author victus
 */
public class Sender extends Thread{
        private Message message;
    public Sender(Message message) {
        this.message = message;
    }    
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("message sent: " + message.getMessage());
    }
}
