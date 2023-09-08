package cput.za.ac.Service.Interface;

import cput.za.ac.Service.IService;
import cput.za.ac.domain.Course;
import cput.za.ac.domain.Educator;

import java.util.List;
import java.util.Set;

public interface IEducatorService extends IService<Educator,String> {
    List<Educator> getAll();
}