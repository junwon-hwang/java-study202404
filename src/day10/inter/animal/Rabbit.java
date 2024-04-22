package day10.inter.animal;

// interface => 다중 상속 가능

public class Rabbit extends Animal implements Pet, Wild {

    // 사냥기능 X

    // 난폭한 성격

    @Override
    public void violent() {
        this.age = 10;
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
