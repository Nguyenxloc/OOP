// call by refferce 

class Operation2{  
 int data=50;  
  
 void change(Operation2 op){  
 op.data=op.data+100;//changes will be in the instance variable 

 }  
     
    
 public static void main(String args[]){  
   Operation2 op=new Operation2();  
  
   System.out.println("before change "+op.data);  
   op.change(op);//passing object  
   System.out.println("after change "+op.data);  
  
 }  
}  
////1. Java passes the arguments both primitives and the copy of object reference by value.

//2. Java never passes the object itself.

//3. In realtime project, we pass class objects as parameters to method call in java.