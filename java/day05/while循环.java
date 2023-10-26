package day05;

public class while循环 {

	public static void main(String[] args) {
		/*格式
		 * while(条件判断语句){
		  循环体语句
		  条件控制语句
		 }
		 */
		//利用while循环打印1-100
		int i=1;
		while(i<=100){
			i++;
		}
		//世界最高峰珠穆朗玛峰（8844.43米=8844430毫米），假如我有一张足够大的纸厚度为0.1毫米
		//请问折叠多少此能达到珠穆朗玛峰高度？
		
		double paper=0.1;//纸张的厚度
		double hingt=8844430;//山峰的高度
		int count=0;//统计次数
		while(paper<hingt){
			paper=paper*2;//折叠的厚度
			count++;
			i++;
		}
		System.out.println(count);

	}

}
