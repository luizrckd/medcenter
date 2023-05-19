
# Cargos
INSERT INTO tb_type(name) VALUES ('Admin');
INSERT INTO tb_type(name) VALUES ('Médico');
INSERT INTO tb_type(name) VALUES ('Auxiliar Adm');
INSERT INTO tb_type(name) VALUES ('Responsável');
INSERT INTO tb_type(name) VALUES ('Paciente');

# Usuarios
INSERT INTO tb_user(type_id, nome, username, email, senha, dtnasc) VALUES (1, 'Julia Laiza', 'julialaiza', 'julialaiza@gmail.com', '12345678', '01/01/2001');
INSERT INTO tb_user(type_id, nome, username, email, senha, dtnasc) VALUES (1, 'Luiz Rickardo', 'luizrckd', 'luizrickardo@gmail.com', '12345678', '01/01/2001');

INSERT INTO tb_user(type_id, name, username, email, senha, dtnasc) VALUES (2, 'Pedro Sampaio', 'pedrohsampaio_d', 'pedrosampaio@gmail.com', '12345678', '01/01/2001');
INSERT INTO tb_user(type_id, nome, username, email, senha, dtnasc) VALUES (2, 'Priscila Holanda', 'pri_holanda', 'priscilaholanda@gmail.com', '12345678', '01/01/2001');

INSERT INTO tb_user(type_id, nome, username, email, senha, dtnasc) VALUES (3, 'Akison Bruno', 'akisonbruno', 'akisonbruno@gmail.com', '12345678', '01/01/2001');
INSERT INTO tb_user(type_id, name, username, email, senha, dtnasc) VALUES (3, 'Dimitry', 'dimitryalves', 'dimitryalves@gmail.com', '12345678', '01/01/2001');

INSERT INTO tb_user(type_id, nome, username, email, senha, dtnasc) VALUES (4, 'Daniel Saraiva', 'danielsaraiva', 'danielsaraiva@gmail.com', '12345678', '01/01/2001');
INSERT INTO tb_user(type_id, nome, username, email, senha, dtnasc) VALUES (5, 'João Luiz', 'joaoluiz', 'joaoluiz@gmail.com', '12345678', '01/01/2001');
INSERT INTO tb_user(type_id, nome, username, email, senha, dtnasc) VALUES (5, 'Pedro Emulador', 'pedroemulador', 'pedroemulador@gmail.com', '12345678', '01/01/2001');