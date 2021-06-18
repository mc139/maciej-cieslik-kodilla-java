package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    EmployeeDao employeeDao;
    @Autowired

    CompanyDao companyDao;
    @Autowired
    CompanyFacade companyFacade;

    @Test
    void shouldRetrieveEmployeeWithNameLike() {
        //GIVEN

        Employee johnSmith = new Employee("John", "Smith");
        Employee johnatanSmith = new Employee("Johnatan", "Smith");
        Employee johnNovak = new Employee("John", "Novak");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Matters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(johnatanSmith);
        dataMaesters.getEmployees().add(johnNovak);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(johnNovak);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        johnatanSmith.getCompanies().add(dataMaesters);
        johnNovak.getCompanies().add(dataMaesters);
        johnNovak.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //WHEN

        List<Employee> employeeList = companyFacade.retrieveEmployeesWithNameLike("smi");

        //THEN

        Assertions.assertEquals(2, employeeList.size());

        //CLEANUP
        employeeDao.deleteAll();
    }

    @Test
    void shouldRetrieveCompanyWithNameLike()

    {

        //GIVEN
        Employee johnSmith = new Employee("John", "Smith");
        Employee johnatanSmith = new Employee("Johnatan", "Smith");
        Employee johnNovak = new Employee("John", "Novak");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Matters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(johnatanSmith);
        dataMaesters.getEmployees().add(johnNovak);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(johnNovak);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        johnatanSmith.getCompanies().add(dataMaesters);
        johnNovak.getCompanies().add(dataMaesters);
        johnNovak.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //WHEN
        List<Company> employeeList = companyFacade.retrieveCompaniesWithNameLike("ma");

        //THEN

        Assertions.assertEquals(3, employeeList.size());

        //CLEANUP
        employeeDao.deleteAll();
    }

}
