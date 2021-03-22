%--------------------------------------------------------
Programa prueba2;
%-------------------------------------------------------- 

%%
 Checkeamos dos cosas: Por un lado, que detecta los dobles
 comentarios y, por otro lado, que salta error con los
 acentos
%%

entero ejecución;

accion dato (ref entero d);
Principio
	d:=0;
	Mq d <= 0
		escribir("Escribe un numero: ");
		leer(d);
		Si d <= 0 ent
			escribir("El numero debe ser positivo.");
			escribir (entacar(13), entacar(10));
		FSi
	FMq
Fin