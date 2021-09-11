# Lombokとは  
JavaのLombokはボイラーテンプレートをシンプルにしてくれるJavaのライブラリ  

## ソースコード  

### Main(@NonNull)  
@NonNullでメソッドの引数をアノテートすると、コンパイル時にnullチェックを自動生成する。  

### Main2(@Getter @Setter)  
@Getterでゲッターメソッド、@Setterでセッターメソッドを自動生成する。  
@Getter引数のAccessLevelでアクセス制御を設定。  

### Main3(@ToString)  
toString()メソッドを適切にオーバーライドしてくれる。  

### Main4(@EqualsAndHashCode)  
equals()メソッドとhashCode()メソッドを自動生成する。  
