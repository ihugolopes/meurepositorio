package entity;

public class Desafio4 {

	public static void main(String[] args) {

		int i = 0, j = 0, find = 0;

		for (i = 5000; i <= 7000; i++) {
			int count = 0;

			for (j = 1; j <= i; j++) {

				if (i % j == 0) {

					if (++count > 2)
						break;
				}

				if (i == j) {
					find++;
					System.out.println(i);
				}
			}
		}

		System.out.printf("\n\n %d números primos de %d a %d!\n", find, 5000, 7000);
	}

}