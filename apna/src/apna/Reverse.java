package apna;

class Reverse
{

public static void main(String[] args)

{

String s="Animation";
String reve="";

for (int i=s.length()-1; i>=0;i--)

{

reve += s.charAt(i);


}

System.out.println("Reverse of the string is --> "+ reve);


}


}