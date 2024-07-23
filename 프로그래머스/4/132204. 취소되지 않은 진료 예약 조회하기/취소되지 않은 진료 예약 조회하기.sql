SELECT a.APNT_NO,
       p.PT_NAME,
       p.PT_NO,
       a.MCDP_CD,
       d.DR_NAME,
       a.APNT_YMD
FROM PATIENT AS p join
     DOCTOR AS d join
     APPOINTMENT AS a on p.PT_NO = a.PT_NO AND d.DR_ID = a.MDDR_ID
WHERE SUBSTR(a.APNT_YMD,1,10) = "2022-04-13" AND
      a.MCDP_CD = "CS" AND
      APNT_CNCL_YN = "N"
ORDER BY 6