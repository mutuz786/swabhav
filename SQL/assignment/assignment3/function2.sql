/* task3: create a stored function to print date in dd/mm/yyyy format  */

drop function formatter;

DELIMITER $$

create function formatter(input date) returns varchar(20) deterministic
begin
return date_format(input,"%d %M %y");
end

$$
DELIMITER;


select deliveryDate,formatter(deliverydate) from orderc;
