import static org.junit.Assert.assertTrue;
import java.util.Scanner;
 class voting_age
{ 
public static void main(String[] args) 
{ 
int age,shrt;
Scanner scan = new Scanner(System.in);
System.out.println(" Please enter your age");
age = scan.nextInt(); 
if(age>=18) 
{ 
System.out.println("Welcome to voting system Yo can Vote");
} 
else
{
	shrt= (18 - age);
System.out.println("Sorry,You can vote after :"+ shrt + " years");
assertTrue(age==shrt);

}
scan.close();
} }
