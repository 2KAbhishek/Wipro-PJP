create table emp(
    id number(7),
    last_name varchar2(25) not null,
    first_name varchar2(25),
    dept_id number(7),
    primary key(id),
    foreign key(dept_id) references dept(id)
);

describe emp;

insert all
    into emp (101,'Sam','Sundar',10)
    into emp (101,'Ram','Krishna',20)
    into emp (102,'Gopi',null,40)
--    into emp (103,null,ram,20)
select 1 from dual;
