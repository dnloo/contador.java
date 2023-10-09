import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt(12);
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt(18);

            try {
                // Chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);

            } catch (ParametrosInvalidosException e) {
                // Imprimir a mensagem personalizada da exceção
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        while (contagem <= parametroDois) {
            System.out.println(contagem);
            contagem++;
        }
    }
}

// Classe de exceção personalizada
class ParametrosInvalidosException extends Exception {
}
