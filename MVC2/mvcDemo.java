package MVC2;

public class mvcDemo {
    public static void main(String[] args) {
        EmployeeM model =retriveEmployee();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        controller.setEmployeeName("Yahya");

        System.out.println("Employee details after Updating");

        controller.updateView();
    }
        private static EmployeeM retriveEmployee(){
            EmployeeM Employee = new EmployeeM();
            Employee.setEmployeeName("burhan");
            Employee.setEmployeeId("11");
            Employee.setEmployeeDepartment("Salesforce");
            return Employee;
        }

    }

