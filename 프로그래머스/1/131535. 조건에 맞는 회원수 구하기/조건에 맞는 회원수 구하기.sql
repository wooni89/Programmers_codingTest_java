-- 코드를 입력하세요
SELECT count(AGE) USERS
from USER_INFO
where AGE >= 20 and AGE <= 29 AND Year(joined) = 2021;