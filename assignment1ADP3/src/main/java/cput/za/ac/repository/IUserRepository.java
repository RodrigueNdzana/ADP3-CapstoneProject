package cput.za.ac.repository;

/*IUserRepository .java
 Author: Bavuyise Mpila(216061067)
 Date 07 April 2023
*/


import cput.za.ac.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface IUserRepository extends JpaRepository<User, String> {
    //create, read, update, delete
   // public Set<User> getAll();
}

