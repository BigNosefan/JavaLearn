
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4_8_PhoneValidation {

	public static void main(String[] args) {
		boolean contiGo = true;
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));
		// �����ֻ������������ʽ
		String regex = "^(13\\d|15[036-9]|18[589])\\d{8}$";
		String phoneNumber = "";
		while(contiGo) {
			System.out.println("�������ֻ�����");
			try {
				phoneNumber = buf.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			boolean match = phoneNumber.matches(regex);
			if (match) {
				System.out.println(phoneNumber+"�ǺϷ��ֻ�����");
				break;
			} else 
				System.out.println(phoneNumber+"���ǺϷ��ֻ�����"); 
		}

	}

}
