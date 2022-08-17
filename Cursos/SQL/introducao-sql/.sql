/* CREATE TABLE
    Objetivo: criar uma tabela contendo nome de até vinte caracteres, data de nascimento e genero
 */
CREATE TABLE pessoas.pessoa (nome varchar(20), nascimento date, genero enum('M', 'F'));

/* INSERT INTO
    Objetivo: popular a tabela pessoa
 */
INSERT INTO pessoas.pessoa (nome, nascimento, genero) VALUES
('David', '2002-01-03', 'M');
INSERT INTO pessoas.pessoa (nome, nascimento, genero) VALUES
('Daniel', '2003-09-14', 'M');

/* SELECT
    Objetivo: listar as pessoas
 */
SELECT * FROM pessoas.pessoa;

/* UPDATE
    Atualizar os dados de todas as pessoas para que contenham o nome 'Nathally Souza'
 */
UPDATE pessoas.pessoa SET nome = 'Nathally Souza';

/* WHERE
    Atualizar os dados de todas as pessoas chamadas 'David' para que contenham o nome 'Nathally Souza'
 */
UPDATE pessoas.pessoa SET nome = 'Nathally Souza' WHERE
nome = 'David';

/* DELETE FROM
    Excluir todas as pessoas nomeadas 'David'
 */
DELETE FROM pessoas.pessoa WHERE nome = 'David';

/* ORDER BY
    Objetivo: listar as pessoas por nome em ordem crescente
 */
SELECT * FROM pessoas.pessoa ORDER BY nome;

/* ORDER BY
    Objetivo: listar as pessoas por nome em ordem decrescente
 */
SELECT * FROM pessoas.pessoa ORDER BY nome DESC;

/* GROUP BY
    Objetivo: mostrar quantas pessoas existem de cada genero
 */
SELECT COUNT(*) AS count, genero FROM pessoas.pessoa GROUP BY
genero;
