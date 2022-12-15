import java.util.Scanner;
public class Calculator
{
public static void main(String[] args)
{
double a,b;
boolean check=true;
System.out.println("Welcome to our Calculator v1.0");

while (check)
{
System.out.println("Available features are :");
System.out.println("Addition----------->(1)");
System.out.println("Subtraction-------->(2)");
System.out.println("Multiplication----->(3)");
System.out.println("Division----------->(4)");
System.out.println("Power-------------->(5)");
System.out.println("Sqrt--------------->(6)");
System.out.println("Max---------------->(7)");
System.out.println("Min---------------->(8)");
System.out.println("Sin---------------->(9)");
System.out.println("Cos---------------->(10)");

Scanner input = new Scanner(System.in);
normal_mode obj = new normal_mode();
int operators= input.nextInt();
switch (operators)
{
case 1:
System.out.println("Enter 2 numbers for Addition :");
a=input.nextInt();

b=input.nextInt();
obj.set_addition(a,b);
System.out.println("The Addition of "+a+" + "+b+" =

"+obj.get_addition()+"");
break;
case 2:
System.out.println("Enter 2 numbers for Subtraction :");
a=input.nextInt();
b=input.nextInt();
obj.set_subtraction(a,b);
System.out.println("The Subtraction of "+a+" - "+b+" =

"+obj.get_subtraction()+"");
break;
case 3:
System.out.println("Enter 2 numbers for Multiplication :");
a=input.nextInt();
b=input.nextInt();
obj.set_multiplication(a,b);
System.out.println("The Multiplication of "+a+" × "+b+" =

"+obj.get_multiplication()+"");

break;
case 4:
System.out.println("Enter 2 numbers for division :");

a=input.nextInt();
b=input.nextInt();
if(b==0)
{
System.out.println("Math Error ");
break;
}
obj.set_division(a,b);
System.out.println("The Division of "+a+" ÷ "+b+" =

"+obj.get_division()+"");
break;
case 5:
System.out.println("Enter 2 numbers for Power :");
a=input.nextInt();
b=input.nextInt();
obj.set_power(a,b);
System.out.println("The Power of "+a+" & "+b+" = "+obj.get_power()+"");
break;
case 6:
System.out.println("Enter the numbers for Squareroot :");
a=input.nextInt();
obj.set_squareroot(a);
System.out.println("The Squareroot of "+a+" = "+obj.get_squareroot()+"");

break;
case 7:
System.out.println("Enter 2 numbers for define Max :");
a=input.nextInt();
b=input.nextInt();
obj.set_maximum(a,b);
System.out.println("The Maximum value from "+a+" & "+b+" =

"+obj.get_maximum()+"");
break;
case 8:
System.out.println("Enter 2 numbers for define Min :");
a=input.nextInt();
b=input.nextInt();
obj.set_minimum(a,b);
System.out.println("The Minimum value from "+a+" & "+b+" =

"+obj.get_minimum()+"");
break;
case 9:
System.out.println("Enter the radian of Sin :");
a=input.nextInt();
obj.set_Sin(a);
System.out.println("The radian of Sin "+a+" = "+obj.get_Sin()+"");
break;

case 10:
System.out.println("Enter the radian of Cos :");
a=input.nextInt();
obj.set_Cos(a);
System.out.println("The radian of Cod "+a+" = "+obj.get_Cos()+"");
break;
default:
System.out.println("Wrong Choice");
}
System.out.println("Do you want to keep continue then press (y) or (n) to
terminate : ");
Scanner input1 = new Scanner(System.in);
String c=input1.nextLine();
if(c.equals("y"))
{
check=true;
}
else
{
check=false;
}
}
}

}

*************************************************************
import java.util.Scanner;
public class normal_mode extends scientific_mode
{
private double a,b;
public void set_addition(double a,double b)
{
this.a=a;
this.b=b;
}
public void set_subtraction(double a,double b)
{
this.a=a;
this.b=b;
}
public void set_multiplication(double a,double b)
{

this.a=a;
this.b=b;
}
public void set_division(double a,double b)
{
this.a=a;
this.b=b;
}
public double get_addition()
{
return (a+b);
}
public double get_subtraction()
{
return (a-b);
}
public double get_multiplication()
{
return (a*b);
}
public double get_division()
{

return (a/b);
}
}

***********************************************************

public class scientific_mode
{
private double a,b;
public void set_power(double a,double b)
{
this.a=a;
this.b=b;
}
public void set_squareroot(double a)
{
this.a=a;
}
public void set_maximum(double a,double b)
{
this.a=a;

this.b=b;
}
public void set_minimum(double a,double b)
{
this.a=a;
this.b=b;
}
public void set_Sin(double a)
{
this.a=a;
}
public void set_Cos(double a)
{
this.a=a;
}

public double get_power()
{
return ((double)Math.pow(a,b));
}
public double get_squareroot()
{

return ((double)Math.sqrt(a));
}
public double get_maximum()
{

return Math.max(a,b);
}
public double get_minimum()
{
return Math.min(a,b);
}
public double get_Sin()
{
return Math.sin(a);
}
public double get_Cos()
{
return Math.cos(a);
}

}