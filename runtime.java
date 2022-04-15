//create instance and check free memorize
//
public class MemoryTest{  
 public static void main(String args[])throws Exception{  
  Runtime r=Runtime.getRuntime(); /// whatmean runtime/// look like a object get class runtime{ getRuntime()[method]
  System.out.println("Total Memory: "+r.totalMemory());//  
  System.out.println("Free Memory: "+r.freeMemory());  
    
  for(int i=0;i<1000;i++){  
   new MemoryTest();
   
  }  
  System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());  
  System.gc();  
  System.out.println("After gc(), Free Memory: "+r.freeMemory());  
 }  
}
