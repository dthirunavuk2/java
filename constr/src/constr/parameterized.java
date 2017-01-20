package constr;


	class parameterized{  
	    int id;  
	    String name;  
	      
	    parameterized(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    parameterized s1 = new parameterized(111,"Karan");  
	    parameterized s2 = new parameterized(222,"Aryan");  
	    s1.display();  
	    s2.display();  
	   
	}  

}
