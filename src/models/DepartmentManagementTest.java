package models;

public class DepartmentManagementTest {
    public static void main(String[] args) {

        DepartmentHashSet departmentManagement = new DepartmentHashSet();


        Department dep1 = new Department(1, "Human Resources", 25);
        Department dep2 = new Department(2, "Information Technology", 50);
        Department dep3 = new Department(3, "Finance", 30);
        Department dep4 = new Department(4, "Marketing", 20);


        departmentManagement.addDepartment(dep1);
        departmentManagement.addDepartment(dep2);
        departmentManagement.addDepartment(dep3);
        departmentManagement.addDepartment(dep4);


        departmentManagement.displayDepartments();


        System.out.println("Search 'Information Technology': " + departmentManagement.searchDepartment("Information Technology"));
        System.out.println("Search 'Production': " + departmentManagement.searchDepartment("Production"));


        System.out.println("Search department 1: " + departmentManagement.searchDepartment(dep1));


        departmentManagement.sortDepartmentsById();


        departmentManagement.sortDepartmentsByNameAndEmployeeCount();


        departmentManagement.removeDepartment(dep3);


        departmentManagement.displayDepartments();


        System.out.println("Total departments: " + departmentManagement.getDepartmentCount());
    }
}