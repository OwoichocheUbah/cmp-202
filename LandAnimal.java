public class LandAnimal extends Animal {
    @Override
    String move() {
        return "Runs on land";
    }
    public static void main(String[] args) {
        LandAnimal cheetah = new LandAnimal();
        cheetah.name = "Cleopatra";
        LandAnimal monkey = new LandAnimal();
        System.out.println(cheetah.move());
        System.out.println(monkey.move());
    }
}
