<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML>
<html>
<head>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"> </script>
<script src="/SoftwareNutricion/js/main.js"> </script>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
<title>Anadir Cliente</title>
</head>
<body>
<div id="global">
<form:form action="saveCliente" commandName="cliente" method="post">
    <fieldset>
        <legend>Datos Generales</legend>
       
       <div id="bloque1">
        <p>
            <label for="nombre">Nombre: </label>
            
            <form:input id="nombre" path="nombre"/>
            <form:hidden path="codigoCliente" value="${clienteId}"/>
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
            <label for="correo">Correo: </label>
            <form:input id="correo" path="correo"/>
        </p>          
   	    <p>
           <label id= "lbtelefono1" for="telefono1">Tel&eacute;fono:</label>
           <form:input id="telefono1" path="telefonos[0].numeroTelefono" />
            <form:button id="btnTelefonosAlternativos" type="button" class="alternativeBtns" >+</form:button>
        </p> 
	    <div id="telefonosAlternativos" class="hidden">
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
	            <option value="false">No</option>
	            <option value="true">S&iacute;</option>
            </form:select>
        </p>
		<p>
            <label for="bebidasAlcoholicas">Bebidas Alcoh&oacute;licas:</label>
            <form:select id="bebidasAlcoholicas" path="bebidasAlcoholicas" >
	            <option value="false">No</option>
	            <option value="true">S&iacute;</option>
            </form:select>
        </p>
     </div>
     <div id="bloque2">
     	<p>
             <label for="estiloVida">Estilo de Vida:</label>
    		<form:select id="estiloVida" path="estiloVida" >
				<form:options items="${estilosDeVida}" />
			</form:select>
        </p> 
        
     </div>
     <div id="bloque3">
     	<label for="ejercicios">Ejercicios/Aficiones/Deportes:</label>
     		<div>
              <c:forEach items="${ejerciciosList}"  var="ej" varStatus="counter">
              	<form:checkbox label="${ej.descripcion}" value="false" path=""></form:checkbox>
              	<form:hidden path="clienteEjercicios[${counter.index}].clienteEjercicioId" value="${clienteEjercicioId + counter.index}"/>
              	<form:hidden path="clienteEjercicios[${counter.index}].cliente.codigoCliente" value="${clienteId}"/>
              	<form:hidden path="clienteEjercicios[${counter.index}].ejercicio.codigoEjercicio" value="${ej.codigoEjercicio}"/>
              	<form:hidden path="clienteEjercicios[${counter.index}].ejercicio.descripcion" value="${ej.descripcion}"/>
              	<form:hidden path="clienteEjercicios[${counter.index}].ejercicio.tipo" value="${ej.tipo}"/>
              </c:forEach>
     		</div>
     </div>
     <div id="bloque4">
      <p id="buttons">
            <input id="reset" type="reset" tabindex="4">
            <input id="submit" type="submit" tabindex="5" value="Anadir Cliente">
        </p>
    </div>
    </fieldset>
</form:form>
</div>

</body>
</html>