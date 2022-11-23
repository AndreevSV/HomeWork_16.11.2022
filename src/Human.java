import java.time.LocalDate;

public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    Human(String name, int yearOfBirth, String town, String jobTitle) {
        if (name == "" || name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        setYearOfBirth(yearOfBirth);
        setTown(town);
        if (jobTitle == "" || jobTitle == null) {
            this.jobTitle = "Информация не предоставлена";
        } else {
            this.jobTitle = jobTitle;
        }
        if (yearOfBirth < 100) {
            this.yearOfBirth = LocalDate.now().getYear() - yearOfBirth;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == "" || town == null) {
            this.town = "Информация не предсоставлена";
        } else {
            this.town = town;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + getTown() + ". Я родился " + getYearOfBirth() + ". Я работаю в должности " + jobTitle + ". Будем знакомы!";
    }
}