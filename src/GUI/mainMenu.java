package GUI;

import Modulos.GReader;
import Modulos.GTalker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class mainMenu {
    public JPanel MainMenu;
    private JButton NormalRequest;
    private JButton requestComErroDoButton;

    public mainMenu() {
        NormalRequest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                requestNormal();
            }
        });
        requestComErroDoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                requestError();
            }
        });
    }

    public void requestNormal(){
        System.out.println("Hello world!");
        GTalker Request = new GTalker();
        GReader Reader = new GReader();

        ArrayList<String> requisicao = new ArrayList<>(1);
        requisicao.add("GET / HTTP/1.1");
        String response = null;
        try {
            System.out.println("success");
            response = Request.requisitarDados(requisicao);
            //Mostra a tela google
            //System.out.println(response);
            //System.out.format("response size: ", response.length());


        } catch (IOException e) {
            System.out.println("error");

            JFrame frame = new JFrame("ConERR");
            frame.setContentPane(new ConectionErrorScreen().ConERROR);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

            throw new RuntimeException(e);
        }
    }
    public void requestError(){
        System.out.println("Hello world!");
        GTalker Request = new GTalker();
        GReader Reader = new GReader();

        ArrayList<String> requisicao = new ArrayList<>(1);
        requisicao.add("GuT / HxTP/2.1");
        String response = null;
        try {
            System.out.println("success");
            response = Request.requisitarDados(requisicao);

        } catch (IOException e) {
            System.out.println("error");

            JFrame frame = new JFrame("ConERR");
            frame.setContentPane(new ConectionErrorScreen().ConERROR);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

            throw new RuntimeException(e);
        }
    }
}
