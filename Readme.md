# 스프링 고급 공부

<br><br>

## ThreadLocal

<br>

### Runnable, Thread
| 항목    |Runnable|Thread|
|-------|---|---|
| 타입    |인터페이스|클래스|
| 목적    |작업 정의|스레드 생성 및 실행|
| 사용 방식 |`Thread`에 전달해서 실행|상속 후 직접 실행|
- Runnable: 스레드에서 실행할 작업을 정의하는 인터페이스
- Thread: 스레드를 생성하고 실행하는 클래스, Runnable을 사용하여 작업을 실행할 수 있음
- Runnable 객체를 Thread에 전달하여 실행할 수도 있다. 이 방법은 스레드를 직접 상속하지 않고 작업만 정의하는 방법


<br>

### 동시성 문제
- 동시성: 동시에 여러 작업이 실행되는 것처럼 처리하는 능력
- 동시성 문제: 여러 쓰레드나 프로세스가 **동시에 같은 자원을 접근하거나 변경**할 때 발생하는 문제
  - ex) 싱글톤으로 등록된 스프링 빈에 여러 쓰레드가 동시에 접근하면 문제 발생
  - 인스턴스 필드, 또는 static 같은 공용 필드에 접근할때 발생
  - 동시성 문제는 값을 변경하기 때문에 발생
- 동기화: 일관적이고 정확하게 데이터를 처리

<br>

> 동시성 문제를 해결하려면 동기화 해야한다 -> 쓰레드 로컬 이용

<br>

### ThreadLocal
- 쓰레드 로컬: 해당 스레드만 접근할 수 있는 특별한 저장소
- 각 스레드마다 내부 저장소를 제공

#### ThreadLocal - 주의사항
- 해당 스레드로컬을 모두 사용하고 나면, ThreadLocal.remove()를 호출해서 **쓰레드 로컬에 저장된 값을 제거**해야 한다
- 그냥 두면 WAS처럼 쓰레드 풀을 사용하는 경우 심각한 문제 발생

<br><br><br><br>

## 디자인 패턴 

<br>

### 템플릿 메서드 패턴
