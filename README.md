# Jogo de Sobrevivência - Versão Java

## Como compilar e rodar

1. Certifique-se de ter o Java (JDK 8 ou superior) instalado.
2. Compile os arquivos:
   ```
   javac -d bin src/controle/Controle.java
   ```
3. Execute o jogo:
   ```
   java -cp bin controle.Controle
   ```

## Estrutura do projeto

- `src/controle/Controle.java` - Classe principal do jogo
- `src/player/Sobrevivente.java` - Classe do jogador
- `src/enemy/Infectado.java` - Classe base dos inimigos
- `src/enemy/Corredor.java`, `src/enemy/Estalador.java`, `src/enemy/Baiacu.java` - Inimigos específicos 