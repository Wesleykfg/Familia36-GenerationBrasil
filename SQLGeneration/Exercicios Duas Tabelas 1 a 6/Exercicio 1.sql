-- criando o banco de dados --
create database db_generation_game_online;

-- Criando Tabelas --
use db_generation_game_online;
create table tb_classe (
	id bigint(5) auto_increment,
    nome varchar (300) not null,
    equipamentos varchar (300),
    spoump varchar(300) not null,
     primary key (id)
);


create table tb_personagem (
	id bigint(5) auto_increment,
	nome varchar (300) not null,
    altura decimal(10,2) not null,
    genero varchar (300) not null,
    raca varchar (300) not null,
    deseja_a_coroa boolean not null,
    poder_de_ataque int not null,
    poder_de_defesa int not null,
    classe_id bigint,
    primary key (id),
    foreign KEY (classe_id) REFERENCES tb_classe (id)
);

-- Criando as Classes --
insert into tb_classe(nome, equipamentos, spoump) values ("Mago", "Leves", "MP");
insert into tb_classe(nome, equipamentos, spoump) values ("Guerreiro", "Pesados", "SP");
insert into tb_classe(nome, equipamentos, spoump) values ("Ladrão", "Leves", "SP");
insert into tb_classe(nome, equipamentos, spoump) values ("Clérigo", "Leves", "MP");
insert into tb_classe(nome, equipamentos, spoump) values ("Arqueiro", "mediano", "SP");

-- Criando os Personagens  --
insert into tb_personagem(nome, altura, genero, raca, deseja_a_coroa, poder_de_ataque, poder_de_defesa, classe_id)
values ("Carlos", 1.92, "Masculino", "Elfo Alto", true, 3000, 3000, 1);
insert into tb_personagem(nome, altura, genero, raca, deseja_a_coroa, poder_de_ataque, poder_de_defesa, classe_id)
values ("Valter", 1.75, "Masculino", "Elfo Negro", true, 9999, 200, 2);
insert into tb_personagem(nome, altura, genero, raca, deseja_a_coroa, poder_de_ataque, poder_de_defesa, classe_id)
values ("Paulo", 1.42, "Masculino", "Anão", true, 1500, 1000, 3);
insert into tb_personagem(nome, altura, genero, raca, deseja_a_coroa, poder_de_ataque, poder_de_defesa, classe_id)
values ("Ooooooo Ana", 1.70, "Feminino", "Nordica", true, 1700, 3000, 2);
insert into tb_personagem(nome, altura, genero, raca, deseja_a_coroa, poder_de_ataque, poder_de_defesa, classe_id)
values ("Hoje N Faro", 1.75, "Feminino", "Elfa da Floresta", true, 1700, 3000, 5);
insert into tb_personagem(nome, altura, genero, raca, deseja_a_coroa, poder_de_ataque, poder_de_defesa, classe_id)
values ("Rafa Fragmentado", 1.32, "Masculino", "Imp", true, 1000, 500, 1);
insert into tb_personagem(nome, altura, genero, raca, deseja_a_coroa, poder_de_ataque, poder_de_defesa, classe_id)
values ("Leandro Matrix", 1.70, "Masculino", "Robô", true, 1200, 750, 4);
insert into tb_personagem(nome, altura, genero, raca, deseja_a_coroa, poder_de_ataque, poder_de_defesa, classe_id)
values ("Safi Clock da Silva", 1.67, "Feminino", "Humano", true, 1475, 600, 4);

-- comando select poder de ataque maior que 2000 --
select * from tb_personagem where poder_de_ataque > 2000;

-- comando select poder de defesa entre 1000 a 2000 --
select * from tb_personagem where poder_de_defesa between 1000 and 2000;

-- Buscar personagens com a letra C no nome --
select * from tb_personagem where nome Like "%C%";

-- Inner Join --
select tb_personagem.nome, tb_personagem.genero, tb_personagem.raca, tb_classe.nome as classe, tb_classe.equipamentos as equipamentos
 from tb_personagem inner join tb_classe on  tb_classe.id = tb_personagem.classe_id;

-- Select personagens de uma determinada Classe --
select tb_personagem.nome, tb_classe.nome from tb_personagem inner join tb_classe
on tb_personagem.classe_id = tb_classe.id
where tb_classe.id = 2;