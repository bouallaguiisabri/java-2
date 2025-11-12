package models;

public interface IDepartment<T> {
    void addDepartment(T t);
    boolean searchDepartment(String departmentName);
    boolean searchDepartment(T t);
    void removeDepartment(T t);
    void displayDepartments();
    void sortDepartmentsById();
    void sortDepartmentsByNameAndEmployeeCount();
}