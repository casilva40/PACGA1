function Validar(){
var nombre,apellido,direccion,tipodocumento,numerodocumento,email,celular,fijo,hora,numregistro,expresion;
nombre = document.getElementById("nombre").value;
apellido = document.getElementById("apellido").value;
direccion = document.getElementById("direccion").value;
tipodocumento = document.getElementById("tipodocumento").value;
numerodocumento = document.getElementById("numerodocumento").value;
email = document.getElementById("email").value;
celular = document.getElementById("celular").value;
fijo = document.getElementById("fijo").value;
hora = document.getElementById("hora").value;
numregistro = document.getElementById("numregistro").value;
expresion = /\w+@\w+\.+[a-z]/;

if(nombre === "" || apellido === "" || direccion === "" || tipodocumento === "" || numerodocumento === "" || email === "" || celular === "" || fijo === "" || hora === "" || numregistro === "")
{
   alert("Todos los campos son obligatorios");
   return false;	
}
else if(nombre.length>20){
   alert("El nombre es muy largo");
   return false;
}
else if(apellido.length>20){
   alert("El apellido es muy largo");
   return false;
} 
else if(direccion.length>20){
   alert("La direccion es muy larga");
   return false;
} 	 
else if(tipodocumento.length>20){
   alert("El tipodocumento no es valido");
   return false;
}
else if(numerodocumento.length>20){
   alert("El numerodocumento no es valido");
   return false;
}
else if(email.length>20){
   alert("El email es muy largo");
   return false;
}
else if(!expresion.test(email)){
   alert("El correo no es valido");
   return false;
}
else if(celular.length>20){
   alert("El celular es muy largo");
   return false;
}
else if(fijo.length>20){
   alert("El fijo es muy largo");
   return false;
}
else if(numregistro.length>20){
   alert("El numregistro no es valido");
   return false;
}
}