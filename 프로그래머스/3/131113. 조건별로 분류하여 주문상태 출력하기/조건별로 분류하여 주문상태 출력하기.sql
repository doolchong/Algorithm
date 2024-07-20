SELECT ORDER_ID,
       PRODUCT_ID,
       SUBSTR(OUT_DATE, 1, 10) as OUT_DATE,
       case when SUBSTR(OUT_DATE, 1, 10) <= "2022-05-01" then "출고완료"
            when SUBSTR(OUT_DATE, 1, 10) IS NULL then "출고미정"
            else "출고대기" end as "출고여부"
FROM FOOD_ORDER