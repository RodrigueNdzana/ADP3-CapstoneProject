package cput.za.ac.repository;

import cput.za.ac.domain.Administartor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AdministratorRepository {
    private final List<Administartor> administrators;

    public AdministratorRepository() {
        administrators = new ArrayList<>();
    }

    public void addAdministrator(Administartor administrator) {
        administrators.add(administrator);
    }

    public void removeAdministrator(Administartor administrator) {
        administrators.remove(administrator);
    }

    public Administartor findAdministratorById(String ID) {
        for (Administartor administrator : administrators) {
            if (Objects.equals(administrator, ID)) return administrator;
        }
        return null;
    }

    public List<Administartor> getAllAdministrators() {
        return administrators;
    }
}
