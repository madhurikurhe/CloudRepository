use swabhav;

select *from bank_master;

select *from bank_transaction;

DELIMITER //
DROP PROCEDURE IF EXISTS 'CHECK_BAL' //
CREATE PROCEDURE `CHECK_BAL` (IN bal INT)
BEGIN
	 DECLARE MSG VARCHAR(128);
    IF bal < 1000 THEN
        SET MSG = CONCAT('BALANCE ERROR: Trying to insert a insufficient value in bank: ', CAST(bal AS CHAR));
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = MSG;
    END IF;
END //
DELIMITER ;