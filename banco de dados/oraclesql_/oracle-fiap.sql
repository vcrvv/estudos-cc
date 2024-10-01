-- COMANDOS PARA CRIAR AS TABELAS 
-- E ADICIONAR CONSTRAINTS: PRIMARY KEY, CHECK E UNIQUE
CREATE TABLE t_sip_departamento (
    cd_depto NUMBER(3)      NOT NULL,
    nm_depto VARCHAR2(30)   NOT NULL,
    sg_depto CHAR(3)        NOT NULL
);
COMMENT ON COLUMN t_sip_departamento.cd_depto IS
    'Um departamento é identificado por um código numérico de três dígitos.';
   ALTER TABLE t_sip_departamento 
ADD CONSTRAINT pk_sip_departamento 
   PRIMARY KEY ( cd_depto );
   ALTER TABLE t_sip_departamento 
ADD CONSTRAINT un_sip_depto_nome 
        UNIQUE ( nm_depto );
   ALTER TABLE t_sip_departamento 
ADD CONSTRAINT un_sip_depto_sigla 
        UNIQUE ( sg_depto );
CREATE TABLE t_sip_dependente (
    nr_matricula  NUMBER(5)     NOT NULL,
    cd_dependente NUMBER(2)     NOT NULL,
    nm_dependente VARCHAR2(50)  NOT NULL,
    dt_nascimento DATE          NOT NULL
);
   ALTER TABLE t_sip_dependente 
ADD CONSTRAINT pk_sip_dependente 
   PRIMARY KEY ( nr_matricula, cd_dependente );
CREATE TABLE t_sip_funcionario (
    nr_matricula      NUMBER(5)     NOT NULL,
    cd_depto          NUMBER(3)     NOT NULL,
    nm_funcionario    VARCHAR2(50)  NOT NULL,
    dt_nascimento     DATE          NOT NULL,
    dt_admissao       DATE          NOT NULL,
    ds_endereco       VARCHAR2(100) NOT NULL,
    vl_salario_mensal NUMBER(7, 2) NOT NULL
);
   ALTER TABLE t_sip_funcionario 
ADD CONSTRAINT ck_sip_func_salario 
         CHECK ( vl_salario_mensal >= 1212 );
   ALTER TABLE t_sip_funcionario 
ADD CONSTRAINT pk_sip_funcionario 
   PRIMARY KEY ( nr_matricula );
CREATE TABLE t_sip_implantacao (
    cd_projeto     NUMBER(5) NOT NULL,
    cd_implantacao NUMBER(3) NOT NULL,
    nr_matricula   NUMBER(5) NOT NULL,
    dt_entrada     DATE      NOT NULL,
    dt_saida       DATE          NULL
);
   ALTER TABLE t_sip_implantacao 
ADD CONSTRAINT ck_sip_implant_data 
         CHECK ( dt_saida > dt_entrada );
   ALTER TABLE t_sip_implantacao 
ADD CONSTRAINT pk_sip_implantacao 
   PRIMARY KEY ( cd_projeto, cd_implantacao );
CREATE TABLE t_sip_projeto (
    cd_projeto NUMBER(5)    NOT NULL,
    nm_projeto VARCHAR2(40) NOT NULL,
    dt_inicio  DATE         NOT NULL,
    dt_termino DATE
);
-- ADICIONAR CONSTRAINT FOREIGN KEY
   ALTER TABLE t_sip_projeto 
ADD CONSTRAINT ck_sip_projeto_data 
         CHECK ( dt_termino > dt_inicio );
   ALTER TABLE t_sip_projeto 
ADD CONSTRAINT pk_sip_projeto 
   PRIMARY KEY ( cd_projeto );
   ALTER TABLE t_sip_projeto 
ADD CONSTRAINT un_sip_projeto_nome 
        UNIQUE ( nm_projeto );
   ALTER TABLE t_sip_dependente
ADD CONSTRAINT fk_sip_dependente_func 
   FOREIGN KEY ( nr_matricula )
    REFERENCES t_sip_funcionario ( nr_matricula );
   ALTER TABLE t_sip_funcionario
ADD CONSTRAINT fk_sip_func_depto 
   FOREIGN KEY ( cd_depto )
    REFERENCES t_sip_departamento ( cd_depto );
   ALTER TABLE t_sip_implantacao
ADD CONSTRAINT fk_sip_implant_func 
   FOREIGN KEY ( nr_matricula )
    REFERENCES t_sip_funcionario ( nr_matricula );
   ALTER TABLE t_sip_implantacao
ADD CONSTRAINT fk_sip_implant_projeto 
   FOREIGN KEY ( cd_projeto )
    REFERENCES t_sip_projeto ( cd_projeto );
    
--aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
-- INSERINDO DADOS NA TABELA DEPARTAMENTO INFORMANDO 
-- COLUNAS E RESPECTIVO CONTEÚDO
INSERT INTO T_SIP_DEPARTAMENTO (CD_DEPTO, NM_DEPTO, SG_DEPTO)
     VALUES (2, 'MARKETING','MKT');

