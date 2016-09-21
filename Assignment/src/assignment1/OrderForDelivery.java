package assignment1;
/*
 
 Scenario : Order for delivery
 Description : A consumer is going to order a delivery through phone calls.
 
 Objects (with States and behaviors) :
 	Object : Consumer
 		State : name, address
 		Behavior : makePhoneCall(), orderDelivery(), payMoneyToCarrier()
 
 	Object : Carrier
 		State : Collection of goods
 		Behavior : carryGoods(), deliver(), acceptMoneyFromConsumer()
 
 	Object : Money
 		State : amount
 
 	Object : Goods
 		State : name, price
 		Behavior : getName(), getPrice()
 		
 */


public class OrderForDelivery {

	public static void main(String[] args) {
		Consumer jim = new Consumer();
		jim.name = "Jim";
		jim.address = "401 Terry Ave N";
		
		Goods hambuger = new Goods();
		hambuger.name = "Hambuger";
		hambuger.price = 3;
		Goods coke = new Goods();
		coke.name = "Coke";
		coke.price = 1;
		Goods[] goods = {hambuger, coke}; 
		
		Carrier carrier = new Carrier();
		jim.makePhoneCall(carrier);
		jim.orderDelivery(goods);
		carrier.carryGoods(goods);
		carrier.deliver(jim.address);
		
		Money money =  jim.payMoneyToCarrier(carrier);
		carrier.acceptMoneyFromConsumer(jim, money);
	}

}

class Consumer{
	String name;
	String address;
	void makePhoneCall(Carrier carrier){}
	void orderDelivery(Goods[] goods){}
	Money payMoneyToCarrier(Carrier supplier){}
}

class Carrier{
	Goods[] goods;
	void carryGoods(Goods[] goods){}
	void deliver(String address){}
	void acceptMoneyFromConsumer(Consumer c, Money m){}
}

class Money{
	float amount;
}

class Goods{
	String name;
	float price;
	String getName(){}
	float getPrice(){}
}

