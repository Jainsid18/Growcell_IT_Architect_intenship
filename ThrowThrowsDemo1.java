import java.lang.*;
class NegativeDimensionException extends Exception
{
	public String getMessage()
	{
		return "Dimension of a rectangle can not be negative";
	}
}
	
class ThrowThrowsDemo1
{
   static int area(int l,int b) throws NegativeDimensionException
   {
	   if(l<0 || b<0)
		   throw new NegativeDimensionException();
	   return l*b;
   }
   static void meth1() throws NegativeDimensionException{
	   System.out.println("Area is:" + area(-10,5));
   }
   public static void main(String args[])
   {
	   try{
		   meth1();
	   }
	   catch(NegativeDimensionException e)
	   {
		   System.out.println(e.getMessage());
	   }
   }
}
	   