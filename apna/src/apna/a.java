package apna;
class parent
{

String s="parent";

parent()
{
System.out.println("Constructor parent");
}
}

class Child extends parent
{
String s="child";

Child()
{

System.out.println("constructor child");
System.out.println(s);
System.out.println(super.s);
System.out.println(this.s);

}
}

public class a
{


public static void main(String[] args)


{

Child c=new Child();

}
}
