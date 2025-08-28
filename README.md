## 🎬 Aplicativo de Busca de Filmes
Este é um aplicativo Java simples para buscar informações de filmes usando a API do OMDB (Open Movie Database). O programa permite que o usuário digite o nome de um filme, busca os dados da API e salva a lista de títulos pesquisados em um arquivo JSON local.

## 🚀 Funcionalidades
Busca Interativa: Permite buscar vários filmes em uma única execução.

Integração com API: Conecta-se à API do OMDB para obter dados de filmes em tempo real.

Serialização de Dados: Utiliza a biblioteca Gson para converter os dados JSON da API em objetos Java.

Persistência de Dados: Salva os filmes pesquisados em um arquivo filmes.json para uso posterior.

## 🛠️ Tecnologias Utilizadas
Java 17

Maven ou Gradle (para gerenciar dependências)

Gson: Biblioteca para processamento de JSON.

## 📁 Estrutura de Arquivos

.idea/: Diretório de metadados do IntelliJ IDEA.

src/: Contém o código-fonte principal do projeto.

br/com/k/: Pacote raiz do projeto.

principal/: Contém a classe principal do aplicativo.

modelos/: Contém as classes que representam os dados de filmes (Titulo, TituloOmdb).

excecao/: Contém a classe de exceção personalizada.

.gitignore: Define os arquivos e pastas a serem ignorados pelo Git.

K.iml: Arquivo de configuração do módulo do IntelliJ IDEA.

filmes.json: Arquivo de saída gerado pelo programa, contendo a lista de filmes pesquisados.

filmes.txt: (Este arquivo pode ser removido se não for utilizado, para manter o projeto limpo).

## 📄 Como Executar
Clone este repositório para sua máquina local.

Abra o projeto em sua IDE (como IntelliJ IDEA ou Eclipse).

Execute a classe PrincipalComBuscas.java.
