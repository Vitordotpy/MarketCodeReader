# MarketCodeReader

# Como executar o projeto(imagens e texto)


## 1º) Necessário ter o java jdk 17.0.1 instalado na máquina
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
![image](https://user-images.githubusercontent.com/58920070/197677432-cd621815-fb70-40f7-bd89-b48c9b659b63.png)
![image](https://user-images.githubusercontent.com/58920070/197677575-1b7accbe-07f3-405a-a1cb-f3166ef0568b.png)

## 3º) Com terminal aberto na pasta do 2º passo, executar o Java Compiler da seguinte forma:
```bash
javac --module-path "MarketCodeReader > src > main > java > com > example > marketcodereader > utils > javafx-sdk-17.0.2 > lib"(sem aspas) --add-modules javafx.controls,javafx.fxml Application.java
```
### Caminho que deve ser colocado no texto dentro das aspas, no comando do 3º passo
![image](https://user-images.githubusercontent.com/58920070/197677871-32e53850-30ac-440d-a2c3-51086908e42c.png)
![image](https://user-images.githubusercontent.com/58920070/197677974-9088c46f-4947-4684-a9d8-103fcdc64383.png)

## 4º) Com terminal aberto na pasta do 2º passo, executar a aplicação:
```bash
java --module-path "MarketCodeReader > src > main > java > com > example > marketcodereader > utils > javafx-sdk-17.0.2 > lib"(sem aspas) --add-modules javafx.controls,javafx.fxml Application
```
### Caminho que deve ser colocado no texto dentro das aspas, no comando do 4º passo
![image](https://user-images.githubusercontent.com/58920070/197678454-61c59733-95b7-4cc3-a9f7-ee00118b90aa.png)
![image](https://user-images.githubusercontent.com/58920070/197677974-9088c46f-4947-4684-a9d8-103fcdc64383.png)

## 5ª) Isso tudo irá gerar um arquivo .exe dentro da pasta do programa, basta executá-lo.



