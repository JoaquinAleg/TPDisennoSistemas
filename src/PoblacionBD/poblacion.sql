INSERT INTO public.Marca (idmarca, nombreMarca) VALUES
  (1, 'Toyota'),
  (2, 'Ford'),
  (3, 'Honda'),
  (4, 'Chevrolet'),
  (5, 'Volkswagen');

INSERT INTO public.Pais (idpais, nombrePais) VALUES
  (1, 'Argentina');

INSERT INTO public.provincia (idprovincia, nombreprovincia, idpais) VALUES
  (1, 'Buenos Aires', 1),
  (2, 'Catamarca', 1),
  (3, 'Chaco', 1),
  (4, 'Chubut', 1),
  (5, 'Córdoba', 1),
  (6, 'Corrientes', 1),
  (7, 'Entre Ríos', 1),
  (8, 'Formosa', 1),
  (9, 'Jujuy', 1),
  (10, 'La Pampa', 1),
  (11, 'La Rioja', 1),
  (12, 'Mendoza', 1),
  (13, 'Misiones', 1),
  (14, 'Neuquén', 1),
  (15, 'Río Negro', 1),
  (16, 'Salta', 1),
  (17, 'San Juan', 1),
  (18, 'San Luis', 1),
  (19, 'Santa Cruz', 1),
  (20, 'Santa Fe', 1),
  (21, 'Santiago del Estero', 1),
  (22, 'Tierra del Fuego', 1),
  (23, 'Tucumán', 1);

-- Insertando datos en la tabla Localidad para las 3 ciudades más importantes de cada provincia de Argentina
INSERT INTO public.localidad (idlocalidad, codigopostal, nombrelocalidad, idprovincia) VALUES
  -- Buenos Aires
  (1, 1000, 'Ciudad Autónoma de Buenos Aires', 1),
  (2, 1603, 'La Matanza', 1),
  (3, 1900, 'La Plata', 1),

  -- Catamarca
  (4, 4700, 'San Fernando del Valle de Catamarca', 2),
  (5, 4701, 'San Isidro', 2),
  (6, 4705, 'Santa Rosa', 2),

  -- Chaco
  (7, 3500, 'Resistencia', 3),
  (8, 3501, 'Barranqueras', 3),
  (9, 3503, 'Fontana', 3),

  -- Chubut
  (10, 9000, 'Comodoro Rivadavia', 4),
  (11, 9100, 'Trelew', 4),
  (12, 9120, 'Rawson', 4),

  -- Córdoba
  (13, 5000, 'Córdoba Capital', 5),
  (14, 5147, 'Villa María', 5),
  (15, 5800, 'Río Cuarto', 5),

  -- Corrientes
  (16, 3400, 'Corrientes Capital', 6),
  (17, 3470, 'Goya', 6),
  (18, 3450, 'Mercedes', 6),

  -- Entre Ríos
  (19, 3100, 'Paraná', 7),
  (20, 3200, 'Concordia', 7),
  (21, 3260, 'Gualeguaychú', 7),

  -- Formosa
  (22, 3600, 'Formosa Capital', 8),
  (23, 3601, 'Clorinda', 8),
  (24, 3602, 'Pirané', 8),

  -- Jujuy
  (25, 4600, 'San Salvador de Jujuy', 9),
  (26, 4608, 'Palpalá', 9),
  (27, 4618, 'Libertador General San Martín', 9),

  -- La Pampa
  (28, 6300, 'Santa Rosa', 10),
  (29, 6380, 'General Pico', 10),
  (30, 6360, 'Toay', 10),

  -- La Rioja
  (31, 5300, 'La Rioja Capital', 11),
  (32, 5380, 'Chilecito', 11),
  (33, 5310, 'Arauco', 11),

  -- Mendoza
  (34, 5500, 'Mendoza Capital', 12),
  (35, 5531, 'Godoy Cruz', 12),
  (36, 5600, 'San Rafael', 12),

  -- Misiones
  (37, 3300, 'Posadas', 13),
  (38, 3370, 'Eldorado', 13),
  (39, 3360, 'Puerto Iguazú', 13),

  -- Neuquén
  (40, 8300, 'Neuquén Capital', 14),
  (41, 8309, 'Cutral Có', 14),
  (42, 8324, 'Plottier', 14),

  -- Río Negro
  (43, 8500, 'General Roca', 15),
  (44, 8332, 'Viedma', 15),
  (45, 8360, 'Cipolletti', 15),

  -- Salta
  (46, 4400, 'Salta Capital', 16),
  (47, 4100, 'San Ramón de la Nueva Orán', 16),
  (48, 4427, 'Cerrillos', 16),

  -- San Juan
  (49, 5400, 'San Juan Capital', 17),
  (50, 5411, 'Rawson', 17),
  (51, 5405, 'Pocito', 17),

  -- San Luis
  (52, 5700, 'San Luis Capital', 18),
  (53, 5730, 'Villa Mercedes', 18),
  (54, 5721, 'La Punta', 18),

  -- Santa Cruz
  (55, 9400, 'Río Gallegos', 19),
  (56, 9015, 'Caleta Olivia', 19),
  (57, 9405, 'El Calafate', 19),

  -- Santa Fe
  (58, 3000, 'Santa Fe Capital', 20),
  (59, 2000, 'Rosario', 20),
  (60, 2132, 'Rafaela', 20),

  -- Santiago del Estero
  (61, 4200, 'Santiago del Estero Capital', 21),
  (62, 4201, 'La Banda', 21),
  (63, 4230, 'Termas de Río Hondo', 21),

  -- Tierra del Fuego
  (64, 9410, 'Ushuaia', 22),
  (65, 9415, 'Río Grande', 22),
  (66, 9420, 'Tolhuin', 22),

  -- Tucumán
  (67, 4000, 'San Miguel de Tucumán', 23),
  (68, 4107, 'Yerba Buena', 23),
  (69, 4160, 'Alderetes', 23);


