%------------------------------------------------------
programa nprimos;
%------------------------------------------------------

    entero n, i,m;

    %------------------------------------------------------
    accion es_primo;
    %------------------------------------------------------
    entero j,m; 
    booleano divisible;

    principio
      divisible := false; 
	  j:=2;
	  escribir(m);
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
  escribir(m);
  i := 2;
  mq i <= n
	 es_primo;
	 i := i + 1;
  fmq
fin


