SELECT WAREHOUSE_ID,
       WAREHOUSE_NAME,
       ADDRESS,
       IF(FREEZER_YN IS NULL, "N", FREEZER_YN) as FREEZER_YN
FROM FOOD_WAREHOUSE
WHERE SUBSTR(WAREHOUSE_NAME, 4, 2) = '경기'
ORDER BY WAREHOUSE_ID