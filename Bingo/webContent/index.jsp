<%--
    Document   : bingoServidor
    Created on : 17/12/2012, 06:10:06 PM
    Author     : Anderson Ramirez, Juan Pablo Moreno, Karen Angulo
--%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=Windows-1252"/>
        <title>BINGO</title>
        <link rel="stylesheet" type="text/css" href="estilos/xr_main.css"/>
        <link rel="stylesheet" type="text/css" href="estilos/xr_text.css"/>
    </head>
    <body style="background-color: #000000">
        <div class="xr_ap" id="xr_xr" style="width: 1050px; height: 1000px; top:0px; left:50%; margin-left: -525px;">
            <div class="xr_ap" id="xr_xri" style="width: 1050px; height: 1100px; clip: rect(0px, 1050px, 1500px, 0px); position: relative; margin-left: auto; margin-right: auto;">

                <img class="xr_ap" src="imagenes/fondo.png" alt="" title="" style="left: 25px; top: 28px; width: 1000px; height: 1000px;"/>
                <img class="xr_ap" src="imagenes/bingo_logo.gif" alt="" title="" style="left: 680px; top: 28px; width: 312px; height: 78px;"/>
                <img class="xr_ap" src="imagenes/panelLateral.png" alt="" title="" style="left: 666px; top: 105px; width: 336px; height: 677px;"/>
                <img class="xr_ap" src="imagenes/panelPrincipal.png" alt="" title="" style="left: 47px; top: 105px; width: 620px; height: 677px;"/>
                <img class="xr_ap" src="imagenes/barra.png" alt="" title="" style="left: 36px; top: 46px; width: 643px; height: 71px;"/>
                <img class="xr_ap" src="imagenes/formaBoton.png" alt="" title="" style="left: 639px; top: 150px; width: 389px; height: 104px;"/>
                <img class="xr_ap" src="imagenes/formaBoton.png" alt="" title="" style="left: 639px; top: 230px; width: 389px; height: 104px;"/>
                <img class="xr_ap" src="imagenes/formaBoton.png" alt="" title="" style="left: 638px; top: 310px; width: 389px; height: 104px;"/>
                <a href="index.jsp">
                    <img class="xr_ap" src="imagenes/botonInicio.png" style="left: 711px; top: 185px; width: 245px; height: 34px;" alt="" title="Inicio"</>
                </a>
                <a href="registrar.jsp">
                    <img class="xr_ap" src="imagenes/botonRegistrar.png" style="left: 711px; top: 265px; width: 245px; height: 34px;" alt="" title="Registrar"<>
                </a>
                <a href="tablaDePuntuacion1.jsp">
                    <img class="xr_ap" src="imagenes/botonTablaDePuntuacion.png" style="left: 711px; top: 345px; width: 245px; height: 34px;" alt="" title="Tabla de puntuacion"</>
                </a>
                <div class="xr_ap" style="left: 190px; top: 200px; width: 350px; height: 192px;">
                    <img class="xr_ap" src="imagenes/panelPrincipal.png" alt="" title="" style="width: 350px; height: 192px; border-style:double; border-color: 808080"/>
                    <form action="Autenticacion" method="post">
                        <table cellspacing="4" class="xr_ap" style="left: 55px; top: 55px;">
                            <tr class="xr_s4">
                                <td>Usuario</td>
                                <td><input type="text" name="Usuario" maxlength="16" size="16"
                                           placeholder="ingrese usuario"></td>
                            </tr>
                            <tr class="xr_s4">
                                <td>Password</td>
                                <td><input type="password" name="Clave" maxlength="16"
                                           size="16" placeholder="ingrese clave"></td>

                            </tr>
                            <tr align="CENTER">
                                <td colspan="2"><input type="submit" value="ingresar"></td>
                            </tr>
                        </table>
                    </form>
                </div>

            </div>
        </div>

    </body>
</html>

