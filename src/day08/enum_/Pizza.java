package day08.enum_;

public class Pizza {
    private String pizzaName; // 피자 이름

    public PizzaStatus getStatus() {
        return status;
    }

    private PizzaStatus status; // 주문중, 요리준비중, 배달중

    // 피자 주문 기능
    public void orderPizza(){
        this.status = PizzaStatus.ORDERED;
        System.out.println("피자 주문이 들어왔습니다.");
    }

    // 피자 준비 완료 기능
    public void readyPizza(){
        if (this.status==PizzaStatus.ORDERED) {
            this.status = PizzaStatus.READY;
            System.out.println("피자가 준비되었습니다.");
        } else {
            System.out.println("피자 주문이 없습니다.");
        }
    }

    // 피자 배달 기능
    public void deliverPizza(){
        if(this.status==PizzaStatus.READY){
            this.status = PizzaStatus.DELIVERED;
            System.out.println("피자가 배달 되었습니다.");
        } else {
            System.out.println("피자가 아직 요리중입니다.");
        }


    }
}
