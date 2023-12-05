# extend-mentoring
2023-2 신입생 공학기초과목 멘토링 프로그램 이후 끝이 아니라 연장선으로 방학 동안 각자 원하는 언어를 통해 프로그래밍 능력을 키우기 위한 스터디입니다.<br><br>
멘토였던 사람으로서, 여러분들에게 프로그래밍 언어에 대한 이해도와 구현 능력을 높이고, 깃, 깃허브에 대한 친숙도를 가질 수 있도록 노력하겠습니다.<br><br>
해당 방법이 익숙하지 않아 거부감이 들고, 실수하면 어떡하지라는 생각이 들 수 있겠지만, 미래에 필요한 방법이기도 하고, 오히려 실수해 주셨으면 해요. 지금 실수해도 되니 실수하시면서 성장해 봐요!
<br><br>

# 스터디 방법
10주간의 스터디입니다. 매주 문제를 선정하여 업데이트할 테니 해당 문제를 보시고 해결하시면 돼요!<br>
각 주차의 폴더에 problem 폴더와 각자의 이니셜 폴더가 있을 거예요. problem 폴더에 매주 업데이트된 문제를 확인하시고, 각자의 폴더에 여러분이 해결하신 코드를 올려주시면 됩니다!<br>
매주 화요일 <시간 업데이트함> 온라인으로 여러분들이 올려주신 코드를 통해 어떻게 해결하셨는지 소개와 질답하는 시간을 가지도록 할게요!<br>
부득이하게 불참하시는 경우 코드 리뷰를 남겨주세요!
<br><br><br>

# ❗️❗️**필수**❗️❗️
## 1. 해당 Repository를 fork 해주세요!
<img width="1246" alt="fork1" src="https://github.com/jun673012/extend-mentoring/assets/70689677/51d5081e-f235-43b8-9802-37bc8186a4a9">

빨간 부분의 fork 를 클릭해 주세요.<br><br>
<img width="1131" alt="fork2" src="https://github.com/jun673012/extend-mentoring/assets/70689677/cff5d3d3-a342-4232-ad53-549313d7ebec">

빨간 부분의 Create fork 를 클릭해 개인 Repository에 fork 해주세요.
<br><br><br>

## 2. fork 한 Repository를 clone 해주세요!
<img width="927" alt="clone1" src="https://github.com/jun673012/extend-mentoring/assets/70689677/6ac37e5f-eb89-4bd8-96ef-15b3824fcda0">

본인이 fork 한 Repository의 빨간 부분의 URL을 복사해 주세요. (아이디가 제 것이라 이렇게 보이지만 자신의 레포에 들어가셔야 해요)

그 후 터미널에 해당 명령어를 실행해 주세요.
```
cd <원하는 폴더 주소>
git clone <복사한 Repository URL>
```

<img width="586" alt="clone2" src="https://github.com/jun673012/extend-mentoring/assets/70689677/b590b5a9-151f-4e48-af7b-6f1628eff80a">
<br>
<img width="778" alt="clone3" src="https://github.com/jun673012/extend-mentoring/assets/70689677/18f2066b-e7af-42e0-8a50-8503a9622c1c">
<br>
이렇게 원하는 폴더에 복사되었습니다!
<br><br><br>

## 3. 원본 Repository를 remote 해주세요!
<img width="963" alt="remote1" src="https://github.com/jun673012/extend-mentoring/assets/70689677/d0fc368d-e235-4b8f-9a3b-ebc9ef83fb92"><br>
**원본 저장소의 URL을 복사해 주세요 원본 저장소의 URL을 복사해 주세요 원본 저장소의 URL을 복사해 주세요 원본 저장소의 URL을 복사해 주세요 원본 저장소의 URL을 복사해 주세요 원본 저장소의 URL을 복사해 주세요 원본 저장소의 URL을 복사해 주세요 원본 저장소의 URL을 복사해 주세요**<br><br>
그 후 하단의 명령어를 실행해 주세요. (별명은 본인의 이름이나 아이디로 해주세요)

