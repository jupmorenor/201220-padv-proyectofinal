SELECT u.nombreUsuario, COUNT(p.descPartida)
FROM personabingo u, partidasganadas p, tipopersona t
WHERE t.idTipoPersona=u.fk_idTipoPersona AND
u.idUsuario=p.fk_idUsuario AND
u.idUsuario = "2"
GROUP BY u.nombreUsuario
