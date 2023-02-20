
public class Staticloading{
public static void main(String args[]){
System.out.println("1 loading main...");
StatA.a=10;
System.out.println("3 bye");
//System.exit(0);
}

static{
System.out.println("0 xxxx");

}
}

class StatA{
static int a;
static{
a=0;
System.out.println("2 loading StatA...");
}
}
