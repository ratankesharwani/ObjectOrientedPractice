package p004;

public class MainClass {
    private String helel;
    public static void main(String[] args) {
         String name = null;
        Person person = null;
        try {
        person = new Person("Indian");
        person.setAge(15);
        } catch (NullNationalityException e) {
            e.printStackTrace();
        } catch (NegativeAgeException e) {
            e.printStackTrace();
        } catch (AgeCannotMoreThan100YearsException e) {
            e.printStackTrace();
        } catch (ForVotingAgeShouldbeAbove18YearExcption e) {
            e.printStackTrace();
        }


        System.out.println(person);


        try {
            Voter voter = new Voter("Indian");
            voter.setAge(18);
            System.out.println(voter);
        } catch (NullNationalityException e) {
            e.printStackTrace();
        } catch (NegativeAgeException e) {
            e.printStackTrace();
        } catch (ForVotingAgeShouldbeAbove18YearExcption e) {
            e.printStackTrace();
        } catch (AgeCannotMoreThan100YearsException e) {
            e.printStackTrace();
        }

    }
}
