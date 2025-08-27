
package sec02.exam08;

public class CompareOperatorExample2 {
	public static void main(String[] args) {

		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);

		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);
		// float와 double의 실수 표현 방식이 다르고 컴퓨터는 2진수로 수를 표현하기 때문에 /2를 계속 하여 0.1과 근사치를 맞춘다.
		// 하지만 0.1과는 다르게 0.100...1이런식으로 뒤에 값이 더 붙기 때문에 완벽히 0.1은 아니다.
		System.out.println((float) v4 == v5);
		System.out.println((int) (v4 * 10) == (int) (v5 * 10));
	}

}
