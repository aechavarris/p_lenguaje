/* Generated By:JavaCC: Do not edit this line. minilengcompilerTokenManager.java */
package analizador;
import java.io.*;
import lib.aviso.*;
import lib.semantico.*;

/** Token Manager. */
public class minilengcompilerTokenManager implements minilengcompilerConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 37:
         return jjMoveStringLiteralDfa1_2(0x100L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_2(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 37:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(1, 8);
         break;
      default :
         return 2;
   }
   return 2;
}
private static final int jjStopStringLiteralDfa_0(int pos, long active0, long active1)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3fc043eaf800L) != 0L)
         {
            jjmatchedKind = 65;
            return 22;
         }
         if ((active0 & 0x400000000000L) != 0L)
         {
            jjmatchedKind = 65;
            return 3;
         }
         if ((active0 & 0x8000000L) != 0L)
            return 13;
         if ((active0 & 0x800000150000L) != 0L)
         {
            jjmatchedKind = 65;
            return 7;
         }
         return -1;
      case 1:
         if ((active0 & 0x80000a4000L) != 0L)
            return 22;
         if ((active0 & 0x800000000000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 65;
               jjmatchedPos = 1;
            }
            return 6;
         }
         if ((active0 & 0x3f4043f5b800L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 65;
               jjmatchedPos = 1;
            }
            return 22;
         }
         if ((active0 & 0x400000000000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 65;
               jjmatchedPos = 1;
            }
            return 2;
         }
         return -1;
      case 2:
         if ((active0 & 0x800000000000L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 65;
               jjmatchedPos = 2;
            }
            return 5;
         }
         if ((active0 & 0xc0002c09800L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 65;
               jjmatchedPos = 2;
            }
            return 22;
         }
         if ((active0 & 0x334041356000L) != 0L)
            return 22;
         if ((active0 & 0x400000000000L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 65;
               jjmatchedPos = 2;
            }
            return 23;
         }
         return -1;
      case 3:
         if ((active0 & 0xe000340d800L) != 0L)
         {
            jjmatchedKind = 65;
            jjmatchedPos = 3;
            return 22;
         }
         if ((active0 & 0x400000800000L) != 0L)
            return 22;
         if ((active0 & 0x800000000000L) != 0L)
         {
            jjmatchedKind = 65;
            jjmatchedPos = 3;
            return 23;
         }
         return -1;
      case 4:
         if ((active0 & 0x800000004000L) != 0L)
            return 22;
         if ((active0 & 0xe0003409800L) != 0L)
         {
            jjmatchedKind = 65;
            jjmatchedPos = 4;
            return 22;
         }
         return -1;
      case 5:
         if ((active0 & 0x20000001000L) != 0L)
            return 22;
         if ((active0 & 0xc0003408800L) != 0L)
         {
            jjmatchedKind = 65;
            jjmatchedPos = 5;
            return 22;
         }
         return -1;
      case 6:
         if ((active0 & 0xc0000408800L) != 0L)
         {
            jjmatchedKind = 65;
            jjmatchedPos = 6;
            return 22;
         }
         if ((active0 & 0x3000000L) != 0L)
            return 22;
         return -1;
      case 7:
         if ((active0 & 0xc0000400800L) != 0L)
            return 22;
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 65;
            jjmatchedPos = 7;
            return 22;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0, long active1)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 37:
         jjmatchedKind = 5;
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 40:
         return jjStopAtPos(0, 50);
      case 41:
         return jjStopAtPos(0, 51);
      case 42:
         return jjStopAtPos(0, 28);
      case 43:
         return jjStopAtPos(0, 26);
      case 44:
         return jjStopAtPos(0, 67);
      case 45:
         return jjStartNfaWithStates_0(0, 27, 13);
      case 47:
         return jjStopAtPos(0, 29);
      case 58:
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 59:
         return jjStopAtPos(0, 66);
      case 60:
         jjmatchedKind = 32;
         return jjMoveStringLiteralDfa1_0(0x3000000000L);
      case 61:
         return jjStopAtPos(0, 33);
      case 62:
         jjmatchedKind = 31;
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x4000001000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x80002000000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x20001402000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x800000150000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x220000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x8800L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x84000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 123:
         return jjStopAtPos(0, 48);
      case 125:
         return jjStopAtPos(0, 49);
      default :
         return jjMoveNfa_0(9, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, 0L);
      return 1;
   }
   switch(curChar)
   {
      case 37:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 61:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         break;
      case 62:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x980002000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000800000L);
      case 73:
      case 105:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x40014000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x24001002000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x50000200000L);
      case 81:
      case 113:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(1, 17, 22);
         break;
      case 82:
      case 114:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 39, 22);
         return jjMoveStringLiteralDfa2_0(active0, 0x400000008800L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x500000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0, 0L);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, 0L);
      return 2;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x401000L);
      case 68:
      case 100:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(2, 21, 22);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 38, 22);
         break;
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 70:
      case 102:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 45, 22);
         break;
      case 73:
      case 105:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(2, 20, 22);
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 76:
      case 108:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 44, 22);
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000000L);
      case 78:
      case 110:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(2, 16, 22);
         break;
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000800L);
      case 81:
      case 113:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(2, 18, 22);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x80002000000L);
      case 84:
      case 116:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 40, 22);
         return jjMoveStringLiteralDfa3_0(active0, 0x20001000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000000L);
      case 86:
      case 118:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(2, 30, 22);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0, 0L);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x80003000000L);
      case 69:
      case 101:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 46, 22);
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0xc000L);
      case 82:
      case 114:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(3, 23, 22);
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, 0L);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x80001008000L);
      case 69:
      case 101:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 47, 22);
         return jjMoveStringLiteralDfa5_0(active0, 0x40002000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      case 79:
      case 111:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(4, 14, 22);
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000800L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x40001000800L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000L);
      case 78:
      case 110:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(5, 12, 22);
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000L);
      case 79:
      case 111:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 41, 22);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x80000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x400000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa7_0(active0, 0x800L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000L);
      case 82:
      case 114:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(6, 24, 22);
         break;
      case 84:
      case 116:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(6, 25, 22);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(7, 11, 22);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0x8000L);
      case 79:
      case 111:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 42, 22);
         break;
      case 82:
      case 114:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(7, 22, 22);
         else if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 43, 22);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0, 0L);
      return 8;
   }
   switch(curChar)
   {
      case 79:
      case 111:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(8, 15, 22);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0, 0L);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 22;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 9:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 60)
                        kind = 60;
                     jjCheckNAdd(0);
                  }
                  else if (curChar == 34)
                     jjCheckNAddStates(0, 2);
                  else if (curChar == 45)
                     jjAddStates(3, 7);
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 65)
                        kind = 65;
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 65)
                        kind = 65;
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 65)
                        kind = 65;
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 65)
                        kind = 65;
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 13:
                  if (curChar == 34)
                     jjCheckNAdd(20);
                  if (curChar == 34)
                     jjCheckNAdd(17);
                  if (curChar == 34)
                     jjCheckNAdd(14);
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 65)
                        kind = 65;
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 65)
                        kind = 65;
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 65)
                        kind = 65;
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 60)
                     kind = 60;
                  jjCheckNAdd(0);
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) != 0L && kind > 65)
                     kind = 65;
                  break;
               case 12:
                  if (curChar == 45)
                     jjAddStates(3, 7);
                  break;
               case 14:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 15:
                  if (curChar == 34 && kind > 61)
                     kind = 61;
                  break;
               case 16:
                  if (curChar == 34)
                     jjCheckNAdd(17);
                  break;
               case 17:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(17, 18);
                  break;
               case 18:
                  if (curChar == 34 && kind > 62)
                     kind = 62;
                  break;
               case 19:
                  if (curChar == 34)
                     jjCheckNAdd(20);
                  break;
               case 20:
                  if (curChar == 34 && kind > 63)
                     kind = 63;
                  break;
               case 21:
                  if (curChar == 34)
                     jjCheckNAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 9:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 65)
                        kind = 65;
                     jjCheckNAddTwoStates(10, 11);
                  }
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 22:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 65)
                        kind = 65;
                  }
                  break;
               case 6:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 65)
                        kind = 65;
                  }
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 2:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 65)
                        kind = 65;
                  }
                  if ((0x20000000200000L & l) != 0L)
                     jjCheckNAdd(1);
                  break;
               case 7:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 65)
                        kind = 65;
                  }
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 13:
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 5:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 65)
                        kind = 65;
                  }
                  if ((0x8000000080000L & l) != 0L)
                     jjCheckNAdd(1);
                  break;
               case 3:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 65)
                        kind = 65;
                  }
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 23:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 65)
                        kind = 65;
                  }
                  if ((0x2000000020L & l) != 0L)
                  {
                     if (kind > 64)
                        kind = 64;
                  }
                  break;
               case 1:
                  if ((0x2000000020L & l) != 0L && kind > 64)
                     kind = 64;
                  break;
               case 4:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 8:
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 10:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 11:
                  if ((0x7fffffe07fffffeL & l) != 0L && kind > 65)
                     kind = 65;
                  break;
               case 14:
                  jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  jjAddStates(8, 9);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 14:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(8, 9);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 22 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 7);
      default :
         return 1;
   }
}
static final int[] jjnextStates = {
   14, 17, 20, 13, 16, 19, 4, 8, 17, 18, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, "\53", 
"\55", "\52", "\57", null, "\76", "\74", "\75", "\72\75", "\76\75", "\74\75", 
"\74\76", null, null, null, null, null, null, null, null, null, null, "\173", "\175", 
"\50", "\51", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, "\73", "\54", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "COMLINE",
   "COMBLOCK",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, 1, 2, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xf00ffffffffff801L, 0xfL, 
};
static final long[] jjtoSkip = {
   0x1feL, 0x0L, 
};
static final long[] jjtoMore = {
   0x600L, 0x0L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[22];
static private final int[] jjstateSet = new int[44];
static protected char curChar;
/** Constructor. */
public minilengcompilerTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public minilengcompilerTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 22; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 3 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 9)
         {
            jjmatchedKind = 9;
         }
         break;
       case 2:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         if (jjmatchedPos == 0 && jjmatchedKind > 10)
         {
            jjmatchedKind = 10;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
