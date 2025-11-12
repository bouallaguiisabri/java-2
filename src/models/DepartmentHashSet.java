package models;

import java.util.*;
import java.util.stream.Collectors;

public class DepartmentHashSet implements IDepartment<Department> {
    private Set<Department> departments;

    public DepartmentHashSet() {
        this.departments = new HashSet<>();
    }
    @Override
    public void addDepartment(Department department) {
        if (department != null) {
            departments.add(department);
            System.out.println("Department added successfully: " + department.getDepartmentName());
        }
    }
    @Override
    public boolean searchDepartment(String departmentName) {
        for (Department dep : departments) {
            if (dep.getDepartmentName().equalsIgnoreCase(departmentName)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean searchDepartment(Department department) {
        return departments.contains(department);
    }
    @Override
    public void removeDepartment(Department department) {
        if (departments.remove(department)) {
            System.out.println("Department removed successfully: " + department.getDepartmentName());
        } else {
            System.out.println("Department not found: " + department.getDepartmentName());
        }
    }
    @Override
    public void displayDepartments() {
        if (departments.isEmpty()) {
            System.out.println("No departments to display.");
            return;
        }

        System.out.println("=== Department List ===");
        for (Department dep : departments) {
            System.out.println(dep);
        }
        System.out.println("=======================");
    }
    @Override
    public void sortDepartmentsById() {
        List<Department> sortedList = departments.stream()
                .sorted(Comparator.comparingInt(Department::getId))
                .collect(Collectors.toList());

        System.out.println("=== Departments Sorted by ID ===");
        sortedList.forEach(System.out::println);
        System.out.println("================================");
    }
    @Override
    public void sortDepartmentsByNameAndEmployeeCount() {
        List<Department> sortedList = departments.stream()
                .sorted(Comparator.comparing(Department::getDepartmentName)
                        .thenComparingInt(Department::getEmployeeCount))
                .collect(Collectors.toList());

        System.out.println("=== Departments Sorted by Name and Employee Count ===");
        sortedList.forEach(System.out::println);
        System.out.println("====================================================");
    }
    public int getDepartmentCount() {
        return departments.size();
    }
}