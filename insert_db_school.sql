USE db_school;

INSERT INTO tb_Alumnos(Nombre_alumno, Apellido_paterno, Apellido_materno, Edad_alumno, id_profesor, id_tutor) VALUES ('Alex', 'Ramirez', 'Fuentes', '12',1,1);
INSERT INTO tb_Alumnos(Nombre_alumno, Apellido_paterno, Apellido_materno, Edad_alumno, id_profesor, id_tutor) VALUES ('Jose', 'Gonzales', 'Acosta', '14',2,2);
INSERT INTO tb_Alumnos(Nombre_alumno, Apellido_paterno, Apellido_materno, Edad_alumno, id_profesor, id_tutor) VALUES ('Ruben', 'Payan', 'Martnez', '15',3,3);
INSERT INTO tb_Alumnos(Nombre_alumno, Apellido_paterno, Apellido_materno, Edad_alumno, id_profesor, id_tutor) VALUES ('Veronica', 'Martinez', 'Leal', '11',4,4);
INSERT INTO tb_Alumnos(Nombre_alumno, Apellido_paterno, Apellido_materno, Edad_alumno, id_profesor, id_tutor) VALUES ('Daniela', 'Lopez', 'Mendez', '13',5,5);

INSERT INTO tb_Profesor(Nombre_profesor, Apellido_Paterno_profesor, Apellido_Materno_profesor) VALUES ('Jose', 'Romero', 'Martinez');
INSERT INTO tb_Profesor(Nombre_profesor, Apellido_Paterno_profesor, Apellido_Materno_profesor) VALUES ('Julian', 'Albarez', 'Romero');
INSERT INTO tb_Profesor(Nombre_profesor, Apellido_Paterno_profesor, Apellido_Materno_profesor) VALUES ('Jazmin', 'Aguila', 'Camacho');
INSERT INTO tb_Profesor(Nombre_profesor, Apellido_Paterno_profesor, Apellido_Materno_profesor) VALUES ('Arturo', 'Prieto', 'Fuenlabrada');
INSERT INTO tb_Profesor(Nombre_profesor, Apellido_Paterno_profesor, Apellido_Materno_profesor) VALUES ('Carina', 'Rosas', 'Paleta');

INSERT INTO tb_Informacion_Alumno(Semestre_alumno, deuda_alumno, beca_alumno, promedio_alumno) VALUES ('3', '1500', true, 8);
INSERT INTO tb_Informacion_Alumno(Semestre_alumno, deuda_alumno, beca_alumno, promedio_alumno) VALUES ('2', '1000', false, 7);
INSERT INTO tb_Informacion_Alumno(Semestre_alumno, deuda_alumno, beca_alumno, promedio_alumno) VALUES ('1', '500', false, 6);
INSERT INTO tb_Informacion_Alumno(Semestre_alumno, deuda_alumno, beca_alumno, promedio_alumno) VALUES ('3', '600', true, 9);
INSERT INTO tb_Informacion_Alumno(Semestre_alumno, deuda_alumno, beca_alumno, promedio_alumno) VALUES ('5', '900', false, 7);

INSERT INTO tb_Kardex(Año_kardex, Calificacion_kardex) VALUES ('2', 8);
INSERT INTO tb_Kardex(Año_kardex, Calificacion_kardex) VALUES ('1', 7);
INSERT INTO tb_Kardex(Año_kardex, Calificacion_kardex) VALUES ('1', 6);
INSERT INTO tb_Kardex(Año_kardex, Calificacion_kardex) VALUES ('3', 9);
INSERT INTO tb_Kardex(Año_kardex, Calificacion_kardex) VALUES ('3', 8);

INSERT INTO tb_Tutor(Nombre_tutor, Correo_tutor) VALUES ('Alejandro', 'a_ramirez@outlook.com');
INSERT INTO tb_Tutor(Nombre_tutor, Correo_tutor) VALUES ('Jose', 'j_jimenez@hotmail.com');
INSERT INTO tb_Tutor(Nombre_tutor, Correo_tutor) VALUES ('Lorena', 'Llopez@hotmail.com.mx');
INSERT INTO tb_Tutor(Nombre_tutor, Correo_tutor) VALUES ('Jazmin', 'jaz13@outlook.com');
INSERT INTO tb_Tutor(Nombre_tutor, Correo_tutor) VALUES ('Guadalupe', 'Guadalupe_J@hotmail.com');




