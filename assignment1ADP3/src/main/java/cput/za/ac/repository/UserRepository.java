package cput.za.ac.repository;

/*UserRepository .java
 Author: Bavuyise Mpila(216061067)
 Date 07 April 2023
*/



import cput.za.ac.domain.User;

import java.util.HashSet;
import java.util.Set;


//import static sun.util.locale.LocaleMatcher.filter;

public class UserRepository implements IUserRepository{
    private static UserRepository repository = null;
    private Set<User> userDB = null;
    private UserRepository(){
        userDB = new HashSet<User>();
    }
    public static UserRepository getRepository(){
        if(repository == null){
            repository = new UserRepository();

        }
        return repository;
    }

    @Override
    public User create(User user) {
        boolean success = userDB.add(user);
        if (!success)
            return null;
        return  user;

    }

    @Override
    public User read(String userId) {
     /* linear or sequential search for (User u : userDB) {
          if (u.getUserId().equals(userId))
              return u;
     }
      return null;*/
        //lambda expressions
        User user = userDB.stream()
                .filter (u->u.getUserId().equals(userId))
                .findAny()
                .orElse(null);
        return user;

    }

    @Override
    public User update(User user) {
        User oldUser = read(user.getUserId());
        if (oldUser!= null){
            userDB.remove(oldUser);
            userDB.add(user);
            return user;
        }
        return null;

    }

    @Override
    public boolean delete(String userId) {
        User userToDelete = read(userId);
        if (userToDelete== null)
            return false;
        userDB.remove(userToDelete);
        return true;
    }

    @Override
    public Set<User> getAll() {

        return userDB;
    }
}

