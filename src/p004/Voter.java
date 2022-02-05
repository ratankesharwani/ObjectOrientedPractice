package p004;

public class Voter extends Person {

    public Voter(String nationality) throws NullNationalityException {
        super(nationality);
    }

    @Override
    public void setAge(Integer age) throws NegativeAgeException, AgeCannotMoreThan100YearsException, ForVotingAgeShouldbeAbove18YearExcption {
        super.setAge(age);
        if(age<18) {
            throw new ForVotingAgeShouldbeAbove18YearExcption();
        }
    }
    @Override
    public String toString() {
        return "Voter{" +
                "age=" + getAge() +
                ", nationality='" + getNationality() + '\'' +
                '}';
    }

}
