package net.javaguides.springboot.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//I need to tell jpa that this object is the thing that will be stored in the database
// we need to map this as the relational database table
//Defines that a class can be mapped to a table
//Allows to specify detail of the table

@Entity
@Table(name = "users")
public class User {
	//identify that member field below is the primary key
	//Increment number?
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	//makes a column
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;

	private String email;
	
	public User() {
			
	}
	
	public User(String firstName, String lastName, String email) {
		super();
		firstName=this.firstName;
		lastName=this.lastName;
		email=this.email;
		
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	
	public String getFirstName() {
		return this.firstName;

	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
		
	}
	
	public String getLastName() {
		return this.lastName;

	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
		
	}
	
	public String email() {
		return this.email;

	}
	
	public void email(String email) {
		this.email=email;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
