package com.aotu.chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.lang.reflect.Array;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        int gap = 10;
        JFrame f = new JFrame("");
        f.setSize(230, 70);
        f.setLocation(200, 900);
        f.setLayout(null);
        JPanel pInput = new JPanel();
        pInput.setBounds(gap, gap, 200, 100);
        pInput.setLayout(new GridLayout(4, 3, gap, gap));
        JTextField locationText = new JTextField();
        pInput.add(locationText);
        f.add(pInput);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Scanner sc = new Scanner(System.in);
        //建立tcp的客户端服务
        Socket socket = new Socket("192.168.1.115", 9090);
        //获取到Socket输出流对象
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
        //获取到Socket的输入流对象
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        Thread thread = new Thread(() -> {
            locationText.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                    Object o = e.getSource();
                    if (o instanceof JTextField) {
                        char keyCh = e.getKeyChar();
                        if (keyCh == '\n') {
                            String date = sdf.format(new Date());
                            String sendMsg = locationText.getText();
                            System.out.println(date + " 客户端：" + sendMsg);
                            locationText.setText("");
                            pw.println(sendMsg);
                        }
                    }
                }

                @Override
                public void keyPressed(KeyEvent e) {}

                @Override
                public void keyReleased(KeyEvent e) {}
            });
        });
        thread.start();
        //读取客户端的数据
        String receiveMsg;
        try {
            while ((receiveMsg = br.readLine()) != null) {
                String date = sdf.format(new Date());
                System.out.println(date + " 服务端：" + receiveMsg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
