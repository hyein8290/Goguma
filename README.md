## 🍠 입찰 시스템을 추가한 중고거래 플랫폼 웹 사이트 프로젝트 입니다.

![goguma_ppt](https://user-images.githubusercontent.com/90780701/152696909-20209341-07bc-4062-bb20-2be93588aea7.png)

>  **고구마켓**은 **Servlet**과 **JSP**로 구현한 중고거래 웹사이트입니다. <br />
>  **25일** 동안( 22.01.03 - 22.01.27 ) **6명**의 팀원이 개발에 참여했습니다. <br />

 <br />
 
## 📌 Table Of Contents
* [📖 Introduction](#-introduction)
* [📝 Main Function](#-main-function)
* [📋 ERD](#erd)
* [🙋 My Role](#-my-role)
* [💡 Review](#-review)

 <br />

## 📖 Introduction
<table>
    <tr>
        <th width="11%">프로젝트 명 </th>
        <th>고구마켓</th>
        <th>개발기간</th>
        <th>2022.01.03. ~ 2022.01.27.</th>
    </tr>
    <tr>
        <th>프로젝트 성격</th>
        <th>웹 프로젝트</th>
        <th>개발인원</th>
        <th>팀 / 6명<br>
            송준영 | 이유미 | 이찬우 | 이혜인 | 주하성 | 황현우
        </th>
    </tr>
    <tr>
        <th>프로젝트 개요</th>
        <th>입찰 시스템을 추가한 중고거래 플랫폼</th>
        <th>개발환경&nbsp;</th>
        <th>Windows10</th>
    </tr>
    <tr>
        <th colspan="5">사용 도구</th>
    </tr>
    <tr>
        <th>개발언어</th>
        <th colspan="3">Java(JDK 11) / HTML / CSS3 / JavaScript / Servlet / JSP </th>
    </tr>
    <tr>
        <th>형상관리</th>
        <th colspan="3">Github, Git , Source Tree</th>
    </tr>
    <tr>
        <th>개발도구</th>
        <th colspan="3">Eclipse IDE, Oracle DBMS / Visual Studio Code</th>
    </tr>
</table>

<br />

## 📝 Main Function
### 1. 비회원
* 회원가입 및 로그인, ID/PW 찾기
* 인기 검색어와 상품 검색
* 중고거래 등 게시글 조회 
### 2. 회원
* 회원 정보 수정 및 탈퇴
* 중고거래 및 커뮤니티 게시글 작성
* 경매 물품 입찰
* 메시지 작성과 조회
### 3. 관리자
* 회원 통합 관리
* 문의 사항 답변
* 고객센터 게시글 등록
* 사이트 통계 현황 확인

<br />

## 📋ERD
![goguma_erd](https://user-images.githubusercontent.com/90780701/152697432-dcdd516b-a2cd-47dc-8a59-ba108e8cd22f.png)

<br />

## 🙋 My Role
### 1. 대시보드

![dashboard2](https://user-images.githubusercontent.com/90780701/152827340-55c1e009-c449-481c-9b60-95b31fb0a39d.gif)
#### 1-1. 대시보드
* 대시보드 페이지를 만들어 홈페이지에 대한 통계를 한 눈에 확인할 수 있도록 하였습니다.
* 오늘 거래금액, 업데이트된 상품수, 오늘 방문자수를 확인할 수 있습니다.
* HighChart API를 이용하여 차트로 통계를 확인할 수 있도록 하였습니다.
* ajax를 사용하여 새로고침 없이 통계 데이터를 가져옵니다.

<br />

### 2. 회원 관리

![userlist](https://user-images.githubusercontent.com/90780701/152835053-3a020827-07dd-425a-8080-f22d4998f8c4.gif)
#### 2-1. 전체 회원 관리
* 전체 회원 리스트를 가져와 회원 정보를 확인할 수 있도록 했습니다.
* 한 페이지당 10명의 회원을 볼 수 있으며 원하는 페이지로 이동 가능합니다.
* 관리자는 일반 회원과 탈퇴 회원을 차단 기능을 이용하여 사이트 이용에 제한을 줄 수 있습니다.
* modal창을 이용하여 화면 전환 없이 바로 차단을 할 수 있도록 했습니다.
* 관리자는 차단 해제 기능을 사용하면 차단 회원의 차단을 해제할 수 있습니다.
* 검색 기능을 이용하여 이름과 아이디로 원하는 회원을 검색할 수 있습니다.

<br />

![image](https://user-images.githubusercontent.com/90780701/152838770-873595ee-eed9-4e3c-859a-0791bcb9e79a.png)
#### 2-2. 차단 회원 관리
* 차단 회원 리스트를 가져와 회원 정보를 확인할 수 있습니다.
* 한 페이지당 10명의 회원을 볼 수 있으며 원하는 페이지로 이동 가능합니다.
* 아이디, 이름, 차단날짜, 차단유형을 확인할 수 있으며 차단해제를 할 수 있습니다.
* 검색 기능을 이용하여 이름과 아이디로 원하는 회원을 검색할 수 있습니다.

<br />

![image](https://user-images.githubusercontent.com/90780701/152840041-ba0cf3be-d7b7-4504-98ef-872f49aac2ea.png)
#### 2-3. 탈퇴 회원 관리
* 탈퇴 회원 리스트를 가져와 회원 정보를 확인할 수 있습니다.
* 한 페이지당 10명의 회원을 볼 수 있으며 원하는 페이지로 이동 가능합니다.
* 아이디, 이름, 탈퇴날짜, 탈퇴유형을 확인할 수 있으며 다시 가입할 수 없도록 차단 기능을 구현했습니다.
* 검색 기능을 이용하여 이름과 아이디로 원하는 회원을 검색할 수 있습니다.

<br />

### 3. 홈페이지 통계

![image](https://user-images.githubusercontent.com/90780701/152842044-fa67fc40-a929-41a7-b770-6c198cb6fe20.png)
#### 3-1. 접속 통계
* 최근 일주일 일별 방문자수와 월별 방문자수를 차트를 통해 한 눈에 확인할 수 있도록 했습니다.
* 월별 방문자수는 연간 평균 방문자 수를 넣어 비교할 수 있도록 했습니다.

<br />

![image](https://user-images.githubusercontent.com/90780701/152842424-c675aace-7ac7-4185-8794-afc27f5226c2.png)
#### 3-2. 거래 통계
* 각 카테고리 별 물품 거래 금액을 차트로 나타냈습니다.

<br />

![image](https://user-images.githubusercontent.com/90780701/152843237-d724d039-bbbf-4372-8870-9b1397ca7110.png)
#### 3-3. 회원 통계
* 사이트의 회원을 연령별 분포를 차트로 나타냈습니다.
* 성별로 나누어 특정 연령대에서 어느 성별의 회원이 더 많은 지 나타냈습니다.

<br />

## 💡 Review
### 1. 후기
> 지금까지 했던 프로젝트들 중 가장 '협업'에 가까운 협업을 한 프로젝트라고 생각합니다. erdcloud, oracle cloud, github, source tree 등 많은 협업 툴을 사용해 보아 좋은 경험이었습니다.
> 물론, 협업 툴을 사용하며 많은 시행착오를 겪기도 했습니다. jdbc를 이용하여 oracle cloud와 연결할 때 오류가 발생해 3시간 동안 헤매기도 했고, git으로 팀원들과 소스를 통합하는 과정에서 많은 충돌 오류로 프로젝트 진행에 차질을 빚기도 했습니다. 하지만 팀원들과의 소통을 통하여 오류를 해결함으로써 큰 뿌듯함을 느꼈으며 소통의 중요성을 깨닫았습니다. 
> 구현 과정에서 많은 오류와 어려움을 겪기도 했지만 얼굴 붉히지 않고 서로의 어려움을 해결해 주고자 열심히 도와준 팀원들을 만나 정말 큰 행운을 얻은 것 같습니다. 이걸 보고 계신 팀원분들 정말 감사합니다😊 팀원분들께 긍정적인 태도를 많이 배워갑니다.<br />





