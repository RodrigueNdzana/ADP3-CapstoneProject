package cput.za.ac.repository;

/*   IRepository.java
     Main Interface  IRepository
     Author:Rodrigue Ndzana Ngonga Beaubane (219384096)
     Date: 07 April 2022
*/
public interface IRepository<T, ID> {
    T create(T t);

    T read(ID id);

    T update(T t);

    boolean delete(ID id);

}
