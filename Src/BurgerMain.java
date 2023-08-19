public class BurgerMain {
    public static void main(String[] args) {

        var regularBurger = new Burger("булка з кунжутом", "говядина", "чеддер", "салат, помідори", "є");
        var dietBurger = new Burger("булка зернова", "курка", "бринза", "огірки, листя салату");
        var doubleMeatBurger = new Burger("булка з кунжутом", "дві порції говядини", "сир гауда", "цибуля");
    }
}
