package com.kodilla.hibernate.manytomany.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.kodilla.hibernate.manytomany.dao.*;
import com.kodilla.hibernate.manytomany.*;


import java.util.List;

@Service
public class ManyToManyFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(ManyToManyFacade.class);

    public List<Company> findCompany(String name) throws EmptyResultException{
        LOGGER.info("Searching for companies..");
        List<Company> result = companyDao.retrieveCompaniesWithDefinedFirstThreeLetters(name);
        if (result.size() == 0) {
            LOGGER.error(EmptyResultException.ERR_NO_COMP);
            throw new EmptyResultException(EmptyResultException.ERR_NO_COMP);
        }
        return result;
    }

    public List<Employee> findEmployees(String name) throws EmptyResultException{
        LOGGER.info("Searching for employees..");
        List<Employee> result2 = employeeDao.retrieveEmployeesWithDefinedLastname(name);
        if (result2.size() == 0) {
            LOGGER.error(EmptyResultException.ERR_NO_EMPL);
            throw new EmptyResultException(EmptyResultException.ERR_NO_EMPL);
        }
        return result2;
    }

    public void saveCompany(Company company){
        companyDao.save(company);
    }

    public void saveEmployee(Employee employee){
        employeeDao.save(employee);
    }
}
