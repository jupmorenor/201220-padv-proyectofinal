create database autenticacionBingo;
use autenticacionBingo;

create table jugadores(nombre varchar(12), password varchar(12), tipo_fk int);
create table tipoJugador(id int, tipo varchar(12));

alter table jugadores
add primary key (nombre);

alter table tipoJugador
add primary key (id);

alter table jugadores
 add constraint fk_tipoJugador_jugadores1
 foreign key (idTipoJugador_fk)
 references tipoJugador(id);

insert into tipoJugador values(1, 'servidor');
insert into tipoJugador values(2, 'cliente');