```
# 원본 저장소 remote 등록
git remote add <별명> <원본 저장소 URL>
# 원본 저장소 확인
git remote -v
```
<img width="578" alt="remote2" src="https://github.com/jun673012/extend-mentoring/assets/70689677/58d2e2ce-34a3-4739-b5c6-99c83eb0867a">
<br><br><br>

## 4. branch를 생성해 주세요!
하단의 명령어를 실행해 주세요. (브랜치명은 week해당주차숫자_본인의 이름이나 아이디로 해주세요 ex)week1_junhyeok)
```
# 브랜치 생성
git branch <브랜치명>
# 브랜치 리스트
git branch
# 브랜치 이동
git checkout <브랜치명>
# 브랜치 리스트
git branch
```

혹시 안되면 하단의 명령어 실행 후 다시 해보세요.
```
git commit -m "initial commit"
```

branch 생성되었으면 거기로 코드를 올려주세요!
<br><br><br>

## commit 규칙

- 한 문제를 해결할 때 마다 commit을 해주세요!<br>
  - ex) 1000번 문제 통과 후 commit하기, 실패한 문제는 commit 하지 않는다.

- commit 메세지는 "번호_인식가능한 이름" 으로 작성해 주세요!<br>
  - ex) 1000_junhyeok   or   1000_jun673012
 
- 해당 문제 소스 코드만 commit 해주세요!
<br><br><br>

## commit 방법
코드 성공시 하단의 명령어를 실행해 주세요. 작성한 코드를 기록하는 과정이에요! (메세지 위의 규칙에 맞게 작성해주세요)
```
git commit -m "<문제번호_인식가능한 이름>"
```
<img width="389" alt="gitcommit1" src="https://github.com/jun673012/extend-mentoring/assets/70689677/3958cc5e-3419-4089-ade5-ae15ea47f27c">
<br>위 사진은 "jun"으로 했지만 규칙에 따라 작성해 주세요!
<br><br><br>

## Push 방법
모든 문제를 해결하셨고, 커밋 하셨다면 하단의 명령어를 실행해 주세요. commit 한 코드를 Repository 에 저장하는 과정이에요!
```
git push origin <본인의 브랜치명>
```
<img width="597" alt="gitpush1" src="https://github.com/jun673012/extend-mentoring/assets/70689677/55c7f7bb-f8a4-42c0-a9a1-56d6d00ac68d">
<br><br><br>

## Pull Request 방법
원본 Repo에 등록하기 위한 과정이에요!

<img width="902" alt="pr1" src="https://github.com/jun673012/extend-mentoring/assets/70689677/2ec11fb2-e3ec-48b5-9d4d-543f306dd769"><br>
Push까지 성공했으면 이런 화면을 보실 수 있을거에요. 빨간 부분의 Compare & Pull request를 클릭해 주세요!<br><br>

<img width="1142" alt="pr2" src="https://github.com/jun673012/extend-mentoring/assets/70689677/17e46b6e-232e-41b5-b7be-a095b8d03758"><br>
1번. Pull request title "해당 주차/인식가능한 이름" 으로 작성해 주세요! 어떤 이름쓰시던 다 식별가능하니 편하게 해주세요!<br>
2번. 설명이에요. 안쓰셔도 됩니다!<br>
3번. 빨간 부분의 Create pull request를 클릭하시면 PR을 보내시는거에요. 최종 확인 후 클릭해주세요!<br>

PR 보내지면 제가 확인 후 Merge 할게요. 문제 있으면 따로 말씀 드릴게요!

풀리퀘스트 반영되면 하단의 명령어 실행해 주세요!
반영된 코드로 업데이트하고 로컬 브랜치를 삭제하는 과정이에요.

```
git pull <remote 별명>
git branch -d <해당 브랜치명>
```

이후 해당 과정을 4. branch를 생성해 주세요! 부터 Pull Request 방법까지 계속 반복하시면 됩니다!
