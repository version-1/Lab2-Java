import java.util.Arrays;

public class Province {
  public static final String[] CANADIAN_PROVINCES = { "Alberta", "British Columbia", "Manitoba", "New Brunswick",
      "Newfoundland and Labrador", "Nova Scotia", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan" };

  public static final String[] CANADIAN_CAPITAL_CITIES = { "Edmonton", "Victoria", "Winnipeg", "Fredericton", "St. John’s",
      "Halifax", "Toronto", "Charlottetown", "Quebec City", "Regina" };
  public static final long[] CANADIAN_POPULATIONS = {
    4067175,
    4648055,
    1278365,
    747101,
    519716,
    971395,
    13448494,
    142907,
    8164361,
    1098352
  };

  final String DEFAULT_PROVINCE = "British Columbia";
  final String DEFAULT_CAPITAL = "Victoria";
  final long DEFAULT_POPULATION = 4648055;

  private String name;
  private String capital;
  private long population;

  public Province(String name, String capital, long population) {
    if (isValidPopulation(population) && isValidProvince(name) && isValidCapitalCity(capital)) {
      this.name = name;
      this.capital = capital;
      this.population = population;
    } else {
      this.population = DEFAULT_POPULATION;
      this.name = DEFAULT_PROVINCE;
      this.capital = DEFAULT_CAPITAL;
    }
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }

  public void setPopulation(long population) {
    this.population = population;
  }

  public String getName() {
    return this.name;
  }

  public String getCapital() {
    return this.capital;
  }

  public long getPopulation() {
    return this.population;
  }

  public String getDetails() {
    return "The capital of " + getCapital() + "(population. " + getPopulation() + ") is " + getCapital() + ".";
  }

  private boolean isValidProvince(String province) {
    return Arrays.asList(CANADIAN_PROVINCES).contains(province);
  }

  private boolean isValidPopulation(long population) {
    return population >= 30000 && population <= 15000000;
  }

  private boolean isValidCapitalCity(String city) {
    return Arrays.asList(CANADIAN_CAPITAL_CITIES).contains(city);
  }
}