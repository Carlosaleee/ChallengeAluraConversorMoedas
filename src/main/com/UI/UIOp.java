package main.com.UI;

import main.com.conversormoedas.api.ClearScreen;
import main.com.conversormoedas.api.CurrencyConverterService;
import java.io.IOException;
import java.util.Scanner;

import static main.com.conversormoedas.api.ClearScreen.centralizarTexto;

public class UIOp {

    public static void inicio() throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            ClearScreen.clearScreen();
            System.out.println("\n*************************************\n");
            System.out.println("Bem Vindo ao Conversor de Moedas: ");
            System.out.println("\n*************************************");

            System.out.print("""
                    
                    - Qual Moeda Vocé Deseja Converter ?
                    
                    1) Real ------------> Dólar
                    2) Real ------------> Peso Argentino
                    3) Real ------------> Euro
                    4) Dólar -----------> Real
                    5) Peso Argentino --> Real
                    6) Euro ------------> Real
                    7) Outras opções
                    0) Sair
                                          
                    Escolha uma opção ou digite 0 para sair:\s""");
            op = sc.nextInt();
            sc.nextLine(); // Consumir o \n após o nextInt()

            switch (op) {
                case 1 -> realizarConversao(sc, "BRL", "USD");
                case 2 -> realizarConversao(sc, "BRL", "ARS");
                case 3 -> realizarConversao(sc, "BRL", "EUR");
                case 4 -> realizarConversao(sc, "USD", "BRL");
                case 5 -> realizarConversao(sc, "ARS", "BRL");
                case 6 -> realizarConversao(sc, "EUR", "BRL");
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (op != 0);

    }

    private static void realizarConversao(Scanner sc, String deMoeda, String paraMoeda) throws IOException, InterruptedException {
        try {
            Double currency = CurrencyConverterService.currencyApi(deMoeda, paraMoeda);
            System.out.print("Digite o valor que quer converter: ");
            String moedaString = sc.nextLine().replace(",", ".");
            Double moeda = Double.parseDouble(moedaString);

            String texto = String.format("O valor convertido é: %.2f", (moeda * currency));

            System.out.println();
            centralizarTexto("************************************ ");
            centralizarTexto(texto);
            centralizarTexto("Pressione Enter para continuar");
            centralizarTexto("************************************ ");
            sc.nextLine();
            ClearScreen.clearScreen();

        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor digitado é inválido.");
        }
    }

}
