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
  (58, 3000, 'Santa Fe Capital', 3),
  (59, 2000, 'Rosario', 3),
  (60, 2132, 'Rafaela', 3),

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

 INSERT INTO public.valorporcentual (idvalorporcentual, fechaasignacion, fechamodificacion, valorporcentual, idcobertura, idajustedescuento, idmarca, idmodelo, idajusteemision, idajustehijo,
 idajustekilometro, idajustesiniestro, idlocalidad, idmedida, idprovincia) VALUES
  (1, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.05, null, null, 1, null, null, null, null, null, null, null, null),
  (2, '2023-02-01 12:00:00', '2023-02-01 12:00:00', 0.08, null, null, 2, null, null, null, null, null, null, null, null),
  (3, '2023-03-01 12:00:00', '2023-03-01 12:00:00', 0.07, null, null, 3, null, null, null, null, null, null, null, null),
  (4, '2023-04-01 12:00:00', '2023-04-01 12:00:00', 0.06, null, null, 4, null, null, null, null, null, null, null, null),
  (5, '2023-05-01 12:00:00', '2023-05-01 12:00:00', 0.09, null, null, 5, null, null, null, null, null, null, null, null),
  (6, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.05, null, null, null, 1, null, null, null, null, null, null, null),
  (7, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.05, null, null, null, 6, null, null, null, null, null, null, null),
  (8, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.05, null, null, null, 11, null, null, null, null, null, null, null),
  (9, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.05, null, null, null, 16, null, null, null, null, null, null, null),
  (10, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.05, null, null, null, 21, null, null, null, null, null, null, null),
  (11, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.06, null, null, null, 2, null, null, null, null, null, null, null),
  (12, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.06, null, null, null, 7, null, null, null, null, null, null, null),
  (13, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.06, null, null, null, 12, null, null, null, null, null, null, null),
  (14, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.06, null, null, null, 17, null, null, null, null, null, null, null),
  (15, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.06, null, null, null, 22, null, null, null, null, null, null, null),
  (16, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.07, null, null, null, 3, null, null, null, null, null, null, null),
  (17, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.07, null, null, null, 8, null, null, null, null, null, null, null),
  (18, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.07, null, null, null, 13, null, null, null, null, null, null, null),
  (19, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.07, null, null, null, 18, null, null, null, null, null, null, null),
  (20, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.07, null, null, null, 23, null, null, null, null, null, null, null),
  (21, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.08, null, null, null, 4, null, null, null, null, null, null, null),
  (22, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.08, null, null, null, 9, null, null, null, null, null, null, null),
  (23, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.08, null, null, null, 14, null, null, null, null, null, null, null),
  (24, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.08, null, null, null, 19, null, null, null, null, null, null, null),
  (25, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.08, null, null, null, 24, null, null, null, null, null, null, null),
  (26, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.09, null, null, null, 5, null, null, null, null, null, null, null),
  (27, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.09, null, null, null, 10, null, null, null, null, null, null, null),
  (28, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.09, null, null, null, 15, null, null, null, null, null, null, null),
  (29, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.09, null, null, null, 19, null, null, null, null, null, null, null),
  (30, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.09, null, null, null, 25, null, null, null, null, null, null, null),
  (31, '2023-02-01 12:00:00', '2023-02-01 12:00:00', 0.08, null, null, null, null, null, null, null, 1, null, null, null),
  (32, '2023-03-01 12:00:00', '2023-03-01 12:00:00', 0.07, null, null, null, null, null, null, null, 2, null, null, null),
  (33, '2023-04-01 12:00:00', '2023-04-01 12:00:00', 0.06, null, null, null, null, null, null, null, 3, null, null, null),
  (34, '2023-05-01 12:00:00', '2023-05-01 12:00:00', 0.09, null, null, null, null, null, null, null, 4, null, null, null);
  
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

INSERT INTO public.domicilio (iddomicilio, calle, dpto, nrocalle, piso, idlocalidad) VALUES
  (1, 'Lavaisse', '-', 610, 0, 20);

INSERT INTO public.persona (cuit, apellido, nombre, cuil, documento, fechanacimiento, iddomicilio, idtipodocumento, idtipoestadocivil, idtiposexo) VALUES
  (1, 'Oggier', 'Ivan Matias', 11, '11111111', '2001-01-01 12:00:00', 1, 1, 1, 1);

INSERT INTO public.cliente (idcliente, fecharegistro, profesion, idtipocondicioniva, idtipoestadocliente, cuit) VALUES
  (0100000001, '2023-11-21 12:00:00', 'Ingeniero En Sistemas', 1, 1, 1);
  
INSERT INTO public.cobertura( idcobertura, descripcion) VALUES
 (1, 'Responsabilidad Civil'),
 (2, 'Respo. Civil + Robo o incendio total'),
 (3, 'Todo Total'),
 (4, 'Terceros Completos'),
 (5, 'Todo riesgo con Franquicia');
INSERT INTO public.tipoformapago(idtipoformapago, descripcion) VALUES
(1, 'Mensual'),
(2, 'Semestral');
 
 