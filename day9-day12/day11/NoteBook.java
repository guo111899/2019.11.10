
public class NoteBook {
	public void run() {
		System.out.println("�ʼǱ�����");
	}
	public void useUSB(USB usb) {
		if (usb != null) {
			usb.open();
			usb.close();
		}
	}

	public void shutDown() {
		System.out.println("�ʼǱ��ر�");
	}
}


