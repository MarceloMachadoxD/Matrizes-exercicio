package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int l, c = 0;

		System.out.print("Digite o nro de linhas da matriz: ");
		l = sc.nextInt();

		System.out.print("Digite o nro de colunas: ");
		c = sc.nextInt();

		int[][] mat = new int[l][c];

		for (int i = 0; i < l; i++) {

			for (int j = 0; j < c; j++) {

				mat[i][j] = sc.nextInt();
			}
		}

		System.out.print("digite qual número inteiro deseja buscar na matriz: ");
		int x = sc.nextInt();
		int count = 0;

		int correspl = 0, correspc = 0;

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				if (mat[i][j] == x) {
					count++;
					correspl = i;
					correspc = j;
				}
			}
		}

		if (count == 0) {
			System.out.println("nenhuma incidencia encontrada");

		} else {
			System.out.println("quantidade de " + x + " contidos na matriz é " + count);
		}

		System.out.println("\n\n");

		count = 0;

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				if (mat[i][j] == x) {
					count++;

					System.out.println("Na " + count + "º incidencia: " + "posição " + i + "," + j);

					if (i - 1 >= 0) {
						System.out.println("Up: " + mat[i - 1][j]);

					}

					if (j - 1 >= 0) {
						System.out.println("Left: " + mat[i][j - 1]);

					}

					if (j + 1 < c) {

						System.out.println("Right: " + mat[i][j + 1]);

					}

					if (i + 1 < l) {

						System.out.println("Down: " + mat[i + 1][j]);
					}

					System.out.println("\n\n");

				}
			}
		}

		int nega = 0;

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				if (mat[i][j] < 0) {

					nega++;

				}

			}

		}

		System.out.println("Negative Numbers: " + nega);

		sc.close();

	}

}
