/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.message;

/**
 *
 * @author victus
 */
public class Receiver extends Thread{
        private Message message;
    public Receiver(Message message) {
        this.message = message;
    }
    public void run() {
        try {
            Thread.sleep(4000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("message recieved: " + message.getMessage());
    }
}

