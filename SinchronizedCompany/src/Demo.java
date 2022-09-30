
public class Demo {

		public static void main(String[] args) {
			
			Software software = new Software();
			BA BAThread = new BA(software);
			Dev DevThread = new Dev(software);
			QA QAThread = new QA(software);
			
			BAThread.start();
			DevThread.start();
			QAThread.start();
			
			try {
				BAThread.join();
				DevThread.join(5);
				QAThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}
