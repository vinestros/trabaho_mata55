const readline = require("readline-sync");
const Sobrevivente = require("./player/Sobrevivente.js");
const Infectado = require("./enemy/Infectado.js");
const Corredor = require("./enemy/Corredor.js");
const Estalador = require("./enemy/Estalador.js");
const Baiacu = require("./enemy/Baiacu.js");
const Arma = require("./weapon/Arma.js");

// const audio = new Audio('audio.mp3');
// audio.play();

// console.log("MENU:")
// const comando = readline.questionInt('Digite 1 para INICIAR ou 2 caso queira saber mais sobre o funcionamento do jogo ou 3 caso queira SAIR.')
// ----------- fazer while enquanto nao for nem 1 nem 2 nem 3: dar comando inválido. 1 continua e 2 mostra as instruções e pergunta (se 1 iniciar ou 3 sair)
// if (comando == 2) {
//   // console.log(`INSTRUÇÕES BÁSICAS SOBRE O FUNCIONAMENTO DO JOGO:
// Procurar sempre possui um risco (mesmo que pequeno)
//   //   `)
// } else {
//   console.log('Comando inválido')
// }

// fazer seção oculta com segredos do jogo por ex. furtividade = 0 igual a morte no inicio;

const corredor1 = new Corredor()
const estalador1 = new Estalador()
const baiacu1 = new Baiacu()
const infectadosNoJogo = [corredor1, estalador1, baiacu1]
let msgAcao1 = 'Digite 1 para AVANÇAR em direção a saída ou 2 para PROCURAR por itens.'
let msgAcao2 = 'Digite 1 para ATACAR, 2 para CORRER ou 3 para PASSAR FURTIVAMENTE.'


console.log()
const nomeSobrevivente = readline.question('Digite seu nome: ')

console.log(`
Olá, ${nomeSobrevivente}! 
Você agora é um sobrevivente preso dentro de um velho depósito com ${infectadosNoJogo.length} infectados no seu caminho para a saída.`)
console.log(`
Você possui 20 pontos de habilidades para distribuir entre os atributos: AGILIDADE, FORÇA e FURTIVIDADE. 
Escolha bem, pois não terá como refazer essa distribuição. 
Atente-se em não digitar uma soma total maior do que 20 pontos.
`)
console.log('Digite o número de pontos em AGILIDADE: ')
const agilidade = readline.questionInt()
console.log('Digite o número de pontos em FORÇA: ')
const forca = readline.questionInt()
console.log('Digite o número de pontos em FURTIVIDADE: ')
const futividade = readline.questionInt()

const sobrevivente = new Sobrevivente(nomeSobrevivente, agilidade, forca, futividade)
console.log()
// console.log('O que fazer em seguida?')
// console.log()
// console.log(msgAcao1)
// let acao = readline.questionInt()
// while (true) {
//   if (acao === 1) {
//     sobrevivente.avancar();
//     break;
//   } else if (acao === 2) {
//     sobrevivente.procurar();
//     break;
//   } else {
//     console.log(`Comando inválido. ${msgAcao1}`);
//     acao = readline.questionInt();
//   }
// }


while (sobrevivente.pontos_de_vida > 0) {
  console.log();


  if (sobrevivente.pontos_de_vida === 0) {
    console.log('Você morreu! FIM DE JOGO');
    break;
  }
  console.log('Você se aproximou de um infectado Corredor... o que você vai fazer?');
  console.log();
  console.log(msgAcao2);
  let acao = readline.questionInt();
  while (true) {
    if (acao === 1) {
      sobrevivente.atacar(corredor1);
      break;
    } else if (acao === 2) {
      sobrevivente.correr(corredor1);
      break;
    } else if (acao === 3) {
      sobrevivente.passarFurtivimente(corredor1);
      break;
    } else {
      console.log(`Comando inválido. ${msgAcao2}`);
      acao = readline.questionInt();
    }
  }
  console.log();


  if (sobrevivente.pontos_de_vida === 0) {
    console.log('Você morreu! FIM DE JOGO');
    console.log();
    break;
  }
  console.log('Você se aproximou de um infectado Estalador... o que você vai fazer?');
  console.log();
  console.log(msgAcao2);
  acao = readline.questionInt();
  while (true) {
    if (acao === 1) {
      sobrevivente.atacar(estalador1);
      break;
    } else if (acao === 2) {
      sobrevivente.correr(estalador1);
      break;
    } else if (acao === 3) {
      sobrevivente.passarFurtivimente(estalador1);
      break;
    } else {
      console.log(`Comando inválido. ${msgAcao2}`);
      acao = readline.questionInt();
    }
  }

  console.log();


  if (sobrevivente.pontos_de_vida === 0) {
    console.log('Você morreu! FIM DE JOGO');
    console.log();
    break;
  }
  console.log('Você se aproximou de um infectado Baiacu... o que você vai fazer?');
  console.log();
  console.log(msgAcao2);
  acao = readline.questionInt();
  while (true) {
    if (acao === 1) {
      sobrevivente.atacar(baiacu1);
      break;
    } else if (acao === 2) {
      sobrevivente.correr(baiacu1);
      break;
    } else if (acao === 3) {
      sobrevivente.passarFurtivimente(baiacu1);
      break;
    } else {
      console.log(`Comando inválido. ${msgAcao2}`);
      acao = readline.questionInt();
    }
  }

  if (sobrevivente.pontos_de_vida === 0) {
    console.log('Você morreu! FIM DE JOGO');
    console.log()
    break;
  } else {
    console.log()
    console.log('Ufa... Você conseguiu chegar vivo na saída! PARABÉNS!')
    console.log()
    console.log('FIM DE JOGO!')
    console.log()
    break;
  }
}