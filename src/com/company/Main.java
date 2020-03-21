package com.company;

import com.sun.security.ntlm.Server;

import java.io.*;
import java.net.Socket;
public class Main {

    public static void main(String[] args) {

        // Envio el id
        Socket serverSocket = null;
        try {
            serverSocket = new Socket("localhost", 10001);
            DataOutputStream dos = new DataOutputStream(serverSocket.getOutputStream());
            dos.writeInt(3);
            dos.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

