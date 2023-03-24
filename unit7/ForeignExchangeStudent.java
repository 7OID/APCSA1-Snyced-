package unit7;

public class ForeignExchangeStudent extends Student {

    private String country;
    private String language;

    public ForeignExchangeStudent(String fullName, String id, int grade, double gpa, String country, String language) {
        super(fullName, id, grade, gpa);
        this.country = country;
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return getLname() + ", " + getFname() + " - " + country;
    }

    @Override
    public boolean hasHonors() {
        if (language.equals("English") && getGpa() >= 3.0) {
            return true;
        } else if (!language.equals("English") && getGpa() >= 2.8) {
            return true;
        }
        return false;
    }
}