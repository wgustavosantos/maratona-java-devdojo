package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.dominio;

public class Person {
    private String firstName;
    private String lastName;
    private String username;
    private String email;

    private Person(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String username;
        private String email;

        public PersonBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder username(String username){
            this.username = username;
            return this;
        }

        public PersonBuilder email(String email){
            this.email = email;
            return this;
        }

        public Person build(){
            return new Person(firstName, lastName, username, email);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
