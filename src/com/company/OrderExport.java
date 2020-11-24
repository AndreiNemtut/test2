package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class OrderExport {
    List<Employee> employees = new ArrayList<>();

    public void exportFile(String filename) {
        File file = new File("export/" + filename);
        try (Writer writer = new FileWriter(file)) {
            writer.write("ID: NAME \n");
            employees = getEmployees();
            for (Employee employee : employees)
                writer.write(employee.getId() + " :" + employee.getName()+"\n");
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }
/*
    public void exportUserFile(String filename) {
        File file = new File("export/" + filename);
        try (Writer writer = new FileWriter(file)) {
            writer.write("ID: NAME \n");
            employees = getEmployees();
            for (Employee employee : employees)
                writer.write(employee.getId() + " :" + employee.getName()+"\n");
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }
*/
    private List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Employee employee = new Employee(i, "name");
            employees.add(employee);
        }
        return employees;
    }
}
