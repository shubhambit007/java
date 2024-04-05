class first{

public static void main(String...args){


try{
System.out.println(" inside try 1");
Thread.sleep(1000);
System.out.println("inside try 2");
Thread.sleep(2000);

System.out.println(args [5]);
Thread.sleep(3000);
System.out.println("inside try 3");
}
catch (ArrayIndexOutOfBoundsException e) {
System.out.println("array index");
}
catch(InterruptedException e) {
System.out.println("insideinterruptException:");
}
catch(Exception e) {
System.out.println("inside catch:");
}

finally {
System.out.println("inside finally:");
}
}
}
