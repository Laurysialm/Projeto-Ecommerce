package projeto;

public class MeanDelivery {
	Integer id_meanDelivery;
	Double value;
	String type;
	Integer qtdDays;
	
	MeanDelivery(Integer id_meanDelivery,Double value, String type, Integer qtdDays){
		setId_meanDelivery(id_meanDelivery);
		setValue(value);
		setType(type);
		setQtdDays(qtdDays);

	}
	
	public Integer getId_meanDelivery() {
		return id_meanDelivery;
	}
	public void setId_meanDelivery(Integer id_meanDelivery) {
		this.id_meanDelivery = id_meanDelivery;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getQtdDays() {
		return qtdDays;
	}
	public void setQtdDays(Integer qtdDays) {
		this.qtdDays = qtdDays;
	}
	
	public void displayDeliveryData() {
		System.out.println("ID Mean Delivery: " + getId_meanDelivery());
		System.out.println("Mean Delivery:" + getType());
		System.out.println("Price: " + getValue());
		System.out.println("Period " + getQtdDays() + " Days");
	}
}
