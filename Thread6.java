import java.util.*;
class Thread2 implements Runnable{
public void run(){
System.out.println("Thread is nunning");
}
class Thread6{
public static void main(String[] args)
{
Runnable  r1=new Thread2();
Thread t1=new Thread(r1,"My new thread");
t1.run();
String str=t1.getName();
System.out.println(str);
}
}
}
