INSERT INTO public.valorporcentual (idvalorporcentual, fechaasignacion, fechamodificacion, valorporcentual) VALUES
  (1, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.05),
  (2, '2023-02-01 12:00:00', '2023-02-01 12:00:00', 0.08),
  (3, '2023-03-01 12:00:00', '2023-03-01 12:00:00', 0.07),
  (4, '2023-04-01 12:00:00', '2023-04-01 12:00:00', 0.06),
  (5, '2023-05-01 12:00:00', '2023-05-01 12:00:00', 0.09);

INSERT INTO public.Marca (idmarca, idvalorporcentual, nombreMarca) VALUES
  (1, 1, 'Toyota'),
  (2, 1, 'Ford'),
  (3, 1, 'Honda'),
  (4, 1, 'Chevrolet'),
  (5, 1, 'Volkswagen'),
  (6, 1, 'Nissan'),
  (7, 1, 'BMW'),
  (8, 1, 'Mercedes-Benz'),
  (9, 1, 'Audi'),
  (10, 1, 'Hyundai');


  INSERT INTO public.valorporcentual (idvalorporcentual, fechaasignacion, fechamodificacion, valorporcentual) VALUES
  (1, '2023-01-01 12:00:00', '2023-01-01 12:00:00', 0.05),
  (2, '2023-02-01 12:00:00', '2023-02-01 12:00:00', 0.08),
  (3, '2023-03-01 12:00:00', '2023-03-01 12:00:00', 0.07),
  (4, '2023-04-01 12:00:00', '2023-04-01 12:00:00', 0.06),
  (5, '2023-05-01 12:00:00', '2023-05-01 12:00:00', 0.09);

INSERT INTO public.Marca (idmarca, idvalorporcentual, nombreMarca) VALUES
  (1, 1, 'Toyota'),
  (2, 2, 'Ford'),
  (3, 3, 'Honda'),
  (4, 4, 'Chevrolet'),
  (5, 5, 'Volkswagen');

  //PROBLEMA CON LA BASE DE DATOS, POR ALGUNA RAZON NO ME DEJA INGRESAR PARA UNA MARCA EL MISMO ID PORCENTUAL



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
INSERT INTO public.modelovehiculo (idmodelo, idmarca, nombremodelo, valorporcentual) VALUES
  -- Toyota
  (1, 1, 'Corolla', 1),
  (2, 1, 'Camry', 2),
  (3, 1, 'Rav4', 1),
  (4, 1, 'Hilux', 3),
  (5, 1, 'Prius', 1),

  -- Ford
  (6, 2, 'F-150', 2),
  (7, 2, 'Escape', 4),
  (8, 2, 'Mustang', 4),
  (9, 2, 'Explorer', 4),
  (10, 2, 'Focus', 2),

  -- Honda
  (11, 3, 'Civic', 5),
  (12, 3, 'Accord', 4),
  (13, 3, 'CR-V', 5),
  (14, 3, 'Pilot', 5),
  (15, 3, 'Fit', 1),

  -- Chevrolet
  (16, 4, 'Silverado', 3),
  (17, 4, 'Equinox', 2),
  (18, 4, 'Malibu', 3),
  (19, 4, 'Traverse', 2),
  (20, 4, 'Camaro', 4),

  -- Volkswagen
  (21, 5, 'Golf', 2),
  (22, 5, 'Jetta', 2),
  (23, 5, 'Tiguan', 3),
  (24, 5, 'Atlas', 4),
  (25, 5, 'Passat', 5);

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
  
insert into TipoEstadoCivil(idtipoestadocivil, descripcion)values(1,'Soltero/a'),(2,'Casado/a'),(3,'Viudo/a'),(4,'Divorciado/a'),(5,'Separado/a');

insert into TipoSexo(idtiposexo, descripcion)values(1,'Femenino'),(2,'Masculino');
