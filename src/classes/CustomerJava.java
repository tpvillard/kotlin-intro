package classes;


public class CustomerJava {

    private int id;
    private String name;
    private String mail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void prettyPrint() {
        System.out.printf("id: %d, name: %s", id , name);
    }

    @Override
    public String toString() {
        return "CustomerJava{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerJava that = (CustomerJava) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return mail != null ? mail.equals(that.mail) : that.mail == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        CustomerJava customer1 = new CustomerJava();
        CustomerJava customer2 = new CustomerJava();
        customer1.setId(1);
        customer2.setId(1);
        customer1.setName("Thomas");
        customer2.setName("Thomas");

        if (customer1.equals(customer2)) {
            System.out.println("they are equals");
        }
    }
}
