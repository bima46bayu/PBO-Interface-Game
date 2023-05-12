public class Main {
    public static void main(String[] args) {

        Potion healPt = new Potion("Healing Potion", "S", 1000, 2, 60, "heal");
        Potion attackPt = new Potion("Weaknes Potion", "S", 1000, 6, 15, "attack");
        Sword sword = new Sword("Totsuka", "S", 9800, 55);
        Shield shield = new Shield("Yata", "S", 6500, 60);

        healPt.use();
        attackPt.use();
        sword.use();
        shield.use();
    }
}
