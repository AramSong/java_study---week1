## 1주차

* 자바설치
* 이클립스 설치
* 입력

```java
Scanner s = new Sacnner(System.in);
s.nextInt(); //Integer형 자료를 입력받을 경우
```

* 난수

```java
Random r = new Random();
r.nextInt(2) + 1 ; //r.nextInt(bound). bound = 2 일 경우=>0,1 둘 중 하나.
```

**[문제]**

* Player Class
  * 변수 :  damage , hp
  * method : attack, defence
* Main Class
  * 사용자의 입력값을 받아(공격 : 1, 방어: 2) 컴퓨터와 게임하는 프로그램.
  * 컴퓨터의 입력값은 랜덤함수를 이용하여 게임을 실행할 때마다, 바꿔준다
  * 컴퓨터와 사용자 둘 중, hp가 0이 되는 순간 게임종료
  * 공격할 때마다 hp 10감소, 만약 공격받는 사용자가 방어상태일 경우엔 hp 5감소

