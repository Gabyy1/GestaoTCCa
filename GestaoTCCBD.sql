Create DataBase GestaoTcc
Go
Use GestaoTcc

Create Table pessoa(
id INT NOT NULL,
nome VARCHAR(100) NOT NULL,
email VARCHAR(100) NOT NULL,
tel VARCHAR(11) NOT  NULL,
cpf VARCHAR(11) NOT NULL
Primary Key (id)
)

Go

Create Table professor (
numProfessor varchar(10) NOT NULL,
nome VARCHAR(100) NOT NULL,
email VARCHAR(100) NOT NULL,
tel VARCHAR(11) NOT  NULL,
cpf VARCHAR(11) NOT NULL,
idPessoa INT NOT NULL
Primary Key (numProfessor)
Foreign Key (idPessoa) references pessoa(id)
)

