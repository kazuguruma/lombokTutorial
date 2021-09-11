package sample;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class Main2 {

	//Getterメソッド、Setterメソッドを自動生成する
	//"hello"を表示する
	@Getter	@Setter
	private String value1 = "hello";

	//AccessLevelで公開範囲を設定できる
	@Getter(AccessLevel.PRIVATE)
	private String value2;

	public static void main(String[] args) {
		//インスタンス生成
		Main2 m = new Main2();
		System.out.println(m.getValue1());
	}


}
