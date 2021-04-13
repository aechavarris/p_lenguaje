/* Generated By:JavaCC: Do not edit this line. minilengcompiler.java */
package analizador;
import java.io.*;

public class minilengcompiler implements minilengcompilerConstants {

  static boolean errorSintactico = false;
  static int nivel = 0;

          public static void main(String args []) throws ParseException {
            if (args.length != 0 ) {
                        File tmp = new File(args[0]);
                        String file = tmp.getAbsolutePath();
                        try {
                                minilengcompiler parser = new minilengcompiler(new FileInputStream(file));
                        }
                        catch (FileNotFoundException e) {
                                System.out.printf("No existe el fichero: "+ file + "\u005cn");
                                System.exit(1);
                        }
        }
        else {
            System.out.printf("Leyendo de la entrada estandar..." + "\u005cn");
                        minilengcompiler parser = new minilengcompiler(System.in);
        }
                try {
                    minilengcompiler.programa();

                    if ( errorSintactico ) {
                                System.out.println("Hay uno o m\u00e1s errores sint\u00e1cticos");
                                System.exit(1);
                    }

                    System.out.println("Analizado correctamente");
                }
                catch(TokenMgrError e) {
                     // ERRORES LEXICOS
                     try {
                                String simbolo = String.valueOf(minilengcompilerTokenManager.input_stream.readChar());
                        String fil = String.valueOf(minilengcompilerTokenManager.input_stream.getEndLine());
                        String col = String.valueOf(minilengcompilerTokenManager.input_stream.getEndColumn());

                        System.err.println("ERROR L\u00c9XICO (<" + fil + ", " + col + ">): s\u00edmbolo no reconocido: <" + simbolo + ">");
                        return;
                     }
                     catch (Exception ex) { }
                }
         }

         private static void error_sintactico(ParseException e, String mensaje) {
        // ERRORES SINTACTICOS
        Token ultimoLeido = minilengcompiler.getNextToken();
        int fil = ultimoLeido.beginLine;
        int col = ultimoLeido.beginColumn;
        String current = ultimoLeido.image;

        System.out.println("ERROR SINT\u00c1CTICO (<" + fil  + ", " + col + ">): Token obtenido -> " + current + " -> " + mensaje );
        if ( !errorSintactico ) {
                        errorSintactico = true;
                }
  }

