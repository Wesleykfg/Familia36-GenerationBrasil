-- criando o banco de dados --
create database db_cidade_das_frutas;

-- Criando Tabelas --
use db_cidade_das_frutas;
create table tb_categoria (
	id bigint(5) auto_increment,
    semente varchar (300) not null,
    citrica boolean not null,
    cor varchar (300) not null,
     primary key (id)
);


create table tb_produto (
	id bigint(5) auto_increment,
	nome varchar (300) not null,
    preco decimal(10,2) not null,
    madura boolean not null,
    em_promocao boolean not null,
    em_estoque boolean not null,
    temporada boolean not null,
    categoria_id bigint,
    primary key (id),
    foreign KEY (categoria_id) REFERENCES tb_categoria (id)
);

-- Criando as Categorias --
insert into tb_categoria(semente, citrica, cor) values ("Pequena", true, "verde");
insert into tb_categoria(semente, citrica, cor) values ("Pequena", false, "vermelha");
insert into tb_categoria(semente, citrica, cor) values ("grande", false, "verde");
insert into tb_categoria(semente, citrica, cor) values ("Pequena", false, "laranja");
insert into tb_categoria(semente, citrica, cor) values ("Pequena", false, "amarela");

-- Criando as Frutas  --
insert into tb_produto(nome, preco, madura, em_promocao, em_estoque, temporada, categoria_id)
values ("Maça Verde", 02.50, false, false, true, true, 2);
insert into tb_produto(nome, preco, madura, em_promocao, em_estoque, temporada, categoria_id)
values ("Limão", 03.00, false, false, true, true, 1);
insert into tb_produto(nome, preco, madura, em_promocao, em_estoque, temporada, categoria_id)
values ("Melancia", 11.99, false, false, true, true, 2);
insert into tb_produto(nome, preco, madura, em_promocao, em_estoque, temporada, categoria_id)
values ("Abacate", 05.50, false, false, true, true, 3);
insert into tb_produto(nome, preco, madura, em_promocao, em_estoque, temporada, categoria_id)
values ("Laranja", 02.50, false, false, true, true, 4);
insert into tb_produto(nome, preco, madura, em_promocao, em_estoque, temporada, categoria_id)
values ("Maracuja", 07.00, false, false, true, true, 5);
insert into tb_produto(nome, preco, madura, em_promocao, em_estoque, temporada, categoria_id)
values ("Maça", 01.50, true, true, true, true, 2);
insert into tb_produto(nome, preco, madura, em_promocao, em_estoque, temporada, categoria_id)
values ("Mexerica", 01.50, true, true, true, true, 4);

-- comando select produto com valor maior que 50 --
select * from tb_produto where preco > 50.00;

-- comando select produto com valor entre 3 a 60 --
select * from tb_produto where preco between 03.00 AND 60.00;

-- Buscar produto com a letra C no nome --
select * from tb_produto where nome Like "%C%";

-- Inner Join --
select * from tb_produto inner join tb_categoria
on tb_produto.categoria_id = tb_categoria.id;

-- Select produto de um determinado tipo --
select tb_produto.nome, tb_produto.preco, tb_categoria.semente, tb_categoria.cor from tb_produto inner join tb_categoria 
on tb_produto.categoria_id = tb_categoria.id
where tb_categoria.id = 4;