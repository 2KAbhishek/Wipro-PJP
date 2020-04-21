insert into dept select department_id, department_name from departments;

insert into dept values (10, 'Accounts');
insert into dept values (null, 'TT');

update dept set dept_id = 20
where dept_name = 'TT';

-- insert into dept values ('A1', 'Accounts');

update dept set dept_id = 30
where dept_name = 'Accounts';

