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
Font f;
f = new Font (“TimesNewRoman”, Font.BOLD+Font.ITALIC,12);
String font = f. getName( );
int style = f.getStyle ( );
int size = f.getSize ( );
boolean bold = f.isBold ( );
boolean normal = f.isPlain ( );
boolean italic = f.isItalic ( );
System.out.println ("Font : "+ font + "\n Style : "+ style + "\n Size: "+ size + "\n Bold : "+bold + "\n Italic : "+italic);
}
}