package asst3_2;

/*
 * This is the child class which extends the parent class person
 * */
public class Author extends Person {
	String name;
	String book;
	//Creating a parameterized constructor of child class
	Author(String name,String book) {
		
		super(); // This super will call the constructor of parent class. 
	    System.out.println("This is the Constructor of Author class");
	    
	    /*
	     * The this keyword can be used to refer current class instance variable. If there is ambiguity 
	     * between the instance variables and parameters, this keyword resolves the problem of ambiguity.
	     * */
	    this.book = book;
	    
	    //We can use super keyword to access the data member or field of parent class.
	    //It is used if parent class and child class have same fields.
	    //E.g we have String name is both classes with different values
	    
	  //Prints Name of Person class
	    System.out.println("Name of the Person is : "+super.name);
	    
	  //Prints Name of Author Class  
	    System.out.println("First Author name : "+name + " and book authored is " + book);
	  	    
	}
	/*
	 * Here we have created a method with passing variables to it
	 * and used this keyword to assign values to it.
	 * */
	void display (String name,String book) {
		this.name = name;
		this.book = book;
		System.out.println("Other Author name : "+ name + " and book authored is" + book);
		
	}
	}

