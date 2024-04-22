package day10.inter.animal;

public class BullDog extends Animal implements Pet,Aggressive{

    // 사냥기능 O

    @Override
    public void hunt(Pet pet) {

    }

    // 난폭한 성격

    @Override
    public void violent() {

    }

    // 애완동물로 적합

    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }



}
