# exampleapp
Projeto pertinente ao processo seletivo Accenture

# Tecnologias
Selenium;

Java;

Cucumber;

jUnit

# Justificativa

Apesar de ter sido solicitado somente a execução do Cenário Principal, deixei features disponíveis para execução individual de cenários referentes às abas. Prevendo uma situação aonde não fosse necessário a execução de todo o fluxo da funcionalidade.

A feature que corresponde à validção do fluxo principal se encontra em "src/main/resources/features/validateInsuranceQuote.feature"

### Pré-requisitos

Maven: https://maven.apache.org/download.cgi;

ChromeDriver (de acordo com a versão do chorme instalada em sua máquina): https://chromedriver.chromium.org/downloads

### Como executar
 1 - Aponte o chorme driver no path do seu S.O;
 
 2 - Execute o comando mvn-install na raiz do projeto;
 
 3 - Caso queira rodar os testes com o jUnit, execute através das Runners disponíveis em: src/main/java/runners;
 
 4 - Caso queira rodar os teste através do cucumber, execute as features disponíveis em: src/main/resources/features.
