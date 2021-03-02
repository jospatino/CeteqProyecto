USE db_banco;

INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Fecha_nacimiento, email ) VALUES ('Jose', 'Ramirez', 'Hernandez', 04/10/1985, 'Hramirez@outlook.com');
INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Fecha_nacimiento, email) VALUES ('Arturo', 'Prieto', 'Fuenlabrada', 03/06/1972, 'Fuenlabrada5@gmail.com');
INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Fecha_nacimiento, email) VALUES ('Javier', 'Perez', 'Santos', 13/01/1961, 'Perez_Santos@hotmail.es');
INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Fecha_nacimiento, email) VALUES ('Victor', 'Perusquia', 'Romero', 04/04/1973, 'Perez_Santos@hotmail.es');
INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Fecha_nacimiento, email) VALUES ('Javier', 'Morales', 'Garcia', 03/05/1955, 'Morales@outlook.com');
INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Fecha_nacimiento, email) VALUES ('Julian', 'Garcia', 'Romero', 01/10/1981, 'Morales@outlook.com');
INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Fecha_nacimiento, email) VALUES ('German', 'Solano', 'Gutierres', 07/09/1971, 'GermanG@outlook.com');
INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Fecha_nacimiento, email) VALUES ('Jazmin', 'Genaro', 'Angeles', 06/07/1967, 'Jazmin_angeles@hotmail.com.mx');
INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Fecha_nacimiento, email) VALUES ('Maria', 'Rosales', 'Mendez', 23/08/1983, 'RosalesM@outlook.com.mx');
INSERT INTO tb_Cliente(nombre_cliente, apellido_paterno, apellido_materno, Fecha_nacimiento, email) VALUES ('Ana', 'Fernandez', 'Gutierres', 28/04/1977, 'Fernandez_Guti@outlook.com');

INSERT INTO debito(Saldo) VALUES (1500000);
INSERT INTO debito(Saldo) VALUES (50000);
INSERT INTO debito(Saldo) VALUES (100000);
INSERT INTO debito(Saldo) VALUES (6500000);
INSERT INTO debito(Saldo) VALUES (12000000);
INSERT INTO debito(Saldo) VALUES (300000000);
INSERT INTO debito(Saldo) VALUES (800000000);
INSERT INTO debito(Saldo) VALUES (280000000);
INSERT INTO debito(Saldo) VALUES (580000000);
INSERT INTO debito(Saldo) VALUES (30000);

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