// public class Palindrom{
// public static void main(String[] args){
// String a="malayalam";
// String rev="";
// int length=a.length();
// for(int i=a.length()-1;i>=0;i--)
// rev=rev+a.charAt(i);
// if(a.equals(rev)){
// System.out.println("Given string is palindrom");
// }
// else{
// System.out.println("Given string is not palindrom");
// }
// }
// }

public class Palindrom{
    public static void main(String args[]){
        String a="malayalam";
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i) equals(a)){
                System.out.println("Given string is Palindrom");
            }
            else{
                System.out.println("Given string is not Palindrom");
            }
        }
    }
}


