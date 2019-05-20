create table LEITURA (
    idLeitura int primary key identity(1,1),
    utilizado int,
    disponivel int,
    velocidade_de_leitura int,
    processos int,
    interrupcoes int,
    threads int,
    fk_maquina int,
    fk_servico int, 

    foreign key (fk_maquina) references MAQUINA (idMaquina),
    foreign key (fk_servico) references SERVICO (idServico)
    );