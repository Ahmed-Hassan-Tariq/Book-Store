public class Person {
    private String name;
    private Integer age;
    private String date_of_birth;
    private String contact;

    public Person(String name, Integer age, String date_of_birth, String contact) {
        this.name = name;
        this.age = age;
        this.date_of_birth = date_of_birth;
        this.contact = contact;
    }

    public Person() {
    }

    public void print() {
        System.out.printf(
                "%nName:%s" +
                "%nAge:%d" +
                "%nDOB:%s" +
                "%nContact:%s" +
                "%n", name, age, date_of_birth, contact);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
