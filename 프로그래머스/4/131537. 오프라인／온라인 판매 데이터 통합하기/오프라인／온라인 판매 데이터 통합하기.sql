-- 코드를 입력하세요
SELECT
    date_format(SALES_DATE,'%Y-%m-%d') AS SALES_DATE,
    PRODUCT_ID,
    USER_ID,
    SALES_AMOUNT
from
    ONLINE_SALE
where
    MONTH(SALES_DATE) = 3
UNION
SELECT
    date_format(SALES_DATE,'%Y-%m-%d') AS SALES_DATE,
    PRODUCT_ID,
    NULL USER_ID,
    SALES_AMOUNT
FROM
    offline_sale
where
    MONTH(SALES_DATE) = 3
ORDER BY
    sales_date, product_id, user_id;
    