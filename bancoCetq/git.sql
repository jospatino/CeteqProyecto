USE db_banco;

INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Edad, email, id_credito, id_debito) VALUES ('Jose', 'Ramirez', 'Hernandez', '30', 'Hramirez@outlook.com', 1, 1);
INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Edad, email, id_credito, id_debito) VALUES ('Arturo', 'Prieto', 'Fuenlabrada', '28', 'Fuenlabrada5@gmail.com', 2, 2);
INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Edad, email, id_credito, id_debito) VALUES ('Javier', 'Perez', 'Santos', '25', 'Perez_Santos@hotmail.es', 3 , 3);
INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Edad, email, id_credito, id_debito) VALUES ('Victor', 'Perusquia', 'Romero', '18', 'Perez_Santos@hotmail.es', 4, 4);
INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Edad, email, id_credito, id_debito) VALUES ('Javier', 'Morales', 'Garcia', '22', 'Morales@outlook.com', 5, 5);
INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Edad, email, id_credito, id_debito) VALUES ('Julian', 'Garcia', 'Romero', '33', 'Morales@outlook.com',6 , 6);
INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Edad, email, id_credito, id_debito) VALUES ('German', 'Solano', 'Gutierres', '35', 'GermanG@outlook.com', 7, 7);
INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Edad, email, id_credito, id_debito) VALUES ('Jazmin', 'Genaro', 'Angeles', '40', 'Jazmin_angeles@hotmail.com.mx', 8, 8);
INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Edad, email, id_credito, id_debito) VALUES ('Maria', 'Rosales', 'Mendez', '48', 'RosalesM@outlook.com.mx', 9, 9);
INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Edad, email, id_credito, id_debito) VALUES ('Ana', 'Fernandez', 'Gutierres', '52', 'Fernandez_Guti@outlook.com', 10, 10);

INSERT INTO debito(Saldo, id_credito) VALUES (1500000, 1);
INSERT INTO debito(Saldo, id_credito) VALUES (50000, 2);
INSERT INTO debito(Saldo, id_credito) VALUES (100000, 3);
INSERT INTO debito(Saldo, id_credito) VALUES (6500000, 4);
INSERT INTO debito(Saldo, id_credito) VALUES (12000000, 5);
INSERT INTO debito(Saldo, id_credito) VALUES (300000000, 6);
INSERT INTO debito(Saldo, id_credito) VALUES (800000000, 7);
INSERT INTO debito(Saldo, id_credito) VALUES (280000000, 8);
INSERT INTO debito(Saldo, id_credito) VALUES (580000000, 9);
INSERT INTO debito(Saldo, id_credito) VALUES (30000, 10);

INSERT INTO credito(monto_prestamo, adeudo_total) VALUES (5000, 3000);
INSERT INTO credito(monto_prestamo, adeudo_total) VALUES (10000, 9000);
INSERT INTO credito(monto_prestamo, adeudo_total) VALUES (40000, 0);
INSERT INTO credito(monto_prestamo, adeudo_total) VALUES (50000, 35000);
INSERT INTO credito(monto_prestamo, adeudo_total) VALUES (35000, 30000);
INSERT INTO credito(monto_prestamo, adeudo_total) VALUES (45000, 5000);
INSERT INTO credito(monto_prestamo, adeudo_total) VALUES (80000, 50000);
INSERT INTO credito(monto_prestamo, adeudo_total) VALUES (9000, 9000);
INSERT INTO credito(monto_prestamo, adeudo_total) VALUES (11000, 10000);
INSERT INTO credito(monto_prestamo, adeudo_total) VALUES (15000, 5000);