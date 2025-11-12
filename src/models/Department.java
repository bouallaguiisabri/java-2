package models;

public class Department {
    private int id;
    private String departmentName;
    private int employeeCount;


    public Department() {
    }
    public Department(int id, String departmentName, int employeeCount) {
        this.id = id;
        this.departmentName = departmentName;
        this.employeeCount = employeeCount;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Department that = (Department) obj;
        return id == that.id &&
                departmentName.equals(that.departmentName);
    }
    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", employeeCount=" + employeeCount +
                '}';
    }
}