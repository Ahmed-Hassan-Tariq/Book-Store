public class Person {
    private String name;
    private Integer age;
    private String contact;

    public Person(String name, Integer age, String contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public Person() {
    }

    public void print() {
        System.out.printf(
                "%nName:%s" +
                "%nAge:%d" +
                "%nContact:%s" +
                "%n"
                , name, age, contact);
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


    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


}
