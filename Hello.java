class Overloading{
void add(){
System.out.println("Nothing to add.");
}
void add(int a){
System.out.println(a+a);
}
void add(int a,int b){
System.out.println(a+b);
}
void add(String a, String b){
System.out.println(a+b);
}
int add(double a, double b){
System.out.println(a+b);
return 0;
}
}

public class Hello{
public static void main(String args[]){
Overloading o=new Overloading();
o.add(3);
o.add(2.5,3.4);
o.add(4,5);
o.add();
o.add("a","b");
}
}