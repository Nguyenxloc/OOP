class Bike7{  
    int speed;
    int num1;                                         
    int num2;                                        
    int num3;                                      
      
    Bike7(){System.out.println("speed is "+speed);      /// block Bike7() is instance block   
			System.out.println("speed id "+num1);       /// constructor of bike7 will be used in another place on class   
			int a= num1 + num2;                            
			int b= num2 + num3;                       
                                                        
													}  
    
    {speed=100; num1=120; num2=130; num3=140;}  
        
    public static void main(String args[]){  
    Bike7 b1=new Bike7();  
    Bike7 b2=new Bike7();
    Bike7 b3=new Bike7();
    
    }      
}  