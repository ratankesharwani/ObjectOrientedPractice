package p004;

public class Person {
    private Integer age;
    private  final String nationality;

    public Person(String nationality) throws NullNationalityException {
        if(nationality==null || nationality=="") {
            throw new NullNationalityException();
        }
        this.nationality = nationality;
        this.age=0;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) throws NegativeAgeException, AgeCannotMoreThan100YearsException, ForVotingAgeShouldbeAbove18YearExcption {
        if(age<0) {
            throw new NegativeAgeException();
        } else if(age>80) {
            throw new AgeCannotMoreThan100YearsException();
        } else {
            this.age = age;
        }
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
