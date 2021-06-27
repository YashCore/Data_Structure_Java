package central;

public class Node {

      
    private String name = null;
    private String surname = null;
    private String job  = null;
    private int age = 0;
    private Node next = null;
    private Node prev =null;

    public Node() {
    }

    public Node(String name, String surname, String job, int age) {
        this.name = name;
        this.surname = surname;
        this.job = job;
        this.age = age;
        next = null;
        prev = null;
    }


    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }    
}
