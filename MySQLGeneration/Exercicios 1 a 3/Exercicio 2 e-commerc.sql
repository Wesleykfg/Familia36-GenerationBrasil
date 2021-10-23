-- criando o banco de dados
create database e_commerce;

-- criando as tabelas
use e_commerce;
create table tb_produtos(
	id bigint(5) auto_increment,
    nome varchar(300) not null,
    cor varchar(300) not null,
    estado varchar (300) not null,
    tipo varchar (300) not null,
    tamanho varchar (300) not null,
    tempogarantiaano int (10),
    ano int (10),
    valor decimal(10,2),
    primary key (id)
);

-- populando a tabela
insert into tb_produtos(nome, cor, estado, tipo, tamanho, tempogarantiaano, ano, valor) values ("ZenFone 5Z", "Preto", "Usado", "Eletronicos", "Pequeno", 2, 2018, 2000.00);
insert into tb_produtos(nome, cor, estado, tipo, tamanho, tempogarantiaano, ano, valor) values ("Sapato Social", "Preto", "Novo", "Calçados", "Pequeno", 0, 2018, 250.00);
insert into tb_produtos(nome, cor, estado, tipo, tamanho, tempogarantiaano, ano, valor) values ("Calça Jeans", "Branco", "Usado", "Roupas", "M 38", 0, 2009, 50);
insert into tb_produtos(nome, cor, estado, tipo, tamanho, tempogarantiaano, ano, valor) values ("Xbox One", "Preto", "Novo", "Eletronicos", "Grande", 2, 2017, 3000.00);
insert into tb_produtos(nome, cor, estado, tipo, tamanho, tempogarantiaano, ano, valor) values ("Laptop Windows 10", "Preto", "Novo", "Eletronicos", "Grande", 2, 2016, 2500.00);
insert into tb_produtos(nome, cor, estado, tipo, tamanho, tempogarantiaano, ano, valor) values ("Como Os Incriveis", "Vermelho e Amarelo", "Novo", "Copo", "Grande", 1, 2021, 30);
insert into tb_produtos(nome, cor, estado, tipo, tamanho, tempogarantiaano, ano, valor) values ("Como Vida de Inseto", "Verde e Marrom", "Novo", "Copo", "Grande", 1, 2021, 30);
insert into tb_produtos(nome, cor, estado, tipo, tamanho, tempogarantiaano, ano, valor) values ("Bola de Vôlei", "Branco e Vermelho", "Novo", "Bola", "Grande", 0, 2021, 70);

select *from tb_produtos;

-- comando select valor do produto mair que 500
select * from tb_produtos where valor > 500;

-- comando select valor do produto menor que 500
select * from tb_produtos where valor < 500;

-- Atualização de dado
update tb_produtos set valor = 1500.00
where id = 3;

-- visualizar tabela
select * from tb_produtos