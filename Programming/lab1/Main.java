import java.util.Arrays;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		short[] c = {6,7,8,9,10,11,12,13,14,15}; // первое множество с
		double[] x = new double[10];			 // второе множество х (объявлено)
		for (int i = 0; i < x.length; i++) {
			x[i] = -14.0 + (double) (Math.random() * 8.0); // заполняем х числами
//			System.out.println(x[i]);
		}
		double[][] matrice = new double[10][10]; // объявляем двойной массив
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (c[i] == 14){
					// double[] e_to_pow = pow(E(),atan((x[j]-3)/22)); // e^*
					// double[] cos_div_pow = pow(cos(x[j])/2,2); // (cos/2)^2
					matrice[i][j] = pow((pow(E,atan((x[j]-3)/22)) - 1) / pow(cos(x[j])/2,2), 3);
				}
				else if (c[i] == 7 || c[i] == 8 || c[i] == 11 || c[i] == 13 || c[i] == 15){
					// double[] arcsin_2 = asin(pow((x[j]-3)/22, 2)); // арксинус дроби^2
					// double[] e_pow_x = pow(E,x[j]) - 1; // (е^х) - 1
					matrice[i][j] = pow((3/4 - asin(pow((x[j]-3)/22, 2))) / pow((1/2)/ pow(E,x[j]) - 1, 3), 3);
				}
				else {
					// double[] pow_of_cos = 3 * (log(abs(x[j])) - 1); // степень косинуса
					// doiuble[] cos_to_pow = pow(cos(x[j], pow_of_cos)); // косинус в степени (степень е)
					matrice[i][j] = (((1 - pow(E, pow(cos(x[j]), 3 * (log(abs(x[j])) - 1)))))/1)/4;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++){
				System.out.printf(" " + "%12.5f", matrice[i][j]);
			}
			System.out.println();
		}
	}
}