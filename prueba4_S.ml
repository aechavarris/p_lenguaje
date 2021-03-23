% --------------------------------------------------------
Programa prueba3;
% -------------------------------------------------------- 



accion mcd(val entero a,b; ref entero m);

	entero i, j, k;
	
	% Comprobamos que no reconoce otro caracter especial $
	
	entero equiumi$;
	
Principio
	j := a;
	k := b;
	i := a mod b;
	Mq i <> 0
		j := k;
		k := i;
		i := j mod k;
	FMq
	m := i;
Fin

Principio
	dato(i);
	dato(j);
	mcd(i,j,m);
	escribir("El MCD es: ", m, entacar(13), entacar(10));
Fin