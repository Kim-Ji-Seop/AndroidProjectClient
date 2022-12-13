# Android_project
## Team Notion Page
https://www.notion.so/Android-Term-Project-53e6c115c3b742e19ab00b078b71f89a
## 11**월 4일 개발일지**


⭐ **기능 기획**

https://www.notion.so/5244356fede4400d8fda2b953905af0d

**⭐ 프로젝트 기본 틀 구성**

![image](https://user-images.githubusercontent.com/76149358/200157833-a07b4c8d-7e89-4b02-827b-9e15d0cb6d98.png)

⭐ **기획서 작성**

### 주제
#### IT&AI 학과 공지 Application

### 기능 구현 목록
- **P1 -** **웹 크롤링 API**(학부 공지사항)
- **P1 -** **동아리 소개 게시판**(커널, 가온누리, 언노운, 딥인트, 홍보영상 삽입)
- **P1 -** **현재 위치 API** (학교 건물에 대한 지도)
- **P1 -** **푸시 알림**(공지사항 알림)
---
- **P2 -** **시험 게시판**
- **P2 -** **과제 게시판**
- **P2 -** **학년별 교과과정 게시판**
- **P2 -** **학년별 커뮤니티 게시판**
- **P2 -** **시간표 게시판**
- **P2 -** **과목 평가 게시판**
- **P2 -** **이수 체계도 게시판**
---  
- **P3 -** **회원가입 API** (ID, PW, NickName, 학과선택, 생년 월일, 학년)
- **P3 -** **로그인 API** (자체 DB, 카카오톡, 네이버로 로그인)
---
- **P4 - 스플래시 화면**
- **P4 - 어플로고 디자인**
- **P4 - 자동로그인**

### 액티비티 화면구성
기본 베이스 : 코스모스

**스플래시** → **로그인 화면**(로그인 + 회원가입)

**회원가입 화면** → 이름, 학번, ID, PW(+ 다른 계정으로 로그인)

로그인 이후 → **메인 화면**

**메인화면** → 하단 네비게이션 바(홈, 지도, 알림, 일정, 게시판)

-**홈화면** : 상단(로그인 정보, 내 정보, 설정 버튼) 

          설정 → 로그아웃, 언어설정, 알림 설정, 문의하기,  Q&A

                중단 (종합)→제일 최근 n가지 공지, 게시판 제일 최신글 n가지 or 관리자가 설정한 주요 공지 우선 표시

-지도 : 상단(검색바) → 검색한 건물 위에 마커 표시

       중단 → 캠퍼스 지도 (내 위치 마커), 내위치로 이동 버튼(클릭시 내 마커 위치 중심으로 지도     재배치)

-알림 : 푸쉬 알림 뜨는거 보여주는 목록 

-일정 : 달력 → 오늘 날짜 강조 표시 → 해당날짜 클릭시 그날 존재하는 일정 목록 팝업

-**게시판** : 게시판 목록 → 게시판 선택하면 특정 게시판의 게시물 목록

                목록 / 학과 공지사항, 질문게시판(작성 및 답글 기능), 시험, 과목평가(레이팅 바), 이수체계도, 학년별 커뮤니티, 학년별 교과 과정, 시간표 게시판

### 참고자료

---

- 안드로이드 마스크 앱
    
    [https://www.youtube.com/watch?v=0Gpw4MYDUYc&t=684s](https://www.youtube.com/watch?v=0Gpw4MYDUYc&t=684s)
    
- 안드로이드 구글 api 사용 지도
    
    [https://www.youtube.com/watch?v=mLqBNdqYEQw&t=1343s](https://www.youtube.com/watch?v=mLqBNdqYEQw&t=1343s)
    
- 안드로이드 수강신청 시스템(동빈나)
    로그인, 회원가입, DB구축, 공지사항, 강의목록, 시간표, 시간표 중복 및 예외 처리, 강의 분석, 학점 계산, 강의 경쟁률 계산, 강의 인기도, 스플래시 화면, 팝업창 어플리케이션 정보 출력
    <br>
    [https://www.youtube.com/playlist?list=PLRx0vPvlEmdD862e43ADbvDeGPUZKDuqL](https://www.youtube.com/playlist?list=PLRx0vPvlEmdD862e43ADbvDeGPUZKDuqL)

## 11**월 6일 개발일지**

**⭐ Google Map Api 사용하여 MapFragment 개발**

![image](https://user-images.githubusercontent.com/76149358/200157850-7e9a62bb-a03f-4a26-b48a-3a1afe5664fe.png)

⭐ **Git Flow Feature Branch Create & Delete**

⭐ Dev Source Tree

- 아직 master에 병합하지 않은 상태..
- 개발은 계속해서 Dev Branch에서 진행한다.

![image](https://user-images.githubusercontent.com/76149358/200157859-9a959562-7440-4176-b157-8398c10334f6.png)