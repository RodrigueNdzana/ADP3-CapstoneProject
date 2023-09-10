package cput.za.ac.repository;

import cput.za.ac.domain.Administrator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AdministratorRepository {
    private final List<Administrator> administrators;

    public AdministratorRepository() {
        administrators = new ArrayList<>();
    }

    public void addAdministrator(Administrator administrator) {
        administrators.add(administrator);
    }

    public void removeAdministrator(Administrator administrator) {
        administrators.remove(administrator);
    }

    public Administrator findAdministratorById(String ID) {
        for (Administrator administrator : administrators) {
            if (Objects.equals(administrator, ID)) return administrator;
        }
        return null;
    }

    public List<Administrator> getAllAdministrators() {
        return administrators;
    }
}
