package com.letchic;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;

    public Employee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return firstname+" "+lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary=salary;
    }

    public int getAnnualSalary() {
        return salary*12;
    }

    public int riseSalary(int percent) {
        salary+=salary/100*percent;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[id="+id+", name="+firstname+", lastname="+lastname+", salary="+salary+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (salary != employee.salary) return false;
        if (firstname != null ? !firstname.equals(employee.firstname) : employee.firstname != null) return false;
        return lastname != null ? lastname.equals(employee.lastname) : employee.lastname == null;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + salary;
        return result;
    }
}
