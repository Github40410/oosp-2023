public class User {

    private String name;
    private String surname;
    private String male;
    private int age;
    private String adres;

    public static class UserBuilder{
        private String name;
        private String surname;
        private String male = "";
        private int age = 0;
        private String adres = "";

        public UserBuilder(String name, String surname){
            this.name = name;
            this.surname = surname;
        }

        public UserBuilder setMale(String male) {
            this.male = male;
            return this;
        }

        public UserBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public UserBuilder setAdres(String adres) {
            this.adres = adres;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    private User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.surname = userBuilder.surname;
        this.male = userBuilder.male;
        this.age = userBuilder.age;
        this.adres = userBuilder.adres;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", male='" + male + '\'' +
                ", age=" + age +
                ", adres='" + adres + '\'' +
                '}';
    }
}
