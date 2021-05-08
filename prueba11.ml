%-------------------------------------------------------------------
programa adivinar;
%-------------------------------------------------------------------

 caracter respuesta, letra, min, max;
 booleano headivinado;
 entero t;
 caracter c, d;

%-----------------------------------------------------------
accion mcd(Val entero  a,b;ref entero x );
%-----------------------------------------------------------
%Una serie de asignaciones de parametros pro referencia -> ok
entero r;
Principio
        r:=a mod b;
		  
        Mq r<>0
				leer(x);
				escribir(x);             
        FMq
Fin

%-------------------------------------------------------------------
principio
%-------------------------------------------------------------------
 escribir("Piensa en una letra e intentare adivinarla.", 
          entacar(13),entacar(10));
 escribir("Listo?");
 leer(c);
 
 %ERROR MODULO 0
 t:= 1 mod 0;
 mcd(3,3,t);
 min := "A";
 max := "Z";
 headivinado := false;
 mq (min <> max) and not headivinado
   letra := entacar((caraent(min) + caraent(max)) div 2);
   escribir("(", min, ",", max, ")",": has pensado en la letra ", letra, "?");
   
   %ERROR SI
   si (respuesta + "N") ent
     escribir("La letra que has pensado es mayor?");
     si respuesta = "S" ent
      min := entacar(caraent(letra) + 1);
     si_no
      max := entacar(caraent(letra) - 1);
    fsi
   si_no
    headivinado := true;
   fsi
 fmq
 si not headivinado ent
  escribir("La letra es la ", min, entacar(13), entacar (10));
 fsi
fin
