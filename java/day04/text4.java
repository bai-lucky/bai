package fenzhijiegou;
import java.util.Scanner;
public class text4 {

	public static void main(String[] args) {
		/* ��ʵ�ʿ����У���ӰԺѡ��Ҳ��ʹ�õ�if�жϡ�
		      ����ĳӰԺ������100��Ʊ��Ʊ�����Ϊ1~100��
		       ��������Ʊ������࣬ż��Ʊ�����Ҳࡣ
                        ����¼��- -��������ʾ��ӰƱ��Ʊ�š�
                        ���ݲ�ͬ�����������ͬ����ʾ: .
                         ���Ʊ��Ϊ��������ô��ӡ�����
                         ���Ʊ��Ϊż������ô��ӡ���ұߡ�
		 * 
		 */
		Scanner ms=new Scanner(System.in);
        System.out.println("�����������λ��");
        int p=ms.nextInt();
        //ֻ�е�p��0~100֮�������ʵ��Ч��Ʊ��
        if(p>=0 && p<=100){
        if(p%2==0){
        	System.out.println("�����λ���ұ�");
        }else{
        	System.out.println("�����λ�����");
        }
	     }
        }

}
