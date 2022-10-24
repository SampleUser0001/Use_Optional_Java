# Use_Optional_Java
Optionalを使う

[toc]

## 実行

``` bash
mvn clean compile exec:java
```


## nullだったら何もしない

``` java
import java.util.Optional;

Optional.ofNullable(str)
        .ifPresent(System.out::println);
```

## nullだった時にデフォルトの値を返す

``` java
import java.util.Optional;

return Optional.ofNullable(l)
               .orElse(Long.valueOf(0));
```

## 参考

- [Java 8 "Optional" ～ これからのnullとの付き合い方 ～:Qiita](https://qiita.com/munieru_jp/items/22371ad39a034cd90c84)

