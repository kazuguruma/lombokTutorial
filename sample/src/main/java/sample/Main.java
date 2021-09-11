package sample;

import lombok.NonNull;

/*@NonNull
 *コンパイル時にnullチェックを自動生成してくれる。
 */
public class Main {

	public static void main(String[] args) {
		method("hello");
		//NullPointerExceptionが発生する。
		method(null);
	}

	public static void method(@NonNull String value) {
		System.out.println(value);
	}
}
