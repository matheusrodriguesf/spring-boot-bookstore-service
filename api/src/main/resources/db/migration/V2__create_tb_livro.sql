CREATE TABLE IF NOT EXISTS TB_LIVRO(
    PK_LIVRO SERIAL PRIMARY KEY,
    TITULO VARCHAR(100) NOT NULL,
    DESCRICAO VARCHAR(1000) NOT NULL,
    ISBN VARCHAR(20) NOT NULL,
    AUTOR VARCHAR(100) NOT NULL,
    EDITORA VARCHAR(100) NOT NULL,
    ANO_PUBLICACAO INT NOT NULL,
    FK_CATEGORIA INT NOT NULL,
    FOREIGN KEY (FK_CATEGORIA) REFERENCES TB_CATEGORIA(PK_CATEGORIA)
);