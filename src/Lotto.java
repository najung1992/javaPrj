import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// ���� ����»�� �ζǹ�ȣ

		Scanner scan = new Scanner(System.in);
	
		int a,b,c,d,e,f,g;
		int nj;

		System.out.print("ȸ���� �Է��ϼ���:");
		nj = scan.nextInt();
		System.out.println("��������������������������������������������");
		System.out.printf("�� �����ζ� �� %dȸ�� ��÷��ȣ  ��\n",nj);//������
		System.out.println("��������������������������������������������\n");		
		
		//�̰ž��ص� next��ǰ� nextLine�¿־ȵǳİ�
		//nextInt��next ���̵Ǵ°ǰ����ŤŹ��� 
		System.out.print("ù��° ���ڸ� �Է��ϼ���:");
		a = scan.nextInt();
		System.out.printf("�α��α�!! ù��° ���ڴ�! �� %d ��\n\n", a);
		System.out.print("�ι�° ���ڸ� �Է��ϼ���:");
		b = scan.nextInt();
		System.out.printf("�ι�° ���ڴ�!!!!!! �� %d ��\n\n", b);
		System.out.print("����° ���ڸ� �Է��ϼ���:");
		c = scan.nextInt();
		System.out.printf("����° ����!!!!!!! �� %d ��\n\n", c);
		System.out.print("�׹�° ���ڸ� �Է��ϼ���:");
		d = scan.nextInt();
		System.out.printf("�׹�° ����!!!!!!!!! �� %d ��\n\n", d);
		System.out.print("�ټ���° ���ڸ� �Է��ϼ���:");
		e = scan.nextInt();
		System.out.printf("�ټ���° �����Դϴ�!!! �� %d ��\n\n", e);
		System.out.print("������° ���ڸ� �Է��ϼ���:");
		f = scan.nextInt();
		System.out.printf("����� ������ ���ڴ�!!!!! �� %d ��\n\n", f);
		System.out.print("���ʽ� ���ڸ� �Է��ϼ���:");
		g = scan.nextInt();
		System.out.printf("���ʽ� ���� �Դϴ�~~~~ �� %d ��\n\n", g);
		// \n�ι����� ���ٿ��� �������� ��������
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		System.out.printf("�� %s %s %s %s %s %s + %d ��\n", a,b,c,d,e,f,g );
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");

	}

}