-- Insertando datos en la tabla ModeloVehiculo para algunas marcas de vehículos
INSERT INTO public.modelovehiculo (idmodelo, idmarca, nombremodelo) VALUES
  -- Toyota
  (1, 1, 'Corolla'),
  (2, 1, 'Camry'),
  (3, 1, 'Rav4'),
  (4, 1, 'Hilux'),
  (5, 1, 'Prius'),

  -- Ford
  (6, 2, 'F-150'),
  (7, 2, 'Escape'),
  (8, 2, 'Mustang'),
  (9, 2, 'Explorer'),
  (10, 2, 'Focus'),

  -- Honda
  (11, 3, 'Civic'),
  (12, 3, 'Accord'),
  (13, 3, 'CR-V'),
  (14, 3, 'Pilot'),
  (15, 3, 'Fit'),

  -- Chevrolet
  (16, 4, 'Silverado'),
  (17, 4, 'Equinox'),
  (18, 4, 'Malibu'),
  (19, 4, 'Traverse'),
  (20, 4, 'Camaro'),

  -- Volkswagen
  (21, 5, 'Golf'),
  (22, 5, 'Jetta'),
  (23, 5, 'Tiguan'),
  (24, 5, 'Atlas'),
  (25, 5, 'Passat');

-- Insertando datos en la tabla AnioFabricacion para años desde 1980
INSERT INTO public.aniofabricacion (idaniofabricacion, aniofabricacion) VALUES
  (1, 1980),
  (2, 1981),
  (3, 1982),
  (4, 1983),
  (5, 1984),
  (6, 1985),
  (7, 1986),
  (8, 1987),
  (9, 1988),
  (10, 1989),
  (11, 1990),
  (12, 1991),
  (13, 1992),
  (14, 1993),
  (15, 1994),
  (16, 1995),
  (17, 1996),
  (18, 1997),
  (19, 1998),
  (20, 1999),
  (21, 2000),
  (22, 2001),
  (23, 2002),
  (24, 2003),
  (25, 2004),
  (26, 2005),
  (27, 2006),
  (28, 2007),
  (29, 2008),
  (30, 2009),
  (31, 2010),
  (32, 2011),
  (33, 2012),
  (34, 2013),
  (35, 2014),
  (36, 2015),
  (37, 2016),
  (38, 2017),
  (39, 2018),
  (40, 2019),
  (41, 2020),
  (42, 2021),
  (43, 2022),
  (44, 2023);