-- CONSULTANDO TODAS AS LINHAS DA TABELA DEPARTAMENTO
SELECT * FROM T_SIP_DEPARTAMENTO;

-- INSERÇÃO COM MANIPULAÇÃO DE DATA/HORA
INSERT INTO T_SIP_PROJETO 
     VALUES (1, 'PROJETO ABC',
             TO_DATE('01/02/2020','DD/MM/YYYY'),
       TO_DATE('15/11/2022','DD/MM/YYYY'));

-- CONSULTANDO TODAS AS LINHAS DA TABELA PROJETO
SELECT * FROM T_SIP_PROJETO;

-- INSERÇÃO COM MANIPULAÇÃO DE NÚMEROS DECIMAIS
INSERT INTO T_SIP_FUNCIONARIO
     VALUES (12345,1,'JOÃO DA SILVA XAVIER', 
       TO_DATE('18/03/1985','DD/MM/YYYY'),
       TO_DATE('21/07/2012','DD/MM/YYYY'),
       'AVENIDA PAULISTA, 1900 - 10o. ANDAR', 
             1234.56); -- UTILIZAMOS O PONTO DECIMAL

-- CONSULTANDO TODAS AS LINHAS DA TABELA FUNCIONARIO
SELECT * FROM T_SIP_FUNCIONARIO;

-- INSERÇÃO DE VALORES NULOS PARA CAMPOS OPCIONAIS
-- MÉTODO IMPLÍCITO - OMITA A COLUNA DA LISTA DURANTE A INSERÇÃO
INSERT INTO T_SIP_PROJETO (CD_PROJETO, NM_PROJETO, DT_INICIO)
     VALUES (2, 'PROJETO DEF',
             TO_DATE('19/03/2020','DD/MM/YYYY'));

-- CONSULTANDO TODAS AS LINHAS DA TABELA PROJETO
SELECT * FROM T_SIP_PROJETO;

-- INSERÇÃO DE VALORES NULOS PARA CAMPOS OPCIONAIS
-- MÉTODO EXPLICITO - ESPECIFIQUE A PALAVRA-CHAVE NULL, 
-- NA CLÁUSULA VALUES
INSERT INTO T_SIP_PROJETO 
     VALUES (3, 'PROJETO GHI',
             TO_DATE('15/08/2021','DD/MM/YYYY'),
             NULL );
             
             
-- CRIAR UMA TABELA EXEMPLO
-- A TABELA ARMAZENARÁ APENAS PROJETOS FINALIZADOS
CREATE TABLE T_SIP_COPY_PROJETO_FIN
(
    CD_PROJETO          NUMBER(5)       NOT NULL ,
    NM_PROJETO          VARCHAR2(40)    NOT NULL ,
    DT_INICIO           DATE            NOT NULL ,
    DT_TERMINO          DATE            NOT NULL 
);
-- CHAVE PRIMARIA DA TABELA 
   ALTER TABLE T_SIP_COPY_PROJETO_FIN
ADD CONSTRAINT PK_SIP_COPY_PROJETO_FIN
   PRIMARY KEY (CD_PROJETO);             
   
-- REALIZANDO A CÓPIA DOS DADOS DE UMA TABELA PARA OUTRA
-- UTILIZANDO O COMANDO INSERT E O COMANDO SELECT 
-- SUBCONSULTA OU SUBQUERY)
INSERT INTO T_SIP_COPY_PROJETO_FIN 
       (CD_PROJETO, NM_PROJETO, DT_INICIO, DT_TERMINO)
 (SELECT CD_PROJETO, NM_PROJETO, 
         DT_INICIO, DT_TERMINO
    FROM T_SIP_PROJETO
   WHERE DT_TERMINO IS NOT NULL);   
   
   
   -- REALIZANDO A CÓPIA DOS DADOS DE UMA TABELA PARA OUTRA
-- UTILIZANDO O COMANDO INSERT E O COMANDO SELECT 
-- SUBCONSULTA OU SUBQUERY)
INSERT INTO T_SIP_COPY_PROJETO_FIN 
            (SELECT * FROM T_SIP_PROJETO
        WHERE DT_TERMINO IS NOT NULL);
   
   
 -- CONSULTANDO TODAS AS LINHAS DA TABELA 
-- CONTENDO OS PROJETOS FINALIZADOS
SELECT * FROM T_SIP_COPY_PROJETO_FIN;  
   
   
 -- ATUALIZAR DUAS OU MAIS COLUNAS EM UM COMANDO DE ATUALIZACAO
-- ALTERAR O NOME E A DATA DE NASCIMENTO DE UM 
-- FUNCIONARIO ESPECÍFICO
   UPDATE T_SIP_FUNCIONARIO
      SET NM_FUNCIONARIO = 'JOÃO DA SILVA XAVIER DE CAMARGO',
    DT_NASCIMENTO = TO_DATE ('18/05/1985','DD/MM/YYYY')
    WHERE NR_MATRICULA = 12345;  
    
    
 -- CONSULTANDO TODAS AS LINHAS DA TABELA FUNCIONÁRIO
SELECT * FROM T_SIP_FUNCIONARIO WHERE NR_MATRICULA = 12345;   
   
   
   
   
   
   