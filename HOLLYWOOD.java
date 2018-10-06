import java.io.*;
public class HOLLYWOOD
{
public void main()throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
String m="THE DARK KNIGHT RISES";
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
int flag=5;
while(flag>0)
{
System.out.println("Number of lives remaining:"+flag);
System.out.println("Instruction:Position refers to the place of that character in the given name of movie.\nExample=Position of m in 'good morning' is 6. ");
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
flag--;
}
if(flag==0)
System.out.println("YOU LOSE.");
else
System.out.println("YOU WIN");
}
}