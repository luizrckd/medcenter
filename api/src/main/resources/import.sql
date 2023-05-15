INSERT INTO tb_type(name) VALUES ('Admin');
INSERT INTO tb_type(name) VALUES ('Médico');
INSERT INTO tb_type(name) VALUES ('Auxiliar Adm');
INSERT INTO tb_type(name) VALUES ('Paciente');

INSERT INTO tb_user(type_id, name, email, password) VALUES (1, 'Julia Laiza', 'julialaiza@gmail.com', '12345678');
INSERT INTO tb_user(type_id, name, email, password) VALUES (2, 'Pedro Sampaio', 'pedrosampaio@gmail.com', '12345678');
INSERT INTO tb_user(type_id, name, email, password) VALUES (3, 'Priscila Holanda', 'priscilaholanda@gmail.com', '12345678');
INSERT INTO tb_user(type_id, name, email, password) VALUES (4, 'Akison Bruno', 'akisonbruno@gmail.com', '12345678');