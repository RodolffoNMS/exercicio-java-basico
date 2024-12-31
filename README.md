# 📚 Projeto de Exercícios em Java
#### Este projeto contém uma coleção de exercícios básicos em Java, organizados em classes individuais, com foco em conceitos fundamentais de programação. Ele foi desenvolvido seguindo os princípios de Clean Code para garantir legibilidade, organização e facilidade de manutenção.

### Este projeto foi criado para consolidar conceitos básicos de programação em Java, como:

#### 🔄 Estruturas de repetição;
#### ❓ Condicionais;
#### 🔢 Manipulação de strings e números;
#### 🧩 Modularização de código.
#### Cada exercício está implementado em uma classe separada, e o programa principal (Main) permite que o usuário escolha qual exercício executar por meio de um menu interativo.

### ✨ Funcionalidades
- ➕ Soma de Números: Calcula a soma de números de 1 até um número fornecido.
- ❗ Fatorial: Calcula o fatorial de um número.
- 🔢 Contagem de Dígitos: Conta o número de dígitos de um número fornecido.
- 🔍 Números Primos: Verifica se um número é primo.
- 🔄 Inversão de Número: Inverte os dígitos de um número.
- 📈 Potência: Calcula a potência de um número.
- 🔁 Palíndromo: Verifica se uma palavra é um palíndromo.
- ✖️ Múltiplos de um Número: Exibe os múltiplos de um número até um limite.
- 🔢 Conversão de Binário para Decimal: Converte um número binário para decimal.
- 📜 Série de Fibonacci: Gera a sequência de Fibonacci até um número de termos fornecido.
- ⚙️ Pré-requisitos
### Antes de executar o projeto, certifique-se de ter os seguintes itens instalados:

- ☕ Java Development Kit (JDK) - Versão 11 ou superior.
- 🖥️ IDE de sua escolha (opcional) - Recomendado: IntelliJ IDEA, Eclipse ou VS Code.
- 🛠️ Git (opcional) - Para clonar o repositório.
- 🚀 Como Executar
### Clone o repositório (se necessário):
````
git clone https://github.com/seu-usuario/projeto-exercicios-java.git
cd projeto-exercicios-java
````
### Compile o projeto:
````
javac -d bin src/**/*.java
````
### Execute o programa principal:
````
java -cp bin main.Main
````
- Siga as instruções no menu interativo para escolher o exercício que deseja executar.

### 📂 Estrutura do Projeto
- A estrutura do projeto foi organizada para facilitar a navegação e a manutenção:
````
src/
├── main/
│   └── Main.java          # Classe principal com o menu interativo
├── utils/
│   └── ScannerUtil.java   # Classe utilitária para entrada de dados
└── exercicios/
    ├── BinarioParaDecimal.java
    ├── ContagemDigitos.java
    ├── Fatorial.java
    ├── Fibonacci.java
    ├── InversaoNumero.java
    ├── Multiplos.java
    ├── NumeroPrimo.java
    ├── Palindromo.java
    ├── Potencia.java
    └── SomaNumeros.java
````
- 🛠️ Tecnologias Utilizadas
- ☕ Java 11: Linguagem de programação principal.
- ⌨️ Scanner: Para entrada de dados do usuário.
- 🛠️ Git: Controle de versão.
- 🤝 Contribuição
#### Contribuições são bem-vindas! Siga os passos abaixo para contribuir:
### Faça um fork do repositório.
- Crie uma branch para sua feature ou correção:
  ````git checkout -b minha-feature````
- Faça o commit das suas alterações:
  ````git commit -m "Adiciona minha nova feature"````
- Envie para o repositório remoto:
  ````git push origin minha-feature````
- Abra um Pull Request.
