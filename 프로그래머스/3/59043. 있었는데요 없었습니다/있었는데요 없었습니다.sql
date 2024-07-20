SELECT ai.ANIMAL_ID,
       ai.NAME
FROM ANIMAL_INS as ai join ANIMAL_OUTS as ao on ai.ANIMAL_ID = ao.ANIMAL_ID
WHERE ai.DATETIME > ao.DATETIME
ORDER BY ai.DATETIME