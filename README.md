# JAVA STANDARD [ 자바의 정석 ]

# Chapter 06 객체지향 프로그래밍 I
### 클래스와 객체(class & object)
- 인스턴스는 참조변수를 통해서만 다룰 수 있으며, 참조변수의 타입은 인스턴스의 타입과 일치해야한다.
- 참고 : 자신을 참조하고 있는 참조변수가 하나도 없는 인스턴스는 더 이상 사용되어질 수 없으므로 '가비지 컬렉터'에 의해서 자동적으로 메모리에서 제거된다.
- 데이터 저장 개념
  - 변수 : 하나의 데이터를 저장할 수 있는 공간
  - 배열 : 같은 종류의 여러 데이터를 하나의 집합으로 저장할 수 있는 공간
  - 구조체 : 서로 관련된 여러 데이터를 종류에 관계없이 하나의 집합으로 저장할 수 있는 공간
  - 클래스 : 데이터와 함수의 결합(구조체 + 함수)

### 변수와 메서드(variable & method)
- 변수
  - 인스턴스변수(instance variable) : 클래스 영역에 선언. 독립적인 저장공간
  - 클래스변수(class variable) : 모든 인스턴스가 공통된 저장공간(변수)을 공유, 인스턴수변수와 달리 인스턴스를 생성하지 않고도 바로 사용 가능, 메모리에 `로딩(loading)`될 때 생성 -> 종료까지 유지
  - 지역변수(local variable) : 메서드 내에 선언되어 메서드 내에서만 사용 가능, 지역변수가 선언된 `블럭 {}` 내에서만 사용 가능
- 인스턴스변수는 인스턴스가 생성될 때 마다 생성되므로 인스턴스마다 각기 다른 값을 유지할 수 있지만, 클래스 변수는 모든 인스턴스가 하나의 저장공간을 공유하므로, 항상 공톤된 값을 갖는다.
- 메서드를 사용하는 이유
  - 높은 재사용성(reusability)
  - 중복된 코드의 제거
  - 프로그램의 구조화
    - 처음에 프로그램을 설계할 때 내용이 없는 메서드를 작업단위로 만들어놓고, 하나씩 완성해가는 것도 프로그램을 구조화하는 좋은 방법
  - 메서드를 작성할 때는 매개변수의 유효성을 검사하는 코드를 반드시 넣자. 매개변수의 유효성 검사는 메서드의 작성에 있어서 간과하기 쉬운 중요한 부분이다.
- JVM의 메모리 구조
  - 메서드 영역(method area)
    - 프로그램 실행 중 어떤 클래스가 사용되면, JVM은 해당 클래스의 클래스파일(*.class)을 읽어서 분석하여 클래스에 대한 정보(클래스 데이터)를 이곳에 저장한다. 이 때, 그 클래스의 클래스변수 (class variable)도 이 영역에 함께 생성된다.
  - 힙(heap)
    - 인스턴스가 생성되는 공간. 프로그램 실행 중 생성되는 인스턴스는 모두 이곳에 생성된다. 즉, 인스턴스변수(instance variable)들이 생성되는 공간이다.
  - 호출스택(call stack 또는 execution stack)
    - 호출스택은 메서드의 작업에 필요한 메모리 공간을 제공한다. 메서드가 호출되면, 호출스택에 호출된 메서드를 위한 메모리가 할당되며, 이 메모리는 메서드가 작업을 수행하는 동안 지역변수(매개변수 포함)들과 연산의 중간결과 등을 저장하는데 사용된다. 그리고 메서드가 작업을 마치면 할당되었던 메모리공간은 반환되어 비워진다.
      - 메서드가 호출되면 수행에 필요한 만큼의 메모리를 스택에 할당받는다.
      - 메서드가 수행을 마치고나면 사용했던 메모리를 반환하고 스택에서 제거된다.
      - 호출스택의 제일 위에 있는 메서드가 현재 실행 중인 메서드이다.
      - 아래에 있는 메서드가 바로 위의 메서드를 호출한 메서드이다.
- 기본형 매개변수와 참조형 매개변수
  - 기본형 매개변수 : 변수의 값을 읽기만 할 수 있다. (read only)
  - 참조형 매개변수 : 변수의 값을 읽고 변경할 수 있다. (read & write)
- 참조형 반환타입
  - "반환타입이 `참조형`이라는 것은 메서드가 `객체의 주소`를 반환한다는 것을 의미한다."
- 이처럼 우리가 메서드를 작성할 때, `호출하는 사람이 당연히 알아서 적절한 값을 인자로 주겠지.`라는 막연한 믿음을 가져서는 안 되고, 어떤 값이 들어와도 에러없이 처리되는 견고한 코드를 작성해야 한다.
- 클래스 메서드(static 메서드)와 인스턴스 메서드
  - 인스턴스 메서드는 인스턴스 변수와 관련된 작업을 하는, 즉 메서드의 작업을 수행하는데 인스턴스 변수를 필요로 하는 메서드이다.
  - 인스턴스와 관계없은(인스턴스 변수나 인스턴스 메서드를 사용하지 않는) 메서드를 클래스 메서드(static 메서드)로 정의한다.
    - 클래스를 설계할 때, 멤버변수 중 모든 인스턴스에 공통으로 사용하는 것에 static을 붙인다.
    - 클래스 변수(static 변수)는 인스턴스를 생성하지 않아도 사용할 수 있다.
    - 클래스 메서드(static 메서드)는 인스턴스 변수를 사용할 수 없다.
    - 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려한다.
- 클래스 멤버와 인스턴스 멤버간의 참조와 호출
  - 인스턴스 멤버가 존재하는 시점에 클래스 멤버는 항상 존재하지만, 클래스멤버가 존재하는 시점에 인스턴스 멤버가 존재하지 않을 수도 있다.
  - 인스턴스멤버간의 호출에는 아무런 문제가 없다. 하나의 인스턴스멤버가 존재한다는 것은 인스턴스가 이미 생성되어있다는 것을 의미하며, 즉 다른 인스턴스멤버들도 모두 존재하기 때문이다.

### 오버로딩(overloading)
- 오버로딩의 조건
  - 메서드 이름이 같아야 한다.
  - 매개변수의 개수 또는 타입이 달라야 한다.
- 가변인자(varargs)와 오버로딩
  - `타입... 변수명`과 같은 형식으로 선언
  - 가변인자를 매개변수 중에서 제일 마지막에 선언해야 함

### 생성자(constructor)
  - 생성자의 이름은 클래스의 이름과 같아야 한다
  - 생성자는 리턴 값이 없다.
  - 연산자 new가 인스턴스를 생성하는 것이지 생성자가 인스턴스를 생성하는 것이 아니다.
  - Card c = new Card();
    - 연산자 new에 의해서 메모리(heap)에 Card 클래스의 인스턴스가 생성된다.
    - 생성자 Card()가 호출되어 수행된다.
    - 연산자 new의 결과로, 생성된 Card 인스턴스의 주소가 반환되어 참조변수 c에 저장된다.
  - 기본 생성자가 컴파일러에 의해서 추가되는 경우는 클래스에 정의된 생성자가 하나도 없을 때 뿐이다.
  - 생성자의 이름으로 클래스이름 대신 this를 사용한다.
  - 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다.
  - this : 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있다. 모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재한다.
  - this(), this(매개변수) : 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용한다.