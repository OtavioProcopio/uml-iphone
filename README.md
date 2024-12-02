# 📱 iPhone UML Model

Este repositório apresenta a modelagem e implementação das funcionalidades básicas do iPhone, incluindo reprodutor musical, telefone e navegador de internet. O projeto utiliza UML para a concepção e foi implementado em Java como parte de um desafio de programação orientada a objetos.

## 🚀 Funcionalidades

- **Reprodutor Musical**: 
  - Tocar música.
  - Pausar música.
  - Avançar para a próxima faixa.
  - Retornar para a faixa anterior.

- **Telefone**: 
  - Fazer chamadas.
  - Receber chamadas.
  - Finalizar chamadas.

- **Navegador de Internet**: 
  - Abrir páginas web.
  - Realizar buscas.
  - Navegar entre páginas (avançar ou voltar).

## 🛠️ Estrutura do Projeto

O projeto é baseado em três interfaces que representam os papéis do iPhone e uma classe principal que implementa todas as interfaces.

### **Diagrama de Classes UML**
A estrutura básica segue este modelo:
+------------------+

MusicalPlayer
+ play()
+ pause()
+ nextTrack()
+ previousTrack()
+------------------+
+------------------+

Telephone
+ makeCall()
+ receiveCall()
+ endCall()
+------------------+
+------------------+

WebBrowser
+ openPage()
+ search()
+ navigate()
+------------------+
+------------------+

iPhone
Implements:
MusicalPlayer,
Telephone,
WebBrowser
+------------------+


### Arquivos do Projeto
- **`MusicalPlayer.java`**: Define a interface para as funções de reprodução musical.
- **`Telephone.java`**: Define a interface para as funções telefônicas.
- **`WebBrowser.java`**: Define a interface para as funções de navegação na internet.
- **`iPhone.java`**: Implementa todas as interfaces e contém o método principal para testes.
