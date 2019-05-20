
create table USUARIO (
    idUsuario int primary key identity(1,1),
    nome varchar(45),
    email varchar(45),
    senha varchar(12),
    username varchar(15)
);