## Factory Method Pattern

- 어떤 인스턴스를 만들지는 서브클래스에서 결정

## 클래스 설명

### Creator 클래스

- PizzaStore : 추상 생성자 클래스로, 추상 팩토리 메소드가 정의만 되어있고, 구현되어 있지 않음
- *PizzaStore : 구상 생성자 클래스로, 추상 팩토리 메소드를 오버라이딩 하여 구현

### Product 클래스

- Pizza : 추상 제품 클래스
- *Pizza : 구상 제품 클래스