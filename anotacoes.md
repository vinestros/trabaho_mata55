-------------------------------------------------------------------------------
Use sua criatividade para fazer um jogo no terminal.

Requisitos:
  - Básico:
    - Use readline sync para ler o Input do usuário
    - Crie uma classe controladora para rodar o jogo.
    - Utilize modificadores de público, privado e estático para alterar a visibilidade dentro das classes
    - Acessos e Modificações devem ser feitos com getters e setters
    - Trate corretamente os erros

  - Mínimo de Classes:
    - Jogador/Usuário
      - Mínimo 3 atributos e 3 métodos (exemplos: atacar, defender…)
    - Itens (Caso tenha)
      - Mínimo 1 atributo e 1 método (exemplos: usar, descartar…)
    - Mínimo de 3 tipos de Inimigos
      - Mínimo 3 atributos e 3 métodos cada (exemplos: atacar, defender…)
      - Utilize Herança e Polimorfismo para fazer os inimigos

-------------------------------------------------------------------------------


BAREMA:
  - Tratamento de erros (1.0)
  - Criação do controlador do jogo (Classe responsável por rodar o jogo) (1.0)
  - Acessos e Modificações com getters e setters (1.0)
  - Complexidade aceitável do jogo (1.0)
    - Não deve ser muito simples, de preferência, faça um jogo que pode ser repetido infinitamente
    - Exemplos: Batalhas Pokémon 1x1, Jogo de aventura baseado em probabilidade…
  - Classes cumprindo os requisitos especificados (1.5)
  - Uso de Herança e Polimorfismo (2.0)
  - Correto uso de modificadores de visibilidade (2.5)

-------------------------------------------------------------------------------

	 

MINHA IDEIA:

Game que mistura Fallout com The Last Of Us
https://darkside.blog.br/conheca-os-6-tipos-de-zumbis-de-the-last-of-us/

O jogador é um sobrevivente de uma uma pandemia causada pelo fungo Cordyceps, que transforma humanos em criaturas violentas.
Após muitos anos, esse sobrevivente se encontra em uma situação dificil em que cada decisão poderá ter sérias consequências.




Projeto final jogo javascript Poo 
Fazer jogo de tiro em zumbi
Zumbi 1 (vida x)
Zumbi 2 (vida 2x)
Zumbi 3 (vida 3x)
Escolher arma, cada arma tem um dano e uma probabilidade de acerto
Escolher onde mirar, cada parte do corpo tem uma provavilidade de acerto e um dano no zumbi
Matou os 3? WIN

*colocar pra tocar trilha sonora the last of us no violao ao final do jogo.

**colocar para no inicio do jogo o jogador poder distribuir pontos de habilidades (por ex. 20 pontos para serem adicionados a: vida, agilidade, força, furtividade)

***basear as probabilidades de acerto de acordo com os pontos em cada habilidade. 
****caso o usuario vença dê a ele mais pontos a serem distribuidos e permita lutar novamente.
*****fazer gets e sets
******fazer tratamento de erros
*******usar polimorfismo em método do infectado 'reagir()'
********utilizar os modificadores de visibilidade


------------------------------------------------------------------------------------

PROBABILIDADE :


Para implementar probabilidade em JavaScript, você pode usar um valor aleatório gerado por Math.random(), que gera números entre 0 e 1. Para simular uma chance de 90%, você verificaria se o número gerado é menor ou igual a 0.9.

Aqui está um exemplo de como você pode fazer isso:

javascript
Copiar código
let chance = 9;

function acertarAlvo() {
    // Gera um número aleatório entre 0 e 1
    let probabilidade = Math.random();
    
    // Verifica se o número é menor ou igual a 0.9 (90% de chance)
    if (probabilidade <= chance / 10) {
        // Se acertar, altera a cor do alvo para vermelho
        document.getElementById("alvo").style.backgroundColor = "red";
        console.log("Alvo acertado!");
    } else {
        console.log("Errou o alvo.");
    }
}

// Exemplo de uso
acertarAlvo();
Explicação:
Math.random() retorna um número decimal entre 0 e 1.
A condição probabilidade <= chance / 10 verifica se o número aleatório está dentro dos 90% de chance.
Se estiver, o alvo fica vermelho (modifique o estilo de um elemento DOM, neste caso com id="alvo").
Esse código pode ser ajustado para suas necessidades.


***Colocar um pequeno timer na realização dos resultados das ações do Game
***No game: colocar um "Para saber mais sobre as habilidades digite: "Saber mais" e explicar sobre elas