-- Asociaciones para Toyota
INSERT INTO public.fabricado (idaniofabricacion, idmodelo) VALUES
  (1, 1), (2, 1), (3, 1), (4, 1), (5, 1),
  (6, 2), (7, 2), (8, 2), (9, 2), (10, 2),
  (11, 3), (12, 3), (13, 3), (14, 3), (15, 3),
  (16, 4), (17, 4), (18, 4), (19, 4), (20, 4),
  (21, 5), (22, 5), (23, 5), (24, 5), (25, 5);

-- Asociaciones para Ford
INSERT INTO public.fabricado (idaniofabricacion, idmodelo) VALUES
  (6, 6), (7, 6), (8, 6), (9, 6), (10, 6),
  (11, 7), (12, 7), (13, 7), (14, 7), (15, 7),
  (16, 8), (17, 8), (18, 8), (19, 8), (20, 8),
  (21, 9), (22, 9), (23, 9), (24, 9), (25, 9),
  (26, 10), (27, 10), (28, 10), (29, 10), (30, 10);

-- Asociaciones para Honda
INSERT INTO public.fabricado (idaniofabricacion, idmodelo) VALUES
  (11, 11), (12, 11), (13, 11), (14, 11), (15, 11),
  (16, 12), (17, 12), (18, 12), (19, 12), (20, 12),
  (21, 13), (22, 13), (23, 13), (24, 13), (25, 13),
  (26, 14), (27, 14), (28, 14), (29, 14), (30, 14),
  (31, 15), (32, 15), (33, 15), (34, 15), (35, 15);

-- Asociaciones para Chevrolet
INSERT INTO public.fabricado (idaniofabricacion, idmodelo) VALUES
  (16, 16), (17, 16), (18, 16), (19, 16), (20, 16),
  (21, 17), (22, 17), (23, 17), (24, 17), (25, 17),
  (26, 18), (27, 18), (28, 18), (29, 18), (30, 18),
  (31, 19), (32, 19), (33, 19), (34, 19), (35, 19),
  (36, 20), (37, 20), (38, 20), (39, 20), (40, 20);

-- Asociaciones para Volkswagen
INSERT INTO public.fabricado (idaniofabricacion, idmodelo) VALUES
  (21, 21), (22, 21), (23, 21), (24, 21), (25, 21),
  (26, 22), (27, 22), (28, 22), (29, 22), (30, 22),
  (31, 23), (32, 23), (33, 23), (34, 23), (35, 23),
  (36, 24), (37, 24), (38, 24), (39, 24), (40, 24),
  (41, 25), (42, 25), (43, 25), (44, 25);

INSERT INTO public.ajusteporsiniestro (idajustesiniestro, cantidadsiniestros) VALUES
  (1, 0), (2, 1), (3, 2), (4, 3);
  
  
  
 INSERT INTO public.valorporcentual (idvalorporcentual, fechaasignacion, fechamodificacion, valorporcentual)
