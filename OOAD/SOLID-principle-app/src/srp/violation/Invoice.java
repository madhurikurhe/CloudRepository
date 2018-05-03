package srp.violation;

public class Invoice {
	private int id;
	private String name;
	private double cost;
	private float discount;
	private static final int GST=12;
	public Invoice(int id, String name, double cost, float total) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float total){
		this.discount = total;
	}

	
	private double calculateTax(){
		double exvat=getCost()*0.08;
		double tax=exvat+(getCost()*GST);
		return tax;
		
	}
	
	private double calculateDiscount(){
		double totalDiscount=(getCost()*getDiscount())/100;
		return totalDiscount;
		
	}
	
	public double calculateTotalCost(){
		cost=(getCost()+calculateTax())-calculateDiscount();
		return cost;
		
	}
	
	public void printDetails(){
		System.out.println("Invoice ID:" +getId());
		System.out.println("Invoice Name:" +getName());
		System.out.println("Discount:" +getDiscount());
		System.out.println("Total Tax:" +calculateTax());
		System.out.println("Invoice TotalCost after Discount:" +calculateTotalCost());
		
		
	}
}
