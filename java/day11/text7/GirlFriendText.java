package text7;

public class GirlFriendText {

	public static void main(String[] args) {
		//创建数组
		GirlFriend[] arr=new GirlFriend[4];
		//创建四个对象
		GirlFriend g1=new GirlFriend("小王",18,"萌妹子","打羽毛球");
		GirlFriend g2=new GirlFriend("小李",19,"御姐","骑车");
		GirlFriend g3=new GirlFriend("小张",20,"萝莉","看小说");
		GirlFriend g4=new GirlFriend("小赵",21,"老师","教书");
		
		arr[0]=g1;
		arr[1]=g2;
		arr[2]=g3;
		arr[3]=g4;
		//求和
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			GirlFriend gf=arr[i];
			sum=sum+gf.getAge();
		}
		//求平均值
		int avg=sum/arr.length;
		//统计年龄比平均值低的有几个，打印他们的信息
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			GirlFriend gf=arr[i];
			if(gf.getAge()<avg){
				System.out.println(gf.getName()+","+gf.getAge()+","+gf.getGender()+","+gf.getHobby());
				count++;
			
		}
			
		}
		System.out.println(count+"个");

	}

}
