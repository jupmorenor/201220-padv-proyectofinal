create database autenticacionUsuarios_kja;

use autenticacionUsuarios_kja;

create table Usuarios
(usuario varchar(12), password varchar(12), roll varchar(15));

alter table Usuarios
add primary key (usuario);
