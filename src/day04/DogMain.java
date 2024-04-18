package day04;

public class DogMain {
    public static void main(String[] args) {

        Dog veca = new Dog();
        Dog choco = new Dog("초코");
        Dog poppy = new Dog("뽀삐");

        System.out.println("choco = " + choco);
        System.out.println("poppy = " + poppy);

        veca.petInfo();
        choco.petInfo();
        System.out.println("===============");
        poppy.inject();
        poppy.petInfo();
    }
}
