public class Soda {
  private String addOn;

  public Soda(String addOn) {
    this.addOn = addOn;
  }

  public String GetMyDrinkString() {
    if (addOn == null || addOn.isEmpty()) {
      return "Обычная газировка";
    } else {
      return "Газировка и " + addOn;
    }
  }
}
