public class Student {
    private String idNo;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private int age;
    private String yearLevel;
    private String phoneNumber;
    private String email;

    public Student() {
        idNo = "";
        firstName = "";
        middleName = "";
        lastName = "";
        suffix = "";
        age = 0;
        yearLevel = "";
        phoneNumber = "";
        email = "";
    }

    public String getIdNo() { return idNo; }
    public void setIdNo(String idNo) { this.idNo = idNo; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getSuffix() { return suffix; }
    public void setSuffix(String suffix) { this.suffix = suffix; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getYearLevel() { return yearLevel; }
    public void setYearLevel(String yearLevel) { this.yearLevel = yearLevel; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}