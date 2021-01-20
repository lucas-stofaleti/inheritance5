package entities;

public class ImportedProduct extends Product
{
	protected double customsFee;

	public ImportedProduct(String name, double price, double customsFee) 
	{
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() 
	{
		return customsFee;
	}
	public void setCustomsFee(double customsFee) 
	{
		this.customsFee = customsFee;
	}
	
	public double totalPrice()
	{
		return price + customsFee;
	}
	
	@Override
	public String priceTag()
	{
		return this.name +
				" $ " +
				String.format("%.2f", this.totalPrice()) + 
				" (Customs fee: $ " + String.format("%.2f", this.customsFee) + ")";	
	}
	
}
