-- Companies
INSERT INTO companies VALUES (DEFAULT, 'Alphabet', 'https://www.google.com');

INSERT INTO companies VALUES (DEFAULT, 'Telefónica', 'https://www.telefonica.com');

INSERT INTO companies VALUES (DEFAULT, 'Tesla', 'https://www.tesla.com');

-- People
INSERT INTO people VALUES 
	(DEFAULT, 'José Rivas', 'jorivas@gmail.com', '04241342343', 'Calle 10, El Cafetal, Caracas');

INSERT INTO people VALUES 
	(DEFAULT, 'Pedro Gómez', 'pjgomez@gmail.com', '04141355343', 'Calle Libertad, Chacaito, Caracas');

-- Jobs
INSERT INTO jobs VALUES 
	(DEFAULT, 1, 1, 'Especialista 2', 'Especialista en sistemas TI, SAP y Oracle', 
	to_timestamp('2008-07-23','yyyy-mm-dd'), to_timestamp('2010-01-15','yyyy-mm-dd'));

INSERT INTO jobs VALUES 
	(DEFAULT, 1, 1, 'Gerente Júnior', 'Gerente Júnior de TI', 
	to_timestamp('2010-01-20','yyyy-mm-dd'), to_timestamp('2014-05-05','yyyy-mm-dd'));

INSERT INTO jobs VALUES 
	(DEFAULT, 2, 1, 'Gerente', 'Gerente de Sistemas TI', 
	to_timestamp('2014-06-13','yyyy-mm-dd'), to_timestamp('2018-01-25','yyyy-mm-dd'));

INSERT INTO jobs VALUES 
	(DEFAULT, 2, 2, 'Auxiliar de ventas', 'Auxiliar de ventas en productos de belleza', 
	to_timestamp('2008-01-03','yyyy-mm-dd'), to_timestamp('2009-09-15','yyyy-mm-dd'));

INSERT INTO jobs VALUES 
	(DEFAULT, 2, 2, 'Especialista de distribución', 'Especialista en distribución de productos de belleza', 
	to_timestamp('2009-10-20','yyyy-mm-dd'), to_timestamp('2014-01-25','yyyy-mm-dd'));

INSERT INTO jobs VALUES 
	(DEFAULT, 3, 2, 'Gerente de Ventas y Despacho', 'Gerente de ventas y despacho a domicilio', 
	to_timestamp('2014-01-30','yyyy-mm-dd'), to_timestamp('2019-06-24','yyyy-mm-dd'));
	




