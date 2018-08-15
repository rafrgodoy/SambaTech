# SambaTech
Processo de seleção - Analista de desenvolvimento (Qualidade e Teste)

## Definição de labels para prioridade e severidade dos bugs
Foram definidas 4 labels para classificação dos bugs quanto à sua prioridade e severidade. Tal classificação é baseada no padrão da ferramenta de monitoramento de projetos e questões (issues) JIRA da Atlassian. Os detalhes estão nas especificações das labels no GitHub.
* Blocker
* Critical
* Major
* Minor
* Trivial

Obs.: No caso das melhorias foi utilizado a label "enhancement" do próprio GitHub.

## Execução de testes manuais para identificação de bugs e melhorias
Foi definido o template do próprio GitHub para registrar bugs (traduzido). O template contém: Título e descrição do bug, passo a passo para execução do teste, comportamento esperado, screenshots, informações sobre o hardware e SO que rodaram os testes e informações adicionais (caso necessário). Para as melhorias foram utilizados 4 campos: Título e descrição, sugestão, alternativa e informações adicionais (caso necessário).

## Codificação dos testes automatizados
Para realização dos testes automatizados foi utilizado o IDE IntelliJ com a importação das bibliotecas do Selenium Webdriver. Todas as configurações necessárias foram realizadas e foi criado o projeto "TesteAuto". Utilizando o padrão de codificação "PageObject" foram criadas classes referentes às páginas principais do sistema, ou seja, a página de login e a página inicial.
Os cenários foram criados para reprodução dos bugs identificados e registrados no GitHub.
<b>Obs.: Apesar de conhecer o GitFlow e o processo de Gestão de Configuração no Git (Master, Develop, Release, Features, HotFix e etc), optei por utilizar apenas o Master para realizar os commits, devido à restrição de tempo e à simplicidade do projeto.</b>
