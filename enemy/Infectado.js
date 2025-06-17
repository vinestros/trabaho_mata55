class Infectado {
  tipo;
  pontos_de_vida;
  agilidade;
  percepcao;

  constructor(tipo, pontos_de_vida, agilidade, percepcao) {
    this.tipo = tipo 
    this.pontos_de_vida = pontos_de_vida
    this.agilidade = agilidade
    this.percepcao = percepcao
  }

  // modoAlertaOn() {
  //   this.percepcao = this.percepcao + 3
  // }

  // modoAlertaOff() {
  //   this.percepcao = this.percepcao - 3
  // }

  // metodo3() {
  // }
}


module.exports = Infectado;