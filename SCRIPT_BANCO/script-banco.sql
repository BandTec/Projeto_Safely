
create table TB_TIPO (
	idTipo int primary key identity(1,1),
	nome varchar(45)
);

GO

create table TB_ESTABELECIMENTO (
    idEstabelecimento int primary key identity(1,1),
    nome varchar(50),
	CNPJ varchar(20)
);

GO

create table TB_USUARIO (
    idUsuario int primary key identity(1,1),
    nome varchar(45),
    email varchar(45),
    senha varchar(12),

    fk_estabelecimento int foreign key references TB_ESTABELECIMENTO (idEstabelecimento)
);

GO 

create table TB_CAIXA (
    idCaixa int primary key identity(1,1),
    data_hora datetime ,
	data_inicio time,
	data_fim time,
    entrada float,

	fk_estabelecimento int foreign key references TB_ESTABELECIMENTO (idEstabelecimento)
);


GO

create table TB_MAQUINA(
    idMaquina int primary key identity(1,1),
    sistema_operacional varchar(45),
    serial_number varchar(45),
    versao varchar(45),
    modelo varchar(45),
    dominio varchar(45),
    hostname varchar(45),
    IPv4 varchar(50),
    IPv6 varchar(45),
    ultima_atualizacao datetime,
	fk_tipo int foreign key references TB_TIPO (idTipo),
	fk_estabelecimento int foreign key references TB_ESTABELECIMENTO (idEstabelecimento),
);

GO

create table TB_PROCESSADOR (
    idProcessador int primary key identity(1,1),
    nome varchar(50),
    ultima_modificacao datetime,
    fk_Maquina int foreign key references TB_MAQUINA (idMaquina)
);

GO

create table TB_DISCO(
    idDisco int primary key identity(1,1),
    nome varchar(50),
    tamanho int, 
    ultima_modificacao datetime,
	fk_Maquina int foreign key references TB_MAQUINA (idMaquina)
);

GO

create table TB_MEMORIA_RAM(
    idMemoria int primary key identity(1,1),
    tamanho int, 
    ultima_modificacao datetime,
	fk_Maquina int foreign key references TB_MAQUINA (idMaquina)
);

GO

create table TB_TEMPO_DE_ATIVIDADE(
    idAtividade int primary key identity(1,1),
    data_inicio datetime,
    data_fim datetime,
    fk_maquina int foreign key references TB_MAQUINA (idMaquina)

);

GO

create table TB_LEITURA (
	idLeitura int primary key identity(1,1),
	qtd_processos int,
	qtd_interrupcoes int,
	vel_leitura_cpu int, 
	uso_processador int,
	uso_ram int,
	uso_disco int,
	data_hora datetime,
	fk_maquina int foreign key references TB_MAQUINA (idMaquina)
);


--DROP TABLE TB_LEITURA; 
--DROP TABLE TB_USUARIO;
--drop table TB_DISCO;
--DROP TABLE TB_MEMORIA_RAM;
--DROP TABLE TB_PROCESSADOR;
--DROP TABLE TB_TEMPO_DE_ATIVIDADE;
--drop table TB_CAIXA;
--DROP TABLE TB_TIPO;
--DROP TABLE TB_MAQUINA;
--DROP TABLE TB_ESTABELECIMENTO;



  


INSERT INTO TB_ESTABELECIMENTO (CNPJ, nome) VALUES ( '123456789', 'AV. PAULISTA 175');


insert into TB_USUARIO values ('admin', 'admin', 'admin', 1);

insert into TB_TIPO values ('Servidor'), ('Client'),('Comum');


select * from TB_USUARIO;
select * from TB_ESTABELECIMENTO;
SELECT * FROM TB_USUARIO WHERE email = 'nataliatayoane@gmail.com' and senha  = '324rfwdccv'
select * from TB_LEITURA;
select * from TB_TIPO;
select * from TB_MEMORIA_RAM;
select * from TB_PROCESSADOR;
select * from TB_DISCO;
select * from TB_MAQUINA;
select * from TB_USUARIO;

