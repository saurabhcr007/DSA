SELECT weather1.id as id
FROM Weather weather1
JOIN Weather weather2
WHERE (
    DATEDIFF(weather1.recordDate, weather2.recordDate) = 1
    AND
    weather1.temperature > weather2.temperature
    );