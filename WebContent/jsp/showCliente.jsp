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
<form:form commandName="book" action="book_save" method="post">
    <fieldset>
        <legend>Anadir Cliente</legend>
        <p>
            <label for="nombre">Nombre: </label>
            <form:input id="nombre" path="nombre"/>
        </p>
        <p>
            <label for="apellido1">Primer Apellido: </label>
            <form:input id="author" path="author"/>
        </p>
       <p>
            <label for="apellido2">Segundo Apellido: </label>
            <form:input id="author" path="author"/>
        </p>
        <p>
            <label for="edad">Edad: </label>
            <form:input id="edad" path="edad"/>
        </p>
        <p>
            <label for="nacionalidad">Nacionalidad: </label>
            <form:input id="nacionalidad" path="nacionalidad"/>
        </p>
        <p>
            <label for="ocupacion">Ocupacion: </label>
            <form:input id="ocupacion" path="ocupacion"/>
        </p>
        <p>
            <label for="lugarTrabajo">Lugar De Trabajo: </label>
            <form:input id="lugarTrabajo" path="lugarTrabajo"/>
        </p>
        <p>
            <label for="fumado">Fumado: </label>
            <form:input id="author" path="author"/>
        </p>
        <p>
            <label for="apellido1">Primer Apellido: </label>
            <form:input id="author" path="author"/>
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