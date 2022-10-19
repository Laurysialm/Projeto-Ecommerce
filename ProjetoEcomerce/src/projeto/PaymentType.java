package projeto;

public class PaymentType {
	Integer id_paymentType;
	String type;
	String name;
	String gateway;
	
	PaymentType(Integer id_paymentType, String type, String name, String gateway){
		setId_paymentType(id_paymentType);
		setType(type);
		setName(name);
		setGateway(gateway);
	}
	
	public Integer getId_paymentType() {
		return id_paymentType;
	}
	public void setId_paymentType(Integer id_paymentType) {
		this.id_paymentType = id_paymentType;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGateway() {
		return gateway;
	}
	public void setGateway(String gateway) {
		this.gateway = gateway;
	}
	
	public void displayPaymentData() {
		System.out.println("ID Form Payment: " + getId_paymentType());
		System.out.println("Type Payment: " + getType());
		System.out.println("PayPal: " + getName());
		System.out.println("Gateway: " + getGateway());
	}
}
