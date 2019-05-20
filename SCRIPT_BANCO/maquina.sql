create table MAQUINA(
    idMaquina int primary key identity(1,1),
    sistema_operacional varchar(45),
    serial_number varchar(45),
    versao varchar(45),
    modelo varchar(45),
    dominio varchar(45),
    host_name varchar(45),
    IPv4 varchar(10),
    IPv6 varchar(45),
    descricao varchar(100),
    ultima_atualizacao datetime,
    fk_idProcessador int,
    fk_idDisco int,
    fk_idMemoria int
);