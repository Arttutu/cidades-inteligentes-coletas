![Fiap-logo-novo](https://github.com/user-attachments/assets/5cb57ae5-d452-413d-8f68-10bd93c12a50)
# Coleta Inteligente de Lixo - Coletas

## **DESCRIÇÃO:**

Esse projeto tem como objetivo colocar em práticas habilidades aprendida durante o curso de Análise e Desenvolvimento de Sistena (FIAP), aplicando na prática  tecnologias utilizados na vida real para resolver problemas urbanos de coleta de resíduos nas lixeiras das cidades

## **TECNOLOGIAS UTILIZADAS:**

* **Back-end:** Spring Boot, Java, Docker, API

## **FUNCIONALIDADES PENSADAS:**

* **Coleta de dados:** Recebe dados de sensores instalados em lixeiras e veículos de coleta.
* **Geração de rotas:** Cria rotas otimizadas para os caminhões de coleta, considerando a capacidade dos veículos, a localização das lixeiras e o nível de enchimento.
* **Monitoramento em tempo real:** Permite acompanhar a localização dos veículos e o status da coleta.
* **Relatórios:** Gera relatórios sobre o desempenho da coleta e a utilização dos recursos.

## **INTERAÇÕES:**

A interação com o sistema ocorre exclusivamente apenas com o back-end, onde podemos fazer requisições e pegar as respostas.

* **Criar Coleta:** Inserir uma coleta nova de  resíduo.
* **Atualizar a coleta:** Atualizar uma coleta.
* **Buscar Coleta:** Buscar coleta por ID.
* **Deletar a coleta:** Deletar coleta do sistema.

## **INSTALAÇÕES DAS FERRAMENTAS NECESSÁRIAS:**

- [Java](https://www.java.com/pt-BR/download/manual.jsp)
- [JDK](https://www.oracle.com/br/java/technologies/downloads/)
- [SpringBoot](https://spring.io/why-spring)
- [Docker](https://www.docker.com/)
- [Postman](https://www.postman.com/)
- [Apache Maven](https://maven.apache.org/install.html)
- IDE de sua prefência

## **COMO COMEÇAR ?:**

**Primerio faça o clone do projeto**

git clone: https://github.com/Arttutu/cidades-inteligentes-coletas.git

**Instale as dependências**

  cd cidades-inteligentes-coletas
  
  mvn clean install

**Construa a imagem Docker**
docker build -t coleta-inteligente

**Executa o container**

docker run -p 8080:8080 coleta-inteligente

**Inicie o Postman: Abra o aplicativo Postman**

- Crie uma nova requisição: Clique em "New" e escolha "Request".
- Configure a requisição:
- Método: Selecione o método HTTP adequado (GET, POST, PUT, DELETE).
- URL: Informe a URL completa da API, por exemplo: http://localhost:8080/api/coletas
- Headers: Adicione os headers necessários (se houver).
- Body: Inclua o corpo da requisição no formato JSON para métodos POST, PUT e DELETE.

  #### PRONTO VOCÊ RECEBERÁ O RETORNO DO BODY DA API


### **CONTRIBUIÇÕES:**

Arthur Gomes dos Santos,
Yuri Klizas Gomes,
Marcus Vinicius Amaral Ferreira Matos
