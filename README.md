# Challenge Conversor de Moeda - Java - Back End

## Autor

Desenvolvido por **Carlos Alexandre**, como parte do programa de formação Next One Education  **Oracle**  em parceria com a **Alura**.

---

O **Challenge Conversor de Moeda** é um desafio oferecido pela **Alura** em parceria com a **Oracle**, com o objetivo de desenvolver uma aplicação Java de conversão de moedas com interação textual via console.

## Funcionalidades

O Conversor de Moeda oferece as seguintes funcionalidades:

1. **Conversão de Moeda:** Permite converter valores de uma moeda para outra.
2. **Seletor de Moeda:** Um menu interativo oferece pelo menos 6 opções distintas de conversão de moedas.
3. **Opção Expandida:** Possibilidade de escolher entre as 60 principais moedas do mundo para conversão.
4. **Atualização Dinâmica:** Integração com uma API externa para obter taxas de conversão em tempo real, garantindo dados atualizados e precisos.

## Instalação e Uso

1. Certifique-se de ter o **Java** instalado em sua máquina.
2. Clone este repositório para o seu computador:
   
   ```bash
   git clone <URL-do-repositório>
   ```
4. Abra o projeto em sua IDE favorita (como IntelliJ, Eclipse, ou NetBeans).
5. Execute a aplicação diretamente pela IDE ou pelo terminal:
   
   ```bash
   java -jar conversor-moeda.jar
   ```

## Como Usar

Após iniciar a aplicação, será exibido um menu interativo no console:


```
1. Converter de Real (BRL) para Dólar (USD)
2. Converter de Dólar (USD) para Euro (EUR)
3. ...
7. Outras opções (escolha entre as 60 principais moedas)
```

Para selecionar uma opção, digite o número correspondente e pressione **Enter**. Se optar por "Outras opções", você poderá escolher qualquer uma das 60 principais moedas para a conversão.

## Tratamento de Erros

O Conversor de Moeda implementa um tratamento de erros robusto para garantir uma experiência fluida ao usuário:

- **Entrada Numérica Válida:** O valor para conversão deve ser numérico e positivo.
- **Validação de Moedas:** A moeda inserida deve ser uma moeda válida e suportada pela API.
- Em caso de erro, uma mensagem apropriada será exibida e a aplicação solicitará nova entrada.

## Consumindo a API

A aplicação utiliza a biblioteca `java.net.http.HttpClient` para fazer requisições HTTP à API de conversão de moeda. A URI da API é gerada dinamicamente com base nas moedas de origem e destino selecionadas pelo usuário. A resposta da API, em formato JSON, é processada usando a biblioteca Gson para extrair a taxa de conversão (`conversion_rate`).

O cálculo da conversão é realizado multiplicando a quantidade inserida pela taxa de conversão obtida.

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, fique à vontade para abrir uma issue ou enviar um pull request.



