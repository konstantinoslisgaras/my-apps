package olympiacosFC;

public class Players {
    private static int totalGoals = 0;
    private static int totalAssists = 0;

    private String lastname;
    private int shirtNumber;

    private String firstname;
    private String middlename;
    private String nationality;
    private int birthYear;

    protected int goals;
    protected int assists;

    public Players() {

    }

    public Players(String lastname, int shirtNumber) {
        this.lastname = lastname;
        this.shirtNumber = shirtNumber;
    }

    public Players(String lastname, int shirtNumber, String firstname, String nationality, int birthYear) {
        this.lastname = lastname;
        this.shirtNumber = shirtNumber;
        this.firstname = firstname;
        this.nationality = nationality;
        this.birthYear = birthYear;
        goals = 0;
        assists = 0;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public int getShirtNumber() {
        return this.shirtNumber;
    }

    public void setFirstname(String firstname) {
        this.firstname = this.firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getMiddlename() {
        if (middlename == null) return "-";
        return middlename;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void addGoal(int g) {
        if (g >= 1) goals += g;
        totalGoals += g;
    }

    public void addAssist(int a) {
        if (a >= 1) assists += a;
        totalAssists += a;
    }

    public String playerDetails() {
        if (middlename != null) {
            return String.format("Player: %s %s %s [%d], from %s born in %d.%nStats: Goals: %d | Assists: %d.%n",
                    lastname, middlename, firstname, shirtNumber, nationality, birthYear, goals, assists);
        }
        return String.format("Player: %s %s [%d], from %s born in %d.%nStats: Goals: %d | Assists: %d.%n",
                lastname, firstname, shirtNumber, nationality, birthYear, goals, assists);
    }

    static String teamTotals() {
        return "Total Goals: " + totalGoals + " | Total Assists: " + totalAssists + "\n";
    }
}