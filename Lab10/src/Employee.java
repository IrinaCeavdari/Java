public abstract class Employee{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthDay;


    public Employee(String first, String last, String ssn,
                    int month, int day, int year){

        setFirstName(first);
        setLastName(last);
        setSocialSecurityNumber(ssn);

        birthDay = new Date(month, day, year);
    }

    public void setFirstName(String first){
        this.firstName = first;
    }
    public void setLastName(String last){
        this.lastName = last;
    }
    public void setSocialSecurityNumber(String ssn){
        this.socialSecurityNumber = ssn;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }
    public Date getBirthday(){
        return this.birthDay;
    }

    @Override
    public String toString(){
        return String.format("%s %s\nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    public abstract double earnings();
}