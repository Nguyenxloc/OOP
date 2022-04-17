//a program : #checkthefont
//method: #font(attribute: bold: Timenewroman; Italicsize: 12)
//output: #attribute of the font.
//java.awt
//FONT CHECKING
import java.awt.*;
public class FontChecking
{
public static void main (String arg [ ])
{
Font f;///object(int a )(that like variable)
f = new Font ("TimesNewRoman", Font.BOLD+Font.ITALIC,12);////Font(String name, int style, int size)
String font = f. getName( );//// get name from f 
int style = f.getStyle ( );////get style from f
int size = f.getSize ( );/////get size from f
boolean bold = f.isBold ( );///
boolean normal = f.isPlain ( );///
boolean italic = f.isItalic ( );///
System.out.println ("Font : "+ font + "\n Style : "+ style + "\n Size: "+ size + "\n Bold : "+bold + "\n Italic : "+italic);
System.out.println(Font.BOLD+Font.ITALIC);
}
}