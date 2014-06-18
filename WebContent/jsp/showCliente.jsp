<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Anadir Cliente</title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>
<div id="global">
<form:form action="saveCliente" commandName="cliente" method="post">
    <fieldset>
        <legend>A&ntilde;adir Cliente</legend>
        <p>
            <label for="nombre">Nombre: </label>
            <form:input id="nombre" path="nombre"/>
        </p>
        <p>
            <label for="apellido1">Primer Apellido: </label>
            <form:input id="apellido1" path="apellido1"/>
        </p>
       <p>
            <label for="apellido2">Segundo Apellido: </label>
            <form:input id="apellido2" path="apellido2"/>
        </p>
        <p>
            <label for="edad">Edad: </label>
            <form:input id="edad" path="edad"/>
        </p>
        <p>
             <label for="nacionalidad">Nacionalidad:</label>
    		<form:select id="nacionalidad" path="nacionalidad" >
			
				<form:options items="${nacionalidades}" />
			</form:select>
        </p>
        
        <p>
            <label for="ocupacion">Ocupaci&oacute;n: </label>
            <form:input id="ocupacion" path="ocupacion"/>
        </p>                   
   	    <p>
           <label for="telefono1">Tel&eacute;fono 1: </label>
           <form:input id="telefono1" path="telefonos[0].numeroTelefono" />
        </p> 
	    <div id="telefonosAlternativos">
	        <p>
	           <label for="telefono2">Tel&eacute;fono 2: </label>
	           <form:input id="telefono2" path="telefonos[1].numeroTelefono"/>
	        </p>
	        <p>
	           <label for="telefono3">Tel&eacute;fono 3: </label>
	           <form:input id="telefono3" path="telefonos[2].numeroTelefono"/>
	        </p>
		</div>       
             
         <p>
            <label for="fumado">Fumado: </label>
            <form:select id="fumado" path="fumado" >
	            <option value="true">S&iacute;</option>
	            <option value="false">No</option>
            </form:select>
        </p>

         <p>
            <label for="bebidasAlcoholicas">Bebidas Alcoh&oacute;licas:</label>
            <form:select id="bebidasAlcoholicas" path="bebidasAlcoholicas" >
	            <option value="true">S&iacute;</option>
	            <option value="false">No</option>
            </form:select>
        </p>
     
        
        <p id="buttons">
            <input id="reset" type="reset" tabindex="4">
            <input id="submit" type="submit" tabindex="5" 
                value="Anadir Cliente">
        </p>
    </fieldset>
</form:form>
</div>

</body>
</html>