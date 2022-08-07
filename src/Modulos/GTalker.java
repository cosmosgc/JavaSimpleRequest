package Modulos;


import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class GTalker extends Requester{

    public void escreverARequisicao( List<String> requisicao) throws IOException {
        PrintStream ps = new PrintStream(socket.getOutputStream());
        ps.println ("\r\n");
        //ps.println ("Host: www.google.com\r\n");
        for(String item : requisicao) {
            ps.println(item);
        }
        ps.println();

    }
}
