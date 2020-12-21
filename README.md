# exampleapp
Projeto pertinente ao processo seletivo Accenture

# Tecnologias
Sellenium;

Java;

Cucumber;

jUnit

# Tecnologias

Apesar ter sido solicitado somente a execução do Cenário Principal, deixei features disponíveis para execução de cenários respectivos às 
abas individualmente.

A feature que corresponde à validção do fluxo principal se encontra em "src/main/resources/features/validateInsuranceQuote.feature"

### Pré-requisitos

Maven: https://maven.apache.org/download.cgi;
ChromeDriver (de acordo com a versão do chorme instalada em sua máquina): https://chromedriver.chromium.org/downloads

### Como executar
 1 - Aponte o chorme driver no path do seu S.O;
 
 2 - Execute o comando mvn-install na raiz do projeto;
 
 3 - Caso queira rodar os testes com o jUnit, execute através das Runners(src/main/java/runners);
 
 4 - Caso queira rodar através das features do cucumber, execute as features(src/main/resources/features).
