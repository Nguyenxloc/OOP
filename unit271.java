///program arrange the number in ascending order
import java.util.Scanner;
public class JavaExample 
{
    public static void main(String[] args) 
    {
    	int count, temp;
    	
    	//User inputs the array size
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the array: ");
        count = scan.nextInt();
    
        int num[] = new int[count];
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++) 
        {
            num[i] = scan.nextInt();///// num[1]= 1 ----> num[2]---->num[3]=3--->num[4]=4--->num[5]=5
        }
        scan.close();
        ////count processing
        for (int i = 0; i < count; i++) //////--->  i= 1 2 3 4 5 count= 5 
        {
            for (int j = i + 1; j < count; j++) { //---> begin j = 1, (i=1, j = 2), (i=4, j=5) count=4 time
                if (num[i] > num[j]) //////----> (num[1]=3; num[2]=2),(num[2]=2;num[3]=4) 
                {///---> num[1]>num[2](3>2)
                //// result---> num[i]>num[j]--->keep going-->else return 	
                ///		--->keep going 
//        num[1]=num[2]=temp=3   
//       purpose: reach i ---> num[i]> num[i+1]----> num[1]==3
//                reach i ---> num[i]< num[i+1]-----> 0 return 		
//     num[i]=5,4,3,2,1-----> 5 >4 ----> temp= 5--> temp=4-->temp=3-->temp=2-->temp=1
///     
//                             temp = num[i]; // int temp = 3 (num[1]=3)  
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < count - 1; i++) 
        {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[count - 1]);
    }
}