VALUES
  (1, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.05),
  (2, '2023-02-01 12:00:00', '2023-02-01 12:00:00', 0.08),
  (3, '2023-03-01 12:00:00', '2023-03-01 12:00:00', 0.07),
  (4, '2023-04-01 12:00:00', '2023-04-01 12:00:00', 0.06),
  (5, '2023-05-01 12:00:00', '2023-05-01 12:00:00', 0.09),
  (6, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.05),
  (7, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.05),
  (8, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.05),
  (9, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.05),
  (10, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.05),
  (11, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.06),
  (12, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.06),
  (13, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.06),
  (14, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.06),
  (15, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.06),
  (16, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.07),
  (17, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.07),
  (18, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.07),
  (19, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.07),
  (20, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.07),
  (21, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.08),
  (22, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.08),
  (23, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.08),
  (24, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.08),
  (25, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.08),
  (26, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.09),
  (27, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.09),
  (28, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.09),
  (29, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.09),
  (30, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.09),
  (31, '2023-02-01 12:00:00', '2023-02-01 12:00:00', 0.08),
  (32, '2023-03-01 12:00:00', '2023-03-01 12:00:00', 0.07),
  (33, '2023-04-01 12:00:00', '2023-04-01 12:00:00', 0.06),
  (34, '2023-05-01 12:00:00', '2023-05-01 12:00:00', 0.09);
INSERT INTO public.ValorMarca(idmarca, idvalorporcentual) VALUES
(1,1),
(2,2),
(3,3),
(4,4),
(5,5);

INSERT INTO public.valormodelo(idmodelo, idvalorporcentual) VALUES
(1,6),
(6,7),
(11,8),
(16,9),

(21,10),
(2,11),
(7,12),
(12,13),
(17,14),
(22,15),
(3,16),
(8,17),
(13,18),
(18,19),
(23,20),
(4,21),
(9,22),
(14,23),
(19,24),
(24,25),
(5,26),
(10,27),
(15,28),
(19,29),
(25,30);

INSERT INTO public.valorsiniestro(idajustesiniestro, idvalorporcentual) VALUES
(1,31),
(2,32),
(3,33),
(4,34);


  
INSERT INTO public.tipocondicioniva (idtipocondicioniva, descripcion) VALUES
  (1, 'IVA Responsable Inscripto'),
  (2, 'IVA Responsable no Inscripto'),
  (3, 'IVA no Responsable'),
  (4, 'IVA Sujeto Exento'),
  (5, 'Consumidor Final'),
  (6, 'Responsable Monotributo'),
  (7, 'Sujeto no Categorizado'),
  (8, 'Cliente Exterior'),
  (9, 'IVA Liberado - Ley Nro 19640'),
  (10, 'IVA Responsable Inscripto - Agente de Persepcion'),
  (11, 'Pequenio Contribuyente Eventual'),
  (12, 'Monotributista Social'),
  (13, 'Pequenio Contribuyente Eventual Social'),
  (14, 'Proveedor Exterior');

INSERT INTO public.tipoestadocliente (idtipoestadocliente, descripcion) VALUES
  (1, 'ACTIVO'),
  (2, 'SUSPENDIDO'),
  (3, 'INACTIVO');

INSERT INTO public.tiposexo (idtiposexo, descripcion) VALUES
  (1, 'Hombre'),
  (2, 'Mujer');

INSERT INTO public.tipoestadocivil (idtipoestadocivil, descripcion) VALUES
  (1, 'Soltero/a'),
  (2, 'Casado/a'),
  (3, 'Viudo/a'),
  (4, 'EnPareja');

INSERT INTO public.tipodocumento (idtipodocumento, descripcion) VALUES
  (1, 'DNI Ejemplar A'),
  (2, 'DNI Ejemplar B'),
  (3, 'DNI Ejemplar C'),
  (4, 'DNI Ejemplar D');
  
INSERT INTO public.tipocondicioncliente(idtipocondicioncliente, descripcion) VALUES
	(1, 'Normal'),
	(2, 'Plata');
  
