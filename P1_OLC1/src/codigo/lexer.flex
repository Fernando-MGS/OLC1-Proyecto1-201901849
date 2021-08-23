package codigo;
import java_cup.runtime.Symbol;
%%
%class Lexer
%public
%char
%line
%cup
%unicode
%ignorecase
%init{
    yycolumn=1;
    yyline=1;
%init}
L=[a-zA-Z_]+
ENTERO =[0-9]+ 
CADENA =[\"\“\'] [^\"\”\'\n]* [\"\”\'\n]
BLANCOS=[ \t\r\f\n]+
%%

"=" {return new Symbol(sym.igual,yycolumn,yyline,yytext());}
"#" {return new Symbol(sym.hash,yycolumn,yyline,yytext());}
"+" {return new Symbol(sym.mas,yycolumn,yyline,yytext());}
"-" {return new Symbol(sym.menos,yycolumn,yyline,yytext());}
"*" {return new Symbol(sym.por,yycolumn,yyline,yytext());}
"/" {return new Symbol(sym.div,yycolumn,yyline,yytext());}

";" {return new Symbol(sym.ptcoma),yycolumn,yyline,yytext());}
"(" {return new Symbol(sym.par1),yycolumn,yyline,yytext());}
")" {return new Symbol(sym.par2),yycolumn,yyline,yytext());}
"{" {return new Symbol(sym.llave1),yycolumn,yyline,yytext());}
"}" {return new Symbol(sym.llave2),yycolumn,yyline,yytext());}

"DEFINIRGLOBALES" {return new Symbol(sym.pdefinir,yycolumn,yyline,yytext());}
"GENERARREPORTEESTADISTICO" {return new Symbol(sym.preporte,yycolumn,yyline,yytext());}
"GRAFICABARRAS" {return new Symbol(sym.pgrafb,yycolumn,yyline,yytext());}
"GRAFICAPIE" {return new Symbol(sym.pgrafp,yycolumn,yyline,yytext());}
"GRAFICALINEAS" {return new Symbol(sym.pgrafl,yycolumn,yyline,yytext());}
"COMPARE" {return new Symbol(sym.pcompare,yycolumn,yyline,yytext());}
"STRING" {return new Symbol(sym.tstring,yycolumn,yyline,yytext());}
"DOUBLE" {return new Symbol(sym.tdouble,yycolumn,yyline,yytext());}

{BLANCOS} {}
{ENTERO} {return new Symbol(sym.entero,yycolumn,yyline,yytext());}  
{L} {return new Symbol(sym.letra,yycolumn,yyline,yytext());} 
{CADENA} {return new Symbol(sym.cadena,yyline,yycolumn, yytext());} 

. {
    System.out.println("Este es un error lexico: "+yytext()+
    ", en la linea: "+yyline+", en la columna: "+yycolumn);
}