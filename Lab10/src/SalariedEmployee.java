public class SalariedEmployee extends Employee{
    private double weeklySalary;


    public SalariedEmployee(String first, String last, String ssn, double salary,
                            int month, int day, int year){

        super(first, last, ssn, month, day, year);

        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary){
        if(salary >= 0.0f)
            this.weeklySalary = salary;
        else
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0f");
    }

    public double getWeeklySalary(){
        return this.weeklySalary;
    }

    @Override
    public double earnings(){
        return getWeeklySalary();
    }

    @Override
    public String toString(){
        return String.format("salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
}