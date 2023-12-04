-- 코드를 입력하세요
SELECT
    user_id, product_id
from
    online_sale
where
    user_id
group by
    user_id, product_id
having
    COUNT(product_id) > 1
order by
    user_id asc, product_id desc;
    