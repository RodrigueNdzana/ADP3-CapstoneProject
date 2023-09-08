package cput.za.ac.repository;

import cput.za.ac.domain.Educator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;


@Repository
public interface IEducatorRepository extends JpaRepository<Educator, String> {
}
