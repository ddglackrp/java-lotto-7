# java-lotto-precourse

## 기능 요구 사항
간단한 로또 발매기를 구현한다.
- 로또 번호의 숫자 범위는 1~45까지이다.
- 1개의 로또를 발행할 때 중복되지 않는 6개의 숫자를 뽑는다.
- 당첨 번호 추첨 시 중복되지 않는 숫자 6개와 보너스 번호 1개를 뽑는다.
- 당첨은 1등부터 5등까지 있다. 당첨 기준과 금액은 아래와 같다.
  - 1등: 6개 번호 일치 / 2,000,000,000원
  - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
  - 3등: 5개 번호 일치 / 1,500,000원
  - 4등: 4개 번호 일치 / 50,000원
  - 5등: 3개 번호 일치 / 5,000원
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 만큼 로또를 발행해야 한다.
- 로또 1장의 가격은 1,000원이다.
- 당첨 번호와 보너스 번호를 입력받는다.
- 사용자가 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역 및 수익률을 출력하고 로또 게임을 종료한다.
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다. Exception이 아닌 IllegalArgumentException, IllegalStateException 등과 같은 명확한 유형을 처리한다.

## 기능 목록
Lotto
- [x] 로또는 서로 다른 숫자 6개를 가진다.
- [x] 숫자는 1 부터 45 사이의 정수이다.
- [x] 로또 숫자들을 알려준다.

Money
- [x] 로또 구입 금액을 가진다.
- [x] 구입 금액은 1000으로 나누어 떨어져야 한다.
- [x] 구입 금액으로 구매할 수 있는 로또 개수를 알려준다.

Buyer
- [ ] 구입 금액과 구입한 로또를 가진다.
- [ ] 당첨 로또와 구입 로또를 비교해 로또 결과를 알 수 있다.

BonusNumber
- [x] 보너스 숫자를 가진다.
- [x] 보너스 숫자는 1부터 45 사이다.
- [x] 보너스 번호를 알려 준다.

WinningLotto
- [x] 당첨 번호와 보너스 번호를 가진다.
- [x] 보너스 숫자는 당첨 번호와 중복되면 안된다.
- [x] 당첨 번호를 알려준다.
- [x] 보너스 번호를 알려준다.

LottoRank
- [x] Lotto 결과를 알려준다.
- [x] Lotto 당첨 금액을 알려준다.
- [x] Lotto 당첨 설명을 알려준다.

LottoGenerator
- [ ] 1부터 45 사이의 서로다른 6개의 숫자를 생성한다.