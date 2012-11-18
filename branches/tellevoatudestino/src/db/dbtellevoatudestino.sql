create database tellevoatudestino_jak;
use tellevoatudestino_jak;
create table ruta(codigoRuta varchar(3), nombreRuta varchar(20), tarifaRuta int);
create table transporte(capacidad int, placa varchar(6), codigoInterno int, consumoCombustible float);
create table tipoTransporte(idTipoTransporte varchar(3),descripTipoTransporte varchar (20));
create table mantenimiento(idMantenimiento varchar(3), seguro varchar(20), revision varchar(20));
create table persona(identificacionPersona varchar(20), nombrePersona varchar(20), telefono varchar(20), direccion varchar(20), fechaNacimiento Date );
create table tipoPersona(idTipoPersona int, descripTipoPersona varchar(20));
create table horario(idHorario int, dia int);
create table cuidad(codCuidad int, nombreCiudad varchar (20));
create table estacion (codigoEstacion varchar(3), nombreEstacion varchar(20), direccionEstacion varchar(20));
create table tipoEstacion(idTipoEstacion varchar(3), nombreTipoEstacion varchar(20));

create table RutaEstacion(idRutaEstacion varchar(3));
create table RutaHorario(idRutaHorario varchar(3));
create table PersonaTransporte(idPersonaTransporte varchar(3));

alter table ruta
  add primary key (codigoRuta);
alter table transporte
  add primary key (codigoInterno); 
alter table tipoTransporte
  add primary key (idTipoTransporte);
alter table mantenimiento
  add primary key (idMantenimiento);
alter table persona
  add primary key (identificacionPersona); 
alter table tipoPersona
  add primary key (idTipoPersona);
alter table horario
  add primary key (idHorario);
alter table cuidad
  add primary key (codCuidad);
alter table estacion
  add primary key (codigoEstacion);
alter table tipoEstacion
  add primary key (codigoTipoEstacion);

alter table transporte
  add constraint fk_TipoTransporte_Transporte1
  foreign key (idTipoTransporte_fk)
  references tipoTransporte(idTipoTransporte);
  
alter table persona
  add constraint fk_TipoTransportePersona_Persona1
  foreign key (idTipoPersona_fk)
  references tipoPersona(idTipoPersona);
  
alter table estacion
  add constraint fk_TipoTransporteEstacion_Estacion1
  foreign key (idTipoEstacion_fk)
  references tipoEstacion(idTipoEstacion);
  
alter table mantenimiento
  add constraint fk_Transporte_Mantenimiento1
  foreign key (idTransporte_fk)
  references transporte(codigoInterno);

alter table RutaEstacion
  add constraint fk_Ruta_RutaEstacion1
  foreign key (idRuta_fk)
  references ruta(codigoRuta)
  add constraint fk_Estacion_RutaEstacion1
  foreign key (idEstacion_fk)
  references estacion(codigoEstacion);
  
alter table estacion
  add constraint fk_Cuidad_Estacion1
  foreign key (idCuidad)
  references cuidad(codCiudad);
  
alter table RutaHorario
  add constraint fk_Ruta_RutaHorario1
  foreign key (codRuta_fk)
  references ruta(codigoRuta)
  add constraint fk_Horario_RutaEstacion1
  foreign key (codHorario_fk)
  references horario(idHorario);
  
alter table RutaTransporte
  add constraint fk_Ruta_RutaTransporte1
  foreign key (codRutaT_fk)
  references ruta(codigoRuta)
  add constraint fk_Transporte_RutaEstacion1
  foreign key (codTransporte_fk)
  references transporte(codigoInterno);
  
alter table PersonaTransporte
  add constraint fk_Persona_PersonaTransporte1
  foreign key (IdentificacionPersona_fk)
  references persona(identificacionPersona)
  add constraint fk_Transporte_PersonaTransporte1
  foreign key (codTransporteP_fk)
  references transporte(codigoInterno);