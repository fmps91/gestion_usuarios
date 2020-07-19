#DROP DATABASE IF EXISTS users;
#CREATE DATABASE users;


CREATE TABLE IF NOT EXISTS public.permiso
(
    id serial PRIMARY KEY,
    name character varying(100) NOT NULL,
    name_rol character varying(100) NOT NULL
  
);

CREATE TABLE IF NOT EXISTS public.rol
(
    id serial PRIMARY KEY,
    name character varying(100) NOT NULL,
    id_usuario integer NOT NULL
);

CREATE TABLE IF NOT EXISTS public.users
(
    id serial PRIMARY KEY,
    first_name character varying(100) NOT NULL,
    last_name character varying(100) NOT NULL,
    email_address character varying(100) NOT NULL,
    password character varying(100) NOT NULL
    
);


ALTER TABLE rol
ADD CONSTRAINT constraint_fk
FOREIGN KEY (id_usuario)
REFERENCES users(id)
ON DELETE CASCADE;


ALTER TABLE permiso
ADD CONSTRAINT constraint_fk1
FOREIGN KEY (name_rol)
REFERENCES rol(name)
ON DELETE CASCADE;

insert into users(first_name,last_name, email_address,password) values ( 'nombre','post','f@1.com','f');

insert into rol(name,id_usuario) values('paciente',1);

insert into permiso(name,id_rol) values('write',"paciente");

