public class Convert2{
public static void main(String args[]){
java.util.Scanner sc=new java.util.Scanner(System.in);
String cname=sc.next();
String[]digits={"zero","one","two","three","four","five","six","seven","eight","nine"};
String[]ones={"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
String[]tens={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
String[]place={"","","hundred","thousand","lakh"};
String[]words=new String[cname.length()];
int i=0;
int n=Integer.parseInt(cname);
    if(cname.length()>4){
        System.out.println("The string is empty");
    }
    while(n>0)
if(words.length<=4){
words[i]=digits[n%10];
n/=10;
i++;
}

for(i=words.length-1;i>=0;i--){

    System.out.println(words[i]+"\t"+place[i]+"\t"+tens[i]+"\t"+digits[i]);
}
}
}
