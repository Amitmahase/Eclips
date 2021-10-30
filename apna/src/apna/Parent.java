package apna;

class Parent
{

int a;
String name;

public void m1(int a, String name)

{

System.out.println("I am 1st method");


}

public void m1( String name, int a)

{

	System.out.println("I am other method");

}

public static void main(String[] args)

{

Parent p=new Parent();

p.m1(20, "anil");
p.m1("anil", 20);

}

}

