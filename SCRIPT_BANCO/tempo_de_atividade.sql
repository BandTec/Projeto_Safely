create table TEMPO_DE_ATIVIDADE(
    idAtividade int primary key identity(1,1),
    data_atividade datetime,
    hora time,
    fk_maquina int,

    foreign key (fk_maquina) references MAQUINA (idMaquina)
    );