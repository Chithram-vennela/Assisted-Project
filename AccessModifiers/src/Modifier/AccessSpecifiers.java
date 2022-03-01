package Modifier;
class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("This is defalut access specifier"); 
     } 
} 


public class AccessSpecifiers {

	public static void main(String[] args) {
			
		System.out.println("default access specifiers");
		defAccessSpecifier obj =new defAccessSpecifier();
		obj.display();
		
	

	}
}


