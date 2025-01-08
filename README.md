# CodingTestStudy

> 코딩테스트 스터디 [코그모]의 코드 저장소입니다 🧑‍💻

### Members
<table>
 <tr>
    <td align="center"><a href="https://github.com/nnayoung"><img src="https://avatars.githubusercontent.com/nnayoung" width="150px;" alt=""></td>
    <td align="center"><a href="https://github.com/Yeon-woo-123"><img src="https://avatars.githubusercontent.com/Yeon-woo-123" width="150px;" alt=""></td>
    <td align="center"><a href="https://github.com/seungsudot"><img src="https://avatars.githubusercontent.com/seungsudot" width="150px;" alt=""></td>
    <td align="center"><a href="https://github.com/subinsss"><img src="https://avatars.githubusercontent.com/subinsss" width="150px;" alt=""></td>
    <td align="center"><a href="https://github.com/hyunwoobaik"><img src="https://avatars.githubusercontent.com/hyunwoobaik" width="150px;" alt=""></td>
    <td align="center"><a href="https://github.com/03do-new30"><img src="https://avatars.githubusercontent.com/03do-new30" width="150px;" alt=""></td>
  </tr>
  <tr>
    <td align="center"><a href="https://github.com/nnayoung"><b>nnayoung</b></td>
    <td align="center"><a href="https://github.com/Yeon-woo-123"><b>Yeon-woo-123</b></td>
    <td align="center"><a href="https://github.com/seungsudot"><b>seungsudot</b></td>
    <td align="center"><a href="https://github.com/subinsss"><b>subinsss</b></td>
    <td align="center"><a href="https://github.com/hyunwoobaik"><b>hyunwoobaik</b></td>
    <td align="center"><a href="https://github.com/03do-new30"><b>03do-new30</b></td>
  </tr>
</table>

## 🗂️ 스터디 진행 방식
- 매주 정해진 문제를 풀어 저장소에 업로드합니다.
- 개념 학습이 있는 주에는 개념을 공부한 내용을 Markdown으로 작성해 저장소에 업로드합니다.

## ✳️ 참여 방법
1. 원본 리포지토리를 `fork`합니다. 
2. 매주 `Week00` 식으로 디렉토리를 만듭니다.
3. 위 디렉토리 하위에 해당 주차 `문제들의 디렉토리`를 만듭니다.
4. 풀이한 코드는 `파일명 규칙`에 따라 파일 이름을 지정하고, `해당하는 문제의 디렉토리`에 위치할 수 있도록 해주세요.
5. `커밋 컨벤션`을 따라 본인의 리포지토리에 푸시합니다.
6. 원본 리포지토리에 `PR`을 보냅니다.
7. 다른 사람들의 코드를 리뷰합니다.

## ✳️ 디렉토리 - 파일명 규칙
### 코드
> Week{주차}/{플랫폼}\_{문제번호}\_{문제이름}/{플랫폼}\_{문제번호}\_{이름}.py
#### 표기 예시
- `Week01/BOJ_2609_최대공약수와_최소공배수/BOJ_2609_김코테.py`
#### 플랫폼 표기 규칙
|플랫폼|표기|
|---|---|
|백준|BOJ|
|프로그래머스|PGM|
|삼성SW Expert Academy|SEA|
#### 문제 번호 규칙
- 백준은 문제 번호를 사용합니다.
- 프로그래머스는 url에서 가장 끝에 있는 번호를 사용합니다.
    - 예를 들어 문제의 url이 `https://school.programmers.co.kr/...lessons/340204` 라면 문제 번호는 `340204`입니다.
#### 문제 이름 규칙
- 띄어쓰기는 `_`언더바로 대체합니다.
- 문제 이름에 기호가 포함되어 있는 경우 생략합니다.

### 개념 정리
> Week{주차}/{알고리즘유형}/{알고리즘유형}_{이름}.md
#### 표기 예시
- `Week02/그리디/그리디_김코테.md`

## ✳️ 커밋 규칙
> [{플랫폼}] {문제번호} - {이름} - {성공or실패}
#### 예시
- `[BOJ] 2609 - 김코테 - 성공 `
- `[BOJ] 2609 - 김코테 - 실패`
#### 터미널에서 작성법
```bash
git commit -m "[BOJ] 2609 - 김코테 - 성공"
```

## ✳️ PR 규칙
### PR 제목
#### 문제별로 PR하는 경우
> [{플랫폼}] {문제번호} - {이름}
##### 예시
- `[BOJ] 2609 - 김코테`
#### 주차별로 한꺼번에 PR하는 경우
> Week{주차} - {이름}
##### 예시
- `Week01 - 김코테`