CREATE TABLE MAQUINA_VIRTUAL (
    ID_VM INT PRIMARY KEY NOT NULL,
    NM_VM VARCHAR(50),
    DESCRIBE VARCHAR(100),
    ESTADO BIT,
    MAC_ADRESS VARCHAR(100),
    MTU VARCHAR(100),
    GATEWAY_IPV4 VARCHAR(10),
    GATEWAY_IPV6 VARCHAR(50),
    ID_COPONENTE INT
);