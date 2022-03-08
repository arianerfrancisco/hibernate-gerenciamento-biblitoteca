# Objetivo do Projeto ⛏

<h1> Criar um sistema de gerenciamento de empréstimo de livros. </h1> 

![diagrama](https://user-images.githubusercontent.com/72419533/157234661-4212e969-6442-4eca-b8a2-683111879dfb.PNG)

<h2> No diagrama tem-se as quatros entidades que serão trabalhadas no projeto. </h2> 

✔ Pelas associações, nota-se: 

- Um livro pode ter apenas uma editora e ela vários livros, o que corresponde uma relação de muitos para muitos.
- Um cliente pode emprestar vários livros e o livro pode ser emprestado por vários cliente, o que corresponde uma relação de muitos para muitos.Nota: nesse tipo de associação é necessário uma tabela auxiliar, que neste projeto será chamado de empréstimo, para esta tabela não é necessário criar uma outra classe que represente uma entidade.
- Um RG é associado apenas a um cliente e este a apenas um RG, o que corresponde uma relação de um para um.

<h2> Repositório criado para fins de estudo 📓 </h2>
