package Modulos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;

public class Requester {

    public Socket socket;

    public String requisitarDados(List<String> requisicao) throws IOException {
        String response = null;
        fazerConexao();
        escreverARequisicao(requisicao);
        GReader gr = new GReader();
        gr.socket = socket;
        Thread grThread = new Thread(gr);
        grThread.start();
        //fecharConexao();
        //System.out.println(response);
        return response;
    }
    public void escreverARequisicao(List<String> requisicao)throws IOException{

    }
    public void fazerConexao() throws IOException, UnknownHostException {
        socket = new Socket("www.google.com.br", 80);
    }

    public void fecharConexao() throws IOException {
        socket.close();
    }
}

