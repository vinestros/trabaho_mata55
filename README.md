# 🧟 Survival Game - Jogo de Sobrevivência

## 📖 Descrição

Um jogo de sobrevivência baseado em texto onde você assume o papel de um sobrevivente preso em um depósito abandonado. Seu objetivo é escapar vivo enfrentando ou evitando 3 tipos diferentes de infectados que bloqueiam seu caminho para a saída.

## 🎮 Como Jogar

### Início do Jogo
1. **Digite seu nome** para criar seu personagem
2. **Distribua 20 pontos de habilidade** entre três atributos:
   - **AGILIDADE**: Determina sua velocidade para fugir dos infectados
   - **FORÇA**: Determina sua capacidade de atacar e derrotar infectados
   - **FURTIVIDADE**: Determina sua capacidade de passar despercebido

### Explorando o Ambiente
- Você pode escolher **vasculhar o ambiente** antes de iniciar
- **50% de chance** de encontrar uma arma:
  - **70% de chance**: Faca (+3 de força)
  - **30% de chance**: Pistola (+6 de força)
- **50% de chance** de não encontrar nada
- Se furtividade < 3: Falha automática

### Enfrentando os Infectados
Você encontrará **3 tipos de infectados** em sequência:

#### 🏃 **Corredor**
- **Especialidade**: Alta agilidade
- **Atributos**: Força: 0, Agilidade: 10, Percepção: 7
- **Características**: Rápido e ágil, mas fraco fisicamente

#### 🔊 **Estalador**  
- **Especialidade**: Alta percepção
- **Atributos**: Força: 6, Agilidade: 6, Percepção: 10
- **Características**: Equilibrado, mas muito perceptivo

#### 💪 **Baiacu**
- **Especialidade**: Alta força
- **Atributos**: Força: 10, Agilidade: 2, Percepção: 4
- **Características**: Muito forte, mas lento

### Ações Disponíveis
Para cada infectado, você pode escolher uma das seguintes ações:

#### 1. **ATACAR**
- Usa seu atributo de **FORÇA**
- Com arma equipada: Chance de fracasso reduzida significativamente
- Sem arma: Chance de sucesso baseada na diferença entre sua força e a do infectado

#### 2. **CORRER**
- Usa seu atributo de **AGILIDADE**
- Chance de sucesso baseada na diferença entre sua agilidade e a do infectado
- Se agilidade = 0: Falha automática

#### 3. **PASSAR FURTIVAMENTE**
- Usa seu atributo de **FURTIVIDADE**
- Chance de sucesso baseada na diferença entre sua furtividade e a percepção do infectado
- Se furtividade = 0: Falha automática

## 🎯 Condições de Vitória e Derrota

### ✅ **Vitória**
- Sobreviver aos **3 infectados** consecutivos
- Chegar vivo na saída do depósito

### ❌ **Derrota**
- Seus pontos de vida chegarem a **0**
- Falhar em qualquer ação contra os infectados
