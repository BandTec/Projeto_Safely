create table PROCESSADOR (
    idProcessador int primary key identity(1,1),
    clock time,
    nome varchar(50),
    ultima_modificacao datetime
);