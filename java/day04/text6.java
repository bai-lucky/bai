package fenzhijiegou;
import java.util.Scanner;

public class text6 {

	public static void main(String[] args) {
		/*
		 ��ʵ�ʿ����У���������ж�ʱ�����õ�if�ĵ����ָ�ʽ:����:
                    �̳�������VIP�Ļ�Ա�ƣ����ݲ�ͬ�Ļ�Ա���в�ͬ���ۿۡ�
                    ������Ʒ�ܼ�Ϊ1000������¼���Ա���𣬲������ʵ��֧����Ǯ��
                      ��Ա1��:��9�ۡ�
                       ��Ա2��:��8�ۡ�
                           ��Ա3��:��7�ۡ�
                              ��Ա:�����ۣ�Ҫ��Ҳ�Ǵ���ۡ�
		 */
		int price=1000;
		Scanner fensu=new Scanner(System.in);
		System.out.println("�������Ա�ȼ�");
        int a=fensu.nextInt();
        if(a>=1 && a<=3){
        if(a==1){
        	System.out.println("��Ӧ�ø���"+price*0.9);
        }else if(a==2){
        	System.out.println("��Ӧ�ø���"+price*0.8);
        }else{
        	System.out.println("��Ӧ�ø���"+price*0.7);
        }
       }else{
        	System.out.println("�����ǻ�ԱӦ֧����"+price);
        }

	}

}
