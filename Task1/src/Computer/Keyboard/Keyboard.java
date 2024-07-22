package Computer.Keyboard;

public class Keyboard {
   private KeyboardType type;
   private Lightnin lightnin;
   private int weight;

   public Keyboard(KeyboardType type, Lightnin lightnin, int weight) {
      this.type = type;
      this.lightnin = lightnin;
      this.weight = weight;
   }

   public int getWeight() {
      return weight;
   }

   public void setWeight(int weight) {
      this.weight = weight;
   }

   @Override
   public String toString() {
      return
              " \nТип: " + type + ";" +
              " Наличие подсветки: " + lightnin + ";" +
              " Вес: " + weight + "гр. \n";
   }
}
