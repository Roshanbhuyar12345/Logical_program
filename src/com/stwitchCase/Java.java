package com.stwitchCase;

public class Java {
	public static void main(String[] args) {

		String s = "trdrr";

		char a[] = s.toCharArray();
		int n[] = new int[a.length];
///[2,-1,0,0,0]
		int count = 1;
		int lock = -1;
		for (int i = 0; i < a.length; i++) {
			count = 1;
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;
					n[j] = lock;
				}

			}
			if (n[i] > lock) {
				n[i] = count;
				System.out.println(n[i] + "  " + a[i]);
			}

		}

	}

}
