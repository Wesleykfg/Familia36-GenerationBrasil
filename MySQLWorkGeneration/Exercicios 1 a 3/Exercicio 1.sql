-- criando o banco de dados
create database Servicos_RH;

-- criando as tabelas
use servicos_rh;
create table tb_funcionarios(
	id bigint(5) auto_increment,
    nome varchar(300) not null,
    genero varchar(30) not null,
    cargo varchar (50) not null,
    salario decimal(10,2),
    horario varchar(500) not null,
    primary key (id)
);

-- populando a tabela
insert into tb_funcionarios(nome, genero, cargo, salario, horario) values ("Wesley", "Masculino", "Supervisor", 3000.00, "09:00h");
insert into tb_funcionarios(nome, genero, cargo, salario, horario) values ("Darcy", "Feminino", "C.O.", 30000.00, "09:00h");
insert into tb_funcionarios(nome, genero, cargo, salario, horario) values ("Maiury", "Feminino", "Diretora", 7000.00, "09:00h");
insert into tb_funcionarios(nome, genero, cargo, salario, horario) values ("André", "Masculino", "T.I.", 2500.00, "08:00h");
insert into tb_funcionarios(nome, genero, cargo, salario, horario) values ("Glauber", "Masculino", "Instrutor", 2000.00, "10:00h");
insert into tb_funcionarios(nome, genero, cargo, salario, horario) values ("Felipe", "Masculino", "T.I.", 2500.00, "08:00h");

-- comando select salario maior que 2000
select * from tb_funcionarios where salario > 2000.00;

-- comando select salario maior que 2000
select * from tb_funcionarios where salario < 2000.00;

-- Atualização de dado
update tb_funcionarios set salario = 1500.00
where id = 5;

-- visualizar tabela
select * from tb_funcionarios