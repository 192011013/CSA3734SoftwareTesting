import static org.junit.Assert.assertTrue;

import java.util.*;
class numrev{
public static void main(String []args){
Scanner a=new Scanner(System.in);
try{
int num=a.nextInt();
System.out.println(Numrev(num));
assertTrue(4321==Numrev(num));


}
catch (Exception e){
System.out.println("enter the integer number only");
}
a.close();
}
public static int  Numrev(int num){
int rev=0;
while(num!=0){
int rem=num%10;
rev=rev*10+rem;
num=num/10;
}
return rev;
}
}
