package ch19_generic.products;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString       // @Data를 달아서 해결하는 방법, alt+ins를 통해 toString() 메서드를 재정의하는 방법 등등이 있다.ㄹ
public class Product<T> {
    private String ProductName;
    private T ProductInfo;


}

