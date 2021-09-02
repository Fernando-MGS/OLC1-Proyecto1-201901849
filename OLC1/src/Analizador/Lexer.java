// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/analizadores/Lexico

package analizadores;
import java_cup.runtime.Symbol;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\36\u0200\1\u0300\267\u0200\10\u0400\u1020\u0200";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\2\4\22\0\1\5\1\0"+
    "\1\6\1\7\1\10\2\0\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\12\22\1\23\1\24"+
    "\1\0\1\25\3\0\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\40\1\46\1\47\1\50\1\51"+
    "\1\52\1\40\1\53\1\54\1\40\1\55\1\56\1\57"+
    "\1\0\1\56\1\0\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\40\1\46\1\47\1\50\1\51"+
    "\1\52\1\40\1\53\1\54\1\40\1\60\1\61\1\62"+
    "\7\0\1\3\252\0\2\63\115\0\1\64\u0198\0\1\65"+
    "\1\56\2\0\1\66\1\67\12\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1280];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\12\23\1\24\1\6\1\25\1\26"+
    "\1\27\1\1\1\30\1\1\1\31\1\0\1\32\1\33"+
    "\3\0\12\23\1\0\1\23\2\0\1\34\1\35\12\23"+
    "\1\0\1\23\1\0\1\36\3\23\1\0\1\23\1\37"+
    "\4\23\1\0\1\23\1\0\2\23\1\0\2\23\1\0"+
    "\3\23\1\0\2\23\1\0\1\23\1\0\2\23\1\0"+
    "\2\23\1\0\1\40\2\23\1\0\1\23\2\41\2\42"+
    "\1\23\2\43\1\44\1\23\1\0\2\23\1\0\1\23"+
    "\1\45\1\46\1\45\1\46\2\47\1\23\1\0\4\23"+
    "\3\0\3\23\1\0\3\23\1\0\1\23\2\0\1\23"+
    "\1\0\2\23\1\0\3\23\1\0\2\50\1\0\1\23"+
    "\1\0\2\23\1\0\3\23\2\0\1\23\1\0\2\23"+
    "\1\0\3\23\2\0\1\23\1\0\2\23\1\0\1\23"+
    "\2\51\2\52\1\23\1\0\2\23\1\0\2\23\1\0"+
    "\1\53\2\54\2\23\1\0\1\23\1\0\1\23\1\0"+
    "\1\23\1\0\2\55\1\23\1\0\1\23\1\0\1\23"+
    "\1\0\1\23\1\0\1\23\1\0\1\23\1\0\1\23"+
    "\1\0\2\56";

  private static int [] zzUnpackAction() {
    int [] result = new int[234];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\70\0\160\0\250\0\340\0\u0118\0\70\0\340"+
    "\0\70\0\70\0\70\0\70\0\70\0\70\0\u0150\0\70"+
    "\0\u0188\0\70\0\70\0\70\0\u01c0\0\u01f8\0\u0230\0\u0268"+
    "\0\u02a0\0\u02d8\0\u0310\0\u0348\0\u0380\0\u03b8\0\70\0\70"+
    "\0\70\0\70\0\70\0\u03f0\0\70\0\340\0\u0428\0\340"+
    "\0\70\0\u0460\0\u0498\0\u04d0\0\u0508\0\u0540\0\u0578\0\u05b0"+
    "\0\u05e8\0\u0620\0\u0658\0\u0690\0\u06c8\0\u0700\0\u0738\0\u0770"+
    "\0\u07a8\0\u07e0\0\u0818\0\70\0\u0508\0\u0850\0\u0888\0\u08c0"+
    "\0\u08f8\0\u0930\0\u0968\0\u09a0\0\u09d8\0\u0a10\0\u0a48\0\u0a80"+
    "\0\u0ab8\0\u0af0\0\u0498\0\u0b28\0\u0b60\0\u0b98\0\u0bd0\0\u0c08"+
    "\0\u01f8\0\u0c40\0\u0c78\0\u0cb0\0\u0ce8\0\u0d20\0\u0d58\0\u0d90"+
    "\0\u0dc8\0\u0e00\0\u0e38\0\u0e70\0\u0ea8\0\u0ee0\0\u0f18\0\u0f50"+
    "\0\u0f88\0\u0fc0\0\u0ff8\0\u1030\0\u1068\0\u10a0\0\u10d8\0\u1110"+
    "\0\u1148\0\u1180\0\u11b8\0\u11f0\0\u1228\0\u01f8\0\u1260\0\u1298"+
    "\0\u12d0\0\u1308\0\u01f8\0\70\0\u1340\0\u1378\0\u13b0\0\u01f8"+
    "\0\70\0\u01f8\0\u13e8\0\u1420\0\u1458\0\u1490\0\u14c8\0\u1500"+
    "\0\u01f8\0\u01f8\0\70\0\70\0\u01f8\0\70\0\u1538\0\u1570"+
    "\0\u15a8\0\u15e0\0\u1618\0\u1650\0\u1688\0\u16c0\0\u16f8\0\u1730"+
    "\0\u1768\0\u17a0\0\u17d8\0\u1810\0\u1848\0\u1880\0\u18b8\0\u18f0"+
    "\0\u1928\0\u1960\0\u1998\0\u19d0\0\u1a08\0\u1a40\0\u1a78\0\u1ab0"+
    "\0\u1ae8\0\u1b20\0\u1b58\0\u01f8\0\70\0\u1b90\0\u1bc8\0\u1c00"+
    "\0\u1c38\0\u1c70\0\u1ca8\0\u1ce0\0\u1d18\0\u1d50\0\u1d88\0\u1dc0"+
    "\0\u1df8\0\u1e30\0\u1e68\0\u1ea0\0\u1ed8\0\u1f10\0\u1f48\0\u1f80"+
    "\0\u1fb8\0\u1ff0\0\u2028\0\u2060\0\u2098\0\u20d0\0\u2108\0\u2140"+
    "\0\u01f8\0\70\0\u01f8\0\70\0\u2178\0\u21b0\0\u21e8\0\u2220"+
    "\0\u2258\0\u2290\0\u22c8\0\u2300\0\u01f8\0\u01f8\0\70\0\u2338"+
    "\0\u2370\0\u23a8\0\u23e0\0\u2418\0\u2450\0\u2488\0\u24c0\0\u24f8"+
    "\0\u01f8\0\70\0\u2530\0\u2568\0\u25a0\0\u25d8\0\u2610\0\u2648"+
    "\0\u2680\0\u26b8\0\u26f0\0\u2728\0\u2760\0\u2798\0\u27d0\0\u2808"+
    "\0\u01f8\0\70";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[234];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\26\1\32\10\26\1\33\1\26\1\34"+
    "\1\35\1\26\1\36\2\26\1\37\1\40\1\41\1\42"+
    "\1\40\1\43\1\2\1\44\1\45\1\46\1\2\71\0"+
    "\2\3\1\0\2\3\63\0\2\3\1\0\1\3\1\4"+
    "\14\0\1\47\3\0\27\47\13\0\2\50\1\51\3\50"+
    "\1\51\2\50\1\51\55\50\1\51\7\0\1\52\4\0"+
    "\1\53\112\0\1\54\35\0\1\47\12\0\1\55\1\0"+
    "\1\21\3\0\27\47\20\0\1\47\14\0\1\26\3\0"+
    "\20\26\1\56\6\26\20\0\1\47\14\0\1\26\3\0"+
    "\27\26\20\0\1\47\14\0\1\26\3\0\16\26\1\57"+
    "\10\26\20\0\1\47\14\0\1\26\3\0\4\26\1\60"+
    "\11\26\1\61\10\26\20\0\1\47\14\0\1\26\3\0"+
    "\11\26\1\62\15\26\20\0\1\47\14\0\1\26\3\0"+
    "\4\26\1\63\13\26\1\64\6\26\20\0\1\47\14\0"+
    "\1\26\3\0\23\26\1\65\3\26\20\0\1\47\14\0"+
    "\1\26\3\0\22\26\1\66\4\26\20\0\1\47\14\0"+
    "\1\26\3\0\10\26\1\67\16\26\6\0\1\70\11\0"+
    "\1\47\14\0\1\26\3\0\1\71\26\26\63\0\1\72"+
    "\24\0\1\47\14\0\1\47\3\0\27\47\13\0\2\52"+
    "\3\0\63\52\3\53\2\0\7\53\1\73\53\53\47\0"+
    "\1\74\14\0\1\74\10\0\1\75\14\0\1\75\36\0"+
    "\1\75\13\0\1\47\14\0\1\26\3\0\2\26\1\76"+
    "\24\26\20\0\1\47\14\0\1\26\3\0\14\26\1\77"+
    "\12\26\20\0\1\47\14\0\1\26\3\0\5\26\1\100"+
    "\21\26\20\0\1\47\14\0\1\26\3\0\23\26\1\101"+
    "\3\26\20\0\1\47\14\0\1\26\3\0\4\26\1\102"+
    "\22\26\20\0\1\47\14\0\1\26\3\0\15\26\1\103"+
    "\11\26\20\0\1\47\14\0\1\26\3\0\1\104\26\26"+
    "\20\0\1\47\14\0\1\26\3\0\15\26\1\105\11\26"+
    "\20\0\1\47\14\0\1\26\3\0\20\26\1\106\6\26"+
    "\20\0\1\47\14\0\1\26\3\0\22\26\1\107\4\26"+
    "\63\0\1\110\24\0\1\47\14\0\1\26\3\0\13\26"+
    "\1\111\13\26\61\0\1\112\21\0\3\53\2\0\2\53"+
    "\1\113\4\53\1\73\53\53\5\0\1\47\14\0\1\26"+
    "\3\0\7\26\1\114\17\26\20\0\1\47\14\0\1\26"+
    "\3\0\17\26\1\115\7\26\20\0\1\47\14\0\1\26"+
    "\3\0\10\26\1\116\16\26\6\0\1\117\11\0\1\47"+
    "\14\0\1\26\3\0\1\26\1\120\25\26\20\0\1\47"+
    "\14\0\1\26\3\0\25\26\1\121\1\26\20\0\1\47"+
    "\14\0\1\26\3\0\4\26\1\122\22\26\20\0\1\47"+
    "\14\0\1\26\3\0\5\26\1\123\21\26\20\0\1\47"+
    "\14\0\1\26\3\0\22\26\1\124\4\26\20\0\1\47"+
    "\14\0\1\26\3\0\10\26\1\125\16\26\6\0\1\126"+
    "\11\0\1\47\14\0\1\26\3\0\23\26\1\127\3\26"+
    "\64\0\1\130\23\0\1\47\14\0\1\26\3\0\16\26"+
    "\1\131\10\26\51\0\1\126\24\0\1\126\11\0\1\47"+
    "\14\0\1\26\3\0\10\26\1\132\16\26\6\0\1\133"+
    "\11\0\1\47\14\0\1\26\3\0\1\134\26\26\20\0"+
    "\1\47\14\0\1\26\3\0\15\26\1\135\11\26\56\0"+
    "\1\136\31\0\1\47\14\0\1\26\3\0\13\26\1\137"+
    "\13\26\20\0\1\47\14\0\1\26\3\0\20\26\1\140"+
    "\6\26\20\0\1\47\14\0\1\26\3\0\10\26\1\141"+
    "\16\26\6\0\1\142\11\0\1\47\14\0\1\26\3\0"+
    "\1\143\26\26\20\0\1\47\14\0\1\26\3\0\15\26"+
    "\1\144\11\26\56\0\1\145\31\0\1\47\14\0\1\26"+
    "\3\0\13\26\1\146\13\26\54\0\1\147\33\0\1\47"+
    "\14\0\1\26\3\0\20\26\1\150\6\26\20\0\1\47"+
    "\14\0\1\26\3\0\24\26\1\151\2\26\65\0\1\152"+
    "\22\0\1\47\14\0\1\26\3\0\20\26\1\153\6\26"+
    "\20\0\1\47\14\0\1\26\3\0\10\26\1\154\16\26"+
    "\6\0\1\155\42\0\1\155\24\0\1\155\11\0\1\47"+
    "\14\0\1\26\3\0\4\26\1\156\22\26\20\0\1\47"+
    "\14\0\1\26\3\0\1\157\26\26\20\0\1\47\14\0"+
    "\1\26\3\0\2\26\1\160\24\26\43\0\1\161\44\0"+
    "\1\47\14\0\1\26\3\0\11\26\1\162\15\26\20\0"+
    "\1\47\14\0\1\26\3\0\6\26\1\163\20\26\47\0"+
    "\1\164\40\0\1\47\14\0\1\26\3\0\16\26\1\165"+
    "\10\26\57\0\1\166\30\0\1\47\14\0\1\26\3\0"+
    "\4\26\1\167\22\26\20\0\1\47\14\0\1\26\3\0"+
    "\16\26\1\170\10\26\57\0\1\171\30\0\1\47\14\0"+
    "\1\26\3\0\4\26\1\172\22\26\20\0\1\47\14\0"+
    "\1\26\3\0\20\26\1\173\6\26\61\0\1\174\26\0"+
    "\1\47\14\0\1\26\3\0\20\26\1\175\6\26\20\0"+
    "\1\47\14\0\1\26\3\0\1\176\26\26\41\0\1\177"+
    "\46\0\1\47\14\0\1\26\3\0\4\26\1\200\22\26"+
    "\20\0\1\47\14\0\1\26\3\0\25\26\1\201\1\202"+
    "\66\0\1\203\1\204\20\0\1\47\14\0\1\26\3\0"+
    "\21\26\1\205\5\26\7\0\1\206\10\0\1\47\14\0"+
    "\1\26\3\0\6\26\1\207\20\26\47\0\1\210\40\0"+
    "\1\47\14\0\1\26\3\0\20\26\1\211\6\26\20\0"+
    "\1\47\14\0\1\26\3\0\1\26\1\212\11\26\1\213"+
    "\3\26\1\214\7\26\42\0\1\215\11\0\1\216\3\0"+
    "\1\217\27\0\1\47\14\0\1\26\3\0\4\26\1\220"+
    "\1\26\1\221\20\26\20\0\1\47\14\0\1\26\3\0"+
    "\13\26\1\222\13\26\54\0\1\223\33\0\1\47\14\0"+
    "\1\26\3\0\4\26\1\224\22\26\20\0\1\47\14\0"+
    "\1\26\3\0\1\225\26\26\20\0\1\47\14\0\1\26"+
    "\3\0\10\26\1\226\16\26\6\0\1\227\11\0\1\47"+
    "\14\0\1\26\3\0\10\26\1\230\16\26\6\0\1\231"+
    "\32\0\1\232\77\0\1\227\24\0\1\227\42\0\1\231"+
    "\24\0\1\231\11\0\1\47\14\0\1\26\3\0\21\26"+
    "\1\233\5\26\7\0\1\234\10\0\1\47\14\0\1\26"+
    "\3\0\4\26\1\235\22\26\20\0\1\47\14\0\1\26"+
    "\3\0\16\26\1\236\10\26\57\0\1\237\30\0\1\47"+
    "\14\0\1\26\3\0\17\26\1\240\7\26\20\0\1\47"+
    "\14\0\1\26\3\0\20\26\1\241\6\26\20\0\1\47"+
    "\14\0\1\26\3\0\15\26\1\242\11\26\56\0\1\243"+
    "\31\0\1\47\14\0\1\26\3\0\4\26\1\244\22\26"+
    "\45\0\1\245\103\0\1\246\26\0\1\47\14\0\1\26"+
    "\3\0\17\26\1\247\7\26\60\0\1\250\27\0\1\47"+
    "\14\0\1\26\3\0\15\26\1\251\11\26\20\0\1\47"+
    "\14\0\1\26\3\0\1\26\1\252\25\26\42\0\1\253"+
    "\45\0\1\47\14\0\1\26\3\0\16\26\1\254\10\26"+
    "\20\0\1\47\14\0\1\26\3\0\20\26\1\255\6\26"+
    "\20\0\1\47\14\0\1\26\3\0\4\26\1\256\22\26"+
    "\45\0\1\257\103\0\1\260\26\0\1\47\14\0\1\26"+
    "\3\0\4\26\1\261\22\26\45\0\1\262\42\0\1\47"+
    "\14\0\1\26\3\0\4\26\1\263\22\26\20\0\1\47"+
    "\14\0\1\26\3\0\1\264\26\26\41\0\1\265\46\0"+
    "\1\47\14\0\1\26\3\0\20\26\1\266\6\26\20\0"+
    "\1\47\14\0\1\26\3\0\1\267\26\26\20\0\1\47"+
    "\14\0\1\26\3\0\1\270\26\26\41\0\1\271\67\0"+
    "\1\272\46\0\1\47\14\0\1\26\3\0\2\26\1\273"+
    "\24\26\43\0\1\274\44\0\1\47\14\0\1\26\3\0"+
    "\20\26\1\275\6\26\20\0\1\47\14\0\1\26\3\0"+
    "\13\26\1\276\13\26\54\0\1\277\33\0\1\47\14\0"+
    "\1\26\3\0\22\26\1\300\4\26\20\0\1\47\14\0"+
    "\1\26\3\0\21\26\1\301\5\26\7\0\1\302\10\0"+
    "\1\47\14\0\1\26\3\0\21\26\1\303\5\26\7\0"+
    "\1\304\52\0\1\304\14\0\1\304\52\0\1\302\14\0"+
    "\1\302\10\0\1\47\14\0\1\26\3\0\10\26\1\305"+
    "\16\26\6\0\1\306\42\0\1\306\24\0\1\306\11\0"+
    "\1\47\14\0\1\26\3\0\1\307\26\26\20\0\1\47"+
    "\14\0\1\26\3\0\4\26\1\310\22\26\45\0\1\311"+
    "\42\0\1\47\14\0\1\26\3\0\4\26\1\312\22\26"+
    "\20\0\1\47\14\0\1\26\3\0\5\26\1\313\21\26"+
    "\46\0\1\314\41\0\1\47\14\0\1\26\3\0\13\26"+
    "\1\315\13\26\20\0\1\47\14\0\1\26\3\0\21\26"+
    "\1\316\5\26\7\0\1\317\52\0\1\317\14\0\1\317"+
    "\10\0\1\47\14\0\1\26\3\0\4\26\1\320\22\26"+
    "\20\0\1\47\14\0\1\26\3\0\10\26\1\321\16\26"+
    "\6\0\1\322\42\0\1\322\24\0\1\322\11\0\1\47"+
    "\14\0\1\26\3\0\21\26\1\323\5\26\7\0\1\324"+
    "\10\0\1\47\14\0\1\26\3\0\2\26\1\325\24\26"+
    "\43\0\1\326\44\0\1\47\14\0\1\26\3\0\22\26"+
    "\1\327\4\26\63\0\1\330\24\0\1\47\14\0\1\26"+
    "\3\0\16\26\1\331\10\26\57\0\1\332\30\0\1\47"+
    "\14\0\1\26\3\0\1\333\26\26\41\0\1\334\46\0"+
    "\1\47\14\0\1\26\3\0\3\26\1\335\23\26\44\0"+
    "\1\336\43\0\1\47\14\0\1\26\3\0\10\26\1\337"+
    "\16\26\6\0\1\340\42\0\1\340\24\0\1\340\11\0"+
    "\1\47\14\0\1\26\3\0\21\26\1\341\5\26\7\0"+
    "\1\342\52\0\1\342\14\0\1\342\10\0\1\47\14\0"+
    "\1\26\3\0\22\26\1\343\4\26\63\0\1\344\24\0"+
    "\1\47\14\0\1\26\3\0\10\26\1\345\16\26\6\0"+
    "\1\346\42\0\1\346\24\0\1\346\11\0\1\47\14\0"+
    "\1\26\3\0\2\26\1\347\24\26\43\0\1\350\44\0"+
    "\1\47\14\0\1\26\3\0\16\26\1\351\10\26\57\0"+
    "\1\352\23\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10304];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\1\11\1\1\6\11\1\1\1\11"+
    "\1\1\3\11\12\1\5\11\1\1\1\11\2\1\1\0"+
    "\1\11\1\1\3\0\12\1\1\0\1\1\2\0\1\11"+
    "\13\1\1\0\1\1\1\0\4\1\1\0\6\1\1\0"+
    "\1\1\1\0\2\1\1\0\2\1\1\0\3\1\1\0"+
    "\2\1\1\0\1\1\1\0\2\1\1\0\2\1\1\0"+
    "\3\1\1\0\2\1\1\11\4\1\1\11\2\1\1\0"+
    "\2\1\1\0\3\1\2\11\1\1\1\11\1\1\1\0"+
    "\4\1\3\0\3\1\1\0\3\1\1\0\1\1\2\0"+
    "\1\1\1\0\2\1\1\0\3\1\1\0\1\1\1\11"+
    "\1\0\1\1\1\0\2\1\1\0\3\1\2\0\1\1"+
    "\1\0\2\1\1\0\3\1\2\0\1\1\1\0\2\1"+
    "\1\0\2\1\1\11\1\1\1\11\1\1\1\0\2\1"+
    "\1\0\2\1\1\0\2\1\1\11\2\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\11\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[234];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
      yycolumn=1;
    yyline=1;
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.println("Este es un error lexico: "+yytext()+
    ", en la linea: "+yyline+", en la columna: "+yycolumn);
            }
            // fall through
          case 47: break;
          case 2:
            { 
            }
            // fall through
          case 48: break;
          case 3:
            { return new Symbol(sym.comillas,yyline,yycolumn,yytext());
            }
            // fall through
          case 49: break;
          case 4:
            { return new Symbol(sym.hash,yyline,yycolumn,yytext());
            }
            // fall through
          case 50: break;
          case 5:
            { return new Symbol(sym.dolar,yyline,yycolumn,yytext());
            }
            // fall through
          case 51: break;
          case 6:
            { return new Symbol(sym.path,yyline,yycolumn,yytext());
            }
            // fall through
          case 52: break;
          case 7:
            { return new Symbol(sym.par_i,yyline,yycolumn,yytext());
            }
            // fall through
          case 53: break;
          case 8:
            { return new Symbol(sym.par_d,yyline,yycolumn,yytext());
            }
            // fall through
          case 54: break;
          case 9:
            { return new Symbol(sym.por,yyline,yycolumn,yytext());
            }
            // fall through
          case 55: break;
          case 10:
            { return new Symbol(sym.mas,yyline,yycolumn,yytext());
            }
            // fall through
          case 56: break;
          case 11:
            { return new Symbol(sym.coma,yyline,yycolumn,yytext());
            }
            // fall through
          case 57: break;
          case 12:
            { return new Symbol(sym.menos,yyline,yycolumn,yytext());
            }
            // fall through
          case 58: break;
          case 13:
            { return new Symbol(sym.punto,yyline,yycolumn,yytext());
            }
            // fall through
          case 59: break;
          case 14:
            { return new Symbol(sym.div,yyline,yycolumn,yytext());
            }
            // fall through
          case 60: break;
          case 15:
            { return new Symbol(sym.entero,yyline,yycolumn,yytext());
            }
            // fall through
          case 61: break;
          case 16:
            { return new Symbol(sym.d_punto,yyline,yycolumn,yytext());
            }
            // fall through
          case 62: break;
          case 17:
            { return new Symbol(sym.ptcoma,yyline,yycolumn,yytext());
            }
            // fall through
          case 63: break;
          case 18:
            { return new Symbol(sym.igual,yyline,yycolumn,yytext());
            }
            // fall through
          case 64: break;
          case 19:
            { return new Symbol(sym.name,yyline,yycolumn,yytext());
            }
            // fall through
          case 65: break;
          case 20:
            { return new Symbol(sym.cor_i,yyline,yycolumn,yytext());
            }
            // fall through
          case 66: break;
          case 21:
            { return new Symbol(sym.cor_d,yyline,yycolumn,yytext());
            }
            // fall through
          case 67: break;
          case 22:
            { return new Symbol(sym.llave_i,yyline,yycolumn,yytext());
            }
            // fall through
          case 68: break;
          case 23:
            { return new Symbol(sym.llave_d,yyline,yycolumn,yytext());
            }
            // fall through
          case 69: break;
          case 24:
            { return new Symbol(sym.coma_f,yyline,yycolumn,yytext());
            }
            // fall through
          case 70: break;
          case 25:
            { return new Symbol(sym.chain,yyline,yycolumn,yytext());
            }
            // fall through
          case 71: break;
          case 26:
            { return new Symbol(sym.cadena,yyline,yycolumn,yytext());
            }
            // fall through
          case 72: break;
          case 27:
            { return new Symbol(sym.com,yyline,yycolumn,yytext());
            }
            // fall through
          case 73: break;
          case 28:
            { return new Symbol(sym.js_ext,yyline,yycolumn,yytext());
            }
            // fall through
          case 74: break;
          case 29:
            { return new Symbol(sym.digitos,yyline,yycolumn,yytext());
            }
            // fall through
          case 75: break;
          case 30:
            { return new Symbol(sym.comm,yyline,yycolumn,yytext());
            }
            // fall through
          case 76: break;
          case 31:
            { return new Symbol(sym.pejex,yyline,yycolumn,yytext());
            }
            // fall through
          case 77: break;
          case 32:
            { return new Symbol(sym.tdouble,yyline,yycolumn,yytext());
            }
            // fall through
          case 78: break;
          case 33:
            { return new Symbol(sym.tstring,yyline,yycolumn,yytext());
            }
            // fall through
          case 79: break;
          case 34:
            { return new Symbol(sym.title,yyline,yycolumn,yytext());
            }
            // fall through
          case 80: break;
          case 35:
            { return new Symbol(sym.pfile,yyline,yycolumn,yytext());
            }
            // fall through
          case 81: break;
          case 36:
            { return new Symbol(sym.pcompare,yyline,yycolumn,yytext());
            }
            // fall through
          case 82: break;
          case 37:
            { return new Symbol(sym.title_x,yyline,yycolumn,yytext());
            }
            // fall through
          case 83: break;
          case 38:
            { return new Symbol(sym.title_y,yyline,yycolumn,yytext());
            }
            // fall through
          case 84: break;
          case 39:
            { return new Symbol(sym.pvalue,yyline,yycolumn,yytext());
            }
            // fall through
          case 85: break;
          case 40:
            { return new Symbol(sym.pgrafp,yyline,yycolumn,yytext());
            }
            // fall through
          case 86: break;
          case 41:
            { return new Symbol(sym.pgrafb,yyline,yycolumn,yytext());
            }
            // fall through
          case 87: break;
          case 42:
            { return new Symbol(sym.pgrafl,yyline,yycolumn,yytext());
            }
            // fall through
          case 88: break;
          case 43:
            { return new Symbol(sym.gen_pt,yyline,yycolumn,yytext());
            }
            // fall through
          case 89: break;
          case 44:
            { return new Symbol(sym.pdefinir,yyline,yycolumn,yytext());
            }
            // fall through
          case 90: break;
          case 45:
            { return new Symbol(sym.esp_pt,yyline,yycolumn,yytext());
            }
            // fall through
          case 91: break;
          case 46:
            { return new Symbol(sym.preporte,yyline,yycolumn,yytext());
            }
            // fall through
          case 92: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}