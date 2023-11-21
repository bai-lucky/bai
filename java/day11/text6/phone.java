package text6;

public class phone {
	/*定义数组存储3部手机对象。
​	手机的属性：品牌，价格，颜色。
​	要求，计算出三部手机的平均价格*/
	private String brand;
	private double price;
	private String color;
	
	//空参
	public phone(){
		
	}
	//全参
	public phone(String brand,double price,String color){
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
