# springboot2-webservice

### 환경
- spring boot 2.1.9 > 2.4.1
- gradle 4.10.2 > 6.7.1
- IntelliJ IDEA 2020.1
- Junit5

### h2
```
http://localhost:8080/h2-console
jdbc url: jdbc:h2:mem:testdb

example
insert into POSTS (TITLE, CONTENT, AUTHOR) values ('title', 'content', 'author');
```

### db
```
show variables like 'c%';

use springboot2_webservice;

alter database springboot2_webservice
CHARACTER SET = 'utf8mb4'
COLLATE = 'utf8mb4_general_ci';

select @@time_zone, now();
```
### 참고사항
- Gradle 업그레이드
```
./gradlew wrapper --gradle-version 6.7.1
```