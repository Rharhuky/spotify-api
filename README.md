# spotify-api

* Api feita com spring boot a fim de consumir dados da API do spotify.

### Tecnologias

* Java 17
* Spring boot 
* Spring Cloud Open Feign
* Spotify
* Lombok


* Documentação:

    * https://developer.spotify.com/documentation/web-api
    * <i> Para utilizar, é necessário ter uma conta no spotify </i>

* Obter imagem:

      docker pull rharhuky/spotify-api

* Executar imagem:

      docker run -e CLIENT_ID=your-client-id -e CLIENT_SECRET=your-client-secret -p 8080:8080 --name spotify-api-container rharhuky/spotify-api

* Endpoint:

      curl -X GET http://localhost:8080/spotify/api


* Versão 1.0
