INSERT INTO tb_participante(nome, email) VALUES ('José Silva', 'jose@gmail.com');
INSERT INTO tb_participante(nome, email) VALUES ('Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participante(nome, email) VALUES ('Maria do Rosário', 'maria@gmail.com');
INSERT INTO tb_participante(nome, email) VALUES ('Teresa Silva', 'teresa@gmail.com');

INSERT INTO tb_categoria(descricao) VALUES ('Curso');
INSERT INTO tb_categoria(descricao) VALUES ('Oficina');

INSERT INTO tb_bloco(inicio, fim, atividade_id) VALUES (TIMESTAMP WITH TIME ZONE '25-09-2017T08:00:00z', TIMESTAMP WITH TIME ZONE '25-09-2017T11:00:00Z', 1);
INSERT INTO tb_bloco(inicio, fim, atividade_id) VALUES (TIMESTAMP WITH TIME ZONE '25-09-2017T14:00:00z', TIMESTAMP WITH TIME ZONE '25-09-2017T18:00:00Z', 2);
INSERT INTO tb_bloco(inicio, fim, atividade_id) VALUES (TIMESTAMP WITH TIME ZONE '26-09-2017T08:00:00z', TIMESTAMP WITH TIME ZONE '26-09-2017T11:00:00Z', 2);


INSERT INTO tb_atividade(nome, descricao, preco, categoria_id) VALUES ('Curso de HTML', 'Aprenda HTML de forma prática', 80.00, 1);
INSERT INTO tb_atividade(nome, descricao, preco, categoria_id) VALUES ('Oficina de Github', 'Controle de Versões de seus projetos', 50.00, 2);

INSERT INTO tb_participante_atividade (participante_id, atividade_id) VALUES (1, 1);
INSERT INTO tb_participante_atividade (participante_id, atividade_id) VALUES (1, 2);
INSERT INTO tb_participante_atividade (participante_id, atividade_id) VALUES (2, 1);
INSERT INTO tb_participante_atividade (participante_id, atividade_id) VALUES (3, 1);
INSERT INTO tb_participante_atividade (participante_id, atividade_id) VALUES (3, 2);
INSERT INTO tb_participante_atividade (participante_id, atividade_id) VALUES (4, 2);