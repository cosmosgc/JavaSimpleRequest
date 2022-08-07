import GUI.mainMenu;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        JFrame frame = new JFrame("MainMenu");
        frame.setContentPane(new mainMenu().MainMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        /*
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
            JFrame frame = new JFrame("GoogleMockUp");
            frame.setContentPane(new GoogleMockUp().GOOGLEPANEL);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

        } catch (IOException e) {
            System.out.println("error");

            JFrame frame = new JFrame("ConERR");
            frame.setContentPane(new ConectionErrorScreen().ConERROR);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

            throw new RuntimeException(e);
        }

        System.out.println(response);
        */
    }
}