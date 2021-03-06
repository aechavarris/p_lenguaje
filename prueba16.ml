%------------------------------------------------------
programa nprimos;
%------------------------------------------------------
% En este fichero de pruebas se comprueba que todos los posibles 
% accesos a vectores y sus componentes se realicen correctamente
% [Lineas 23, 24, 25, 26 y 27]
%------------------------------------------------------

    entero n, i;
	caracter car[5],car2[5];
	caracter t;
	entero a;

    %------------------------------------------------------
    accion es_primo;
    %------------------------------------------------------
    entero j;
    booleano divisible;

    principio
      j := 2;
	  a:=1;
	  car:=car2;
	  car[0]:=car[2];
	  car2[0]:=car2[2];
	  escribir(car[j+a],car2,car[2]);
	  leer(car[j+a],car[0]);
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


