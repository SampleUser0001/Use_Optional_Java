package ittimfn.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Optionalを使う
 */
public class App {
    
    public void exec(String[] args) {
        print("hoge");
        print(null);
        print("piyo");

        Long total = null;
        List<Long> longList = new ArrayList<>();
        longList.add(1L);
        longList.add(2L);
        longList.add(null);
        longList.add(Long.valueOf(3));
        for(Long l : longList) {
            total = this.add(total, l);
        }
        System.out.println(total);
    }
    
    /**
     * 引数の値を標準出力に出力する。
     * nullの場合は出力しない。
     * @param 出力する文字列
     */
    private void print(String str) {
        Optional.ofNullable(str)
                .ifPresent(System.out::println);
    }
    
    private Long add(Long a, Long b) {
        return Long.sum(this.isNullGetZero(a), this.isNullGetZero(b));
    }

    /**
     * 引数の値がnullの場合、0を返す。null以外の場合、そのまま返す。
     */
    private Long isNullGetZero(Long l) {
        return Optional.ofNullable(l)
                       .orElse(Long.valueOf(0));
    }
    
    public static void main( String[] args ) { 
        new App().exec(args);
    }
}
