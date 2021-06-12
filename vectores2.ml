% Este programa calcula la media de n números utilizando
% vectores. Útil para comprobar también los desbordamientos.

programa media_vectores;
     
     entero valores[10], i, n, suma;

principio

     escribir("Introduce el número de elementos: ");
     leer(n);

     % NOTA: si introducís un n mayor de 10, el programa debe detectar overflow. 
     % Si es 0 o negativo, debe detectar underflow.

     i := 0;
     suma := 0;

     mq i < n
          escribir("Introduce el número ", i+1, ": ");
          leer(valores[i+1]); % sí, el acceso con el i+1 está hecho a propósito
          suma := suma + valores[i+1];
          i := i + 1;
     fmq

     escribir("La media es: ", suma div n);

fin