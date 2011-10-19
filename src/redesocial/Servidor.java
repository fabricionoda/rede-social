package redesocial;

import action.Comunicador;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class Servidor {
    private static final int PORTA = 1234;

    private Comunicador comunicador = new Comunicador();
    
    public void iniciar() throws IOException {
        ServerSocket socket = new ServerSocket(PORTA);

        try {
            while (true) {
                atenderCliente(socket.accept());
            }
        } finally {
            socket.close();
        }
    }
    
    private void atenderCliente(final Socket cliente) throws IOException {        
        // A ideia basica para atender um cliente é
        //   - ler comando
        //   - processar comando
        //   - escrever resposta
        // Você deve fazer o controle da concorrência, pois vários
        // clientes podem ser atendindos concorrentemente
        // Você pode criar uma thread para atender cada cliente
        String comando = readLine(cliente.getInputStream());
       // writeLine(cliente.getOutputStream(), "comando recebido: " + comando);
        retornoMensagem(cliente.getOutputStream(), comunicador.interpretaMensagem(comando));
        cliente.close();
    }
    
    private static String readLine(InputStream in) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        return reader.readLine();
    }
    
    private static void writeLine(OutputStream out, String linhas) throws IOException {
        out.write(linhas.getBytes());
        out.write('\n');
    }

    private void retornoMensagem(OutputStream saida, List<String> retorno) throws IOException{
        for (int i = 0; i < retorno.size(); i++) {
            writeLine(saida, retorno.get(i));
        }

        
    }

}
