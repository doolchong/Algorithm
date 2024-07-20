SELECT *
FROM (
    SELECT ugu.USER_ID,
           ugu.NICKNAME,
           sum(price) as TOTAL_SALES
    FROM used_goods_board as ugb join used_goods_user as ugu on ugb.writer_id = ugu.user_id
    WHERE STATUS = "DONE"
    GROUP BY ugb.writer_id
) as a
WHERE TOTAL_SALES >= 700000
ORDER BY 3