/* task2: create a stored function to print name in capital  */

DELIMITER $$

create function caps(text varchar(20)) returns varchar(20) deterministic
begin
return upper(text);
end

$$
DELIMITER;

select name,caps(name) from customer;