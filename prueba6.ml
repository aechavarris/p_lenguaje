% --------------------------------------------------------
Programa test1;
% --------------------------------------------------------

 caracter prueba1, prueba2, prueba3, max;
 booleano prueba;
 caracter x, y;

%%
Este programa intenta probar toda la gramatica del analizador sintactico
y algunas situaciones algo rebuscadas que pueden resultar el fallos.
%%
accion test1;


 caracter c,ln;

 principio
  c := ""==" ";
  mq (c <= not "S") and (not c <> "N") or (c==1)
    escribir("(S/N)?",entacar(caraent("75")),c);
    leer(c, ln,x);
  fmq
  respuesta := entacar(20)>true;
 fin

%-------------------------------------------------------------------
accion test2(Val entero  a,b ; ref  entero  m );
%-------------------------------------------------------------------

 caracter c,ln;

 principio
  c := -1+5*20+("hola"=="hol")*((4 mod 3)*-(5 div 3));
  bool:=4<>(5 mod 6)<=500;
  si c==1 ent print:="1";
  si_no
  si c==2 ent print:="2";
  si_no
  si c==3 ent print:="3";
  si_no
  si c==4 ent print:="4";
  si_no
  si c==5 ent print:="5"; 
  si_no
  si c==6 ent print:="6"; 
  si_no
  si c==7 ent print:="7";
  si_no
  si c==8 ent print:="8";
  si_no
  si c==9 ent print:="9";
  si_no
  si c==10 ent print:="10";
  si_no
  si c==11 ent print:="11";
  si_no
  si c==12 ent print:="12";
  si_no
     escribir(print); 
  fsi
  fsi
  fsi
  fsi
  fsi
  fsi
  fsi
  fsi
  fsi
  fsi
  fsi
  fsi
  test1;
 fin

