## Simple Factory

- 엄밀히 말하면, 디자인 패턴은 아님
- 팩토리 : 객체 생성을 처리하는 클래스

## 클래스 설명

- PizzaStore : 팩토리를 사용하는 클라이언트
- SimplePizzaFactory : 피자 객체를 생성하는 팩토리
- Pizza : 팩토리에서 만들어내는 상품 (인터페이스)
- APizza, BPizza, CPizza : Pizza 인터페이스를 구현한 클래스