import java.io.*;
public class HOLLYWOOD
{
public void main()throws IOException
{
HOLLYWOOD obj=new HOLLYWOOD();
obj.design();
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
String temp;
int num,flag,choice=0;

do
{
System.out.println("\f");
System.out.println("Enter a number between 0 to 9");
num=Integer.parseInt(buf.readLine());
String mov[]={"THE GODFATHER","THE DARK KNIGHT RISES","THE SHAWSHANK REDEMPTION","TITANIC","INTERSTELLAR","BACK TO THE FUTURE","JURASSIC PARK","BLADE RUNNER","ROCKY"};
System.out.println("\f");
String m=mov[num];
String movie="";
for(int i=0;i<m.length();i++)
{
char ch=m.charAt(i);
if(ch==' ')
movie=movie+"/";
else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
movie=movie+ch;
else
movie=movie+"_";
}
System.out.println(movie);
temp="";
for(int i=0;i<m.length();i++)
{
char ch=m.charAt(i);
if(ch==' ')
temp=temp+"/";
else
temp=temp+ch;
}

flag=5;
while(flag>0)
{

System.out.println("Number of lives remaining:"+flag);
System.out.println("Instruction:Position refers to the place of that character in the given name of movie.\nExample=Position of M in 'GOOD MORNING' is 6. ");
System.out.println("Enter position:");
int n=Integer.parseInt(buf.readLine());
System.out.println("Enter alphabet:");
char c=(char)buf.read();
c=Character.toUpperCase(c);
buf.readLine();
if(c==m.charAt(n-1))
{
movie=movie.substring(0,n-1)+c+movie.substring(n);
System.out.println("\f");
System.out.println(movie);
}
else
{
flag--;
System.out.println("\f");
System.out.println(movie);
}
if(movie.equals(temp))
break;
}
System.out.println("\f");
if(flag==0)
System.out.println("\t\t\t\t\t\t\tYOU LOSE.");
else
System.out.println("\t\t\t\t\t\t\tYOU WIN");
System.out.println("Movie was:"+mov[num]);
System.out.println("Enter 0 to play again.\nEnter any other number to exit");
choice=Integer.parseInt(buf.readLine()); 
}while(choice==0);
}
public void design()
{
System.out.println("\t\t\t\t\t\t\tWELCOME");
 for(double i=0.0;i<900000000.0;i++){}
System.out.println("\t\t\t\t\t\t\tTO");
 for(double i=0.0;i<900000000.0;i++){}
System.out.println("\t\t\t\t\t\t\tHOLLYWOOD");
 for(double i=0.0;i<900000000.0;i++){}
 System.out.println("\f");
}
}