package day07.encap.Practice;

public class Student {
    private String name;
    private String studentId;
    private String department;

    public void setName(String name) {
        if(name==null || name.isEmpty()){
            System.out.println("유효하지 않은 이름입니다.");
            return;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
