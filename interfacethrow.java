interface voter{
int  age=24;
void castvoter();
}
interface ec{
void checkvalidityofvoter();

}

class ecindia implements voter,ec{

public void  castvoter()
{
System.out.println("cast voter:: ecindia");
}
public void checkvalidityofvoter()
{
if (age<18)
{
System.out.println("invalid voter:");
}

throw new ArithmeticException("invalid voter");
}

public static void main(String args [])
{
ecindia obj = new ecindia();
obj.castvoter();
obj.checkvalidityofvoter();
}
}
