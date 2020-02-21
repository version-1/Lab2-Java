public class Canada {
  private Province[] provinces = new Province[10];
  public Canada() {
    for (int i = 0; i < 10; i++) {
      Province province = new Province(Province.CANADIAN_PROVINCES[i], Province.CANADIAN_CAPITAL_CITIES[i], Province.CANADIAN_POPULATIONS[i]);
      this.provinces[i] = province;
    }
  }

  public void displayAllProvinces() {
    for (Province item: this.provinces) {
      System.out.println(item.getDetails());
    }
  }

  public int getNumOfProvincesBetween(int min, int max) {
    int count = 0;
    for (Province item: this.provinces) {
      if (min * 100000 <= item.getPopulation() && max * 100000 >= item.getPopulation()) {
        count++;
      }
    }
    return count;
  }

}