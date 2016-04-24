class phone {
	String Brand;
	int NewCost;
	int ContractLength;
	
	//GETTERS
	String getBrand(){
		return Brand;
	}
	int getNewCost(){
		return NewCost;
	}
	int getContactLength(){
		return ContractLength;
	}
	
	//SETTERS
	void setBrand(String Brand){
		this.Brand=Brand;
	}
	void setNewCost(int NewCost){
		this.NewCost=NewCost;
	}
	void setContractLength(int ContractLength){
		this.ContractLength=ContractLength;
	}
	
	//CONSTRUCTORS
	public phone(){
		this("none", 420, 0);
		
		System.out.println("C1 running!");
	}
	public phone(String Brand, int NewCost, int ContractLength){
		Brand = "SET_BRAND";
		NewCost = 1000;
		ContractLength = 1000;
		
		System.out.println("C2 running");
	}
	//Printing method
	void PRINT(){
		System.out.println(getBrand() + getNewCost() + getContactLength());
	}
}

public class app {

	public static void main(String[] args) {
		
		phone FX = new phone();
		phone IP = new phone();
		
		FX.setContractLength(24);
		FX.getContactLength();
		FX.PRINT();
		
	}
}
