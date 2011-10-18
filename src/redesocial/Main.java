package redesocial;

import java.io.IOException;


public class Main {
    private static void apresenta(){
        System.out.println("Tabalho de Introducao a Inteligencia Artificial");
		System.out.println("Professor: Marco Aurélio Barbosa");
		System.out.println("Aluno:  Fabricio Noda RA 39854");
		System.out.println(" ");
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Iniciando servidor");
        Servidor servidor = new Servidor();
        servidor.iniciar();
        apresenta();
    }
}