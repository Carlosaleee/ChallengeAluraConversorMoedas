package main.com.UI;

import main.com.conversormoedas.api.ClearScreen;
import main.com.conversormoedas.api.CurrencyConverterService;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import com.google.gson.Gson;

import static main.com.conversormoedas.api.ClearScreen.centralizarTexto;

public class UIOutrasOp {
    public static void exibirSubMenuOutrasOpcoes() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        ClearScreen.clearScreen();
        centralizarTexto("************************************ ");
        centralizarTexto("As 60 principais moedas");
        centralizarTexto("************************************ \n");


        HashMap<String, String> currencies = new HashMap<>();
        currencies.put("BRL", "Real Brasileiro");
        currencies.put("USD", "Dólar dos Estados Unidos");
        currencies.put("EUR", "Euro");
        currencies.put("JPY", "Iene japonês");
        currencies.put("GBP", "Libra esterlina britânica");
        currencies.put("AUD", "Dólar australiano");
        currencies.put("CAD", "Dólar canadense");
        currencies.put("CHF", "Franco suíço");
        currencies.put("CNY", "Yuan chinês");
        currencies.put("SEK", "Coroa sueca");
        currencies.put("NZD", "Dólar neozelandês");
        currencies.put("KRW", "Won sul-coreano");
        currencies.put("SGD", "Dólar de Singapura");
        currencies.put("NOK", "Coroa norueguesa");
        currencies.put("MXN", "Peso mexicano");
        currencies.put("INR", "Rupia indiana");
        currencies.put("RUB", "Rublo russo");
        currencies.put("ZAR", "Rand sul-africano");
        currencies.put("HKD", "Dólar de Hong Kong");
        currencies.put("TRY", "Lira turca");
        currencies.put("BRL", "Real Brasileiro");
        currencies.put("IDR", "Rupia indonésia");
        currencies.put("MYR", "Ringgit malaio");
        currencies.put("PLN", "Zloty polonês");
        currencies.put("COP", "Peso colombiano");
        currencies.put("THB", "Baht tailandês");
        currencies.put("CLP", "Peso chileno");
        currencies.put("PHP", "Peso filipino");
        currencies.put("EGP", "Libra egípcia");
        currencies.put("CZK", "Coroa checa");
        currencies.put("AFN", "Afegane afegão");
        currencies.put("ALL", "Lek albanês");
        currencies.put("AMD", "Dram armênio");
        currencies.put("ANG", "Florim das Antilhas Holandesas");
        currencies.put("AOA", "Kwanza angolano");
        currencies.put("ARS", "Peso argentino");
        currencies.put("AWG", "Florim de Aruba");
        currencies.put("AZN", "Manat azerbaijano");
        currencies.put("BBD", "Dólar de Barbados");
        currencies.put("BDT", "Taka bengalesa");
        currencies.put("BGN", "Lev búlgaro");
        currencies.put("BHD", "Dinar bareinita");
        currencies.put("BIF", "Franco burundiano");
        currencies.put("BMD", "Dólar das Bermudas");
        currencies.put("BND", "Dólar de Brunei");
        currencies.put("BOB", "Boliviano boliviano");
        currencies.put("BSD", "Dólar das Bahamas");
        currencies.put("BTN", "Ngultrum butanês");
        currencies.put("BWP", "Pula de Botsuana");
        currencies.put("BYN", "Rublo bielorrusso");
        currencies.put("BZD", "Dólar do Belize");
        currencies.put("CDF", "Franco congolês");
        currencies.put("DOP", "Peso dominicano");
        currencies.put("DZD", "Dinar argelino");
        currencies.put("ERN", "Nakfa eritreia");
        currencies.put("ETB", "Birr etíope");
        currencies.put("FJD", "Dólar fijiano");
        currencies.put("FKP", "Libra das Ilhas Falkland");
        currencies.put("GGP", "Libra de Guernsey");
        currencies.put("GEL", "Lari georgiano");
        currencies.put("GHS", "Cedi ganês");
        currencies.put("GIP", "Libra de Gibraltar");
        currencies.put("GMD", "Dalasi gambiano");
        currencies.put("GNF", "Franco guineense");
        currencies.put("GTQ", "Quetzal guatemalteco");
        currencies.put("GYD", "Dólar da Guiana");
        int count = 0;
        for (String code : currencies.keySet()) {
            System.out.printf("%-5s: %-40s", code, currencies.get(code));
            count++;
            if (count % 2 == 0) {
                System.out.println();
                Thread.sleep(200);
            }
        }
        System.out.println();

        try {
            System.out.println("Enter para Continuar...");
            sc.nextLine();
            System.out.print("Qual a moeda de origem? (exemplo BRL): ");
            String moedaOrigem = sc.nextLine().toUpperCase();

            System.out.print("Qual moeda de destino? (Exemplo USD): ");
            String moedaDestino = sc.nextLine().toUpperCase();

            Double currency = CurrencyConverterService.currencyApi(moedaOrigem, moedaDestino);
            System.out.print("Digite o valor que quer converter: ");

            String moedaString = sc.nextLine().replace(",", ".");

            Double moeda = Double.parseDouble(moedaString);
            String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * currency));

            System.out.println();
            centralizarTexto("************************************ ");
            centralizarTexto(texto);
            centralizarTexto("Enter para retornar");
            centralizarTexto("************************************ ");

            sc.nextLine();
            ClearScreen.clearScreen();
            UIOp.inicio();

        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor digitado é inválido.");
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao acessar o serviço de conversão de moeda.");
            e.printStackTrace(); // Exibir mais informações sobre a exceção
        }

    }

}
