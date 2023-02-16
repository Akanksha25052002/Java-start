public class Anagram{
public static void main(String args[]){
String p="silent";
String s="listen";
int f=0;
if(s.length()==p.length()){
for(int i=0;i<s.length();i++){
if(!p.contains(s.charAt(i)+"")){
f=1;
break;
}
}
}
else{
f=1;
if(f==1)
System.out.println("String is not anagram");

else
System.out.println("String is anagram");
}
}
}
