package cput.za.ac.Service.impl;

import cput.za.ac.Service.Interface.IEducatorService;
import cput.za.ac.domain.Educator;

import cput.za.ac.repository.IEducatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service
public class EducatorServiceImpl implements IEducatorService {
    private IEducatorRepository repository;
    @Autowired
    private EducatorServiceImpl(IEducatorRepository repository){
        this.repository = repository;
    }
    @Override
    public Educator create(Educator educator) {
        return this.repository.save(educator);
    }

    @Override
    public Educator read(String educator_Id) {
        return this.repository.findById(educator_Id).orElse(null);
    }

    @Override
    public Educator update(Educator educator) {

        if (this.repository.existsById(educator.getEducator_Id())) {
            return this.repository.save(educator);
        }
        return null;
    }
    @Override
    public boolean delete(String educator_Id) {
        if(this.repository.existsById(educator_Id)){
            this.repository.deleteById(educator_Id);
            return true;
        }
        return false;
    }

    @Override
    public List<Educator> getAll() {
        return this.repository.findAll();
    }
}
