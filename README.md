# Avaliacao_Android
<h3>O projeto é desenvolvido em Java, utilizando a plataforma Android para a criação do aplicativo.<br>
A biblioteca Room é utilizada para implementar o banco de dados local, permitindo a persistência dos dados dos carros.<br>
O RecyclerView é utilizado para exibir a lista de carros de forma eficiente e com bom desempenho.<br>
O aplicativo faz uso de recursos do Material Design, incluindo botões flutuantes e ícones de acordo com as diretrizes do Material Design.</h3>
<h2>Estrutura do Projeto:</h2>



<strong>Controllers:</strong><br> Os controladores ou activities são responsáveis por gerenciar a lógica do aplicativo e interagir com a interface do usuário. Eles recebem as interações do usuário e enviam solicitações para os modelos e o banco de dados.<br>

<strong>Models:</strong><br> Os modelos representam a estrutura dos dados do aplicativo. No projeto, a classe Carro é um exemplo de modelo, que possui atributos como marca, modelo, combustível e ano.<br>

<strong>Database:</strong><br> A implementação do banco de dados é feita utilizando a biblioteca Room, que fornece abstrações para o SQLite no Android. A classe CarrosDB é a classe de banco de dados que estende a RoomDatabase e possui a instância do DAO (CarroDAO) para acessar e executar as operações do banco de dados.<br>

<strong>Layout:</strong><br> Os arquivos XML são utilizados para definir a interface do usuário em todas as telas do aplicativo, incluindo a lista de carros, o formulário de cadastro/edição e a tela de detalhes.<br>

As ações no projeto são realizadas através das interações do usuário com a interface do usuário, que por sua vez, são gerenciadas pelos controladores. Os controladores interagem com os modelos para manipulação dos dados e com o banco de dados para persistência dos dados. O layout é responsável por exibir as informações e permitir as interações do usuário.<br>

Este é um resumo geral das funcionalidades, tecnologias e estrutura do projeto apresentado, com ênfase na organização por layout, controllers, models e database. É importante notar que o projeto segue boas práticas de desenvolvimento Android e utiliza as principais tecnologias para proporcionar uma experiência de gerenciamento de carros eficiente e agradável para o usuário.
