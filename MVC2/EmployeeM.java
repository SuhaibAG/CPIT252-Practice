package MVC2;

public class EmployeeM {
    private String EmployeeName;
    private String EmployeeId;
    private String EmployeeDepartment;

    public EmployeeM(String employeeName, String employeeId, String employeeDepartment) {
        EmployeeName = employeeName;
        EmployeeId = employeeId;
        EmployeeDepartment = employeeDepartment;
    }

    public EmployeeM() {

    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeDepartment() {
        return EmployeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        EmployeeDepartment = employeeDepartment;
    }
}
