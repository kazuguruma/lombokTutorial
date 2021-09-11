package sample;

import java.util.Arrays;
import java.util.List;

import lombok.EqualsAndHashCode;

/*equals()メソッドとhashCode()メソッドを
 * 自動生成してくれる
 */

@EqualsAndHashCode
public class Main4 {
	private int id = 100;
	private String value = "hoge";
	private List list = Arrays.asList("fizz","buzz");

	public static void main(String[] args) {
		Main4 a = new Main4();
		Main4 b = new Main4();

		System.out.println("a.hash="+a.hashCode());
		System.out.println("b.hash="+b.hashCode());
		System.out.println(a.equals(b));
	}
}