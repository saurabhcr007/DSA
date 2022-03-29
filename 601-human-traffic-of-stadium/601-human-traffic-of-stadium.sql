SELECT DISTINCT S1.id, S1.visit_date, S1.people FROM Stadium S1, Stadium S2, Stadium S3
WHERE S1.people >= 100 AND S2.people >= 100 AND S3.people >= 100 AND ((S1.id = S2.id - 1 AND S1.id = S3.id - 2 AND S2.id = S3.id - 1 ) OR (S1.id = S2.id + 1 AND S1.id = S3.id - 1 AND S2.id = S3.id - 2 ) OR (S1.id = S2.id + 2 AND S1.id = S3.id + 1 AND S2.id = S3.id - 1 ))ORDER BY S1.visit_date
