package projeto;

public class Order {
	private Integer id_order;
	private Integer numb_Order;
	private String status;
	private Double value = 0.0;
	private User users;
	private Adress adress;
	private Product[] product;
	private PaymentType paymentType;
	private MeanDelivery meanDelivery;
	
	Order(
		 Integer id_order,
		 Integer numb_Order,
		 String status, Product[] product)
	{
		setId_order(id_order);
		setId_order(numb_Order);
		setStatus(status);
		setProducts(product);
	}
	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public MeanDelivery getMeanDelivery() {
		return meanDelivery;
	}

	public void setMeanDelivery(MeanDelivery meanDelivery) {
		this.meanDelivery = meanDelivery;
	}

	public Integer getId_order() {
		return id_order;
	}
	public void setId_order(Integer id_order) {
		this.id_order = id_order;
	}
	public Integer getNumb_Order() {
		return numb_Order;
	}
	public void setNumb_Order(Integer numb_Order) {
		this.numb_Order = numb_Order;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public User getUsers() {
		return users;
	}
	public void setUsers(User users) {
		this.users = users;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public Product[] getProducts() {
		return product;
	}
	public void setProducts(Product[] products) {
		this.product = products;
		Integer qtdProducts = products.length;
		for(Integer i = 0; qtdProducts > i; i++) {
			if(products[i] == null) {
				break;
			}
			if(products[i] != null) {
				setValue( getValue()+ products[i].getPrice());
			}else {
				setValue(products[i].getPrice());
			}
		}
	}
	public void listProducts() {
		if(product.length > 0) {	
			Integer qtdProducts = product.length;
			for(Integer i = 0; qtdProducts > i; i++) {
				if(product[i] == null) {
					break;
				}
				product[i].showProduct();
			}
		}else {
			System.out.println("There are no products registered");
		}
	}
	
	public void order_owner() {
		User order_owner = getUsers();
		if(order_owner != null) {
			System.out.println(order_owner.getName()); 
		}else {
			System.out.println("Owner of the order could not be found");
		}
	}
	
	public void statusOrder() {
		Adress delivery = getAdress();
		if(delivery != null) {
			delivery.showAdress();
		}else {
			System.out.println("Delivery address Not found");
		}
	}
		
		public void meanDelivery() {
			MeanDelivery meanDelivery = getMeanDelivery();
			if(meanDelivery != null) {
				meanDelivery.displayDeliveryData();;
			}else {
				System.out.println("Delivery form is not defined");
			}
		
		}
		public void dataPayment() {
			PaymentType paymentType = getPaymentType();
			if(paymentType != null) {
				paymentType.displayPaymentData();
			}else {
				System.out.println("Payment type is not defined");
			}
		
		
	}
	
	public void showOrder() {
		System.out.println("-------- Order Number "+ getNumb_Order() +" ---------");
		System.out.println("ID Order: " + getId_order());
		System.out.println("Status Order: " + getStatus());
		String valueFormat = String.format("%.2f", getValue());
		System.out.println("Order Value: " + valueFormat);
		System.out.println("Order Owner: ");
		order_owner();
		System.out.println("Delivery Details: ");
		deliveryInfo();
		System.out.println("Product List: ");
		listProducts();
		
	}

	private void deliveryInfo() {
		// TODO Auto-generated method stub
		
	}
}
