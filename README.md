# 인프런 김영한님의 강의를 듣고 정리하기 위한 레포지토리

# Spring Basic - 핵심 원리 & 핵심 기능 정리

## 1. 스프링 핵심 원리

### ● 객체 지향 설계
- 유연하고 변경에 강한 구조를 만들기 위한 설계 방법.
- 클래스 간 결합도를 낮추고, 역할과 구현을 명확히 분리함.

### ● 다형성 - 역할과 구현의 분리
- 인터페이스(역할)와 구현 클래스를 분리하여 유연한 설계 가능.
- 클라이언트는 구현체가 아닌 역할에만 의존하도록 설계.

### ● SOLID 원칙 중 OCP, DIP
- **OCP (Open-Closed Principle)**  
  - 확장에는 열려 있고, 변경에는 닫혀 있어야 함.  
  - 새로운 기능 추가 시 기존 코드를 수정하지 않고 확장 가능해야 함.
- **DIP (Dependency Inversion Principle)**  
  - 고수준 모듈은 저수준 모듈에 의존하면 안 됨.  
  - 둘 다 추상화(인터페이스)에 의존해야 함.  
  - 구현체가 아닌 인터페이스에 의존해야 유연한 구조가 됨.

### ● DI(Dependency Injection) 컨테이너
- 객체의 생성과 의존관계 주입을 스프링 컨테이너가 관리함.
- OCP, DIP 원칙을 지킬 수 있게 도와주는 핵심 기술.

---

## 2. 스프링 핵심 기능

### ● 스프링 컨테이너와 빈(Bean)
- 스프링 컨테이너는 객체를 생성하고 관리하는 핵심 컴포넌트.
- 컨테이너가 관리하는 객체를 "빈(Bean)"이라고 부름.

### ● 싱글톤
- 스프링 빈은 기본적으로 싱글톤(컨테이너 당 하나의 인스턴스)으로 관리됨.
- 메모리 사용 최소화 및 공통 인스턴스 공유에 효과적임.

### ● 컴포넌트 스캔
- `@Component`, `@Service`, `@Repository`, `@Controller` 등의 어노테이션이 붙은 클래스를 자동으로 빈으로 등록해줌.
- `@ComponentScan`으로 설정.

### ● 의존관계 자동 주입
- `@Autowired`를 이용해 의존 객체를 자동으로 주입받을 수 있음.
- 생성자, 필드, 세터 등 다양한 방식으로 주입 가능.

### ● 빈 생명주기 콜백
- 스프링은 빈의 생성부터 소멸까지의 생명주기를 관리함.
- `@PostConstruct`, `@PreDestroy` 등을 이용해 초기화 및 종료 작업 가능.

### ● 빈 스코프
- 빈의 생성 및 유지 범위를 설정할 수 있음.
- 대표 스코프:  
  - `singleton`: 컨테이너 내 하나의 인스턴스 (기본값)  
  - `prototype`: 요청 시마다 새로운 인스턴스 생성  
  - 웹 환경에서는 `request`, `session` 등도 존재함.

---
