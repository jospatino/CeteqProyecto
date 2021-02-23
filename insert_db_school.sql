USE db_school;

INSERT INTO tb_Alumnos(Nombre, Apellido_paterno, Apellido_materno, Edad) VALUES ('Alex', 'Ramirez', 'Fuentes', '12');
INSERT INTO tb_Alumnos(Nombre, Apellido_paterno, Apellido_materno, Edad) VALUES ('Jose', 'Gonzales', 'Acosta', '14');
INSERT INTO tb_Alumnos(Nombre, Apellido_paterno, Apellido_materno, Edad) VALUES ('Ruben', 'Payan', 'Martnez', '15');
INSERT INTO tb_Alumnos(Nombre, Apellido_paterno, Apellido_materno, Edad) VALUES ('Veronica', 'Martinez', 'Leal', '11');
INSERT INTO tb_Alumnos(Nombre, Apellido_paterno, Apellido_materno, Edad) VALUES ('Daniela', 'Lopez', 'Mendez', '13');

INSERT INTO tb_Profesores(Nombre, Apellido_Paterno, Apellido_Materno) VALUES ('Jose', 'Romero', 'Martinez');
INSERT INTO tb_Profesores(Nombre, Apellido_Paterno, Apellido_Materno) VALUES ('Julian', 'Albarez', 'Romero');
INSERT INTO tb_Profesores(Nombre, Apellido_Paterno, Apellido_Materno) VALUES ('Jazmin', 'Aguila', 'Camacho');
INSERT INTO tb_Profesores(Nombre, Apellido_Paterno, Apellido_Materno) VALUES ('Arturo', 'Prieto', 'Fuenlabrada');
INSERT INTO tb_Profesores(Nombre, Apellido_Paterno, Apellido_Materno) VALUES ('Carina', 'Rosas', 'Paleta');

INSERT INTO tb_Informacion_Alumno(Semestre, deuda, beca, promedio) VALUES ('3', '1500', true, 8);
INSERT INTO tb_Informacion_Alumno(Semestre, deuda, beca, promedio) VALUES ('2', '1000', false, 7);
INSERT INTO tb_Informacion_Alumno(Semestre, deuda, beca, promedio) VALUES ('1', '500', false, 6);
INSERT INTO tb_Informacion_Alumno(Semestre, deuda, beca, promedio) VALUES ('3', '600', true, 9);
INSERT INTO tb_Informacion_Alumno(Semestre, deuda, beca, promedio) VALUES ('5', '900', false, 7);

INSERT INTO tb_Kardex(Año, Calificacion) VALUES ('2', 8);
INSERT INTO tb_Kardex(Año, Calificacion) VALUES ('1', 7);
INSERT INTO tb_Kardex(Año, Calificacion) VALUES ('1', 6);
INSERT INTO tb_Kardex(Año, Calificacion) VALUES ('3', 9);
INSERT INTO tb_Kardex(Año, Calificacion) VALUES ('3', 8);

INSERT INTO tb_Tutor(Nombre, Correo) VALUES ('Alejandro', 'a_ramirez@outlook.com');
INSERT INTO tb_Tutor(Nombre, Correo) VALUES ('Jose', 'j_jimenez@hotmail.com');
INSERT INTO tb_Tutor(Nombre, Correo) VALUES ('Lorena', 'Llopez@hotmail.com.mx');
INSERT INTO tb_Tutor(Nombre, Correo) VALUES ('Jazmin', 'jaz13@outlook.com');
INSERT INTO tb_Tutor(Nombre, Correo) VALUES ('Guadalupe', 'Guadalupe_J@hotmail.com');




