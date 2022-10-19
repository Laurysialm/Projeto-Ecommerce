package projeto;

public class main {

	public static void main(String[] args) {
		// Create Users 
		
		User user1 = new User(
				1,
				"laurialms@gmail.com",
				"898989",
				1,
				"Lauri Almeida",
				"33991292-87",
				"33991618491",
				"F",
				"05/03/1995");
		User user2 = new User(
				2,
				"patricia43@hotmail.com",
				"31898738",
				1,
				"Patricia Silva",
				"512312-123",
				"32871371783",
				"F",
				"04/07/1967");
		user1.showInformation();
		user2.showInformation();
		
		// Create Adress
		Adress adress1 = new Adress(1, "Rua Das flores","Borboleta", "Juiz de Fora", "36031-080", "Brasil");
		adress1.showAdress();
		
		
		// Create product
		Product product1 = new Product(
				1,
				 "Bala fini dentadura",
				 "Fini",
				 7.90,
				 "Doces",
				 "Bala Fini Dentadura",
				 "www.fini/img/Bala_Fini_Dentadura"
				);
		
		Product product2 = new Product(
				2,
				 "bala fini beijos",
				 "Fini",
				 6.90,
				 "Doces",
				 "Bala Fini Beijos",
				 "www.fini/img/Bala_Fini_Beijos"
				);
		product1.showProduct();
		product2.showProduct();
		Product[] products = new Product[10];
		products[0] = product1;
		products[1] = product2;
		
		MeanDelivery type1 = new MeanDelivery(1, 56.90,"Sedex", 5);
		MeanDelivery type2 = new MeanDelivery(2, 20.90,"CorreiosPadrão", 14);
		
		PaymentType  payment1 = new PaymentType(1,"digital","Credit Card","3112");
		PaymentType  payment2 = new PaymentType(2,"physical cash","cash","null");
		
		Order order1 = new Order(
				  1,
				  3312,
				  "Conpleted",
				  products
				);
		order1.setAdress(adress1);
		order1.setUsers(user1);
		order1.showOrder();
		order1.setPaymentType(payment1);
		order1.showOrder();
	}

}
