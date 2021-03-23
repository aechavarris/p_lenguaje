% --------------------------------------------------------
Programa prueba5;
% -------------------------------------------------------- 

%%
 Checkeamos que salta error con acentos en letras 
 mayúsculas
%%

entero perDÓN;

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