

CREATE TABLE IF NOT EXISTS public.permiso
(
    id serial PRIMARY KEY,
    name character varying(100) NOT NULL,
    id_rol integer NOT NULL
);

CREATE TABLE IF NOT EXISTS public.rol
(
    id serial PRIMARY KEY,
    name character varying(100) NOT NULL ,
    id_usuario integer NOT NULL
);

CREATE TABLE IF NOT EXISTS public.users
(
    id serial PRIMARY KEY,
    first_name character varying(100) NOT NULL,
    last_name character varying(100) NOT NULL,
    email_address character varying(100) NOT NULL ,
    password character varying(100) NOT NULL
    
);

CREATE TABLE IF NOT EXISTS public.medico
(
    id serial PRIMARY KEY,
    credencial character varying(100) NOT NULL,
    id_usuario integer NOT NULL
    
);

CREATE TABLE IF NOT EXISTS public.especialidad
(
    id serial PRIMARY KEY,
    nombre character varying(100) NOT NULL,
    descipcion character varying(100) NOT NULL,
    id_medico integer NOT NULL
    
);

CREATE TABLE IF NOT EXISTS public.paciente
(
    id serial PRIMARY KEY,
    nombre character varying(100) NOT NULL,
    num_emergencia integer NOT NULL,
    fec_nacimiento character varying(100) NOT NULL ,
    id_usuario integer NOT NULL
    
);



CREATE TABLE IF NOT EXISTS public.cita
(
    id serial PRIMARY KEY,
    fecha character varying(100) NOT NULL,
    motivo character varying(100) NOT NULL,
    id_medico integer NOT NULL ,
    id_paciente integer NOT NULL
    
);

CREATE TABLE IF NOT EXISTS public.examen
(
    id serial PRIMARY KEY,
    fecha character varying(100) NOT NULL,
    motivo character varying(100) NOT NULL,
    resultado character varying(100) NOT NULL,
    id_medico integer NOT NULL ,
    id_paciente integer NOT NULL
    
);

CREATE TABLE IF NOT EXISTS public.historia_clinica
(
    id serial PRIMARY KEY,
    nombre character varying(100) NOT NULL,
    edad integer NOT NULL,
    sexo character varying(100) NOT NULL,
    ocupacion character varying(100) NOT NULL,
    telefono integer NOT NULL,
    fecha character varying(100) NOT NULL,
    hora character varying(100) NOT NULL,
    lugar character varying(100) NOT NULL,
    id_paciente integer NOT NULL
    
);

ALTER TABLE rol
ADD CONSTRAINT constraint_fk
FOREIGN KEY (id_usuario)
REFERENCES users(id)
ON DELETE CASCADE;


ALTER TABLE permiso
ADD CONSTRAINT constraint_fk1
FOREIGN KEY (id_rol)
REFERENCES rol(id)
ON DELETE CASCADE;

ALTER TABLE medico
ADD CONSTRAINT constraint_fk2
FOREIGN KEY (id)
REFERENCES users(id)
ON DELETE CASCADE;

ALTER TABLE especialidad
ADD CONSTRAINT constraint_fk3
FOREIGN KEY (id_medico)
REFERENCES medico(id)
ON DELETE CASCADE;

ALTER TABLE paciente
ADD CONSTRAINT constraint_fk4
FOREIGN KEY (id)
REFERENCES users(id)
ON DELETE CASCADE;

ALTER TABLE cita
ADD CONSTRAINT constraint_fk5
FOREIGN KEY (id_medico)
REFERENCES medico(id)
ON DELETE CASCADE;

ALTER TABLE cita
ADD CONSTRAINT constraint_fk6
FOREIGN KEY (id_paciente)
REFERENCES paciente(id)
ON DELETE CASCADE;

ALTER TABLE examen
ADD CONSTRAINT constraint_fk7
FOREIGN KEY (id_medico)
REFERENCES medico(id)
ON DELETE CASCADE;

ALTER TABLE examen
ADD CONSTRAINT constraint_fk8
FOREIGN KEY (id_paciente)
REFERENCES paciente(id)
ON DELETE CASCADE;

ALTER TABLE historia_clinica
ADD CONSTRAINT constraint_fk9
FOREIGN KEY (id_paciente)
REFERENCES paciente(id)
ON DELETE CASCADE;

insert into users(first_name,last_name, email_address,password) values ( 'admin','admin','admin@sgd.com','admin');
insert into users(first_name,last_name, email_address,password) values ( 'carlos','castillo','c@1.com','c1');
insert into users(first_name,last_name, email_address,password) values ( 'vinicio','valle','v@1.com','v1');
insert into users(first_name,last_name, email_address,password) values ( 'cesar','salgado','c@2.com','c2');
insert into users(first_name,last_name, email_address,password) values ( 'kevin','tena','c@2.com','k1');


insert into rol(name,id_usuario) values('admin',1);
insert into rol(name,id_usuario) values('paciente',2);
insert into rol(name,id_usuario) values('doctor',3);
insert into rol(name,id_usuario) values('paciente',4);
insert into rol(name,id_usuario) values('doctor',5);

insert into permiso(name,id_rol) values('write',1);
insert into permiso(name,id_rol) values('read',1);
insert into permiso(name,id_rol) values('update',1);
insert into permiso(name,id_rol) values('delete',1);


insert into paciente(nombre, num_emergencia,fec_nacimiento,id_usuario) values('carlos carrasco',911191,"26/06/2019",2);


