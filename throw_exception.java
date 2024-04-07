class first{

public static void main (String args[]){
int i=20;
int j=0;

try {

j= 18/i;

if (j==0)
throw new ArithmeticException (); // throw the exception...
}

catch(ArithmeticException e){
j= 18/1; // to avoid exception or error ..
System.out.println("this is default output:");
}
catch (Exception e)
{
System.out.println(" something went wrong:");
}

System.out.println(j);
System.out.println("bye");
}
}




