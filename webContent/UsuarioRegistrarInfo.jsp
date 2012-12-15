<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Documento sin título</title>
<style type="text/css">
<!--
@import url("styles.css");
body {
	font: 100%/1.4 Verdana, Arial, Helvetica, sans-serif;
	background-color: #42413C;
	margin: 0;
	padding: 0;
	color: #000;
}

/* ~~ Selectores de elemento/etiqueta ~~ */
ul, ol, dl { /* Debido a las diferencias existentes entre los navegadores, es recomendable no añadir relleno ni márgenes en las listas. Para lograr coherencia, puede especificar las cantidades deseadas aquí o en los elementos de lista (LI, DT, DD) que contienen. Recuerde que lo que haga aquí se aplicará en cascada en la lista .nav, a no ser que escriba un selector más específico. */
	padding: 0;
	margin: 0;
}
h1, h2, h3, h4, h5, h6, p {
	margin-top: 0;	 /* la eliminación del margen superior resuelve un problema que origina que los márgenes escapen de la etiqueta div contenedora. El margen inferior restante lo mantendrá separado de los elementos de que le sigan. */
	padding-right: 15px;
	padding-left: 15px;
	text-align: center;
	font-family: Verdana, Arial, Helvetica, sans-serif;
}
a img { /* este selector elimina el borde azul predeterminado que se muestra en algunos navegadores alrededor de una imagen cuando está rodeada por un vínculo */
	border: none;
}

/* ~~ La aplicación de estilo a los vínculos del sitio debe permanecer en este orden (incluido el grupo de selectores que crea el efecto hover -paso por encima-). ~~ */
a:link {
	color: #42413C;
	text-decoration: underline; /* a no ser que aplique estilos a los vínculos para que tengan un aspecto muy exclusivo, es recomendable proporcionar subrayados para facilitar una identificación visual rápida */
}
a:visited {
	color: #6E6C64;
	text-decoration: underline;
}
a:hover, a:active, a:focus { /* este grupo de selectores proporcionará a un usuario que navegue mediante el teclado la misma experiencia de hover (paso por encima) que experimenta un usuario que emplea un ratón. */
	text-decoration: none;
}

/* ~~ este contenedor de anchura fija rodea a las demás divs ~~ */
.container {
	width: 960px;
	background-color: #FFF;
	margin: 0 auto; /* el valor automático de los lados, unido a la anchura, centra el diseño */
}

/* ~~ no se asigna una anchura al encabezado. Se extenderá por toda la anchura del diseño. Contiene un marcador de posición de imagen que debe sustituirse por su propio logotipo vinculado ~~ */
.header {
	background-color: #336699;
}

/* ~~ Estas son las columnas para el diseño. ~~ 

1) El relleno sólo se sitúa en la parte superior y/o inferior de las divs. Los elementos situados dentro de estas divs tienen relleno a los lados. Esto le ahorra las "matemáticas de modelo de cuadro". Recuerde que si añade relleno o borde lateral a la div propiamente dicha, éste se añadirá a la anchura que defina para crear la anchura *total*. También puede optar por eliminar el relleno del elemento en la div y colocar una segunda div dentro de ésta sin anchura y el relleno necesario para el diseño deseado. También puede optar por eliminar el relleno del elemento en la div y colocar una segunda div dentro de ésta sin anchura y el relleno necesario para el diseño deseado.

2) No se asigna margen a las columnas, ya que todas ellas son flotantes. Si es preciso añadir un margen, evite colocarlo en el lado hacia el que se produce la flotación (por ejemplo: un margen derecho en una div configurada para flotar hacia la derecha). En muchas ocasiones, puede usarse relleno como alternativa. En el caso de divs para las que deba incumplirse esta regla, deberá añadir una declaración "display:inline" a la regla de la div para evitar un error que provoca que algunas versiones de Internet Explorer dupliquen el margen.

3) Dado que las clases se pueden usar varias veces en un documento (y que también se pueden aplicar varias clases a un elemento), se ha asignado a las columnas nombres de clases en lugar de ID. Por ejemplo, dos divs de barra lateral podrían apilarse si fuera necesario. Si lo prefiere, éstas pueden cambiarse a ID fácilmente, siempre y cuando las utilice una sola vez por documento.

4) Si prefiere que la navegación esté a la derecha en lugar de a la izquierda, simplemente haga que estas columnas floten en dirección opuesta (todas a la derecha en lugar de todas a la izquierda) y éstas se representarán en orden inverso. No es necesario mover las divs por el código fuente HTML.

*/
.sidebar1 {
	float: left;
	width: 180px;
	background-color: #EADCAE;
	padding-bottom: 10px;
}
.content {

	padding: 10px 0;
	width: 780px;
	float: left;
}

/* ~~ Este selector agrupado da espacio a las listas del área de .content ~~ */
.content ul, .content ol { 
	padding: 0 15px 15px 40px; /* este relleno reproduce en espejo el relleno derecho de la regla de encabezados y de párrafo incluida más arriba. El relleno se ha colocado en la parte inferior para que el espacio existente entre otros elementos de la lista y a la izquierda cree la sangría. Estos pueden ajustarse como se desee. */
}

