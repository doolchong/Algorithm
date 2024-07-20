SELECT ugu.USER_ID,
       ugu.NICKNAME,
       CONCAT(ugu.CITY, " ", ugu.STREET_ADDRESS1, " ", ugu.STREET_ADDRESS2) AS "전체주소",
       CONCAT(SUBSTR(ugu.TLNo, 1, 3), "-", SUBSTR(ugu.TLNo, 4, 4), "-", SUBSTR(ugu.TLNo, 8, 4)) AS "전화번호"
FROM USED_GOODS_BOARD AS ugb join USED_GOODS_USER AS ugu on ugb.WRITER_ID = ugu.USER_ID
GROUP BY ugb.WRITER_ID
HAVING COUNT(ugu.USER_ID) >= 3
ORDER BY 1 DESC