  static final public void programa() throws ParseException {
    try {
      jj_consume_token(tPROGRAMA);
      jj_consume_token(tIDENTIFICADOR);
      jj_consume_token(tFIN_SENTENCIA);
      declaracion_variables();
      declaracion_acciones();
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tPRINCIPIO:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        bloque_sentencias();
      }
    } catch (ParseException e) {
                error_sintactico(e,"Error en programa");
    }
  }

  static final public void sentencia() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tLEER:
        leer();
        jj_consume_token(tFIN_SENTENCIA);
        break;
      case tESCRIBIR:
        escribir();
        jj_consume_token(tFIN_SENTENCIA);
        break;
      case tIDENTIFICADOR:
        jj_consume_token(tIDENTIFICADOR);
        asignacion_invocacion_accion();
        jj_consume_token(tFIN_SENTENCIA);
        break;
      case tPRINCIPIO:
        seleccion();
        break;
      case tMQ:
        mientras_que();
        break;
      case tSI:
        si();
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
        error_sintactico(e,"Error en sentencia");
    }
  }

  static final public void asignacion_invocacion_accion() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tOAS:
        asignacion();
        break;
      case tIDENTIFICADOR:
        invocacion_accion();
        break;
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
        error_sintactico(e,"Error en asignacion");
    }
  }

  static final public void asignacion() throws ParseException {
    try {
      jj_consume_token(tOAS);
      expresion();
    } catch (ParseException e) {
        error_sintactico(e,"Error en asignacion");
    }
  }

  static final public void invocacion_accion() throws ParseException {
    try {
      jj_consume_token(tIDENTIFICADOR);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tFIN_SENTENCIA:
        jj_consume_token(tFIN_SENTENCIA);
        break;
      case tPA:
        argumentos();
        jj_consume_token(tFIN_SENTENCIA);
        break;
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
        error_sintactico(e,"Error en invocacion_accion");
    }
  }

  static final public void declaracion_variables() throws ParseException {
    try {
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tENTERO:
        case tBOOLEANO:
        case tCARACTER:
          ;
          break;
        default:
          jj_la1[4] = jj_gen;
          break label_2;
        }
        declaracion();
        jj_consume_token(tFIN_SENTENCIA);
      }
    } catch (ParseException e) {
        error_sintactico(e,"Error en declaracion_variables");
    }
  }

  static final public void declaracion() throws ParseException {
    try {
      tipo_variables();
      identificadores();
    } catch (ParseException e) {
        error_sintactico(e,"Error en declaracion");
    }
  }

  static final public void tipo_variables() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tENTERO:
        jj_consume_token(tENTERO);
        break;
      case tCARACTER:
        jj_consume_token(tCARACTER);
        break;
      case tBOOLEANO:
        jj_consume_token(tBOOLEANO);
        break;
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
        error_sintactico(e,"Error en tipo_variables");
    }
  }

  static final public void identificadores() throws ParseException {
    try {
      jj_consume_token(tIDENTIFICADOR);
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tCOMA:
          ;
          break;
        default:
          jj_la1[6] = jj_gen;
          break label_3;
        }
        jj_consume_token(tCOMA);
        jj_consume_token(tIDENTIFICADOR);
      }
    } catch (ParseException e) {
        error_sintactico(e,"Error en identificadores");
    }
  }

  static final public void declaracion_acciones() throws ParseException {
    try {
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tACCION:
          ;
          break;
        default:
          jj_la1[7] = jj_gen;
          break label_4;
        }
        declaracion_accion();
      }
    } catch (ParseException e) {
        error_sintactico(e,"Error en declaracion_acciones");
    }
  }

  static final public void declaracion_accion() throws ParseException {
    try {
      cabecera_accion();
      declaracion_variables();
      declaracion_acciones();
      bloque_sentencias();
    } catch (ParseException e) {
        error_sintactico(e,"Error en declaracion_accion");
    }
  }

  static final public void cabecera_accion() throws ParseException {
    try {
      jj_consume_token(tACCION);
      jj_consume_token(tIDENTIFICADOR);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tPA:
        parametros_formales();
        break;
      default:
        jj_la1[8] = jj_gen;
        ;
      }
      jj_consume_token(tFIN_SENTENCIA);
    } catch (ParseException e) {
        error_sintactico(e,"Error en cabecera_accion");
    }
  }

  static final public void parametros_formales() throws ParseException {
    try {
      jj_consume_token(tPA);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tVAL:
      case tREF:
        parametros();
        label_5:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case tFIN_SENTENCIA:
            ;
            break;
          default:
            jj_la1[9] = jj_gen;
            break label_5;
          }
          jj_consume_token(tFIN_SENTENCIA);
          parametros();
        }
        break;
      default:
        jj_la1[10] = jj_gen;
        ;
      }
      jj_consume_token(tPC);
    } catch (ParseException e) {
        error_sintactico(e,"Error en parametros_formales");
    }
  }

  static final public void parametros() throws ParseException {
    try {
      clase_parametros();
      tipo_variables();
      identificadores();
    } catch (ParseException e) {
        error_sintactico(e,"Error en parametros");
    }
  }

  static final public void clase_parametros() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tVAL:
        jj_consume_token(tVAL);
        break;
      case tREF:
        jj_consume_token(tREF);
        break;
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
        error_sintactico(e,"Error en clase_parametros");
    }
  }

  static final public void bloque_sentencias() throws ParseException {
    try {
      jj_consume_token(tPRINCIPIO);
      lista_sentencias();
      jj_consume_token(tFIN);
    } catch (ParseException e) {
        error_sintactico(e,"Error en bloque_sentencias");
    }
  }

  static final public void lista_sentencias() throws ParseException {
    try {
      label_6:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tPRINCIPIO:
        case tMQ:
        case tSI:
        case tESCRIBIR:
        case tLEER:
        case tIDENTIFICADOR:
          ;
          break;
        default:
          jj_la1[12] = jj_gen;
          break label_6;
        }
        sentencia();
      }
    } catch (ParseException e) {
        error_sintactico(e,"Error en lista_sentencias");
    }
  }

  static final public void leer() throws ParseException {
    try {
      jj_consume_token(tLEER);
      jj_consume_token(tPA);
      identificadores();
      jj_consume_token(tPC);
    } catch (ParseException e) {
        error_sintactico(e,"Error en leer");
    }
  }

  static final public void escribir() throws ParseException {
    try {
      jj_consume_token(tESCRIBIR);
      jj_consume_token(tPA);
      lista_escribibles();
      jj_consume_token(tPC);
    } catch (ParseException e) {
        error_sintactico(e,"Error en escribir");
    }
  }

  static final public void caraent() throws ParseException {
    try {
      jj_consume_token(tCARAENT);
      jj_consume_token(tPA);
      expresion();
      jj_consume_token(tPC);
    } catch (ParseException e) {
        error_sintactico(e,"Error en caraent");
    }
  }

  static final public void entacar() throws ParseException {
    try {
      jj_consume_token(tENTACAR);
      jj_consume_token(tPA);
      expresion();
      jj_consume_token(tPC);
    } catch (ParseException e) {
        error_sintactico(e,"Error en entacar");
    }
  }

  static final public void lista_escribibles() throws ParseException {
    try {
      expresion();
      label_7:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tCOMA:
          ;
          break;
        default:
          jj_la1[13] = jj_gen;
          break label_7;
        }
        jj_consume_token(tCOMA);
        expresion();
      }
    } catch (ParseException e) {
        error_sintactico(e,"Error en lista_escribibles");
    }
  }

  static final public void mientras_que() throws ParseException {
    try {
      jj_consume_token(tMQ);
      expresion();
      label_8:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tAND:
        case tOR:
          ;
          break;
        default:
          jj_la1[14] = jj_gen;
          break label_8;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tAND:
          jj_consume_token(tAND);
          break;
        case tOR:
          jj_consume_token(tOR);
          break;
        default:
          jj_la1[15] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        expresion();
      }
      lista_sentencias();
      jj_consume_token(tFMQ);
    } catch (ParseException e) {
        error_sintactico(e,"Error en mientras_que");
    }
  }

  static final public void si() throws ParseException {
    try {
      jj_consume_token(tSI);
      expresion();
      label_9:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tAND:
        case tOR:
          ;
          break;
        default:
          jj_la1[16] = jj_gen;
          break label_9;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tAND:
          jj_consume_token(tAND);
          break;
        case tOR:
          jj_consume_token(tOR);
          break;
        default:
          jj_la1[17] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        expresion();
      }
      jj_consume_token(tENT);
      lista_sentencias();
      label_10:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tSI_NO:
          ;
          break;
        default:
          jj_la1[18] = jj_gen;
          break label_10;
        }
        jj_consume_token(tSI_NO);
        lista_sentencias();
      }
      jj_consume_token(tFSI);
    } catch (ParseException e) {
        error_sintactico(e,"Error en si");
    }
  }

  static final public void argumentos() throws ParseException {
    try {
      jj_consume_token(tPA);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tENTACAR:
      case tCARAENT:
      case tRESTA:
      case tNOT:
      case tENTERO:
      case tTRUE:
      case tFALSE:
      case tPA:
      case tVALOR_ENTERO:
      case tVALOR_CARACTER:
      case tVALOR_CADENA:
      case tVALOR_CADENA_VACIA:
      case tIDENTIFICADOR:
        lista_expresiones();
        break;
      default:
        jj_la1[19] = jj_gen;
        ;
      }
      jj_consume_token(tPC);
    } catch (ParseException e) {
        error_sintactico(e,"Error en argumentos");
    }
  }

  static final public void lista_expresiones() throws ParseException {
    try {
      expresion();
      label_11:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tCOMA:
          ;
          break;
        default:
          jj_la1[20] = jj_gen;
          break label_11;
        }
        jj_consume_token(tCOMA);
        expresion();
      }
    } catch (ParseException e) {
        error_sintactico(e,"Error en lista_expresiones");
    }
  }

  static final public void seleccion() throws ParseException {
    try {
      jj_consume_token(tPRINCIPIO);
      jj_consume_token(tIDENTIFICADOR);
      jj_consume_token(tLLAVE_IZQ);
      label_12:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tPRINCIPIO:
        case tMQ:
        case tSI:
        case tESCRIBIR:
        case tLEER:
        case tIDENTIFICADOR:
          ;
          break;
        default:
          jj_la1[21] = jj_gen;
          break label_12;
        }
        sentencia();
      }
      jj_consume_token(tLLAVE_DCHA);
    } catch (ParseException e) {
        error_sintactico(e,"Error en seleccion");
    }
  }

  static final public void expresion() throws ParseException {
    try {
      factor();
      label_13:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tMOD:
        case tSUMA:
        case tRESTA:
        case tMULL:
        case tDIV:
        case tDIV1:
        case tMAYOR:
        case tMENOR:
        case tIGUAL:
        case tMAI:
        case tMEI:
        case tNI:
        case tAND:
        case tOR:
          ;
          break;
        default:
          jj_la1[22] = jj_gen;
          break label_13;
        }
        operador();
        factor();
      }
    } catch (ParseException e) {
        error_sintactico(e,"Error en expresion");
    }
  }

  static final public void operador() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tSUMA:
      case tRESTA:
        operador_aditivo();
        break;
      case tMOD:
      case tMULL:
      case tDIV:
      case tDIV1:
      case tMAYOR:
      case tMENOR:
      case tIGUAL:
      case tMAI:
      case tMEI:
      case tNI:
      case tAND:
      case tOR:
        operador2();
        break;
      default:
        jj_la1[23] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
        error_sintactico(e,"Error en operador_relacional");
    }
  }

  static final public void operador2() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tMOD:
      case tMULL:
      case tDIV:
      case tDIV1:
        operador_multiplicativo();
        break;
      case tMAYOR:
      case tMENOR:
      case tIGUAL:
      case tMAI:
      case tMEI:
      case tNI:
      case tAND:
      case tOR:
        operador3();
        break;
      default:
        jj_la1[24] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
        error_sintactico(e,"Error en operador_relacional");
    }
  }

  static final public void operador3() throws ParseException {
    try {
      operador_relacional();
    } catch (ParseException e) {
        error_sintactico(e,"Error en operador_relacional");
    }
  }

  static final public void operador_relacional() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tMENOR:
        jj_consume_token(tMENOR);
        break;
      case tMAYOR:
        jj_consume_token(tMAYOR);
        break;
      case tMEI:
        jj_consume_token(tMEI);
        break;
      case tMAI:
        jj_consume_token(tMAI);
        break;
      case tIGUAL:
        jj_consume_token(tIGUAL);
        break;
      case tNI:
        jj_consume_token(tNI);
        break;
      case tAND:
        jj_consume_token(tAND);
        break;
      case tOR:
        jj_consume_token(tOR);
        break;
      default:
        jj_la1[25] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
        error_sintactico(e,"Error en operador_relacional");
    }
  }

  static final public void operador_aditivo() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tRESTA:
        jj_consume_token(tRESTA);
        break;
      case tSUMA:
        jj_consume_token(tSUMA);
        break;
      default:
        jj_la1[26] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
        error_sintactico(e,"Error en operador_adictivo");
    }
  }

  static final public void operador_multiplicativo() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tMULL:
        jj_consume_token(tMULL);
        break;
      case tDIV:
        jj_consume_token(tDIV);
        break;
      case tDIV1:
        jj_consume_token(tDIV1);
        break;
      case tMOD:
        jj_consume_token(tMOD);
        break;
      default:
        jj_la1[27] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
        error_sintactico(e,"Error en operador_multiplicativo");
    }
  }

  static final public void factor() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tRESTA:
      case tNOT:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case tRESTA:
          jj_consume_token(tRESTA);
          break;
        case tNOT:
          jj_consume_token(tNOT);
          break;
        default:
          jj_la1[28] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
      default:
        jj_la1[29] = jj_gen;
        ;
      }
      factor2();
    } catch (ParseException e) {
        error_sintactico(e,"Error en factor");
    }
  }

  static final public void factor2() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case tPA:
        jj_consume_token(tPA);
        expresion();
        jj_consume_token(tPC);
        break;
      case tENTACAR:
        jj_consume_token(tENTACAR);
        jj_consume_token(tPA);
        expresion();
        jj_consume_token(tPC);
        break;
      case tCARAENT:
        jj_consume_token(tCARAENT);
        jj_consume_token(tPA);
        expresion();
        jj_consume_token(tPC);
        break;
      case tIDENTIFICADOR:
        jj_consume_token(tIDENTIFICADOR);
        break;
      case tENTERO:
        jj_consume_token(tENTERO);
        break;
      case tVALOR_CARACTER:
        jj_consume_token(tVALOR_CARACTER);
        break;
      case tVALOR_CADENA:
        jj_consume_token(tVALOR_CADENA);
        break;
      case tVALOR_CADENA_VACIA:
        jj_consume_token(tVALOR_CADENA_VACIA);
        break;
      case tVALOR_ENTERO:
        jj_consume_token(tVALOR_ENTERO);
        break;
      case tTRUE:
        jj_consume_token(tTRUE);
        break;
      case tFALSE:
        jj_consume_token(tFALSE);
        break;
      default:
        jj_la1[30] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
        error_sintactico(e,"Error en factor2");
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public minilengcompilerTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[31];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
      jj_la1_init_2();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x8000,0xca8000,0x0,0x0,0x0,0x0,0x0,0x1000,0x0,0x0,0x0,0x0,0xca8000,0x0,0x0,0x0,0x0,0x0,0x4000,0xb000000,0x0,0xca8000,0xfc200000,0xfc200000,0xf0200000,0x80000000,0xc000000,0x70200000,0x8000000,0x8000000,0x3000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x4,0x40000,0xe00,0xe00,0x0,0x0,0x40000,0x0,0x3000,0x3000,0x0,0x0,0xc0,0xc0,0xc0,0xc0,0x0,0xf004c300,0x0,0x0,0xfb,0xfb,0xfb,0xfb,0x0,0x0,0x100,0x100,0xf004c200,};
   }
   private static void jj_la1_init_2() {
      jj_la1_2 = new int[] {0x0,0x2,0x2,0x4,0x0,0x0,0x8,0x0,0x0,0x4,0x0,0x0,0x2,0x8,0x0,0x0,0x0,0x0,0x0,0x2,0x8,0x2,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x2,};
   }

  /** Constructor with InputStream. */
  public minilengcompiler(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public minilengcompiler(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new minilengcompilerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 31; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 31; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public minilengcompiler(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new minilengcompilerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 31; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 31; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public minilengcompiler(minilengcompilerTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 31; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(minilengcompilerTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 31; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[68];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 31; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 68; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
