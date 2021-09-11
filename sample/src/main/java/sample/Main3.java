package sample;

import java.util.Arrays;
import java.util.List;

import lombok.ToString;

/*@ToString
 *toString()メソッドを適切にオーバーライドしてくれる。
 */
@ToString
public class Main3 {
	private int id = 100;
	private String value = "hello";
	private List list = Arrays.asList("fizz","buzz");
	private double ignore = 999;

	public static void main(String[] args) {
		System.out.println(new Main3());
	}

}
