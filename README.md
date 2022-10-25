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
![image](https://user-images.githubusercontent.com/58920070/197686828-f0f1d4f4-1498-4213-8ffd-3febb3add88e.png)

## 3º) Com terminal aberto na pasta do 2º passo, executar o Java Compiler da seguinte forma:
```bash
javac --module-path "MarketCodeReader > src > main > java > com > example > marketcodereader > utils > javafx-sdk-17.0.2 > lib"(sem aspas) --add-modules javafx.controls,javafx.fxml Application.java
```
### Caminho que deve ser colocado no texto dentro das aspas, no comando do 3º passo
![image](https://user-images.githubusercontent.com/58920070/197687189-a508e114-8303-4be9-bead-72a2766c1a10.png)
![image](https://user-images.githubusercontent.com/58920070/197677974-9088c46f-4947-4684-a9d8-103fcdc64383.png)

## 4º) Com terminal aberto na pasta do 2º passo, executar a aplicação:
```bash
java --module-path "MarketCodeReader > src > main > java > com > example > marketcodereader > utils > javafx-sdk-17.0.2 > lib"(sem aspas) --add-modules javafx.controls,javafx.fxml Application
```
### Caminho que deve ser colocado no texto dentro das aspas, no comando do 4º passo
![image](https://user-images.githubusercontent.com/58920070/197687334-5669e400-b69b-47f6-875f-0eef6a713272.png)
![image](https://user-images.githubusercontent.com/58920070/197677974-9088c46f-4947-4684-a9d8-103fcdc64383.png)

## 5ª) Isso tudo irá gerar um arquivo .exe dentro da pasta do programa, basta executá-lo.
![image](https://user-images.githubusercontent.com/58920070/197687412-3e349ad3-ff13-401c-979f-c3d7cba2bb14.png)


