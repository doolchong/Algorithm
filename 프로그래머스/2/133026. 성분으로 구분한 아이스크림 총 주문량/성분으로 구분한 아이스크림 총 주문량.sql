SELECT ii.INGREDIENT_TYPE,
       SUM(fh.TOTAL_ORDER) as TOTAL_ORDER
FROM FIRST_HALF as fh join ICECREAM_INFO as ii on fh.FLAVOR = ii.FLAVOR
GROUP BY 1