/* ~~ Los estilos de lista de navegación (pueden eliminarse si opta por usar un menú desplegable predefinido como el de Spry) ~~ */
ul.nav {
	list-style: none; /* esto elimina el marcador de lista */
	border-top: 1px solid #666; /* esto crea el borde superior de los vínculos (los demás se sitúan usando un borde inferior en el LI) */
	margin-bottom: 15px; /* esto crea el espacio entre la navegación en el contenido situado debajo */
}
ul.nav li {
	border-bottom: 1px solid #666; /* esto crea la separación de los botones */
}
ul.nav a, ul.nav a:visited { /* al agrupar estos selectores, se asegurará de que los vínculos mantengan el aspecto de botón incluso después de haber sido visitados */
	padding: 5px 5px 5px 15px;
	display: block; /* esto asigna propiedades de bloque al vínculo, lo que provoca que llene todo el LI que lo contiene. Esto provoca que toda el área reaccione a un clic de ratón. */
	width: 160px;  /*esta anchura hace que se pueda hacer clic en todo el botón para IE6. Puede eliminarse si no es necesario proporcionar compatibilidad con IE6. Calcule la anchura adecuada restando el relleno de este vínculo de la anchura del contenedor de barra lateral. */
	text-decoration: none;
	background-color: #3399CC;
	font-family: Verdana, Arial, Helvetica, sans-serif;
}
ul.nav a:hover, ul.nav a:active, ul.nav a:focus { /* esto cambia el color de fondo y del texto tanto para usuarios que naveguen con ratón como para los que lo hagan con teclado */
	background-color: #3333CC;
	color: #FFF;
	font-family: Verdana, Arial, Helvetica, sans-serif;
}

/* ~~ El pie de página ~~ */
.footer {
	padding: 10px 0;
	background-color: #CCC49F;
	position: relative;/* esto da a IE6 hasLayout para borrar correctamente */
	clear: both; /* esta propiedad de borrado fuerza a .container a conocer dónde terminan las columnas y a contenerlas */
	font-family: Verdana, Arial, Helvetica, sans-serif;
}

/* ~~ clases float/clear varias ~~ */
.fltrt {  /* esta clase puede utilizarse para que un elemento flote en la parte derecha de la página. El elemento flotante debe preceder al elemento junto al que debe aparecer en la página. */
	float: right;
	margin-left: 8px;
}
.fltlft { /* esta clase puede utilizarse para que un elemento flote en la parte izquierda de la página. El elemento flotante debe preceder al elemento junto al que debe aparecer en la página. */
	float: left;
	margin-right: 8px;
}
.clearfloat { /* esta clase puede situarse en una <br /> o div vacía como elemento final tras la última div flotante (dentro de #container) si #footer se elimina o se saca fuera de #container */
	clear:both;
	height:0;
	font-size: 1px;
	line-height: 0px;
}
.azul {
	color: #06F;
}
.tituloRegistro {
	font-size: 24%;
	font-weight: bold;
}
.titulod {
	font-size: 36%;
}
.titulod {
	font-size: 36%;
}
.container .footer p center p br {
	text-align: center;
}
-->
</style></head>

<body>

<div class="container">
  <div class="header"><a href="#"><img src="logo.jpg" alt="Insertar logotipo aquí" name="Insert_logo" width="177" height="151" class="header" id="Insert_logo" style="background-color: #C6D580; display:block;" /></a> 
    <!-- end .header --></div>
  <div class="sidebar1">
    <ul class="nav">
      <li></li>
      <p>
      <li><a href="indexUsuario.jsp"><strong><center>Inicio Usuarios</center></strong></a></li>
      <p></p>
      <li><strong><center>Consultar Información</center></strong></li>
      	<li><a href="UsuarioConsultarRuta.jsp">Consultar Rutas</a></li>
        <li><a href="UsuarioConsultarSucursales.jsp">Consultar Sucursales</a></li>
        <li><a href="UsuarioConsultarInfo.jsp">Consultar Informacion Personal</a></li>
      <p>
      <li><a href="UsuarioRegistrarInfo.jsp"><strong><center>Registrar Información</center></strong></a></li>
      
    </ul>
    
    <!-- end .sidebar1 --></div>
  <div class="content">
    <h1><center>
      
      <div id="aside">
					<div class="box-b">
						<div>
						  <h3>
						  <cufon class="cufon cufon-canvas" alt="Request " style="width: 109px; height: 27px; font-size: 12%;"></cufon><cufon class="cufon cufon-canvas" alt="demo" style="width: 68px; height: 27px;"><cufontext></cufontext></cufon>
						  <span class="tituloRegistro"><center spry:hover="titulod">
						    <p class="box-b"><center>Registre su Información</center> </p>
						  </center></span></h3><form id="frm-request" action="/" method="post">
								<fieldset>
									<p>
									  <label class="w3c" for="frm-email2">Leave blank</label>
									  <input class="w3c" type="text" name="email2" id="frm-email2" value=""></input>
									  <label for="frm-request-name" class="w3c">Identificación</label>
									  <input type="text" name="identificacion" id="frm-request-name" value=""></input>
									  <label for="frm-request-email" class="w3c">Nombre</label>
									  <input type="text" name="nombre" id="frm-request-email" value=""></input>
									  <label for="frm-request-phone" class="w3c">Telefono</label>
									  <input type="text" name="telefono" id="frm-request-phone" value=""></input>
									  <label for="frm-request-company" class="w3c">Direccion</label>
									  <input type="text" name="direccion" id="frm-request-company" value=""></input>
								  </p>
									<p>
									  <input type="image" name="request-submit" id="frm-request-submit" src="/btn-submit-large.png" alt="Submit" value="Submit">
								  </p>
					        </fieldset>
							</form>
					  </div>
					</div>
		</div>
    </center>
    <!-- end .content --></h1>
  </div>
  <div class="footer">
  	<p>
    	<center><p><br><span class="azul">Te Llevo a Tu Destino</span> Copyright 2012</br>
        		<br>
        	</p>
      		<p>Website Te Llevo a Tu detino by Team KJA </p>
    	</center>
	</p>
    <!-- end .footer --></div>
  <!-- end .container --></div>
</body>
</html>