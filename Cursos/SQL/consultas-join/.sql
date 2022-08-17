
/* SELECT
    Objetivo: listar os canais
 */
SELECT * FROM diotube.canais;

/* AS
    Objetivo: mostrar os nomes dos canais
 */
SELECT c.nome_canal FROM diotube.canais AS c;

/* JOIN
    Objetivo: mostrar todos os canais que postaram videos
 */
SELECT * FROM diotube.videos_canais AS vc JOIN diotube.canais AS c ON vc.fk_canal=c.id_canal GROUP BY c.nome_canal;

/* JOIN
    Objetivo: mostrar apenas os nomes de todos os canais que postaram videos
 */
SELECT c.nome_canal FROM diotube.videos_canais AS vc JOIN diotube.canais AS c ON vc.fk_canal=c.id_canal GROUP BY c.nome_canal;

/* JOIN
    Objetivo: mostrar a quantidade de videos que cada canal postou
 */
SELECT COUNT(*) AS videos, c.nome_canal FROM diotube.videos_canais as vc JOIN diotube.canais AS c ON c.id_canal=vc.fk_canal GROUP BY vc.fk_canal;

/* JOIN
    Objetivo: mostrar os videos postados por cada canal
 */
SELECT v.nome_video, c.nome_canal FROM diotube.videos_canais as vc JOIN diotube.canais AS c ON c.id_canal=vc.fk_canal JOIN diotube.videos AS v ON v.id_video=vc.fk_video;

/* DISTINCT
    Objetivo: mostrar a quantidade de canais que postaram videos
 */
SELECT COUNT(DISTINCT vc.fk_canal) AS canais FROM diotube.videos_canais as vc;
