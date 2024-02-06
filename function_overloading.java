class father{
int balance=0;
static String sirname;
static boolean status;
public static void main(String[]args){
father son=new father();

son.fun(10 ,10);
son.fun(20,10);
}

public long fun (long a, int b)
{
System.out.println("inside fun (long int)");
System.out.println(a+b);
return a+b;
}

public int fun (int b, int a)
{
System.out.println("inside fun (int int)");
System.out.println(a+b);
return a+b;
}

}
