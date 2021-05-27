%------------------------------------------------------
programa nprimos;
%------------------------------------------------------

    entero n, i;
	caracter car[5],car2[3];
	entero a;

    %------------------------------------------------------
    accion es_primo;
    %------------------------------------------------------
    entero j;
    booleano divisible;

    principio
      j := 2;
	  escribir(car);
	  a:=1;
      divisible := false;
      mq (j < (i div 2)) and not divisible
	     divisible := i mod j = 0;
	     j := j + 1;
      fmq
      si not divisible ent
	     escribir (i, "es primo.", entacar(13), entacar(10));
      fsi
    fin

%------------------------------------------------------
principio
%------------------------------------------------------
  n := 100;
  i := 2;
  mq i <= n
	 es_primo;
	 i := i + 1;
  fmq
fin


