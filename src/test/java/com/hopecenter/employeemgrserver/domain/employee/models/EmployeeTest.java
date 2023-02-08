package com.hopecenter.employeemgrserver.domain.employee.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void constructorTest01(){
        Employee employee = new Employee("Demo", "user", "DemoUser@gmail.com");
        employee.setId(1L);

        String expected = "1 Demo user DemoUser@gmail.com";
        String actual = employee.toString();

        Assertions.assertEquals(expected,actual);
    }

}
