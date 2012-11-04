create databases tellevoatudestino_jak;
use tellevoatudestino_jak;
create table rutas(codigoRuta varchar(3), nombreRuta varchar(20), 
	inicioRuta varchar(20), finRuta varchar(20), tarifaRuta int);
create table buses(codigoBus varchar(3), matriculaBus varchar(6), 
	capacidadBus int, consumoCombustible float);
create table sucursales(nombreSucursal varchar(20));
create table paradas(codigoParada varchar(3), nombreParada varchar(20));
create table empleados(nombreEmpleado varchar(35), identificacion varchar(10), 
	telefono varchar(7), direccion varchar(35), fechaNac date());