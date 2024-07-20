SELECT CAR_ID
FROM (
    SELECT crcc.CAR_ID,
           crcrh.START_DATE
    FROM CAR_RENTAL_COMPANY_CAR as crcc join 
         CAR_RENTAL_COMPANY_RENTAL_HISTORY as crcrh 
         on crcc.CAR_ID = crcrh.CAR_ID
    WHERE crcc.CAR_TYPE = "세단"
) a
WHERE SUBSTR(START_DATE, 6, 2) = "10"
GROUP BY CAR_ID
ORDER BY 1 DESC