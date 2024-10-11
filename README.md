# Challenge Conversor de Moeda - Java - Back end

O Challenge Conversor de Moeda é um desafio oferecido pela Alura em parceria com a Oracle, com o objetivo de desenvolver uma aplicação Java de conversão de moedas com interação textual via console.

## Funcionalidades

O Challenge Conversor de Moeda oferece as seguintes funcionalidades:

1. Conversão de moeda de uma moeda para outra.
2. Possibilidade de escolher entre pelo menos 6 opções distintas de conversões de moedas em um menu interativo.
3. Opção adicional para escolher entre as 60 principais moedas do mundo para conversão.
4. Atualização dinâmica das taxas de conversão por meio de uma API, garantindo dados precisos e em tempo real.

## Instalação e Uso

1. Certifique-se de ter o Java instalado em sua máquina.
2. Clone este repositório para o seu computador.
3. Abra o projeto em sua IDE favorita.
4. Execute a aplicação.

## Como usar

Após executar a aplicação, você será apresentado com o seguinte menu:

![Menu](https://github.com/rafaelcardosodesouza/challengeAluraConversor/blob/main/Print%20Screen%20de%20referencia/menu.png?raw=true)

Para selecionar uma opção, basta digitar o número correspondente e pressionar Enter. Se optar pela "Outras opções", você poderá escolher entre as 60 principais moedas do mundo para a conversão.
![Menu2](https://github.com/rafaelcardosodesouza/challengeAluraConversor/blob/main/Print%20Screen%20de%20referencia/as%2060%20principais.png?raw=true)

## Tratamento de Erro

O Conversor de Moeda implementa tratamento de erro para garantir que apenas entradas válidas sejam aceitas. Isso inclui:

- Verificação para garantir que o valor inserido para a conversão seja numérico e positivo.
![erro1](https://github.com/rafaelcardosodesouza/challengeAluraConversor/blob/main/Print%20Screen%20de%20referencia/tratamento%20de%20erro%201.png?raw=true)

- Validação para garantir que a moeda inserida seja uma moeda válida e suportada pela API de conversão de moeda.
![erro2](https://github.com/rafaelcardosodesouza/challengeAluraConversor/assets/30002986/e53affcc-f289-4b63-b552-8fc4db1e35d0)


Se uma entrada inválida for detectada, a aplicação exibirá uma mensagem de erro apropriada e solicitará uma nova entrada.

## Demonstração

Assista ao vídeo de demonstração do Conversor de Moeda:

[![Vídeo de Demonstração](https://img.youtube.com/vi/Vms9boQqdqo/maxresdefault.jpg)](https://www.youtube.com/watch?v=Vms9boQqdqo](https://www.youtube.com/watch?v=Vms9boQqdqo))

## Consumindo a API

O Conversor de Moeda consome uma API externa para obter as taxas de conversão de moeda em tempo real. Para isso, utiliza a biblioteca padrão do Java `java.net.http.HttpClient` para fazer requisições HTTP à API de conversão de moeda.

A URI da API é construída dinamicamente de acordo com as moedas de origem e destino selecionadas pelo usuário. Após fazer a requisição, o JSON de resposta é parseado utilizando a biblioteca Gson para extrair o campo "conversion_rate", que representa a taxa de conversão entre as duas moedas especificadas.

O valor da conversão é então calculado multiplicando-se a quantidade da moeda de origem pelo valor da taxa de conversão.


## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
