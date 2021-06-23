package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.User;
// Since every entity created we probably going to need same methods for them
// jpa -team has created an out of a box solution for creating these methods as a standard
// JpaRepository (or CrudRepository)
// by extending this jpaRepository we inherits methods. This contains the logic for all entities
// if we are going add more functionality in userRepository. JpaRepository is generic
// first entity class the second is what is the PK-type.

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	  
	
	
	

}
