-- criando o banco de dados --
create database db_farmacia_do_bem;

-- Criando Tabelas --
use db_farmacia_do_bem;
create table tb_categoria (
	id bigint(5) auto_increment,
    tipo varchar (300) not null,
    somente_com_receita boolean not null,
    idade varchar (300) not null,
     primary key (id)
);


create table tb_produto (
	id bigint(5) auto_increment,
	nome varchar (300) not null,
    preco decimal(10,2) not null,
    entrega_em_casa boolean not null,
    em_promocao boolean not null,
    em_estoque boolean not null,
    categoria_id bigint,
    primary key (id),
    foreign KEY (categoria_id) REFERENCES tb_categoria (id)
);

-- Criando as Categorias --
insert into tb_categoria(tipo, somente_com_receita, idade) values ("Medicamento", true, "Adulto");
insert into tb_categoria(tipo, somente_com_receita, idade) values ("Medicamento", true, "Infantil");
insert into tb_categoria(tipo, somente_com_receita, idade) values ("Cosmetico", true, "Adulto");
insert into tb_categoria(tipo, somente_com_receita, idade) values ("Cosmetico", true, "Infantil");
insert into tb_categoria(tipo, somente_com_receita, idade) values ("Higiene", true, "Adulto");

-- Criando os Produtos  --
insert into tb_produto(nome, preco, entrega_em_casa, em_promocao, em_estoque, categoria_id)
values ("Batom Vermelho", 24.99, false, true, true, 3);
insert into tb_produto(nome, preco, entrega_em_casa, em_promocao, em_estoque, categoria_id)
values ("Dipirona", 05.50, true, false, true, 1);
insert into tb_produto(nome, preco, entrega_em_casa, em_promocao, em_estoque, categoria_id)
values ("Shampoo", 20.99, true, false, true, 4);
insert into tb_produto(nome, preco, entrega_em_casa, em_promocao, em_estoque, categoria_id)
values ("Creme de Barbear", 23.99, false, false, true, 3);
insert into tb_produto(nome, preco, entrega_em_casa, em_promocao, em_estoque, categoria_id)
values ("Xarope", 07.50, false, false, true, 2);
insert into tb_produto(nome, preco, entrega_em_casa, em_promocao, em_estoque, categoria_id)
values ("Lenço Umedecido", 14.00, true, false, true, 5);
insert into tb_produto(nome, preco, entrega_em_casa, em_promocao, em_estoque, categoria_id)
values ("Lâmina de Barbear", 22.99, true, true, true, 3);
insert into tb_produto(nome, preco, entrega_em_casa, em_promocao, em_estoque, categoria_id)
values ("Desodorante", 24.99, true, false, true, 5);

-- comando select produto com valor maior que 50 --
select * from tb_produto where preco > 50.00;

-- comando select produto com valor entre 3 a 60 --
select * from tb_produto where preco between 03.00 AND 60.00;

-- Buscar produto com a letra B no nome --
select * from tb_produto where nome Like "%B%";

-- Inner Join --
select * from tb_produto inner join tb_categoria
on tb_produto.categoria_id = tb_categoria.id;

-- Select produto de um determinado tipo --
select tb_produto.nome, tb_categoria.tipo from tb_produto inner join tb_categoria 
on tb_produto.categoria_id = tb_categoria.id
where tb_categoria.id = 1;