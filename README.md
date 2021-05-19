<h2>Projeto entrevista de emprego</h2>



<h3> Desafio</h3>

Criar um aplicativo que acessa a API do site Imgur, selecione apenas imagens de gatos e as exiba (em uma única tela). 



<h3>Como o aplicativo ficou </h3>



<img src="imgGithub/img1.jpg">



<img src="imgGithub/img2.jpg">



<img src="imgGithub/img3.jpg">



<img src="imgGithub/img4.jpg">



<h3>Detalhes sobre o processo </h3>

Como na teoria iria ter que exibir várias imagens vindas do site, decidi utilizar o RecyclerView, por conta de desempenho, contudo, obtive algumas falhas na hora de compilar, atualizei minha IDE e recebi o erro APPT neste novo projeto e em outros antigos. A IDE não estava conseguindo acessar um arquivo nomeado de R na pasta debug, para corrigir isto, entrei nessa pasta e vi que ela estava vazia, então criei um arquivo do tipo txt com o nome de R. Após isto recebi outro erro...
Descobri que meu antivírus estava causando este problema, logo, o desativei.

Seguindo a orientação da documentação da API do site, vi que eles utilizavam uma biblioteca nomeada de moshi, também recebi erro na sua importação e por consequência, na tentativa de utilizar suas ferramentas.

"Disable Gradle Offline mode", este foi outro erro que recebi, parece que o Gradle não estava conseguindo sincronizar com as dependências/importações.

Pesquisei sobre estes erros e procurei outras formas de consumir a API deste site, mas também não deu certo, até o momento.

Com isso, decidi comentar a parte que estava dando erro no código, criar uma galeria com 50 fotos de gatos deste site (consegui através da API e do próprio site) e utilizar o RecyclerView para exibir elas.

Dessa forma, falhei na etapa de consumir a API, pretendo tentar mais para superar este desafio e melhorar como programador. 