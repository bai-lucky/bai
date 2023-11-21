package text3;

public class Goodstext {

	public static void main(String[] args) {
		//创建一个数组
		Goods[] arr=new Goods[3];
		//2.创建三个商品对象
		Goods g1 = new Goods("001","华为P40",5999.0,100);
        Goods g2 = new Goods("002","保温杯",227.0,50);
        Goods g3 = new Goods("003","枸杞",12.7,70);
		
		//3.把商品添加到数组中
		arr[0]=g1;
		arr[1]=g2;
		arr[2]=g3;
		//4.遍历 也就是验证一次
		for (int i = 0; i < arr.length; i++) {
			//i 表示索引
			//arr[i]表示元素
			Goods goods=arr[i];
			System.out.println(goods.getId()+","+goods.getPrice()+","+goods.getPrice()+","+goods.getCount());
			
		}
		

	}

}
