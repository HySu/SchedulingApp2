# SchedulingApp2
## 개요
JPA 를 이용하여 일정 관리 앱을 개발한다.

## API 명세서 소개
일정 관리 앱에 대한 API 명세서를 작성하여 문서를 보고 프로그래밍 할 수 있게 한다.

### API 명세서
|기능|Method|URL|request|response|상태 코드|
|---|---|---|---|---|---|
|일정 등록|POST|/api/schedules|요청 body|등록 정보|200:OK|
|전체 일정 조회|GET|/api/schedules|없음|전체 응답 정보|200:OK, 400: Bad Request, 404:NOT FOUND|
|선택 일정 조회|GET|/api/schedules/{id}|없음|단건 응답 정보|200:OK, 404:NOT FOUND|
|일정 수정|PUT|/api/schedules/{id}|요청 body|수정 정보|200:OK, 400: Bad Request, 404:NOT FOUND|
|일정 삭제|DELETE|/api/schedules/{id}|없음|-|200:OK, 404:NOT FOUND|

### 일정 등록
#### 요청
- 기능 : 일정 등록
- Method : POST
- URL : /api/schedules
- 요청 JSON 값에 대한 설명

|이름|타입|최대글자수|설명|필수|
|---|---|---|---|---|
|username|String|varchar(20)|작성 유저명|O|
|title|String|varchar(255)|할일 제목|O|
|contents|String|longtext|할일 내용|O|
|createAt|LocalDateTime|-|작성일|O|
|modifiedAt|LocalDateTime|-|수정일|O|

- Request : 요청 body
    - 요청 body(JSON) 에 대한 JSON 코드
```html
예시)
{
    "username" : "HYUNSU",
    "title" : "첫 번째 일정 등록",
    "contents" : 스파르타코딩클럽 1주차 강의 듣기,
    "createdAt" : "2020-11-05 09:00:00",
    "modifiedAt" : "2020-11-05 09:00:00"
}
```

#### 응답
- 응답 JSON 값에 대한 설명

|이름|타입|최대글자수|설명|필수|
|---|---|---|---|---|
|id|Bigint|-|일정 번호|O|
|username|String|varchar(20)|작성 유저명|O|
|title|String|varchar(255)|할일 제목|O|
|contents|String|longtext|할일 내용|O|
|createdAt|LocalDateTime|-|작성일|O|
|modifiedAt|LocalDateTime|-|수정일O|


- response : 응답 body(JSON)
    - 응답 body(JSON) 에 대한 JSON 키-벨류 값
```html
예시)
{
    "id" : 1,
    "username" : "hyunsu",
    "title" : "안녕하세요",
    "contents" : "저는 배가 부릅니다.",
    "createdAt" : "2024-11-04 17:14:40",
    "modifiedAt" : "2024-11-04 17:14:40"
}
```
- 상태 코드 : 200: OK


### 유저 등록
#### 요청
- 기능 : 일정 등록
- Method : POST
- URL : /api/schedules
- 요청 JSON 값에 대한 설명

|이름|타입|최대글자수|설명|필수|
|---|---|---|---|---|
|username|String|varchar(20)|유저명|O|
|email|String|varchar(255)|이메일|O|
|createdAt|LocalDateTime|-|작성일|O|
|modifiedAt|LocalDateTime|-|수정일|O|

- Request : 요청 body
    - 요청 body(JSON) 에 대한 JSON 코드
```html
예시)
{
    "username" : "HYUNSU",
    "email" : "abc@abc.abc",
    "createdAt" : "2020-11-05 09:00:00",
    "modifiedAt" : "2020-11-05 09:00:00"
}
```

#### 응답
- 응답 JSON 값에 대한 설명

|이름|타입|최대글자수|설명|필수|
|---|---|---|---|---|
|id|Bigint|-|일정 번호|O|
|username|String|varchar(20)|작성 유저명|O|
|title|String|varchar(255)|할일 제목|O|
|contents|String|varchar(255)|할일 내용|O|
|createdAt|LocalDateTime|-|작성일|O|
|modifiedAt|LocalDateTime|-|수정일O|


- response : 응답 body(JSON)
    - 응답 body(JSON) 에 대한 JSON 키-벨류 값
```html
예시)
{
    "id" : 1,
    "username" : "hyunsu",
    "title" : "안녕하세요",
    "contents" : "저는 배가 부릅니다.",
    "createdAt" : "2024-11-04 17:14:40",
    "modifiedAt" : "2024-11-04 17:14:40"
}
```
- 상태 코드 : 200: OK
