public class Exception{
public static void main(String args[]){

//Exception ex=new Exception();

try{

int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=a/b;
System.out.println("a/b="+c);

}

catch(ArithmeticException ex){
System.out.println("a/b=0");
}
catch(ArrayIndexOutOfBoundsException ex){
System.out.println("Insufficient inputs please enter two integer");
}
catch(NumberFormatException ex){
System.out.println("Only digits acceptable");
}

/*catch(Exception ex){
System.out.println(ex.getMessage());
}*/

finally{
System.out.println("Bye");
}
}

public void printStackTrace() {
}
}

