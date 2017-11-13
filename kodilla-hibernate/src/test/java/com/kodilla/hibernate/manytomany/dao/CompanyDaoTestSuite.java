package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    /*@Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
                try {
                 companyDao.delete(softwareMachineId);
                 companyDao.delete(dataMaestersId);
                 companyDao.delete(greyMatterId);
              } catch (Exception e) {
                 do nothing
            //}
        }*/

    @Test
    public void testRetrieveEmployeesWithDefinedLastname() {
        //Given
        Employee mikePatton = new Employee("Mike", "Patton");
        Employee chuckNorris = new Employee("Chuck", "Norris");
        employeeDao.save(mikePatton);
        employeeDao.save(chuckNorris);
        //When
        List<Employee> resultOfRetrieve = employeeDao.retrieveEmployeesWithDefinedLastname("Norris");
        //Then
        Assert.assertEquals(1, resultOfRetrieve.size());
        //CleanUp
        employeeDao.delete(mikePatton);
        employeeDao.delete(chuckNorris);
    }

    @Test
    public void testRetrieveCompaniesWithDefinedFirstThreeLetters(){
        //Given
        Company microsoft = new Company("Microsoft");
        Company apple = new Company("Apple");
        companyDao.save(microsoft);
        companyDao.save(apple);
        //When
        List<Company> resultOfRetrieve2 = companyDao.retrieveCompaniesWithDefinedFirstThreeLetters("mic%");
        //Then
        Assert.assertEquals(1, resultOfRetrieve2.size());
        //CleanUp
        companyDao.delete(microsoft);
        companyDao.delete(apple);

    }

}