INSERT INTO public.domicilio (iddomicilio, calle, dpto, nrocalle, piso, idlocalidad) VALUES
  (1, 'Lavaisse', '-', 610, 0, 20),
  (2, 'Patricio Cullen', '-', 6161, 0, 20),
  (3, 'Antonia Godoy', '-', 6145, 0, 20),
  (4, 'Angel Cassanello', '-', 654, 0, 20),
  (5, 'Avenida de Mayo', '2A', 1234, 3, 10),
  (6, 'Calle San Martín', '6B', 5678, 5, 25),
  (7, 'Avenida 9 de Julio', '1C', 9876, 8, 42),
  (8, 'Calle Florida', '3D', 4321, 2, 15),
  (9, 'Avenida Corrientes', '4E', 2468, 7, 31),
  (10, 'Calle Belgrano', '5F', 1357, 4, 50),
  (11, 'Avenida Rivadavia', '2G', 8642, 6, 12),
	(12, 'Calle Sarmiento', '7H', 9753, 9, 21),
	(13, 'Avenida Pueyrredón', '1I', 1235, 1, 7),
	(14, 'Calle Reconquista', '8J', 5679, 5, 18),
	(15, 'Avenida Callao', '3K', 9877, 3, 35),
	(16, 'Calle Lavalle', '4L', 4322, 7, 58),
	(17, 'Avenida Santa Fe', '5M', 2469, 2, 63),
	(18, 'Calle Cerrito', '6N', 1358, 4, 27),
	(19, 'Avenida Entre Ríos', '7O', 8643, 8, 8),
	(20, 'Calle Tucumán', '2P', 9754, 6, 46),
	(21, 'Avenida Scalabrini Ortiz', '1Q', 1236, 5, 55),
	(22, 'Calle Paraguay', '8R', 5680, 3, 19),
	(23, 'Avenida Leandro N. Alem', '3S', 9878, 1, 13),
	(24, 'Calle Uruguay', '4T', 4323, 9, 29),
	(25, 'Avenida Córdoba', '5U', 8644, 4, 14),
	(26, 'Calle Balcarce', '6V', 9755, 6, 23),
	(27, 'Avenida Mendoza', '2W', 1237, 2, 37),
	(28, 'Calle Maipú', '7X', 5681, 8, 52),
	(29, 'Avenida San Juan', '1Y', 9879, 3, 6),
	(30, 'Calle Pasco', '8Z', 4324, 1, 44),
	(31, 'Avenida Jujuy', '3AA', 24610, 5, 61),
	(32, 'Calle Pellegrini', '4BB', 1359, 7, 28),
	(33, 'Avenida 25 de Mayo', '5CC', 8645, 4, 11),
	(34, 'Calle Viamonte', '6DD', 9756, 2, 20),
	(35, 'Avenida Independencia', '7EE', 1238, 9, 34),
	(36, 'Calle Azopardo', '2FF', 5682, 6, 49),
	(37, 'Avenida Huergo', '1GG', 9880, 3, 17),
	(38, 'Calle Pacheco de Melo', '8HH', 4325, 5, 26),
	(39, 'Avenida Almafuerte', '3II', 24611, 1, 9),
	(40, 'Calle Moreno', '4JJ', 1360, 8, 16),
	(41, 'Avenida Scalabrini Ortiz', '5KK', 8646, 7, 32),
	(42, 'Calle Sáenz Peña', '6LL', 9757, 2, 22),
	(43, 'Avenida Belgrano', '7MM', 1239, 4, 38),
	(44, 'Calle Pueyrredón', '2NN', 5683, 6, 53);


