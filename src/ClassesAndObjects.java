/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

    public static boolean isOlder(Cat first, Cat second){

        return first.getAge() > second.getAge();
    }

  public static void main (String args[]) {

      Cat garfield = new Cat("Garfield");
      garfield.setFavoriteFood("Lasagna");
      garfield.setAge(7);

      Cat pinkPanther = new Cat("Pink Panther");
      pinkPanther.setFavoriteFood("Caviar"); // cause he's classy
      pinkPanther.setAge(14);

      Cat catwoman = new Cat("Catwoman");
      catwoman.setFavoriteFood("Tuna Fish");
      catwoman.setAge(22);

      System.out.println("Garfield is older than Catwoman: " + isOlder(garfield, catwoman));
      System.out.println("Catwoman is older than Pink Panther: " + isOlder(catwoman, pinkPanther));
  }
}
