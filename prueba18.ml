%------------------------------------------------------
programa nprimos;
%------------------------------------------------------

    entero n, i;

    %------------------------------------------------------
    accion es_primo(val entero e,x;ref entero r,y);
    %------------------------------------------------------
    entero j; 
    booleano divisible;

    principio
	  escribir(r," ",e," ",x," ",y," ");
      divisible := false; 
	  j:=2;
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
	 es_primo(5,3,n,i);
	 i := i + 1;
  fmq
fin


