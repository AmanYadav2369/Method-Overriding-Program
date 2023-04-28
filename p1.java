//waoojp to implement method overriding....


class A
{
void add(int a){
int res=a*a;
System.out.println("square is "+res);
}
}
class B extends A
{
void add(int a){
int res=a*a*a;
System.out.println("cube is "+res);
}

}
class p1
{
public static void main(String args[])
{
A a=new A();
a.add(5);
B b=new B();
b.add(5);


}
}