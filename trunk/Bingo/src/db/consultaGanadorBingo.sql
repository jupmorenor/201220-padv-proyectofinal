SELECT DISTINCT u.nombreUsuario, b.descBingo, c.descCarton,a.letra, a.numero, d.letra, d.numero
FROM Bingo b, Carton c, balotasCorrectas a, balotas d, personabingo u, partidasganadas p, tipopersona t
WHERE b.idBingo = a.fk_idBingo AND
b.idBingo=c.fk_idBingo AND
c.idCarton=d.fk_idCarton AND
u.idUsuario=c.fk_idUsuario AND
t.idTipoPersona=u.fk_idTipoPersona AND
a.letra=d.letra AND a.numero=d.numero;