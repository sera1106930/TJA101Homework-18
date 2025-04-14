package hw2;

//阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
public class hw0208 {
	public static void main(String[] args) {
		int count = 0; // 記錄符合條件的數字個數
		System.out.println("阿文可以選擇的數字有：");

		for (int i = 1; i <= 49; i++) {
			if (!containsFour(i)) { // if數字不包含4
				System.out.print(i + " ");
				count++;

			}
		}

		System.out.println("\n總共有 " + count + " 個數字可選。");
	}

	// 判斷數字是否包含4
	public static boolean containsFour(int num) {
		String str = String.valueOf(num); // 轉成字串
		return str.contains("4"); // 檢查是否包含 '4'
	}

}
