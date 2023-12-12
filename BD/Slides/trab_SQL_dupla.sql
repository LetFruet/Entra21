-- Alana Andreazza e Leticia Fruet

-- 1- Criação das estruturas do modelo (tabelas, atributos e restrições)
CREATE TABLE usuario(
	cd_usuario INTEGER PRIMARY KEY,
	nm_usuario VARCHAR(50),
	ds_email VARCHAR(50),
	nr_telefone VARCHAR(15)
);

CREATE TABLE servico(
	cd_servico INTEGER PRIMARY KEY,
	ds_servico VARCHAR(50),
	ds_sugestao VARCHAR(200)
);

CREATE TABLE ordem_servico(
	nr_os INTEGER PRIMARY KEY,
	cd_usuario INTEGER,
	dt_registro DATE,
	ds_observacao VARCHAR(200),
	FOREIGN KEY (cd_usuario) REFERENCES usuario (cd_usuario)
);

CREATE TABLE itens_ordem_servico(
	nr_os INTEGER,
	cd_servico INTEGER,
	dt_atendimento DATE,
	ds_atendimento VARCHAR(100),
	PRIMARY KEY(nr_os, cd_servico),
	FOREIGN KEY (nr_os) REFERENCES ordem_servico (nr_os),
	FOREIGN KEY (cd_servico) REFERENCES servico (cd_servico)
);

-- 2 - 03 usuários; 05 serviços; 05 ordens de serviço com data de registro em qualquer dia do mês de novembro/2023 e com, no mínimo, 02 serviços em cada ordem
INSERT INTO usuario VALUES (1, "JOAO", "JOAO@GMAIL.COM", "(47)98875-5874");
INSERT INTO usuario VALUES (2, "MARIA", "MARIA@GMAIL.COM", "(47)99984-6584");
INSERT INTO usuario VALUES (3, "CAROL", "CAROL@GMAIL.COM", "(47)99981-1478");

INSERT INTO servico VALUES (1, "TROCA DE MONITOR DE VIDEO", "SUBSTITUIR O MAIS VELHO");
INSERT INTO servico VALUES (2, "INSTALAÇÃO DE EDITOR DE TEXTO", "WORD");
INSERT INTO servico VALUES (3, "MANUTENÇÃO DE TECLADO", null);
INSERT INTO servico VALUES (4, "CONSERTO DO PROJETOR", "EXIBIR IMAGENS COLORIDAS");
INSERT INTO servico VALUES (5, "ATUALIZAÇÃO DO WINDOWS", "ATUALIZAR PARA O MAIS NOVO");
INSERT INTO servico VALUES (6, "LIMPEZA DOS GABINETE", null);

INSERT INTO ordem_servico VALUES (1, 1, '2023-11-01', null);
INSERT INTO ordem_servico VALUES (2, 2, '2023-11-12', 'PRIORIDADE MAXIMA');
INSERT INTO ordem_servico VALUES (3, 3, '2023-11-21', 'PRIORIDADE MINIMA');
INSERT INTO ordem_servico VALUES (4, 1, '2023-11-26', 'PRIORIDADE MEDIA');
INSERT INTO ordem_servico VALUES (5, 2, '2023-11-30', null);
INSERT INTO ordem_servico VALUES (6, 2, '2023-11-10', null);

INSERT INTO itens_ordem_servico VALUES (1, 1, '2023-11-05', 'SERVICO COMPLETO');
INSERT INTO itens_ordem_servico VALUES (1, 2, '2023-11-05', 'SERVICO EM ANDAMENTO');

INSERT INTO itens_ordem_servico VALUES (2, 3, '2023-11-25', 'AGUARDANDO PEÇA');
INSERT INTO itens_ordem_servico VALUES (2, 4, '2023-11-12', 'RESOLVIDO NO DIA');

INSERT INTO itens_ordem_servico VALUES (3, 5, '2023-11-30', 'AGUARDANDO ATENDIMENTO');
INSERT INTO itens_ordem_servico VALUES (3, 1, '2023-11-21', 'SERVICO EM ANDAMENTO');
INSERT INTO itens_ordem_servico VALUES (3, 3, '2023-11-21', 'CONCLUIDO');

INSERT INTO itens_ordem_servico VALUES (4, 2, '2023-12-05', 'SERVICO AGENDADO');
INSERT INTO itens_ordem_servico VALUES (4, 5, '2023-12-03', 'AGUARDANDO LANÇAMENTO DA ATUALIZAÇÃO');

INSERT INTO itens_ordem_servico VALUES (5, 3, '2023-12-02', 'AGUARDANDO TÉCNIDO DISPONIVEL');
INSERT INTO itens_ordem_servico VALUES (5, 4, '2023-12-02', 'AGUARDANDO PAGAMENTO');

INSERT INTO itens_ordem_servico VALUES (6, 2, '2023-11-11', 'SERVICO EM ANDAMENTO');
INSERT INTO itens_ordem_servico VALUES (6, 6, '2023-11-15', 'CONCLUIDO');

-- 3 - Exibir a quantidade média de serviços associadas às ordens de serviço cadastradas
SELECT COUNT(s.cd_servico) / COUNT(os.nr_os) AS "Media de servicos"
FROM servico s, ordem_servico os

-- 4 - Listar as ordens de serviço registradas entre os dias 10 e 15 de novembro de 2023 (inclusive estas datas), com nome de usuário que solicitou e descrições dos serviços 
SELECT u.nm_usuario AS Cliente, s.ds_servico AS Servico
FROM usuario u, servico s, ordem_servico os, itens_ordem_servico ios
WHERE u.cd_usuario = os.cd_usuario
	AND os.nr_os = ios.nr_os 
	AND ios.cd_servico = s.cd_servico
	AND os.dt_registro BETWEEN '2023-11-10' AND '2023-11-15'
	
-- 5 - Exibir o nome do usuário com a respectiva quantidade de ordens de serviço que solicitou
SELECT u.nm_usuario AS Cliente, COUNT(os.cd_usuario) AS "Qtde ordem solicitada"
FROM usuario u, ordem_servico os
WHERE u.cd_usuario = os.cd_usuario
GROUP BY u.nm_usuario

-- 6 - Listar o número da ordem de serviço, a data de registro da mesma e descrição do(s) serviço(s) associado(s) 
a respectiva ordem de serviço onde a descrição do atendimento é diferente de 'concluído'
SELECT os.nr_os AS 'Numero Ordem Servico', os.dt_registro AS 'Data Registro', s.ds_servico AS Descricao
FROM ordem_servico os, servico s, itens_ordem_servico ios
WHERE os.nr_os = ios.nr_os 
	AND s.cd_servico = ios.cd_servico
	AND ios.ds_atendimento <> 'CONCLUIDO'