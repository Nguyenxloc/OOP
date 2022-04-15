//class: ColourChecking , Define color (red=193, green=255,blue= 183)
//Find the Hue, saturation and brigtness of this color.
//no seperate the rgb values
// switch from RGB color into HSB
// java.awt
import java.awt. *;
public class ColourChecking
{
public static void main(String arg [ ])
{
Color rgb, hsb;
rgb = new Color (193,255,183);
int red, green, blue;
red = rgb.getRed ( );
green = rgb.getGreen ( );
blue = rgb.getBlue ( );

float x [ ] = {0.0f,0.0f,0.0f};/// definition array 
rgb.RGBtoHSB(red, green, blue, x);
System.out.println ("RGB Combination");
System.out.println ("Red : "+red+"Green: "+green+"Blue : "+blue);
System.out.println ("Hue : "+x[0]+ "Saturation: "+x[1] +
"Brightness: "+x[2]);
int r = rgb.HSBtoRGB (0.75f,0.2375f,0.95f);
System.out.println ("\n HSB Combination");
System.out.println(" Red, Blue and Green Combination : "+ r);
System.out.println(red);
System.out.println(green);
}
}
