## Factory Method Pattern

- 어떤 인스턴스를 만들지는 서브클래스에서 결정
- Static Factory Method : 객체 생성의 역할을 하는 static 메소드

## Static Factory Method Naming Convention

- from() : 하나의 매개 변수를 받아서 인스턴스를 생성하여 반환
- of() : 여러 개의 매개 변수를 받아서 인스턴스를 생성하여 반환
- getInstance() : 인스턴스를 생성하여 반환
- newInstance() : 항상 새로운 인스턴스를 생성하여 반환
- getType : 특정 타입의 인스턴스를 생성하여 반환
- newType : 특정 타입의 새로운 인스턴스를 생성하여 반환