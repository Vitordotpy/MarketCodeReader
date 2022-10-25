# MarketCodeReader

# Como executar o projeto


## 1º) Instalar o java jdk 17.0.1 que está na pasta utils
### Se for windows, usar o executável que está no caminho: 
```bash
MarketCodeReader > src > main > java > com > example > marketcodereader > utils
```
### Se for Linux, usar o comando para instalar a versão 17:
```bash
sudo apt install openjdk-17-jdk-headless
```
## 2ª) Abrir o terminal na pasta que tem o arquivo **Application.java** com caminho: 
```bash
MarketCodeReader > src > main > java > com > example > marketcodereade
```
# 3º) Com terminal aberto na pasta do 2º passo, executar o Java Compiler da seguinte forma:
```bash
javac --module-path "MarketCodeReader > src > main > java > com > example > marketcodereader > utils > javafx-sdk-17.0.2 > lib"(sem aspas) --add-modules javafx.controls,javafx.fxml Application.java
```
# 4º) Com terminal aberto na pasta do 2º passo, Executar a aplicação:
```bash
java --module-path "MarketCodeReader > src > main > java > com > example > marketcodereader > utils > javafx-sdk-17.0.2 > lib"(sem aspas) --add-modules javafx.controls,javafx.fxml Application
```
# 5ª) Isso tudo irá gerar um arquivo .exe dentro da pasta do programa, basta executá-lo.

