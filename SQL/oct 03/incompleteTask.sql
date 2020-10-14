/* incomplete task1: Make an insert of swabhav Techlabs in location/state tables map to india and asia. */

insert into locations values(6,'swabhav techlabs',265766,'mumbai','maharashtra','i');


/* incomplete task2: Filter details bassed on mumbai location */

select l.STREET_ADDRESS,l.POSTAL_CODE,l.CITY,l.STATE_PROVINCE,r.region_name,c.COUNTRY_NAME
from locations l,regions r,countries c 
where r.region_id = c.REGION_ID 
and c.COUNTRY_ID=l.COUNTRY_ID
and city='mumbai';
