SELECT YEAR(os.SALES_DATE) AS YEAR,
       MONTH(os.SALES_DATE) AS MONTH,
       GENDER,
       COUNT(DISTINCT(os.USER_ID)) AS USERS
FROM USER_INFO AS ui JOIN ONLINE_SALE AS os ON ui.USER_ID = os.USER_ID
WHERE GENDER IS NOT NULL
GROUP BY 1, 2, 3
ORDER BY 1, 2, 3