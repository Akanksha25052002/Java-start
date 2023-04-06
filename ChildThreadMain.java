public class ChildThreadMain {
    public static void main(String[] args) {
        
        MyClass my=new MyClass();
        System.out.println("Hello");
        try{
            Thread.sleep(1000);

        }catch(Exception e){
            

            // my.show();
        }
        System.out.println("bye");
    }
}

class MyClass extends Thread {
void show(){
      System.out.println("Welcome");
}
 MyClass(){
    start();

}
public void run(){
    show();
}

}