INSERT INTO public.persona (idpersona, apellido, cuil, documento, fechanacimiento, nombre, iddomicilio, idtipodocumento, idtipoestadocivil, idtiposexo)
VALUES
  (1, 'Oggier', '11111111', '11111111', '2001-01-01', 'Ivan Matias', 1, 1, 1, 1),
	(2, 'Franzen', '22222222', '22222222', '2000-10-19', 'Fernando Jose', 2, 1, 1, 1),
	(3, 'Bracalenti', '33333333', '33333333', '2001-01-01', 'Jose', 3, 1, 1, 1),
	(4, 'Alegre', '44444444', '44444444', '2001-01-01', 'Joaquin', 4, 1, 1, 1),
  (5, 'Gonzalez', '20-12345678-9', '12345678', '1990-05-15', 'Maria', 5, 1, 2, 1),
  (6, 'Rodriguez', '27-98765432-1', '98765432', '1985-08-22', 'Juan', 6, 2, 3, 2),
  (7, 'Lopez', '23-87654321-0', '87654321', '1982-11-10', 'Ana', 7, 3, 1, 1),
  (8, 'Fernandez', '21-23456789-8', '23456789', '1995-02-28', 'Carlos', 8, 4, 4, 2),
  (9, 'Martinez', '24-34567890-7', '34567890', '1987-04-17', 'Laura', 9, 1, 2, 1),
  (10, 'Perez', '22-78901234-6', '78901234', '1992-09-05', 'Miguel', 10, 2, 3, 2),
  (11, 'Gomez', '25-56789012-5', '56789012', '1980-12-03', 'Silvia', 11, 3, 1, 1),
  (12, 'Diaz', '28-12349876-4', '12349876', '1998-03-20', 'Gabriel', 12, 4, 4, 2),
  (13, 'Sanchez', '26-98761234-3', '98761234', '1983-06-08', 'Patricia', 13, 1, 2, 1),
  (14, 'Romero', '29-87612345-2', '87612345', '1989-01-25', 'Hector', 14, 2, 3, 2),
  (15, 'Alvarez', '30-23456789-1', '23456789', '1994-07-13', 'Carmen', 15, 3, 1, 1),
  (16, 'Torres', '31-34567890-0', '34567890', '1986-10-30', 'Diego', 16, 4, 4, 2),
  (17, 'Gimenez', '32-78901234-9', '78901234', '1991-04-06', 'Luis', 17, 1, 2, 1),
  (18, 'Ramos', '33-56789012-8', '56789012', '1984-08-23', 'Elena', 18, 2, 3, 2),
  (19, 'Suarez', '34-12349876-7', '12349876', '1997-01-10', 'Jorge', 19, 3, 1, 1),
  (20, 'Molina', '35-98761234-6', '98761234', '1981-05-28', 'Sofia', 20, 4, 4, 2),
  (21, 'Castro', '36-87612345-5', '87612345', '1993-10-15', 'Ricardo', 21, 1, 2, 1),
  (22, 'Hernandez', '37-23456789-4', '23456789', '1988-02-02', 'Monica', 22, 2, 3, 2),
  (23, 'Gutierrez', '38-34567890-3', '34567890', '1996-06-20', 'Pablo', 23, 3, 1, 1),
  (24, 'Reyes', '39-78901234-2', '78901234', '1982-11-07', 'Isabel', 24, 4, 4, 2),
  (25, 'Delgado', '40-56789012-1', '56789012', '1995-03-26', 'Fernando', 25, 1, 2, 1),
  (26, 'Ortiz', '41-12349876-0', '12349876', '1987-07-13', 'Adriana', 26, 2, 3, 2),
  (27, 'Vargas', '42-98761234-9', '98761234', '1992-12-30', 'Alberto', 27, 3, 1, 1),
  (28, 'Benitez', '43-87612345-8', '87612345', '1980-04-16', 'Carolina', 28, 4, 4, 2),
  (29, 'Morales', '44-23456789-7', '23456789', '1989-09-03', 'Raul', 29, 1, 2, 1),
  (30, 'Luna', '45-34567890-6', '34567890', '1986-01-21', 'Julia', 30, 2, 3, 2),
  (31, 'Aguilar', '46-78901234-5', '78901234', '1991-06-09', 'Roberto', 31, 3, 1, 1),
  (32, 'Flores', '47-56789012-4', '56789012', '1984-10-27', 'Marta', 32, 4, 4, 2),
  (33, 'Ibanez', '48-12349876-3', '12349876', '1997-03-15', 'Alejandro', 33, 1, 2, 1),
  (34, 'Sosa', '49-98761234-2', '98761234', '1981-07-02', 'Natalia', 34, 2, 3, 2),
  (35, 'Rojas', '50-87612345-1', '87612345', '1994-11-19', 'Santiago', 35, 3, 1, 1),
  (36, 'Mendez', '51-23456789-0', '23456789', '1988-04-07', 'Eva', 36, 4, 4, 2),
  (37, 'Pereyra', '52-34567890-9', '34567890', '1993-08-25', 'Hugo', 37, 1, 2, 1),
  (38, 'Cabrera', '53-78901234-8', '78901234', '1985-01-12', 'Liliana', 38, 2, 3, 2),
  (39, 'Navarro', '54-56789012-7', '56789012', '1990-06-30', 'Mario', 39, 3, 1, 1),
  (40, 'Guzman', '55-12349876-6', '12349876', '1983-10-18', 'Cecilia', 40, 4, 4, 2),
  (41, 'Lopez', '56-98761234-5', '98761235', '1988-07-03', 'Gustavo', 41, 1, 2, 1),
  (42, 'Fernandez', '57-87612345-4', '87612346', '1993-11-20', 'Carla', 42, 2, 3, 2),
  (43, 'Martinez', '58-23456789-3', '23456790', '1985-04-07', 'Daniel', 43, 3, 1, 1),
  (44, 'Gomez', '59-34567890-2', '34567891', '1990-08-25', 'Mariana', 44, 4, 4, 2);
  
