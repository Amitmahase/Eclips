package apna;

class over
{

String s;
int a;

static void m1(String s, int a)
{

System.out.println("Static m1");


}


static void m1(int a, String s)
{

System.out.println("overloaded static m1");
}


}


class runn
{
public static void main(String[] args)

{

over obj=new over();

obj.m1(20,"shiva");

obj.m1("shiv", 100);

	
	}
	

}
	

