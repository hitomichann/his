package model;

public class Doctor {
    private String name;
    private String password;
    private String department;
    private String title;
//    private ArrayList<patients> undiagnosedPatients;
//    private ArrayList<patients> diagnosedPatients;

    public Doctor(String name, String password, String department, String title) {
        this.name = name;
        this.password = password;
        this.department = department;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