INSERT INTO public.cliente (idcliente, numerocliente, fecharegistro, profesion, idtipocondicioniva, idtipoestadocliente, idtipocondicioncliente, idpersona)
VALUES 
	(1, '01-00000001', '2023-11-21', 'Ingeniero En Sistemas', 1, 1, 1, 1),
	(2, '01-00000002', '2023-11-21', 'Ingeniero En Sistemas', 1, 1, 1, 2),
	(3, '01-00000003', '2023-11-21', 'Ingeniero En Sistemas', 1, 1, 1, 3),
	(4, '01-00000004', '2023-11-21', 'Ingeniero En Sistemas', 1, 1, 1, 4),
	(5, '01-00000005', '1980-01-01', 'Profesion1', 1, 1, 1, 5),
	(6, '01-00000006', '1981-02-15', 'Profesion2', 2, 2, 1, 6),
	(7, '01-00000007', '1982-03-20', 'Profesion3', 3, 3, 1, 7),
	(8, '01-00000008', '1983-04-25', 'Profesion4', 4, 1, 1, 8),
	(9, '01-00000009', '1984-05-30', 'Profesion5', 5, 2, 1, 9),
	(10, '01-00000010', '1985-06-05', 'Profesion6', 6, 3, 1, 10),
	(11, '01-00000011', '1986-07-10', 'Profesion7', 7, 1, 1, 11),
	(12, '01-00000012', '1987-08-15', 'Profesion8', 8, 2, 1, 12),
	(13, '01-00000013', '1988-09-20', 'Profesion9', 9, 3, 1, 13),
	(14, '01-00000014', '1989-10-25', 'Profesion10', 10, 1, 1, 14),
	(15, '01-00000015', '1990-11-30', 'Profesion11', 11, 2, 1, 15),
	(16, '01-00000016', '1991-12-05', 'Profesion12', 12, 3, 1, 16),
	(17, '01-00000017', '1992-01-10', 'Profesion13', 13, 1, 1, 17),
	(18, '01-00000018', '1993-02-15', 'Profesion14', 14, 2, 1, 18),
	(19, '01-00000019', '1994-03-20', 'Profesion15', 1, 3, 1, 19),
	(20, '01-00000020', '1995-04-25', 'Profesion16', 2, 1, 1, 20),
	(21, '01-00000021', '1996-05-30', 'Profesion17', 3, 2, 1, 21),
	(22, '01-00000022', '1997-06-05', 'Profesion18', 4, 3, 1, 22),
	(23, '01-00000023', '1998-07-10', 'Profesion19', 5, 1, 1, 23),
	(24, '01-00000024', '1999-08-15', 'Profesion20', 6, 2, 1, 24),
	(25, '01-00000025', '2000-09-20', 'Profesion21', 7, 3, 1, 25),
	(26, '01-00000026', '2001-10-25', 'Profesion22', 8, 1, 1, 26),
	(27, '01-00000027', '2002-11-30', 'Profesion23', 9, 2, 1, 27),
	(28, '01-00000028', '2003-12-05', 'Profesion24', 10, 3, 1, 28),
	(29, '01-00000029', '2004-01-10', 'Profesion25', 11, 1, 1, 29),
	(30, '01-00000030', '2005-02-15', 'Profesion26', 12, 2, 1, 30),
	(31, '01-00000031', '2006-03-20', 'Profesion27', 13, 3, 1, 31),
	(32, '01-00000032', '2007-04-25', 'Profesion28', 14, 1, 1, 32),
	(33, '01-00000033', '2008-05-30', 'Profesion29', 1, 2, 1, 33),
	(34, '01-00000034', '2009-06-05', 'Profesion30', 2, 3, 1, 34),
	(35, '01-00000035', '2010-07-10', 'Profesion31', 3, 1, 1, 35),
	(36, '01-00000036', '2011-08-15', 'Profesion32', 4, 2, 1, 36),
	(37, '01-00000037', '2012-09-20', 'Profesion33', 5, 3, 1, 37),
	(38, '01-00000038', '2013-10-25', 'Profesion34', 6, 1, 1, 38),
	(39, '01-00000039', '2014-11-30', 'Profesion35', 7, 2, 1, 39),
	(40, '01-00000040', '2015-12-05', 'Profesion36', 8, 3, 1, 40),
	(41, '01-00000041', '2016-01-10', 'Profesion37', 9, 1, 1, 41),
	(42, '01-00000042', '2017-02-15', 'Profesion38', 10, 2, 1, 42),
	(43, '01-00000043', '2018-03-20', 'Profesion39', 11, 3, 1, 43),
	(44, '01-00000044', '2019-04-25', 'Profesion40', 12, 1, 1, 44);
  
