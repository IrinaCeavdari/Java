import java.util.Calendar;
public class PayrollSystemTest {
    public static void main(String[] args){
        int currentMonth = 1 + Calendar.getInstance().get(Calendar.MONTH);


        Employee[] employees = new Employee[5];


        employees[0] = new SalariedEmployee(
                "John", "Smith", "111-11-1111", 800.0f, 11, 3, 1883);
        employees[1] = new HourlyEmployee(
                "Karen", "Price", "222-22-2222", 16.75f, 40.0f, 12, 12, 1975);
        employees[2] = new CommissionEmployee(
                "Sue", "Jones", "333-33-3333", 10000.0f, .06f, 12, 13, 1965);
        employees[3] = new BasePlusCommissionEmployee(
                "Bob", "Lewis", "444-44-4444", 5000.0f, .04f, 300.0f, 12, 12, 1956);


        System.out.println("Employees processed polymorphically:\n");

        for(Employee currentEmployee : employees){
            System.out.println(currentEmployee);


            if(currentEmployee instanceof BasePlusCommissionEmployee){

                BasePlusCommissionEmployee employee =
                        (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10f * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f\n",
                        employee.getBaseSalary());


            }

            System.out.printf("earned $%,.2f\n\n",
                    (currentEmployee.getBirthday().getMonth() == currentMonth) ?
                            currentEmployee.earnings() + 100.0f : currentEmployee.earnings());
        }


        for(int j=0; j<employees.length; j++){
            System.out.printf("Employee %d is a %s\n",
                    j, employees[j].getClass().getName());
        }
    }
}

