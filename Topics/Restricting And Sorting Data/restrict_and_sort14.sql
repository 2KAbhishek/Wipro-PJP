select last_name, job, salary from employees
where job in ('Sales Representative','Stock Clerk') and salary not in (2500, 3500, 7000);

