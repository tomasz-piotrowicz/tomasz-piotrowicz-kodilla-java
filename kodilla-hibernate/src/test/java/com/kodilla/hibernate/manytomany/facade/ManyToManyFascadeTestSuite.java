package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToManyFascadeTestSuite {
    @Autowired
    private ManyToManyFacade facade;


    @Test
    public void testSearchEngineForCompanies(){
        Company atari = new Company("Atari");
        Company lucas = new Company("Lucas Arts");
        facade.saveCompany(atari);
        facade.saveCompany(lucas);
        try {
            facade.findCompany("Ata");
        } catch (EmptyResultException e) {

        }
    }

    @Test
    public void testSearchEngineForEmployees(){
        Employee fred = new Employee("Fred", "Aster");
        Employee luke = new Employee("Luke", "Skywalker");
        facade.saveEmployee(fred);
        facade.saveEmployee(luke);
        try {
            facade.findEmployees("Sky");
        } catch (EmptyResultException e) {

        }
    }
}
