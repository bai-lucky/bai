package text3;

public class Goodstext {

	public static void main(String[] args) {
		//����һ������
		Goods[] arr=new Goods[3];
		//2.����������Ʒ����
		Goods g1 = new Goods("001","��ΪP40",5999.0,100);
        Goods g2 = new Goods("002","���±�",227.0,50);
        Goods g3 = new Goods("003","���",12.7,70);
		
		//3.����Ʒ��ӵ�������
		arr[0]=g1;
		arr[1]=g2;
		arr[2]=g3;
		//4.���� Ҳ������֤һ��
		for (int i = 0; i < arr.length; i++) {
			//i ��ʾ����
			//arr[i]��ʾԪ��
			Goods goods=arr[i];
			System.out.println(goods.getId()+","+goods.getPrice()+","+goods.getPrice()+","+goods.getCount());
			
		}
		

	}

}
