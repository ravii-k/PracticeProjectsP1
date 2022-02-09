package SearchEmailAddr;
import java.util.*;
public class SearchEmail {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the size of the list:");
	        int size=sc.nextInt();
	        String email;
	        ArrayList<String> al=new ArrayList<String>();
	        System.out.println("Enter the Email ID into the list:");
	        for(int i=0;i<=size;i++)
	        {
	            email=sc.nextLine();
	            al.add(email);
	        }
	        System.out.println("Enter the Email ID to be searched:");
	        String find=sc.nextLine();
	        Validate(al,find);
	        if(Validate(al, find)==1)
	        {
	            System.out.println("The Email ID is found in the list!");
	        }
	        else{
	            System.out.println("Email ID is not present in the list!");
	        }

	    }
	    public static int Validate(ArrayList<String> al, String str)
	    {
	        Set<String>set=new HashSet<String>(al);
	        if(set.contains(str));
	        {
	            return 1;
	        }
	        
	    }
	}