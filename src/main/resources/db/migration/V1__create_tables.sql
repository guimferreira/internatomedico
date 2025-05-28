CREATE TYPE PERIODO_ACADEMICO AS ENUM ('P7', 'P8', 'P9', 'P10', 'P11', 'P12');

CREATE TYPE TURNO AS ENUM ('manhã', 'tarde', 'noite');

CREATE TABLE usuarios
(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(30) UNIQUE NOT NULL,
    cpf CHAR(11) UNIQUE NOT NULL
);

CREATE TABLE alunos
(
    id SERIAL PRIMARY KEY,
    usuario_id INT NOT NULL,
    periodo_academico PERIODO_ACADEMICO NOT NULL,
    CONSTRAINT fk_usuario_id FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

CREATE TABLE coordenadores
(
    id SERIAL PRIMARY KEY,
    usuario_id INT NOT NULL,
    CONSTRAINT fk_usuario_id FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

CREATE TABLE supervisores
(
    id SERIAL PRIMARY KEY,
    usuario_id INT NOT NULL,
    CONSTRAINT fk_usuario_id FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

CREATE TABLE especialidades
(
    id SERIAL PRIMARY KEY,
    especialidade_medica VARCHAR(30) NOT NULL
);

CREATE TABLE preceptores
(
    id SERIAL PRIMARY KEY,
    usuario_id INT NOT NULL,
    crm VARCHAR(9),
    especialidade_id INT NOT NULL,
    CONSTRAINT fk_usuario_id FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
    CONSTRAINT fk_especialidade_id FOREIGN KEY (especialidade_id) REFERENCES especialidades(id)
);

CREATE TABLE periodo_especialidade
(
    id SERIAL PRIMARY KEY,
    periodo_academico PERIODO_ACADEMICO NOT NULL,
    especialidade_id INT NOT NULL,
    carga_horaria INT NOT NULL,
    CONSTRAINT fk_especialidade_id FOREIGN KEY (especialidade_id) REFERENCES especialidades(id)
);

CREATE TABLE local_parceiro
(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    sigla VARCHAR(10) NOT NULL,
    cep CHAR(8) NOT NULL,
    logradouro VARCHAR(50) NOT NULL,
    numero INT,
    bairro VARCHAR(20) NOT NULL,
    cidade VARCHAR(50) NOT NULL,
    uf CHAR(2) NOT NULL,
    latitude REAL NOT NULL,
    longitude REAL NOT NULL,
    raio REAL NOT NULL
);

CREATE TABLE semestre_letivo
(
    id SERIAL PRIMARY KEY,
    semestre CHAR(6) NOT NULL,
    data_inicio DATE NOT NULL,
    data_fim DATE NOT NULL
);

CREATE TABLE local_especialidade
(
    id SERIAL PRIMARY KEY,
    local_parceiro_id INT NOT NULL,
    especialidade_id INT NOT NULL,
    semestre_id INT NOT NULL,
    vagas INT NOT NULL,
    CONSTRAINT fk_local_parceiro_id FOREIGN KEY (local_parceiro_id) REFERENCES local_parceiro(id),
    CONSTRAINT fk_especialidade_id FOREIGN KEY (especialidade_id) REFERENCES especialidades(id),
    CONSTRAINT fk_semestre_id FOREIGN KEY (semestre_id) REFERENCES semestre_letivo(id)
);

CREATE TABLE plantao
(
    id SERIAL PRIMARY KEY,
    data_inicio DATE NOT NULL,
    data_fim DATE NOT NULL,
    turno TURNO NOT NULL,
    local_especialidade_id INT NOT NULL,
    vagas INT NOT NULL,
    preceptor_id INT,
    CONSTRAINT fk_local_especialidade_id FOREIGN KEY (local_especialidade_id) REFERENCES local_especialidade(id),
    CONSTRAINT fk_preceptor_id FOREIGN KEY (preceptor_id) REFERENCES preceptores(id)
);

CREATE TABLE checkins
(
    id SERIAL PRIMARY KEY,
    data_hora_checkIn TIMESTAMP NOT NULL,
    data_hora_checkOut TIMESTAMP NOT NULL,
    latitude REAL NOT NULL,
    longitude REAL NOT NULL,
    validacao BOOLEAN NOT NULL,
    aluno_id INT NOT NULL,
    plantao_id INT NOT NULL,
    CONSTRAINT fk_aluno_id FOREIGN KEY (aluno_id) REFERENCES alunos(id),
    CONSTRAINT fk_plantao_id FOREIGN KEY (plantao_id) REFERENCES plantao(id)
);

CREATE TABLE escala
(
    id SERIAL PRIMARY KEY ,
    aluno_id INT NOT NULL,
    plantao_id INT NOT NULL,
    CONSTRAINT fk_aluno_id FOREIGN KEY (aluno_id) REFERENCES alunos(id),
    CONSTRAINT fk_plantao_id FOREIGN KEY (plantao_id) REFERENCES plantao(id)
)