-- V2: Migrations para adicionar a coluna de RANK na tabela de cadastros

ALTER TABLE tb_cadastro
ADD column rank VARCHAR(255);