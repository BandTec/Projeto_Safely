create table FRANQUIA (
    idFranquia int primary key identity(1,1),
    nome varchar(50),
    fk_maquina int,
    fk_caixa int, 
    fk_usuario int,
    fk_empresa int
);