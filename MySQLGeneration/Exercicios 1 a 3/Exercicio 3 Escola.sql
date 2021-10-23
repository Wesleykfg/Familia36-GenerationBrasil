-- criando o banco de dados
create database escola;

-- criando as tabelas
use escola;
create table tb_estudantes(
	id bigint(5) auto_increment,
    nome varchar(300) not null,
    idade int (10) not null,
    nota int (10) not null,
    genero varchar (300) not null,
    sala varchar (300) not null,
    email varchar (300) not null,
    telefone int (10) not null,
    mensalidade decimal(10,2) not null,
    primary key (id)
);

-- populando a tabela

insert into tb_estudantes(nome, idade, nota, genero, sala, email, telefone, mensalidade) values ("Wesley", "17", "10", "Masculino", "3B", "wesleywesss@escola.com", 33220909, 320.00);
insert into tb_estudantes(nome, idade, nota, genero, sala, email, telefone, mensalidade) values ("Darcy", "18", "9", "Feminino", "3B", "darcydars@escola.com", 22345677, 320.00);
insert into tb_estudantes(nome, idade, nota, genero, sala, email, telefone, mensalidade) values ("Maiury", "17", "8", "Feminino", "3A", "maiurymai@escola.com", 99787879, 300.00);
insert into tb_estudantes(nome, idade, nota, genero, sala, email, telefone, mensalidade) values ("André", "16", "7", "Masculino", "2C", "andredre@escola.com", 33220909, 320.00);
insert into tb_estudantes(nome, idade, nota, genero, sala, email, telefone, mensalidade) values ("Glauber", "15", "6", "Masculino", "1B", "glaubergla@escola.com", 25667678, 296.70);
insert into tb_estudantes(nome, idade, nota, genero, sala, email, telefone, mensalidade) values ("Felipe", "15", "6", "Masculino", "1B", "feliefe@escola.com", 988765454, 296.70);
insert into tb_estudantes(nome, idade, nota, genero, sala, email, telefone, mensalidade) values ("Lin", "17", "10", "Feminino", "3C", "linlinlin@escola.com", 988887890, 320.00);
insert into tb_estudantes(nome, idade, nota, genero, sala, email, telefone, mensalidade) values ("Safira", "16", "5", "Feminino", "2B", "safirasafi@escola.com", 34564432, 320.00);

select *from tb_estudantes;

-- comando select nota maior que 7
select * from tb_estudantes where nota > 7;

-- comando select nota menor que 7
select * from tb_estudantes where nota < 7;

-- Atualização de dado
update tb_estudantes set nota = 7
where id = 8;

-- visualizar tabela
select * from tb_estudantes