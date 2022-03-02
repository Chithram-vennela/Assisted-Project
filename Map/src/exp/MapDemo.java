package exp;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Tom");    
	      hm.put(2,"Jerry");    
	      hm.put(3,"bittu");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	    //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"vennela");  
	      ht.put(5,"laxmi");  
	      ht.put(6,"sandy");  
	      ht.put(7,"shailu");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Roja");    
	      map.put(9,"Bhagi");    
	      map.put(10,"Usha");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   } 


}


