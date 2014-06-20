
$(document).ready(function() {
	
	/*onclick btnTelefonosAlternativos
	 * desplegar 2 inputs adicionales para registrar mas de un telefono para el cliente 
	 * el texto del boton cambia de + a - y viceversa
	 * */
	$('#btnTelefonosAlternativos').click(function(event){
	        event.preventDefault();
	        $("#telefonosAlternativos").toggle( "fast", function() {});
	        
	        if($("#btnTelefonosAlternativos").html() == "+"){
	        	
	        	$("#btnTelefonosAlternativos").html("-");
	        }
	        
	        else{
	        	
	        	$("#btnTelefonosAlternativos").html("+");
	        }  
	});
	
	
	
	
});

	
 