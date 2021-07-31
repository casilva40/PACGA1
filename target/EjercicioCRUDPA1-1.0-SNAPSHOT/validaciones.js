function Login(){ 
var done=0; 
var usuario=document.login.usuario.value; 
var password=document.login.password.value; 
if (usuario=="1010105885" && password=="Cowork1") { 
<h:link class="Error500" outcome="PaginaError500N">Olvido su contraseña</h:link> 
        //window.location="GestionA.html"; 
  } 
  else if (usuario=="1015417404" && password=="Cowork2") { 
    window.location="AsignacionA.html"; 
    }
    else if (usuario=="1002701249" && password=="Cowork3") { 
      window.location="PrestamoA.html"; 
      } 
      else{
            alert("El ususario o la contraseña ingresada no son correctos por favor verifique sus datos.");
          } 
} 