INSERT INTO public.cobertura( idcobertura, descripcion) VALUES
	(1, 'Responsabilidad Civil'),
	(2, 'Respo. Civil + Robo o incendio total'),
	(3, 'Todo Total'),
	(4, 'Terceros Completos'),
	(5, 'Todo riesgo con Franquicia');
INSERT INTO public.tipoformapago(idformapago, descripcion) VALUES
	(1, 'Mensual'),
	(2, 'Semestral');
INSERT INTO public.medidaseguridad (idmedida, tipomedidaseguridad) VALUES
	(1, 'Garage'),
	(2, 'Alarma'),
	(3, 'Tuercas'),
	(4, 'Rastreo Vehicular');
 
INSERT INTO public.ajustepordescuentounidadad (idajustedescuento, ajustedescuento)
VALUES
  (1, 0.0),
  (2, 5.0),
  (3, 20.0),
  (4, 15.0),
  (5, 20.0),
  (6, 22.0),
  (7, 30.0);
INSERT INTO public.ajusteporemision (idajusteemision, ajusteemision)
VALUES
    (1, 5);
 
INSERT INTO public.ajusteporkilometro (idajustekilometro, escalakm)
VALUES
	(1,0.0),
	(2, 10000.0),
	(3, 20000.0),
	(4, 30000.0);
 
INSERT INTO public.ajustehijo (idajustehijo, canthijos)
VALUES
	(0, 0),
	(1, 1),
	(2, 2),
	(3, 3),
	(4, 4),
	(5, 5),
	(6, 6),
	(7, 7),
	(8, 8),
	(9, 9),
	(10, 10),
	(11, 11),
	(12, 12),
	(13, 13),
	(14, 14),
	(15, 15),
	(16, 16),
	(17, 17),
	(18, 18),
	(19, 19),
	(20, 20);
