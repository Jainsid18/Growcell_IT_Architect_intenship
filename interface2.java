import java.lang.*;
import java.util.*;
class phone
{
	public void call()
	{
		System.out.println("Call is possible");
	}
	public void sms()
	{
		System.out.println("SMS is possible");
	}
}
interface camera{
	void click();
	void record();
}
interface music{
	void start();
	void stop();
}
class smartphone extends phone implements camera ,music{
	public void videocall()
	{
		System.out.println("VideoCall is possible");
	}
	public void click()
	{
		System.out.println("Click is possible");
	}
	public  void record()
	{
		System.out.println("Record is possible");
	}
	public void start()
	{
		System.out.println("Starting a music is possible");
	}
	public void stop()
	{
		System.out.println("Stopping a music is possible");
	}
}
class interface2
{
	public static void main(String args[])
	{
		smartphone sc=new smartphone();
		sc.videocall();
		
		phone p=sc;
		p.call();
		p.sms();
		
		camera c=sc;
		c.click();
		c.record();
		
		music m=sc;
		m.start();
		m.stop();
	}
}