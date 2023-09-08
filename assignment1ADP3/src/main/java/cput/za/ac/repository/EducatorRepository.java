package cput.za.ac.repository;
/*   EducatorRepository.java
     Repository for the Educator
     Author:Rodrigue Ndzana Ngonga Beaubane (219384096)
     Date: 07 April 2022
*/

import cput.za.ac.domain.Educator;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
/*

public class EducatorRepository implements IEducatorRepository {
    private static EducatorRepository repository = null; // Initialize the repo to null
    private Set<Educator> educatorDB ;

    private EducatorRepository() {
        educatorDB = new HashSet<Educator>(); // storing our data in a form of a set
    }

    public static EducatorRepository getRepository() {
        // checking if the repository is null , if that is a case(which is true) create a repository
        if (repository == null) {
            repository = new EducatorRepository();
        }
        return repository;
    }


    @Override
    public Educator create(Educator educator) {
        // do some testing
        boolean success = educatorDB.add(educator);
        // if I was successfully able to create object (Employee object). That is why the create method return an employee
        if (!success) {
            return null;
        }
        return educator;
    }

    @Override
    public Educator read(String educationID) {
        Educator educator = educatorDB.stream()
                .filter(e -> e.getEducator_Id().equals(educationID))
                .findAny()
                .orElse(null);
        return educator;
    }

    @Override
    public Educator update(Educator educator) {
        // get the oldEducator and read (the one found in the set) in which the return a string. This go in database and find it
        Educator oldEducator = read(educator.getEducator_Id());
        if (oldEducator == null) {
            // after remove the old educator i need to add the updated value
            educatorDB.remove(oldEducator);
            educatorDB.add(educator);
        }
        return educator;
    }

    @Override
    public boolean delete(String educationID) {
        //first find it in the set
        Educator educatorToDelete = read(educationID);
        if (educatorToDelete == null)
            // if it equal to null mean it is nothing to delete so return false
            return false;
        educatorDB.remove(educatorToDelete);
        return true;
    }

    @Override
    public Set<Educator> getAll() {
        return educatorDB;
    }


}

 */
