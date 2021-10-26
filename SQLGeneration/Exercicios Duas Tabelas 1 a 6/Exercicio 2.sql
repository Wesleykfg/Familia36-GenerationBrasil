-- criando o banco de dados --
create database db_pizzaria_legal;

-- Criando Tabelas --
use db_pizzaria_legal;
create table tb_categoria (
	id bigint(5) auto_increment,
    tipo varchar (300) not null,
    tempo_de_preparo_em_minutos int not null,
    acompanhamento boolean not null,
     primary key (id)
);


create table tb_pizza (
	id bigint(5) auto_increment,
	nome varchar (300) not null,
    preco decimal(10,2) not null,
    tamanho varchar (300) not null,
    em_promocao boolean not null,
    em_estoque boolean not null,
    categoria_id bigint,
    primary key (id),
    foreign KEY (categoria_id) REFERENCES tb_categoria (id)
);

-- Criando as Categorias --
insert into tb_categoria(tipo, tempo_de_preparo_em_minutos, acompanhamento) values ("Doce", "40", true);
insert into tb_categoria(tipo, tempo_de_preparo_em_minutos, acompanhamento) values ("Salgada", "30", true);
insert into tb_categoria(tipo, tempo_de_preparo_em_minutos, acompanhamento) values ("Mista", "50", false);
insert into tb_categoria(tipo, tempo_de_preparo_em_minutos, acompanhamento) values ("Vegana", "60", false);
insert into tb_categoria(tipo, tempo_de_preparo_em_minutos, acompanhamento) values ("Vegetariana", "50", false);

-- Criando as Pizzas  --
insert into tb_pizza(nome, preco, tamanho, em_promocao, em_estoque, categoria_id)
values ("Calabresa", 24.99, "Grande", true, true, 2);
insert into tb_pizza(nome, preco, tamanho, em_promocao, em_estoque, categoria_id)
values ("Muçarela", 24.99, "Grande", true, true, 2);
insert into tb_pizza(nome, preco, tamanho, em_promocao, em_estoque, categoria_id)
values ("Chocolate", 29.99, "Grande", false, true, 1);
insert into tb_pizza(nome, preco, tamanho, em_promocao, em_estoque, categoria_id)
values ("Meio a Meio", 45.99, "Mediano", false, true, 3);
insert into tb_pizza(nome, preco, tamanho, em_promocao, em_estoque, categoria_id)
values ("Veg Pizza", 35.99, "Mediano", false, true, 4);
insert into tb_pizza(nome, preco, tamanho, em_promocao, em_estoque, categoria_id)
values ("vegi Pizza", 32.99, "Mediano", false, true, 5);
insert into tb_pizza(nome, preco, tamanho, em_promocao, em_estoque, categoria_id)
values ("Quatro Queijos", 27.99, "Mediano", true, false, 2);
insert into tb_pizza(nome, preco, tamanho, em_promocao, em_estoque, categoria_id)
values ("Pizza Gelada", 50.00, "Pequeno", true, true, 3);

-- comando select produto com valor maior que 45 --
select * from tb_pizza where preco > 45.00;

-- comando select produto com valor entre 29 a 60 --
select * from tb_pizza where preco between 29.00 AND 60.00;

-- Buscar pizza com a letra C no nome --
select * from tb_pizza where nome Like "%C%";

-- Inner Join --
select tb_pizza.nome, tb_pizza.preco, tb_pizza.em_estoque, tb_categoria.tipo as tipo_da_categoria, tb_categoria.tempo_de_preparo_em_minutos as tempo_de_preparo_em_minutos
 from tb_pizza inner join tb_categoria on  tb_categoria.id = tb_pizza.categoria_id;

-- Select pizzas de um determinado tipo --
select tb_pizza.nome, tb_categoria.tipo from tb_pizza inner join tb_categoria 
on tb_pizza.categoria_id = tb_categoria.id
where tb_categoria.id = 2;