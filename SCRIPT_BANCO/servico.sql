create table SERVICO (
    idServico int primary key identity(1,1),
    nome varchar(50),
    descricao varchar(100),
    estado bit,
    fk_maquina int,

    foreign key (fk_maquina) references MAQUINA (idMaquina)
);