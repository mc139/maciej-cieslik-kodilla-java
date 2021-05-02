package com.kodilla.hibernate.manytomany.dao;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    @Test
    void testSaveManyToMany() {
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
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

//        CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    void queryTest() {

        //GIVEN

        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company greyMaesters = new Company("Grey Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        greyMaesters.getEmployees().add(stephanieClarckson);
        greyMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(greyMaesters);
        lindaKovalsky.getCompanies().add(greyMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //WHEN

        companyDao.save(greyMaesters);
        companyDao.save(greyMatter);
        companyDao.save(softwareMachine);
        List<Employee> queryListWithNames = employeeDao.retrieveEmployeeWithSurname("Kovalsky");
        List<Company> queryListWithCompanies = companyDao.retrieveCompanyNamedLike("Gre");

        //THEN

        Assertions.assertEquals(1, queryListWithNames.size());
        Assertions.assertEquals(2, queryListWithCompanies.size());
        Assertions.assertNotNull(queryListWithCompanies);
        Assertions.assertNotNull(queryListWithNames);

        //CLEANUP
        try {
            companyDao.deleteById(softwareMachine.getId());
            companyDao.deleteById(greyMaesters.getId());
            companyDao.deleteById(greyMatter.getId());
        } catch (Exception e) {
            //do nothing
        } finally {
            System.out.println("COMPLETED");
        }

    }

}
