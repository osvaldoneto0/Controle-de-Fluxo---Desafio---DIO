package controleDeFluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int primeiroNumero = leia.nextInt();

            System.out.print("Digite o segundo número: ");
            int segundoNumero = leia.nextInt();

            contar(primeiroNumero, segundoNumero);
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado.");
        } finally {
            leia.close();
        }
    }

    public static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if (primeiroNumero >= segundoNumero) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro");
        }

        int quantidadeInteracoes = segundoNumero - primeiroNumero;
        for (int i = 1; i <= quantidadeInteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}