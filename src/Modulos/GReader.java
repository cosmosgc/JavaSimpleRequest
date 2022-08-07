package Modulos;

import GUI.GoogleMockUp;
import GUI.requestError;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class GReader extends Requester implements Runnable{
    public void run()
    {
        lerAResposta(socket);
    }
    public String lerAResposta(Socket socket) {
        String response = null;
        try {
            System.out.println("lendo");
            response = lendoDoSocketUsandoBufferedReader(socket);
        } catch (IOException e) {
            System.out.println("Erro na leitura da resposta: " + e.getMessage());
        }
        if (response.length() <= 1610){
            //abrir janela de request error
            JFrame frame = new JFrame("RequestError");
            frame.setContentPane(new requestError().requestErrorWindow);
            //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
        else{
            //abrir janela de google
            JFrame frame = new JFrame("GoogleMockUp");
            frame.setContentPane(new GoogleMockUp().GOOGLEPANEL);
            //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
        return response;
    }

    private String lendoDoSocketUsandoBufferedReader(Socket socket) throws IOException {
        InputStreamReader ir = new InputStreamReader(socket.getInputStream());
        BufferedReader br = new BufferedReader(ir);
        String resposta = "";
        String linha = br.readLine();
        while (br.ready()) {
            resposta += (linha + "\n");
            linha = br.readLine();
        }
        //System.out.println(resposta);
        System.out.println("response size: "+ resposta.length());
        return resposta;
    }
}
